/*
* Hannah Chen &copy 
*/
package tw.com.store.dao;

import java.util.List;


/**
* Project:tw.com.store.daoStore01
* Time: Jan 12, 20191:00:26 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public interface MainDao<T> {
	public void add(T t);
	
	public T findByCode(String code);
	
	public List<T> findByName(String name);
	
	public List<T> findByPhone(String phone);
	
	public List<T> getData(String column);
	
}
