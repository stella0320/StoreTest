/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 18, 2019 9:09:10 PM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class SystemCustomerPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton btnOrders;
	private JButton btnLoginCustomer;
	private JLabel timeLable; 
	private JLabel dayLable; 
	private JLabel customerLabel;
	
	public void addbtnLoginCustomerListener(ActionListener listener) {
		btnLoginCustomer.addActionListener(listener);
	}
	
	public void addbtnOrders(ActionListener listener) {
		btnOrders.addActionListener(listener);
	}
	
	
	public JLabel getTimeLable() {
		return timeLable;
	}
	public JLabel getDayLable() {
		return dayLable;
	}
	public JLabel getCustomerLabel() {
		return customerLabel;
	}
	
	/**
	 * Create the panel.
	 */
	public SystemCustomerPanel() {
		
		setBounds(0, 0, 1400 , 1000);
		setBackground(new Color(64, 64, 64));
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		
		
		timeLable = new JLabel("");
		timeLable.setBounds(105, 880, 455, 41);
		add(timeLable);
		
		dayLable = new JLabel("");
		dayLable.setBounds(110, 812, 455, 41);
		add(dayLable);
		
		JLabel lblCustomer = new JLabel("Customer:");
		lblCustomer.setBounds(740, 810, 323, 27);
		lblCustomer.setForeground(new Color(255, 204, 0));
		lblCustomer.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		add(lblCustomer);
		
		customerLabel = new JLabel("");
		customerLabel.setBounds(740, 860, 200, 56);
		customerLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		add(customerLabel);
		customerLabel.setForeground(new Color(255, 204, 0));

	    btnOrders = new JButton("Orders");
		
		btnOrders.setBackground(new Color(255, 204, 0));
		
		btnOrders.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnOrders.setBounds(1155, 125, 138, 100);
		add(btnOrders);
		
		btnLoginCustomer = new JButton("Login");
		btnLoginCustomer.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnLoginCustomer.setBackground(new Color(255, 204, 0));
		btnLoginCustomer.setBounds(950, 830, 100, 80);
		add(btnLoginCustomer);
		
		

		
		
		
		
		
		
	}

}
