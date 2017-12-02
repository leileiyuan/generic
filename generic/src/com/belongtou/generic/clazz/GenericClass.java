package com.belongtou.generic.clazz;

/**
 * 泛型 类。将泛型类型定义到类上面，避免重复。泛型方法的定义就可以去掉了
 */
public class GenericClass<T> {
	
	public void testClass() {
		// 在创建泛型类 对象的时候 才能确定类型
		GenericClass<String> genericClass = new GenericClass<>();
		genericClass.save("China", 77); // save(T t,K k) k的类型是方法和入参类型 确定的
		genericClass.update("");
	}

	// 定义多个类型
	public <K> T save(T t, K k) {
		return null;
	}

	public void update(T t) {
	}
}
