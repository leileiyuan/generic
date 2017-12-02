package com.belongtou.generic.use;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型的使用，集合泛型
 */
public class UseGeneric {
	public static void main(String[] args) {
		try {
			testGeneric();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		testGeneric2();
	}

	// 需要做强制转换 才能获得真实的类型
	public static void testGeneric() {
		List list = new ArrayList();
		list.add("abc");
		list.add(888);

		each(list);
	}

	public static void testGeneric2() {
		List<String> list = new ArrayList<>();
		list.add("def");
		list.add("99");
		
		each(list);
	}

	private static void each(List list) {
		for (Iterator it = list.iterator(); it.hasNext();) {
			// 集合中的类型不一致，强制可能会发生异常  ClassCastException
			String obj = (String) it.next();
			System.out.println(obj);
		}
	}
}
