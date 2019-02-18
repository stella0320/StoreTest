/*
* Hannah Chen &copy 
*/
package tw.com.store.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

/**
* Project:tw.com.store.view Store01<br>
* Time: Feb 18, 2019 8:46:25 PM<br>
* @auther:Hannah Chen<br>
* E-mail:jud40322@gapp.nthu.edu.tw<br>
* TODO
*/
public class SystemFrame extends JFrame {

	private JPanel contentPane;
	private JPanel changePanel;
	private JPanel panelEmployee; 
	
	public JPanel getChangePanel() {
		return changePanel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemFrame frame = new SystemFrame();
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
	public SystemFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imag\\logo.png"));
		setTitle("MacDonald System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400 , 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 105, 1300, 15);
		contentPane.add(separator);
		
		JLabel titleName = new JLabel("MacDonald System");
		titleName.setForeground(new Color(255, 204, 0));
		titleName.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 50));
		titleName.setBounds(67, 27, 425, 60);
		contentPane.add(titleName);
		
		changePanel = new JPanel();
		changePanel.setBackground(new Color(255, 204, 0));
		changePanel.setBounds(65, 125, 1050, 664);
		contentPane.add(changePanel);
		

		panelEmployee = new SystemEmployeePanel();
		panelEmployee.setBounds(0, 0, 1400, 1000);
		contentPane.add(panelEmployee);
		
		
		
		
		
		
		
		
	}
}
