/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 18, 2019 8:40:46 PM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class SystemEmployeePanel extends SystemCustomerPanel {
	
	private JLabel employeeLabel;
	private JButton btnCustomers;
	private JButton btnSales;
	private JButton btnEmployees;
	
	
	
	public void addbtnCustomersListener(ActionListener listener) {
		btnCustomers.addActionListener(listener);
	}
	
	public void addbtnSalesListener(ActionListener listener) {
		btnSales.addActionListener(listener);
	}
	
	public void addbtnEmployeesListener(ActionListener listener) {
		btnEmployees.addActionListener(listener);
	}
	
	
	public void setEmployeeLabel(JLabel employeeLabel) {
		this.employeeLabel = employeeLabel;
	}

	private JButton btnLoginEmployee;

	/**
	 * Create the panel.
	 */
	public SystemEmployeePanel() {
		
		setBounds(0, 0, 1400 , 1000);
		setBackground(new Color(64, 64, 64));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee:");
		lblEmployee.setForeground(new Color(255, 204, 0));
		lblEmployee.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		lblEmployee.setBounds(400, 810, 287, 27);
		add(lblEmployee);
		
		
		employeeLabel = new JLabel("");
		employeeLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		employeeLabel.setBounds(400, 860, 200, 56);
		add(employeeLabel);
		employeeLabel.setForeground(new Color(255, 204, 0));
		
		btnCustomers = new JButton("Customers");
		btnCustomers.setBackground(new Color(255, 204, 0));
		btnCustomers.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnCustomers.setBounds(1155, 260, 138, 100);
		add(btnCustomers);
		
		btnEmployees = new JButton("Employees");
		btnEmployees.setBackground(new Color(255, 204, 0));
		btnEmployees.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnEmployees.setBounds(1155, 395, 138, 100);
		add(btnEmployees);
		
		btnSales = new JButton("Sales");
		btnSales.setBackground(new Color(255, 204, 0));
		btnSales.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnSales.setBounds(1155, 530, 138, 100);
		add(btnSales);
		
		JLabel label = new JLabel("");
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("imag\\logo.png").getImage().getScaledInstance(125, 85, Image.SCALE_DEFAULT));
		label.setIcon(imageIcon);
		label.setBounds(495, 13, 125, 85);
		add(label);
		
		btnLoginEmployee = new JButton("Login");
		btnLoginEmployee.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnLoginEmployee.setBackground(new Color(255, 204, 0));
		btnLoginEmployee.setBounds(610, 830, 100, 80);
		add(btnLoginEmployee);
		
		
		
		
		
		
		
		
	}
	


}
