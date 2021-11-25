package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	private JTextField txtMatrikelnummer;
	private JTextField txtName;
	private JTextField txtUnternehmen;
	private JTextField txtZeitraum;
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

	private void JLabelMouseCLicked(java.awt.event.MouseEvent evt) {
		tabbedPane.setSelectedIndex(0);
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
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 10));
		tab1.add(lblNewLabel);

		JPanel tab2 = new JPanel();
		tab2.setBounds(0, 102, 120, 21);
		panel_1.add(tab2);

		JLabel lblNewLabel_1 = new JLabel("BPS-Formular");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 10));
		tab2.add(lblNewLabel_1);

		JPanel tab2_1 = new JPanel();
		tab2_1.setBounds(0, 134, 120, 21);
		panel_1.add(tab2_1);

		JLabel lblNewLabel_1_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 10));
		tab2_1.add(lblNewLabel_1_1);

		JPanel tab2_2 = new JPanel();
		tab2_2.setBounds(0, 166, 120, 21);
		panel_1.add(tab2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Dokumente");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 10));
		tab2_2.add(lblNewLabel_1_2);

		JPanel tab2_2_1 = new JPanel();
		tab2_2_1.setBounds(0, 198, 120, 21);
		panel_1.add(tab2_2_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
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

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(119, 50, 565, 311);
		contentPane.add(tabbedPane);

		JPanel t1 = new JPanel();
		tabbedPane.addTab("New tab", null, t1, null);
		t1.setLayout(null);

		txtBenutzer = new JTextField();
		txtBenutzer.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtBenutzer.setHorizontalAlignment(SwingConstants.CENTER);
		txtBenutzer.setText("Benutzer");
		txtBenutzer.setBounds(10, 54, 244, 20);
		t1.add(txtBenutzer);
		txtBenutzer.setColumns(10);

		txtPasswort = new JTextField();
		txtPasswort.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		txtPasswort.setText("Passwort");
		txtPasswort.setColumns(10);
		txtPasswort.setBounds(10, 85, 244, 20);
		t1.add(txtPasswort);

		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.setBounds(165, 116, 89, 23);
		t1.add(btnNewButton_1);

		JLabel lblNewLabel_3_3 = new JLabel("Login");
		lblNewLabel_3_3.setBounds(10, 11, 252, 32);
		t1.add(lblNewLabel_3_3);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("BPS-Formular Abgabe");
		lblNewLabel_3.setBounds(10, 11, 252, 32);
		panel_3.add(lblNewLabel_3);

		txtMatrikelnummer = new JTextField();
		txtMatrikelnummer.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtMatrikelnummer.setText("Matrikelnummer");
		txtMatrikelnummer.setBounds(10, 43, 341, 20);
		panel_3.add(txtMatrikelnummer);
		txtMatrikelnummer.setColumns(10);

		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtName.setText("Name");
		txtName.setColumns(10);
		txtName.setBounds(10, 74, 341, 20);
		panel_3.add(txtName);

		txtUnternehmen = new JTextField();
		txtUnternehmen.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtUnternehmen.setText("Unternehmen");
		txtUnternehmen.setColumns(10);
		txtUnternehmen.setBounds(10, 105, 341, 20);
		panel_3.add(txtUnternehmen);

		txtZeitraum = new JTextField();
		txtZeitraum.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtZeitraum.setText("Zeitraum");
		txtZeitraum.setColumns(10);
		txtZeitraum.setBounds(10, 136, 341, 20);
		panel_3.add(txtZeitraum);

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
