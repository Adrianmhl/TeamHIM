package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtBenutzer;
	private JTextField txtPasswort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 120, 361);
		panel_1.setBackground(Color.RED);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel tab1 = new JPanel();
		tab1.setBounds(0, 70, 120, 21);
		panel_1.add(tab1);

		JLabel lblNewLabel = new JLabel("Log-in");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 10));
		tab1.add(lblNewLabel);

		JPanel tab2 = new JPanel();
		tab2.setBounds(0, 102, 120, 21);
		panel_1.add(tab2);

		JLabel lblNewLabel_1 = new JLabel("BPS-Formular");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 10));
		tab2.add(lblNewLabel_1);

		JPanel tab2_1 = new JPanel();
		tab2_1.setBounds(0, 134, 120, 21);
		panel_1.add(tab2_1);

		JLabel lblNewLabel_1_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 10));
		tab2_1.add(lblNewLabel_1_1);

		JPanel tab2_2 = new JPanel();
		tab2_2.setBounds(0, 166, 120, 21);
		panel_1.add(tab2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Dokumente");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 10));
		tab2_2.add(lblNewLabel_1_2);

		JPanel tab2_2_1 = new JPanel();
		tab2_2_1.setBounds(0, 198, 120, 21);
		panel_1.add(tab2_2_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 10));
		tab2_2_1.add(lblNewLabel_1_2_1);

		JLabel lblNewLabel_2 = new JLabel("LOGO");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 100, 48);
		panel_1.add(lblNewLabel_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBounds(0, 0, 684, 50);
		contentPane.add(panel_2);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(119, 61, 565, 300);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);

		txtBenutzer = new JTextField();
		txtBenutzer.setHorizontalAlignment(SwingConstants.CENTER);
		txtBenutzer.setText("Benutzer");
		txtBenutzer.setBounds(10, 11, 244, 20);
		panel.add(txtBenutzer);
		txtBenutzer.setColumns(10);

		txtPasswort = new JTextField();
		txtPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		txtPasswort.setText("Passwort");
		txtPasswort.setColumns(10);
		txtPasswort.setBounds(10, 42, 244, 20);
		panel.add(txtPasswort);

		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.setBounds(165, 73, 89, 23);
		panel.add(btnNewButton_1);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("BPS-Formular Abgabe");
		lblNewLabel_3.setBounds(10, 0, 252, 32);
		panel_3.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(10, 43, 341, 20);
		panel_3.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 74, 341, 20);
		panel_3.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 105, 341, 20);
		panel_3.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 136, 341, 20);
		panel_3.add(textField_3);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(262, 167, 89, 23);
		panel_3.add(btnNewButton);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);

		JButton btnNewButton_2 = new JButton("hochladen");
		btnNewButton_2.setBounds(10, 154, 89, 23);
		panel_4.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("hochladen");
		btnNewButton_2_1.setBounds(105, 154, 89, 23);
		panel_4.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("hochladen");
		btnNewButton_2_2.setBounds(204, 154, 89, 23);
		panel_4.add(btnNewButton_2_2);

		JLabel lblNewLabel_3_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_3_1.setBounds(10, 11, 252, 32);
		panel_4.add(lblNewLabel_3_1);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_3_2 = new JLabel("Dokumente");
		lblNewLabel_3_2.setBounds(10, 11, 252, 32);
		panel_5.add(lblNewLabel_3_2);

		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel_3_2_1 = new JLabel("Profil");
		lblNewLabel_3_2_1.setBounds(10, 11, 252, 32);
		panel_6.add(lblNewLabel_3_2_1);
	}
}
