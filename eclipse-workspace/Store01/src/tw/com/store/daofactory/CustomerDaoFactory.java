/*
* Hannah Chen &copy 
*/
package tw.com.store.daofactory;

import tw.com.store.bean.Customers;
import tw.com.store.dao.MainDao;
import tw.com.store.daoimpl.CustomerDaoImpl;

/**
* Project:tw.com.store.daofactoryStore01
* Time: Jan 12, 20191:32:10 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class CustomerDaoFactory {
	
	public static MainDao<Customers> getDaoFactory() {
		return new CustomerDaoImpl();
	}
	
}
