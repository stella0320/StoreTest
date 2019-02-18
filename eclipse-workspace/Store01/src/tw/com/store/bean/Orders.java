/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;

import java.math.BigDecimal;

/**
* Project:tw.com.store.beanStore
* Time: Jan 10, 20193:22:33 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class Orders {
	//總售價
	private BigDecimal sales;
	
	public BigDecimal getSales() {
		return sales;
	}
	
	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}
	
}
