package com.belongtou.generic.method;

/**
 * 泛型 方法。先定义类型 再使用。对于泛型方法，它的类型是在使用的时候确定的
 */
public class GenericMethod {
	
	public void testMethod() {
		this.save("China");
		// 返回的类型是第一个参数的类型
		String str = this.save("ABC", 999);
		Integer num = this.save(55, "kk");
	}
	
	// 保存任何类型的东西，类型需要先定义再使用
	// 定义类型：public <K> void save()...
	public <K> void save(K k) {
		
	}
	
	// 定义多个类型
	public <T,K> T save(T t,K k) {
		return null;
	}
}
