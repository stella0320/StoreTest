/*
* Hannah Chen &copy 
*/
package tw.com.store.Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tw.com.store.bean.Customers;
import tw.com.store.dao.MainDao;
import tw.com.store.daofactory.CustomerDaoFactory;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
* Project:tw.com.store.TestStore01
* Time: Jan 14, 20192:37:40 PM
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw
* TODO
*/
public class SearchApp extends JFrame {

	private JPanel contentPane;
	private JTextField textSearch;
	private Object[] option;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchApp frame = new SearchApp();
					frame.setVisible(true);
				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerName = new JLabel("Customer Code:");
		lblCustomerName.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblCustomerName.setBounds(138, 90, 122, 29);
		contentPane.add(lblCustomerName);
		
		JLabel label = new JLabel("Customer Name:");
		label.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		label.setBounds(138, 135, 122, 29);
		contentPane.add(label);
		
		JLabel lblCustomerPhone = new JLabel("Customer Phone:");
		lblCustomerPhone.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblCustomerPhone.setBounds(138, 180, 122, 29);
		contentPane.add(lblCustomerPhone);
		
		JLabel lblCustomerNote = new JLabel("Customer Note:");
		lblCustomerNote.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblCustomerNote.setBounds(138, 270, 122, 29);
		contentPane.add(lblCustomerNote);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 64, 632, 17);
		contentPane.add(separator);
		
		JLabel lblCustomerDetail = new JLabel("Customer  Detail");
		lblCustomerDetail.setFont(new Font("Microsoft JhengHei", Font.BOLD, 30));
		lblCustomerDetail.setBounds(225, 10, 251, 44);
		contentPane.add(lblCustomerDetail);
		
		JLabel textc_code = new JLabel("");
		textc_code.setForeground(Color.DARK_GRAY);
		textc_code.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		textc_code.setBounds(276, 90, 219, 29);
		contentPane.add(textc_code);
		
		JLabel textc_name = new JLabel("");
		textc_name.setForeground(Color.DARK_GRAY);
		textc_name.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		textc_name.setBounds(276, 135, 219, 29);
		contentPane.add(textc_name);
		
		JLabel textc_phone = new JLabel("");
		textc_phone.setForeground(Color.DARK_GRAY);
		textc_phone.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		textc_phone.setBounds(276, 180, 219, 29);
		contentPane.add(textc_phone);
		
		JLabel textc_note = new JLabel("");
		textc_note.setBackground(Color.GRAY);
		textc_note.setVerticalAlignment(SwingConstants.TOP);
		textc_note.setForeground(Color.GRAY);
		textc_note.setFont(new Font("MS PGothic", Font.BOLD, 14));
		textc_note.setBounds(270, 270, 334, 121);
		contentPane.add(textc_note);
		
		JLabel lblCustomerPoint = new JLabel("Customer Point:");
		lblCustomerPoint.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		lblCustomerPoint.setBounds(138, 225, 122, 29);
		contentPane.add(lblCustomerPoint);
		
		JLabel textc_point = new JLabel("");
		textc_point.setForeground(Color.DARK_GRAY);
		textc_point.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		textc_point.setBounds(276, 225, 219, 29);
		contentPane.add(textc_point);
		
		JLabel lblBy = new JLabel("By");
		lblBy.setFont(new Font("Kristen ITC", Font.BOLD, 27));
		lblBy.setBounds(269, 407, 40, 49);
		contentPane.add(lblBy);
		
		JComboBox typeSearch = new JComboBox();
		typeSearch.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		typeSearch.setModel(new DefaultComboBoxModel(new String[] {"Code", "Name", "Phone"}));
		typeSearch.setBounds(318, 407, 135, 49);
		contentPane.add(typeSearch);
		typeSearch.setSelectedIndex(1);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 27));
		label_1.setBounds(463, 407, 17, 49);
		contentPane.add(label_1);
		
		textSearch = new JTextField();
		textSearch.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		textSearch.setBounds(473, 407, 189, 49);
		contentPane.add(textSearch);
		textSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search Customer");
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp = textSearch.getText() + "1";
				if(tmp.length()==1) {
					JOptionPane.showMessageDialog(null, "Please type what you search for ", "Warning!!!", 1);
				}else {
					MainDao<Customers> cdao = CustomerDaoFactory.getDaoFactory();
					String tsSt = (String) typeSearch.getSelectedItem();
					
					Customers customerList3 = null;
					List<Customers> customerList = null;
					String m = null;
					int dataSize;
					Customers customerUser = null;
					
					try {
						if(tsSt == "Code") {
							customerList3 = cdao.findByCode(textSearch.getText().trim());
							customerUser = customerList3;
						}else { 
							if(tsSt == "Phone") {
								customerList = cdao.findByPhone(textSearch.getText().trim());
							}else {
								customerList = cdao.findByName(textSearch.getText().trim());
							}
							dataSize = customerList.size();								
							if(dataSize > 1) {
								String[] str = new String[dataSize];
								for(int i = 0; i < dataSize; i++) {
									str[i] = customerList.get(i).getCode();
								}
								option = str;
								m  = (String) JOptionPane.showInputDialog(null, "Please choose one data you need:", "Search Result", JOptionPane.PLAIN_MESSAGE, null,option, option[0]);
								for(Customers c:customerList) {
									if(c.getCode() == m) {
										customerUser = c;
									}
								}
							}else {
								customerUser = customerList.get(0);
							}
						}
						
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "There is no data you need!", "Warning!!!", 1);
					}
					
					
					
					
					textc_code.setText(customerUser.getCode());
					textc_name.setText(customerUser.getCustomersName());
					textc_phone.setText(customerUser.getPhone());
					textc_point.setText(Integer.toString(customerUser.getPoint()));
					textc_note.setText(customerUser.getNote());
					
					
					
					
					
					
					
				}
				
				
				
			}
		});
		btnSearch.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		btnSearch.setBounds(30, 407, 219, 49);
		contentPane.add(btnSearch);
		
		JButton btn_reset = new JButton("Reset");
		btn_reset.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
		btn_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textc_code.setText(null);
				textc_name.setText(null);
				textc_phone.setText(null);
				textc_point.setText(null);
				textc_note.setText(null);
				textSearch.setText(null);
				typeSearch.setSelectedIndex(1);
			}
		});
		btn_reset.setBounds(257, 493, 135, 35);
		contentPane.add(btn_reset);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 466, 632, 17);
		contentPane.add(separator_1);
		
		
		
		
		
	}
}
