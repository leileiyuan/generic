package com.belongtou.generic.keyword;

import java.util.ArrayList;
import java.util.List;

public class Generic_extents_super {
	
	// 调用该方法时 list中的数据类型只能String的父亲类型
	public static void update(List<? super String> list) {}


	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		update(list);
		update(list2);
		//update(list3); // 编译不通过
	}

	public void testGeneric() throws Exception {
		List list = new ArrayList<>();

		Class<?> class1 = Class.forName("com.belongtou.generic.keyword.Generic_extents_super");

		List<?> list2 = new ArrayList<String>();
		// list2.add("");
		for (Object object : list2) {

		}
	}
}
