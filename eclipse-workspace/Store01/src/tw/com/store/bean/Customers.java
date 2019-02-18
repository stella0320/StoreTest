/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;
/**
* Project:tw.com.pcschool.storeStore
* Time: Jan 10, 2019 2:34:14 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class Customers extends Point{
	//顧客編碼
	private String code;
	//顧客名字
	private String customersName;
	private String phone;
	private String note;
	
	//外加
	private static Customers customer = new Customers();
	
	/**
	 * constructor<br>
	  * 即消費即為會員<br>
	 * 所以消費者消費先檢查是否為會員:<br>
	 * 是 -> 直接用資料庫資料<br>
	 * 否 -> 新建立會員資料<br>* 
	 */
	
	public static Customers getCustomer() {
		return customer;
	}
	
	public Customers() {
		super();
	}
	
	public Customers(String code, String customersName, String phone, String note) {
		super();
		setCode(code);
		setCustomersName(customersName);
		setPhone(phone);
		setNote(note);
	}
	
	/**
	 * @param code 
	 * @param customersName
	 * @param point 由資料庫查詢到點數輸入
	 * @param phone
	 * 
	 */
	
	
	public Customers(String code, String customersName, int point, String phone) {
		super(point);
		setCode(code);
		setCustomersName(customersName);
		setPhone(phone);
		
	}
    
	public Customers(String code, String customersName, int point, String phone, String note) {
		this(code,customersName,point,phone);
		setNote(note);
	}
	
	public String getCustomersName() {
		return customersName;
	}

	public String getCode() {
		return code;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getNote() {
		return note;
	}
	/**
	 * 
	 * @param customersName
	 */
	public void setCustomersName(String customersName) {
		this.customersName = customersName;
	}
	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Customers [code=" + code + ", customersName=" + customersName + ", phone=" + phone + ", note=" + note
				+ ", point=" + getPoint() + "]";
	}
	
	

}
