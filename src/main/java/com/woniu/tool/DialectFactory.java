package com.woniu.tool;

public class DialectFactory {
	public static Dialect create(String type) {
		if("Mysql".equalsIgnoreCase(type)) {
			return new MySQLDialect();
		}
		return null;
	}
}
