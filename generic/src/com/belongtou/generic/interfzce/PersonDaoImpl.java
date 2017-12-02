package com.belongtou.generic.interfzce;

/**
 * 泛型 接口
 */
interface BaseDao<T> {
	// 泛型方法
	public void save(T t);

	public void update(T t);

	// K的类型没有接口上定义，类型是在调用该方法时传入的参数类型确定
	public <K> void select(K k);
}

class AbstractBaseDao<T> implements BaseDao<T> {

	@Override
	public void save(T t) {
	}

	@Override
	public void update(T t) {
	}

	// K 的类型是在调用 该方法时 传入的参数类型 确定 
	@Override
	public <K> void select(K k) {
	}

}

/**
 * 根据实现类 传入的类型 来确定泛型的类型
 */
public class PersonDaoImpl extends AbstractBaseDao<Person> {

	@Override
	public void save(Person p) {
	}

	@Override
	public <K> void select(K k) {
	}
	
	private void testSelect() {
		new PersonDaoImpl().select("aaaa");
	}
}

class Person {
}

