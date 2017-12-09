package com.belongtou.generic.daopattern.dao.impl;

import java.util.List;

import com.belongtou.generic.daopattern.dao.CustomerDao;
import com.belongtou.generic.daopattern.model.Customer;

public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {
	@Override
	public List<Customer> findAll() {
		System.err.println(" findAll " + this.getClass().getName());
		return null;
	}

}
