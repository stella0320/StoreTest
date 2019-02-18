/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 15, 2019 9:53:42 AM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class LoginCustomer extends JFrame {

	private final JPanel contentPanel = new JPanel();
	private static JFrame frame;
	private LoginPanel mainPanel;
	/**
	 * Launch the application.
	 */
	
	public LoginPanel getMainPanelCs() {
		return mainPanel;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginCustomer();
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
	public LoginCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 433);
		setTitle("Customer Login");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
	    mainPanel = new LoginPanel();
//		mainPanel.getLoginButton().addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				String userName = mainPanel.getUserName().getText().trim();
//				String userPassword = String.valueOf(mainPanel.getUserPassword().getPassword());
//				
//				
//				if((userName.equals("kelly")) && (userPassword.equals("1234"))) {
//					
//					//dialog.setVisible(false);
//					frame.setVisible(false);
//					new System().setVisible(true);
//					
//				}else {
//					mainPanel.getUserName().setText(null);
//					mainPanel.getUserPassword().setText(null);;
//					JOptionPane.showMessageDialog(null, "There is no user.", "Warning!!!", 1);
//					
//				}
//				
//				
//				
//			}
//		});
		mainPanel.getTitleLabel().setBounds(109, 21, 345, 51);
		mainPanel.getTitleLabel().setText("Customer Login");
		mainPanel.setBounds(10, 10, 563, 350);
		contentPanel.add(mainPanel);
	}

}
