package udvash;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(50, 63, 105, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 139, 105, 23);
		frame.getContentPane().add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(209, 68, 114, 19);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = txtusername.getText();
				String pass = txtpassword.getText();
				
				if(user.equals("admin") && pass.equals("admin123456"))
				{
					JOptionPane.showMessageDialog(frame, "You are Successfully logged in");
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				}
			}
		});
		btnLogin.setBounds(154, 191, 117, 25);
		frame.getContentPane().add(btnLogin);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(209, 141, 114, 19);
		frame.getContentPane().add(txtpassword);
	}
}
