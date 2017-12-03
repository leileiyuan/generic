package com.belongtou.generic.reflect;

public class TestReflect {
	public static void main(String[] args) {
		AccountDao accountDao = new AccountDao();
		accountDao.findById(1);

		AdminDao adminDao = new AdminDao();
		adminDao.findById(1);
	}
}
