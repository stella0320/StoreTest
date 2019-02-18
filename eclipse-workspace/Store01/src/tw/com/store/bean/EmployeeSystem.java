/*
* Hannah Chen &copy 
*/
package tw.com.store.bean;

import java.time.*;

/**
* Project:tw.com.store.beanStore
* Time: Jan 11, 20192:36:43 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class EmployeeSystem extends Employee{
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	
	
	
	
	
	public EmployeeSystem(String code, String employeeName, String phone, String type, String note) {
		super(code, employeeName, phone, type, note);
		setDate(date);
		setTime(time);
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public LocalTime getTime() {
		return time;
	}

	@Override
	public String toString() {
		return String.format("%s現在日期: %s%n現在時間: %s", super.toString(), date, time);
	}
	
	
}
