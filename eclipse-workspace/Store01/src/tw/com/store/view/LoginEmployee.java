/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 15, 2019 8:23:02 AM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class LoginEmployee extends JFrame{

	private final JPanel contentPanel = new JPanel();
    private static JFrame dialog;
    private LoginPanel mainPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog = new LoginEmployee();
			dialog.setVisible(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("imag\\1179794987.jpg"));
		setBounds(100, 100, 599, 433);
		setTitle("Employee Login");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		mainPanel = new LoginPanel();
		mainPanel.getTitleLabel().setBounds(109, 21, 345, 51);
		mainPanel.getTitleLabel().setText("Employee Login");
		mainPanel.setBounds(10, 10, 563, 350);
		contentPanel.add(mainPanel);
		
		
		mainPanel.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = mainPanel.getUserName().getText().trim();
				String userPassword = String.valueOf(mainPanel.getUserPassword().getPassword());
				
				
				if((userName.equals("john")) && (userPassword.equals("a1234"))) {
					
					//dialog.setVisible(false);
					dialog.setVisible(false);
					LoginCustomer LoginCs = new LoginCustomer();
					LoginCs.setVisible(true);
					
					
					LoginCs.getMainPanelCs().getLoginButton().addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							String userNameCs = LoginCs.getMainPanelCs().getUserName().getText().trim();
							String userPasswordCs = String.valueOf(LoginCs.getMainPanelCs().getUserPassword().getPassword());
							
							
							if((userNameCs.equals("kelly")) && (userPasswordCs.equals("1234"))) {
								LoginCs.setVisible(false);
								System mainSystem = new System();
								mainSystem.setVisible(true);
								//mainSystem.getContentPane().setBackground(new Color(64, 64, 64));
								mainSystem.getCustomerLabel().setText(userNameCs.toUpperCase());
								mainSystem.getEmployeeLabel().setText(userName.toUpperCase());
								
							}else {
								LoginCs.getMainPanelCs().getUserName().setText(null);
								LoginCs.getMainPanelCs().getUserPassword().setText(null);;
								JOptionPane.showMessageDialog(null, "Login Again.", "Warning!!!", 1);
							}
						}
						
						
					} );
					
					
				
					
				}else {
					mainPanel.getUserName().setText(null);
					mainPanel.getUserPassword().setText(null);;
					JOptionPane.showMessageDialog(null, "Login Again.", "Warning!!!", 1);
					
				}
			}
		});
		
	}
}
