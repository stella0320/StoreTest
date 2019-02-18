/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tw.com.store.bean.Customers;
import tw.com.store.dao.MainDao;
import tw.com.store.daofactory.CustomerDaoFactory;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

/**
* Project:tw.com.store.viewStore01
* Time: Jan 12, 20191:25:15 AM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class addCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField CustomerCode;
	private JTextField CustomerName;
	private JTextField CustomerPhone;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCustomer frame = new addCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addCustomer() {
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("顧客編號:");
		label.setBounds(43, 21, 113, 30);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("顧客姓名:");
		label_1.setBounds(43, 83, 113, 30);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("顧客電話:");
		label_2.setBounds(43, 145, 113, 30);
		contentPane.add(label_2);
		
		CustomerCode = new JTextField();
		CustomerCode.setBounds(178, 18, 186, 36);
		contentPane.add(CustomerCode);
		CustomerCode.setColumns(10);
		
		CustomerName = new JTextField();
		CustomerName.setColumns(10);
		CustomerName.setBounds(178, 80, 186, 36);
		contentPane.add(CustomerName);
		
		CustomerPhone = new JTextField();
		CustomerPhone.setColumns(10);
		CustomerPhone.setBounds(178, 142, 186, 36);
		contentPane.add(CustomerPhone);
		
		label_3 = new JLabel("備註:");
		label_3.setBounds(43, 207, 91, 30);
		contentPane.add(label_3);
		
		JTextArea noteText = new JTextArea();
		noteText.setBounds(178, 201, 186, 88);
		contentPane.add(noteText);
		
		JButton btnNewButton = new JButton("Add Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = CustomerCode.getText().trim();
				String name = CustomerName.getText().trim();
				String phone = CustomerPhone.getText().trim();
				String note = noteText.getText().trim();
				
				MainDao<Customers> cdao = CustomerDaoFactory.getDaoFactory();
				
				Customers customer = new Customers(code, name, phone, note);
				
				cdao.add(customer);
				JOptionPane.showMessageDialog(null, "新增一筆"+code+"資料...", "新增資料", 1);
				
				CustomerCode.setText("");
				CustomerName.setText("");
				CustomerPhone.setText("");
				noteText.setText("");
				
				
			}
		});
		btnNewButton.setBounds(155, 310, 246, 39);
		contentPane.add(btnNewButton);
		
		
	}
}
