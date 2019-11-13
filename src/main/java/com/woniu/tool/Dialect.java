package com.woniu.tool;

public interface Dialect {
	public String getPageSql(String sql,int offset,int limit);
}
