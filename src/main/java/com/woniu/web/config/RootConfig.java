package com.woniu.web.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.realm.jdbc.JdbcRealm.SaltStyle;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.druid.pool.DruidDataSource;

public class RootConfig {
	
	@Bean
	public DataSource ds() {
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/logistics?charactEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public HashedCredentialsMatcher hcm() {
		HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
		hcm.setHashAlgorithmName("md5");
		hcm.setHashIterations(1024);
		return hcm;
	}
	
	@Bean
	public JdbcRealm realm() {
		JdbcRealm realm = new JdbcRealm();
		realm.setDataSource(ds());
		realm.setAuthenticationQuery("select password, salt from users where username = ?");
		realm.setUserRolesQuery("select rname from users_roles ur join users u on ur.uid = u.uid join roles r on ur.rid = r.rid where username = ?");
		realm.setPermissionsQuery("select pname from roles_permissions rp join roles r on rp.rid = r.rid join permissions p on rp.pid = p.pid where rname = ?");
		realm.setPermissionsLookupEnabled(true);
		realm.setCredentialsMatcher(hcm());
		realm.setSaltStyle(SaltStyle.COLUMN);
		return realm;
	}
	
	@Bean
	public DefaultWebSecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		return securityManager;
	}
	
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean sf = new ShiroFilterFactoryBean();
		sf.setSecurityManager(securityManager());
		Map<String, String> map=new HashMap<>();
		map.put("/login", "anon");
		map.put("/isLogin", "anon");
		map.put("/logout", "logout");
		map.put("/**", "authc");
		sf.setFilterChainDefinitionMap(map);
		return sf;
	}
	
	/*
	 * @Bean public AuthorizationAttributeSourceAdvisor
	 * getAuthorizationAttributeSourceAdvisor() {
	 * AuthorizationAttributeSourceAdvisor aasa = new
	 * AuthorizationAttributeSourceAdvisor();
	 * aasa.setSecurityManager(securityManager()); return aasa; }
	 */
	//开启shiro注解处理器
	@Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
	
	//配置文件上传
    @Bean
    public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager());
        return authorizationAttributeSourceAdvisor;
    }
    
    @Bean
    public CommonsMultipartResolver multiparResolver() {
    	return new CommonsMultipartResolver();
    }
    
}
