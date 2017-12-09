package com.belongtou.generic.daopattern.dao.impl;

import java.io.Serializable;

import com.belongtou.generic.daopattern.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Override
	public void add(T t) {
		System.err.println("add " + this.getClass().getName());
	}

	@Override
	public void update(T t) {
		System.err.println("update " + this.getClass().getName());
	}

	@Override
	public void delete(Serializable id) {
		System.err.println("delete " + this.getClass().getName());
	}

	@Override
	public T findOne(Serializable id) {
		System.err.println("findOne " + this.getClass().getName());
		return null;
	}

}
