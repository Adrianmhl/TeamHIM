package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Datenbank.Datenbank;

public class Registrierung extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatrnr;
	private JTextField txtVorname;
	private JTextField txtName;
	private JTextField txtMail;
	private JTextField txtPasswort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Registrierung frame = new Registrierung();
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
	public Registrierung() {
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.RED);
		panel_1_2.setBounds(0, 0, 156, 361);
		contentPane.add(panel_1_2);

		JPanel tab2_2_2_1 = new JPanel();
		tab2_2_2_1.setLayout(null);
		tab2_2_2_1.setBackground(Color.RED);
		tab2_2_2_1.setBounds(0, 329, 136, 21);
		panel_1_2.add(tab2_2_2_1);

		JLabel lblNewLabel_1_2_2_1 = new JLabel("Zur\u00FCck");
		lblNewLabel_1_2_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2_2_1.setBounds(10, 0, 116, 18);
		tab2_2_2_1.add(lblNewLabel_1_2_2_1);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(150, 11, 534, 333);
		contentPane.add(panel_3);

		JLabel lblNewLabel_3 = new JLabel("Registrierung");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 0, 252, 32);
		panel_3.add(lblNewLabel_3);

		txtMatrnr = new JTextField();
		txtMatrnr.setForeground(Color.GRAY);
		txtMatrnr.setText("Matrikelnummer / Personalnummer");
		txtMatrnr.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtMatrnr.setColumns(10);
		txtMatrnr.setBounds(35, 136, 341, 20);
		panel_3.add(txtMatrnr);

		txtVorname = new JTextField();
		txtVorname.setForeground(Color.GRAY);
		txtVorname.setText("Vorname");
		txtVorname.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtVorname.setColumns(10);
		txtVorname.setBounds(35, 43, 341, 20);
		panel_3.add(txtVorname);

		JButton btnNewButton = new JButton("best\u00E4tigen");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Datenbank db = new Datenbank();
				db.createUser(txtMatrnr.getText(), txtPasswort.getText(), txtName.getText(), txtVorname.getText(),
						txtMail.getText());

				JOptionPane.showMessageDialog(btnNewButton, "Erfolreich registriert!");

			}
		});
		btnNewButton.setBounds(273, 274, 103, 23);
		panel_3.add(btnNewButton);

		txtName = new JTextField();
		txtName.setForeground(Color.GRAY);
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtName.setColumns(10);
		txtName.setBounds(35, 74, 341, 20);
		panel_3.add(txtName);

		txtMail = new JTextField();
		txtMail.setForeground(Color.GRAY);
		txtMail.setText("Mail");
		txtMail.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtMail.setColumns(10);
		txtMail.setBounds(35, 105, 341, 20);
		panel_3.add(txtMail);

		txtPasswort = new JTextField();
		txtPasswort.setForeground(Color.GRAY);
		txtPasswort.setText("Passwort");
		txtPasswort.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtPasswort.setColumns(10);
		txtPasswort.setBounds(35, 167, 341, 20);
		panel_3.add(txtPasswort);
	}

}
