package com.belongtou.generic.daopattern.test;

import com.belongtou.generic.daopattern.dao.CustomerDao;
import com.belongtou.generic.daopattern.dao.impl.CustomerDaoImpl;
import com.belongtou.generic.daopattern.model.Customer;

public class DaoTest {
	public static void main(String[] args) {
		CustomerDao customerDao = new CustomerDaoImpl();
		Customer t = new Customer();
		customerDao.add(t);
		customerDao.findAll();
	}
}
