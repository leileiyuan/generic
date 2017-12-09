package com.belongtou.generic.daopattern.dao;

import java.io.Serializable;

public interface BaseDao<T> {

	void add(T t);

	void update(T t);

	void delete(Serializable id); // string integer 联合主键

	T findOne(Serializable id);
}
