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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Objekte.Studierende;

public class Login extends JFrame {
	private JTextField textFieldBenutzer;
	private JTextField textFieldPasswort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Login frame = new Login();
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

	public Login() {
		setTitle("HIM - HFT Intern Manager");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(145, 0, 529, 361);
		getContentPane().add(panel);
		panel.setLayout(null);

		textFieldBenutzer = new JTextField();
		textFieldBenutzer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldBenutzer.setText("");
			}
		});
		textFieldBenutzer.setForeground(Color.GRAY);
		textFieldBenutzer.setText("Matrikel- / Personalnummer");
		textFieldBenutzer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBenutzer.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textFieldBenutzer.setColumns(10);
		textFieldBenutzer.setBounds(70, 150, 284, 32);
		panel.add(textFieldBenutzer);

		textFieldPasswort = new JTextField();
		textFieldPasswort.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				textFieldPasswort.setText("");
			}
		});
		textFieldPasswort.setForeground(Color.GRAY);
		textFieldPasswort.setText("Kennwort");
		textFieldPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPasswort.setFont(new Font("Tahoma", Font.ITALIC, 13));
		textFieldPasswort.setColumns(10);
		textFieldPasswort.setBounds(70, 191, 284, 32);
		panel.add(textFieldPasswort);

		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(e -> {

			Studierende stud = new Studierende();

			try {
				if (stud.verifyLogin(textFieldBenutzer.getText(), textFieldPasswort.getText()) == true) {

					MenuStu ms = new MenuStu();
					ms.setVisible(true);
					dispose();

				} else {
					JOptionPane.showMessageDialog(btnNewButton_1,
							"Ihr Benutzername und/oder Kennwort ist nicht korrekt. Bitte überprüfen Sie ihr Daten.");
					textFieldBenutzer.setText("");
					textFieldPasswort.setText("");
				}

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

//			if (textFieldBenutzer.getText().equals("test") && textFieldPasswort.getText().equals("test")) {
//
//				MenuStu ms = new MenuStu();
//				ms.setVisible(true);
//
//				dispose();
//			} else {
//				JOptionPane.showMessageDialog(btnNewButton_1,
//						"Ihr Benutzername und/oder Kennwort ist nicht korrekt. Bitte überprüfen Sie ihr Daten.");
//				textFieldBenutzer.setText("");
//				textFieldPasswort.setText("");
//			}

		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBounds(135, 234, 157, 32);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Icon/logo");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/res/ProjLogo3.png")));
		lblNewLabel.setBounds(124, 32, 199, 107);
		panel.add(lblNewLabel);

		JLabel lblRegistrieren = new JLabel("Jetzt registieren >");
		lblRegistrieren.setForeground(Color.DARK_GRAY);
		lblRegistrieren.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrieren.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Registrierung reg = new Registrierung();
				reg.setVisible(true);
				dispose();
			}
		});
		lblRegistrieren.setBounds(135, 278, 157, 14);
		panel.add(lblRegistrieren);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(0, 0, 156, 361);
		getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.RED);

		JPanel tab2_3 = new JPanel();
		tab2_3.setLayout(null);
		tab2_3.setBackground(Color.RED);
		tab2_3.setBounds(10, 102, 126, 21);
		panel_1_2.add(tab2_3);

		JPanel tab2_1_1 = new JPanel();
		tab2_1_1.setLayout(null);
		tab2_1_1.setBackground(Color.RED);
		tab2_1_1.setBounds(10, 134, 126, 21);
		panel_1_2.add(tab2_1_1);

		JPanel tab2_2_3 = new JPanel();
		tab2_2_3.setLayout(null);
		tab2_2_3.setBackground(Color.RED);
		tab2_2_3.setBounds(10, 166, 126, 21);
		panel_1_2.add(tab2_2_3);

		JPanel tab2_2_1_1 = new JPanel();
		tab2_2_1_1.setLayout(null);
		tab2_2_1_1.setBackground(Color.RED);
		tab2_2_1_1.setBounds(10, 198, 126, 21);
		panel_1_2.add(tab2_2_1_1);

		JPanel tab2_2_2_1 = new JPanel();
		tab2_2_2_1.setLayout(null);
		tab2_2_2_1.setBackground(Color.RED);
		tab2_2_2_1.setBounds(0, 329, 136, 21);
		panel_1_2.add(tab2_2_2_1);

	}
}
