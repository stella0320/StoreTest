/*
* Hannah Chen &copy 
*/
package tw.com.store.dao;

import java.util.List;

import tw.com.store.bean.Customers;

/**
* Project:tw.com.store.daoStore01
* Time: Jan 12, 201912:42:15 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public interface CustomerDao {
	
	public void addCustomer(Customers customer);
	
	public Customers findByCustomerCode(String customerCode);
	
	public List<Customers> findByCustomerName(String customerName);
	
	public List<Customers> findByCustomerPhone(String customerPhone);

}
