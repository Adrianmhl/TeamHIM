package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class MenuBet extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuBet frame = new MenuBet();
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
	public MenuBet() {
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
		
				JLabel lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setIcon(new ImageIcon(MenuBet.class.getResource("/res/ProjLogo.jpeg")));
				lblNewLabel_5.setBounds(10, 11, 112, 87);
				panel_1.add(lblNewLabel_5);

		JPanel tab2_2 = new JPanel();
		tab2_2.setBackground(Color.RED);
		tab2_2.setBounds(10, 166, 126, 21);
		panel_1.add(tab2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Besuchsbericht");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(0, 0, 116, 18);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
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
				tabbedPane.setSelectedIndex(2);
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
				
				JPanel tab2_2_3 = new JPanel();
				tab2_2_3.setLayout(null);
				tab2_2_3.setBackground(Color.RED);
				tab2_2_3.setBounds(10, 134, 126, 21);
				panel_1.add(tab2_2_3);
				
						JLabel lblNewLabel_1_1 = new JLabel("Bewerbung BPS-Student");
						lblNewLabel_1_1.setBounds(0, 0, 126, 24);
						tab2_2_3.add(lblNewLabel_1_1);
						lblNewLabel_1_1.setForeground(Color.WHITE);
						lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
						lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								tabbedPane.setSelectedIndex(0);
							}
						});
						lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 11));

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

		JLabel lblNewLabel_3 = new JLabel("Bewerbung auf BPS-Student");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 0, 252, 32);
		panel_3.add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Bericht versenden");
		btnNewButton.setBounds(273, 274, 155, 23);
		panel_3.add(btnNewButton);
		
		table = new JTable();
		table.setToolTipText("");
		table.setBounds(22, 44, 366, 218);
		panel_3.add(table);
		
		textField_6 = new JTextField();
		textField_6.setBounds(20, 44, 349, 202);
		panel_3.add(textField_6);
		textField_6.setColumns(10);

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

		JLabel lblNewLabel_3_1 = new JLabel("Besuchsbericht");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 0, 252, 32);
		panel_4.add(lblNewLabel_3_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(50, 51, 36, 16);
		panel_6.add(lblNewLabel);

		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(50, 78, 55, 16);
		panel_6.add(lblVorname);

		JLabel lblUnternehmer = new JLabel("Mitarbeiternummer");
		lblUnternehmer.setBounds(50, 105, 120, 16);
		panel_6.add(lblUnternehmer);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 132, 34, 16);
		panel_6.add(lblEmail);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Profil");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_1_1.setBounds(10, 0, 252, 32);
		panel_6.add(lblNewLabel_3_1_1_1);

		textField = new JTextField();
		textField.setBounds(232, 50, 280, 18);
		panel_6.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(232, 76, 280, 18);
		panel_6.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(232, 103, 280, 18);
		panel_6.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(232, 130, 280, 18);
		panel_6.add(textField_3);

		JPanel panel = new JPanel();
		panel.setBounds(116, 361, 10, 10);
		contentPane.add(panel);
	}
}
