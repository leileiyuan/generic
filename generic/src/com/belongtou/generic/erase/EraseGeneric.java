package com.belongtou.generic.erase;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型擦除。泛型只在编译期有效，编译后的字节码文件中，不存在编译信息
 */
public class EraseGeneric {

	public static void main(String[] args) {
		new EraseGeneric().testErase2();
	}

	// 泛型擦除1

	/*
	 * 以下代码不能重载，编译期报错 public void save(List<String> strs) { }
	 * 
	 * public void save(List<Integer> nums) { }
	 */

	// 泛型擦除2
	public void testErase() {
		List<String> strs = new ArrayList<>();
		strs.add("ABCDE");

		Class<?> class1 = strs.getClass();
		try {
			Method method = class1.getMethod("add", Object.class);
			// 通过反射执行集合的add方法，参数是Integer类型的100，可以正常调用
			method.invoke(strs, 100);
			System.err.println(strs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testErase2() {
		List<String> strs = new ArrayList<>();
		strs.add("ABCDE");

		List list = new ArrayList<>();

		// true
		System.out.println(strs.getClass() == list.getClass());
	}

}
