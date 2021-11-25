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

public class MenuStu extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	private JTextField txtMatrikelnummer;
	private JTextField txtName;
	private JTextField txtUnternehmen;
	private JTextField txtZeitraum;
	private JTextField txtBeschreibung;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuStu frame = new MenuStu();
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
	public MenuStu() {
		setResizable(false);
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 146, 361);
		panel_1.setBackground(Color.RED);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel tab2 = new JPanel();
		tab2.setBackground(Color.RED);
		tab2.setBounds(10, 102, 126, 21);
		panel_1.add(tab2);

		JLabel lblNewLabel_1 = new JLabel("BPS-Formular");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 0, 116, 21);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		tab2.setLayout(null);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		tab2.add(lblNewLabel_1);

		JPanel tab2_1 = new JPanel();
		tab2_1.setBackground(Color.RED);
		tab2_1.setBounds(10, 134, 126, 21);
		panel_1.add(tab2_1);

		JLabel lblNewLabel_1_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(0, 0, 141, 18);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		tab2_1.setLayout(null);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		tab2_1.add(lblNewLabel_1_1);

		JPanel tab2_2 = new JPanel();
		tab2_2.setBackground(Color.RED);
		tab2_2.setBounds(10, 166, 126, 21);
		panel_1.add(tab2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Dokumente");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(0, 0, 116, 18);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		tab2_2.setLayout(null);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		tab2_2.add(lblNewLabel_1_2);

		JPanel tab2_2_1 = new JPanel();
		tab2_2_1.setBackground(Color.RED);
		tab2_2_1.setBounds(10, 198, 126, 21);
		panel_1.add(tab2_2_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBackground(Color.RED);
		lblNewLabel_1_2_1.setBounds(0, 0, 116, 18);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		tab2_2_1.setLayout(null);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 11));
		tab2_2_1.add(lblNewLabel_1_2_1);

		JPanel tab2_2_2 = new JPanel();
		tab2_2_2.setLayout(null);
		tab2_2_2.setBackground(Color.RED);
		tab2_2_2.setBounds(0, 329, 136, 21);
		panel_1.add(tab2_2_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("Logout");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Login log = new Login();
				log.setVisible(true);
				dispose();

			}
		});
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(10, 0, 116, 18);
		tab2_2_2.add(lblNewLabel_1_2_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBounds(0, 0, 684, 27);
		contentPane.add(panel_2);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 0, 539, 361);
		contentPane.add(tabbedPane);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("BPS-Formular Abgabe");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 0, 252, 32);
		panel_3.add(lblNewLabel_3);

		txtMatrikelnummer = new JTextField();
		txtMatrikelnummer.setForeground(Color.GRAY);
		txtMatrikelnummer.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtMatrikelnummer.setText("Matrikelnummer");
		txtMatrikelnummer.setBounds(35, 51, 341, 20);
		panel_3.add(txtMatrikelnummer);
		txtMatrikelnummer.setColumns(10);

		txtName = new JTextField();
		txtName.setForeground(Color.GRAY);
		txtName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtName.setText("Name");
		txtName.setColumns(10);
		txtName.setBounds(35, 82, 341, 20);
		panel_3.add(txtName);

		txtUnternehmen = new JTextField();
		txtUnternehmen.setForeground(Color.GRAY);
		txtUnternehmen.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtUnternehmen.setText("Unternehmen");
		txtUnternehmen.setColumns(10);
		txtUnternehmen.setBounds(35, 113, 341, 20);
		panel_3.add(txtUnternehmen);

		txtZeitraum = new JTextField();
		txtZeitraum.setForeground(Color.GRAY);
		txtZeitraum.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtZeitraum.setText("Zeitraum");
		txtZeitraum.setColumns(10);
		txtZeitraum.setBounds(35, 144, 341, 20);
		panel_3.add(txtZeitraum);

		JButton btnNewButton = new JButton("best\u00E4tigen");
		btnNewButton.setBounds(273, 274, 103, 23);
		panel_3.add(btnNewButton);

		txtBeschreibung = new JTextField();
		txtBeschreibung.setForeground(Color.GRAY);
		txtBeschreibung.setText("Beschreibung");
		txtBeschreibung.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtBeschreibung.setColumns(10);
		txtBeschreibung.setBounds(35, 175, 341, 88);
		panel_3.add(txtBeschreibung);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);

		JButton btnNewButton_2 = new JButton("hochladen");
		btnNewButton_2.setBounds(10, 164, 89, 23);
		panel_4.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("hochladen");
		btnNewButton_2_1.setBounds(109, 164, 89, 23);
		panel_4.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("hochladen");
		btnNewButton_2_2.setBounds(208, 164, 89, 23);
		panel_4.add(btnNewButton_2_2);

		JLabel lblNewLabel_3_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 0, 252, 32);
		panel_4.add(lblNewLabel_3_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_3_1_1 = new JLabel("Dokumente");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(10, 0, 252, 32);
		panel_5.add(lblNewLabel_3_1_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel_3_1_2 = new JLabel("Profil");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(10, 0, 252, 32);
		panel_6.add(lblNewLabel_3_1_2);
	}
}
