/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.CurrentHolder;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.atomic.LongAccumulator;

import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 15, 2019 8:12:10 AM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class System extends JFrame {

	private JPanel contentPane;
	private JLabel timeLable; 
	private JLabel dayLable; 
	private JLabel lblEmployee;
	private JLabel employeeLabel;
	private JLabel customerLabel;
	
	public JLabel getEmployeeLabel() {
		return employeeLabel;
	}




	public JLabel getCustomerLabel() {
		return customerLabel;
	}




	public void setEmployeeLabel(JLabel employeeLabel) {
		this.employeeLabel = employeeLabel;
	}




	public void setCustomerLabel(JLabel customerLabel) {
		this.customerLabel = customerLabel;
	}




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					System frame = new System();
					
					frame.setVisible(true);
					//frame.getContentPane().setBackground(new Color(64, 64, 64));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	

	/**
	 * Create the frame.
	 */
	
	public void clock() {
		
		Thread clock = new Thread() {
			public void run() {
				try {
					while(true) {
						LocalDateTime time = LocalDateTime.now();
						int year = time.getYear();
						int month = time.getMonthValue();
						int day = time.getDayOfMonth();
						int hour = time.getHour();
						int minute = time.getMinute();
						int second = time.getSecond();
						
						String txtDay = year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
						String txtTime = String.format("%02d", (hour>12?(hour%12):hour))+":"+String.format("%02d", minute)+":"+String.format("%02d", second)+ " "+(hour>12?"PM":"AM");
						//String.format("%02d:%02d:%02d %d", hour, minute, second, (hour>12?"PM":"AM"));
						//hour +":"+ minute +":"+second+" "+(hour>12?"PM":"AM");
						dayLable.setText(txtDay);
						dayLable.setForeground(new Color(255, 204, 0));
						dayLable.setFont(new Font("Microsoft Tai Le", Font.BOLD, 45));
						
						timeLable.setText(txtTime);
						timeLable.setForeground(new Color(255, 204, 0));
						timeLable.setFont(new Font("Microsoft Tai Le", Font.BOLD, 45));
						sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		clock.start();
		
		
	} 
	
	public System() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imag\\logo.png"));
		setTitle("MacDonald System");
		clock();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400 , 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 0));
		panel.setBounds(65, 125, 1050, 664);
		contentPane.add(panel);
		
		timeLable = new JLabel("");
		timeLable.setBounds(105, 880, 455, 41);
		contentPane.add(timeLable);
		
		dayLable = new JLabel("");
		dayLable.setBounds(110, 812, 455, 41);
		contentPane.add(dayLable);
		
		lblEmployee = new JLabel("Employee:");
		lblEmployee.setForeground(new Color(255, 204, 0));
		lblEmployee.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		lblEmployee.setBounds(400, 810, 287, 27);
		contentPane.add(lblEmployee);
		
		JLabel lblCustomer = new JLabel("Customer:");
		lblCustomer.setForeground(new Color(255, 204, 0));
		lblCustomer.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		lblCustomer.setBounds(740, 810, 323, 27);
		contentPane.add(lblCustomer);
		
		employeeLabel = new JLabel("");
		employeeLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		employeeLabel.setBounds(400, 860, 200, 56);
		contentPane.add(employeeLabel);
		employeeLabel.setForeground(new Color(255, 204, 0));
		
		customerLabel = new JLabel("");
		customerLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 30));
		customerLabel.setBounds(740, 860, 200, 56);
		contentPane.add(customerLabel);
		customerLabel.setForeground(new Color(255, 204, 0));
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 105, 1300, 15);
		contentPane.add(separator);
		
		JLabel titleName = new JLabel("MacDonald System");
		titleName.setForeground(new Color(255, 204, 0));
		titleName.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 50));
		titleName.setBounds(67, 27, 425, 60);
		contentPane.add(titleName);
		
		
		JButton btnOrders = new JButton("Orders");
		
		
		btnOrders.setBackground(new Color(255, 204, 0));
		
		btnOrders.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnOrders.setBounds(1155, 125, 138, 100);
		contentPane.add(btnOrders);
		
		JButton btnCustomers = new JButton("Customers");
		btnCustomers.setBackground(new Color(255, 204, 0));
		btnCustomers.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnCustomers.setBounds(1155, 260, 138, 100);
		contentPane.add(btnCustomers);
		
		JButton btnEmployees = new JButton("Employees");
		btnEmployees.setBackground(new Color(255, 204, 0));
		btnEmployees.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnEmployees.setBounds(1155, 395, 138, 100);
		contentPane.add(btnEmployees);
		
		JButton btnSales = new JButton("Sales");
		btnSales.setBackground(new Color(255, 204, 0));
		btnSales.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnSales.setBounds(1155, 530, 138, 100);
		contentPane.add(btnSales);
		
		JLabel label = new JLabel("");
		ImageIcon imageIcon = new ImageIcon(new ImageIcon("imag\\logo.png").getImage().getScaledInstance(125, 85, Image.SCALE_DEFAULT));
		label.setIcon(imageIcon);
		label.setBounds(495, 13, 125, 85);
		contentPane.add(label);
		
		JButton btnLoginEmployee = new JButton("Login");
		btnLoginEmployee.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnLoginEmployee.setBackground(new Color(255, 204, 0));
		btnLoginEmployee.setBounds(610, 830, 100, 80);
		contentPane.add(btnLoginEmployee);
		
		JButton btnLoginCustomer = new JButton("Login");
		btnLoginCustomer.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
		btnLoginCustomer.setBackground(new Color(255, 204, 0));
		btnLoginCustomer.setBounds(950, 830, 100, 80);
		contentPane.add(btnLoginCustomer);
	}
}
