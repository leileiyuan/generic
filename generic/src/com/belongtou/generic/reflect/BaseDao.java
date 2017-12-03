package com.belongtou.generic.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseDao<T> {
	
	private Class<?> clazz;
	// 获取参数类型中的 实际类型
	public BaseDao() {
		//  获取当前运行类（AccountDao/AdminDao）的字节码
		// 获取当前运行类的父类的参数化类型
		Type superType = this.getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) superType;
		
		//获取参数化类型中 实际类型的定义BaseDao<Account,Admin.....>
		Type[] typeArguments = pt.getActualTypeArguments();
		
		// Account/Admin
		 this.clazz = (Class<?>) typeArguments[0];
	}
	

	/**
	 * 根据主键id 查询获取对象
	 */
	public T findById(int id) {
		String simpleName = clazz.getSimpleName();
		System.out.println(simpleName);
		
		return null;
	}
}
