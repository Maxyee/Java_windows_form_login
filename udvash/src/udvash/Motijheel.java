package udvash;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Motijheel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Motijheel frame = new Motijheel();
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
	public Motijheel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(204, 368, 117, 25);
		contentPane.add(btnRegister);
		
		JLabel lblMotijiheelStudentRegister = new JLabel("Motijiheel Student Registration");
		lblMotijiheelStudentRegister.setBounds(169, 32, 232, 32);
		contentPane.add(lblMotijiheelStudentRegister);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setBounds(59, 81, 91, 25);
		contentPane.add(lblStudentId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(59, 121, 91, 25);
		contentPane.add(lblName);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(59, 141, 117, 37);
		contentPane.add(lblFathersName);
		
		JLabel lblCollege = new JLabel("College");
		lblCollege.setBounds(59, 179, 91, 43);
		contentPane.add(lblCollege);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(59, 234, 107, 32);
		contentPane.add(lblPhoneNumber);
		
		textField = new JTextField();
		textField.setBounds(204, 84, 197, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 124, 194, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(207, 150, 194, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(207, 191, 194, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(207, 241, 194, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
