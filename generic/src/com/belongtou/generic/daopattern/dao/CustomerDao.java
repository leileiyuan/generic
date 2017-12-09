package com.belongtou.generic.daopattern.dao;

import java.util.List;

import com.belongtou.generic.daopattern.model.Customer;

public interface CustomerDao extends BaseDao<Customer> {
	
	List<Customer> findAll();
}
