/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 15, 2019 9:28:06 AM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class LoginPanel extends JPanel {
	//需要正規化
	private JTextField userName;
	private JPasswordField userPassword;
	private JLabel titleLabel;
	private JButton loginButton;
	
	public JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
	}

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		setBackground(new Color(64, 64, 64));
		setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(94, 82, 372, 2);
		add(separator);
		
		titleLabel = new JLabel("XXX Login");
		titleLabel.setForeground(new Color(255, 204, 0));
		titleLabel.setFont(new Font("Consolas", Font.BOLD, 44));
		titleLabel.setBounds(159, 21, 242, 51);
		add(titleLabel);
		
		JLabel label = new JLabel("User Name:");
		label.setForeground(new Color(255, 204, 0));
		label.setFont(new Font("Consolas", Font.BOLD, 20));
		label.setBounds(74, 125, 119, 39);
		add(label);
		
		JLabel label_1 = new JLabel("User Password:");
		label_1.setForeground(new Color(255, 204, 0));
		label_1.setFont(new Font("Consolas", Font.BOLD, 20));
		label_1.setBounds(74, 184, 160, 39);
		add(label_1);
		
		userName = new JTextField();
		userName.setFont(new Font("Consolas", Font.PLAIN, 15));
		userName.setColumns(10);
		userName.setBounds(203, 130, 263, 31);
		add(userName);
		
		userPassword = new JPasswordField();
		userPassword.setFont(new Font("Consolas", Font.PLAIN, 15));
		userPassword.setBounds(254, 189, 212, 31);
		add(userPassword);
		
		loginButton = new JButton("Login");
		loginButton.setForeground(new Color(64, 64, 64));
		loginButton.setBackground(new Color(255, 204, 0));
		loginButton.setFont(new Font("Consolas", Font.BOLD, 25));
		loginButton.setBounds(212, 272, 136, 48);
		add(loginButton);

	}
	
	public JTextField getUserName() {
		return userName;
	}

	public JPasswordField getUserPassword() {
		return userPassword;
	}

	public void setUserName(JTextField userName) {
		this.userName = userName;
	}

	public void setUserPassword(JPasswordField userPassword) {
		this.userPassword = userPassword;
	}

	public void setTitleLabel(JLabel titleLabel) {
		this.titleLabel = titleLabel;
	}

	public JLabel getTitleLabel() {
		return titleLabel;
	}
	
	
	
	

}
