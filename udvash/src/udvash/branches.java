package udvash;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class branches extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					branches frame = new branches();
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
	public branches() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToUdvash = new JLabel("Welcome to Udvash Record System");
		lblWelcomeToUdvash.setBounds(51, 12, 374, 40);
		contentPane.add(lblWelcomeToUdvash);
		
		JButton btnMotijheel = new JButton("Motijheel");
		btnMotijheel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motijheel mo = new Motijheel();
				mo.setVisible(true);
			}
		});
		btnMotijheel.setBounds(39, 170, 117, 25);
		contentPane.add(btnMotijheel);
		
		JButton btnFarmgate = new JButton("Farmgate");
		btnFarmgate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Farmgate farm = new Farmgate();
				farm.setVisible(true);
			}
		});
		btnFarmgate.setBounds(180, 170, 117, 25);
		contentPane.add(btnFarmgate);
		
		JButton btnDhanmondi = new JButton("Dhanmondi");
		btnDhanmondi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dhanmondhi dha = new Dhanmondhi();
				dha.setVisible(true);
			}
		});
		btnDhanmondi.setBounds(321, 170, 117, 25);
		contentPane.add(btnDhanmondi);
		
		JLabel lblBranches = new JLabel("Branches");
		lblBranches.setBounds(180, 93, 91, 25);
		contentPane.add(lblBranches);
	}

}
