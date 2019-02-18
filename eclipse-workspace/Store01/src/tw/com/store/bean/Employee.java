/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;
/**
* Project:tw.com.store.beanStore
* Time: Jan 10, 201911:34:57 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class Employee {
	//顧客編碼
	private String code;
	//顧客名字
	private String employeeName;
	private String phone;
	private String type;
	private String note;
	
	
	public Employee(String code, String employeeName, String phone, String type) {
		this.code = code;
		this.employeeName = employeeName;
		this.phone = phone;
		this.type = type;
		this.note = null;
	}
	
	public Employee(String code, String employeeName, String phone, String type, String note) {
		this(code, employeeName, phone, type);
		this.note = note;
	}
	
	public String getCode() {
		return code;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getPhone() {
		return phone;
	}
	public String getType() {
		return type;
	}
	public String getNote() {
		return note;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return String.format("員工編號: %s%n員工姓名: %s%n員工職位: %s%n", code, employeeName, type);
	}
	
	
	
	
	
}
