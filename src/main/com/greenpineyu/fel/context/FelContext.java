package com.greenpineyu.fel.context;

import com.greenpineyu.fel.common.Null;



public interface FelContext {

	
	Null NULL = new Null();
	
	/**
	 * 如果没有找到变量，返回此变量
	 */
	Var NOT_FOUND = new Var("NOT_FOUND",null,Var.class);


	Object get(String name);

	/**
	 * 设置变量
	 * 
	 * @param name
	 *            变量名称
	 * @param value
	 *            变量值
	 */
	void set(String name, Object value);
	
	
	/**
	 * 获取变量值
	 * 
	 * @param name
	 *            变量名称
	 * @return 变量值，如果没有找到变量，返回FelContext.NOT_FOUND
	 */
	 Var getVar(String name);
	
	 void setVar(Var var);


}