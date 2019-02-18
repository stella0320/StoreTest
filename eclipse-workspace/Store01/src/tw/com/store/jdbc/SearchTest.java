/*
* Hannah Chen &copy 
*/
package tw.com.store.jdbc;

import java.util.List;

import tw.com.store.bean.Customers;
import tw.com.store.dao.MainDao;
import tw.com.store.daofactory.CustomerDaoFactory;

/**
* Project:tw.com.store.jdbcStore01
* Time: Jan 12, 201912:00:40 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/

/*
 * 從資料庫撈取資料做查詢動作
 * 以顧客資料為例
 */

public class SearchTest {
	

	public static void main(String[] args) {
		
		MainDao<Customers> cdao = CustomerDaoFactory.getDaoFactory();
		Customers customerList3 = cdao.findByCode("A2019011200005");
		List<Customers> customerList1 = cdao.findByName("peter");
		List<Customers> customerList4 = cdao.findByName("kelly");
		List<Customers> customerList2 = cdao.findByPhone("0968245829");
		System.out.println("---findByName('peter')-----");
		System.out.println(customerList1.get(0));
		System.out.println("---findByName('kelly')-----");
		System.out.println(customerList4.get(0));
		System.out.println("-----findByPhone('0968245829')-------");
		System.out.println(customerList2.get(0));
		System.out.println("-----findByCode('A2019011200005')-----");
		System.out.println(customerList3);
		System.out.println(customerList3.getCode());
		
		
		
//		
	}
	
}
