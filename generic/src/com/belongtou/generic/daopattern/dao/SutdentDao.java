package com.belongtou.generic.daopattern.dao;

import java.util.List;

import com.belongtou.generic.daopattern.model.Student;

public interface SutdentDao extends BaseDao<Student> {

	List<Student> findPageRecords(int index, int size);
}
