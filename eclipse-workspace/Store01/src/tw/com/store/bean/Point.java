/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;

import java.math.BigDecimal;

/**
* Project:tw.com.store.beanStore
* Time: Jan 10, 20192:53:21 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class Point {
	private int point;
	
	//constructor
	public Point() {
		setPoint(0);
	}
	/**
	 * 
	 * @param point 目前點數
	 */
	public Point(int point) {
		setPoint(point);
	}
	
	public int getPoint() {
		return point;
	}
	
	/**
	 * 
	 * @param point
	 */
	public void setPoint(int point) {
		if(point<0) {
			throw new IllegalArgumentException("point must be more than 0.");
		}else {
			this.point = point;
		}
	}

	
	/**
	 * 以300點可以折抵1元
	 * @return 目前該會員可折抵最大現金折扣
	 */
	public int discountMoney() {
		BigDecimal unit = new BigDecimal("300.0");
		BigDecimal np = new BigDecimal(getPoint());
		int money = np.divide(unit, 0, 1).intValue();
		return money;
	}

	//該訂單增加點數並更新點數
	//消費一元一點
	/**
	 * 透過訂單來計算增加會員點數
	 * @param orders
	 */
	public void addPoint(Orders orders) {
		int newPoint = orders.getSales().intValue();
		setPoint(getPoint() + newPoint);
	}
	
	/**
	 * 透過訂單，顧客可以指定折扣現金多寡，來更新會員點數以及計算最後顧客付款金額
	 * @param orders 顧客訂單
	 * @param deleteMoney 可以設定折抵現金
	 */
	public void deletPoint(Orders orders, int deleteMoney) {
		int unit = 300;
		BigDecimal dm = new BigDecimal(deleteMoney);
		
		if(deleteMoney*unit > getPoint()) {
			orders.setSales(orders.getSales().subtract(new BigDecimal(discountMoney())));
			setPoint(getPoint() - discountMoney()*unit);
			throw new IllegalArgumentException("點數不足，已抵銷最大折扣金額");			
		}else {
			orders.setSales(orders.getSales().subtract(dm));
			setPoint(getPoint() - deleteMoney*unit);
		}
		
	}
	
	
	
	
	

}
