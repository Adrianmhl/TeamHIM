package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;

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

	public Login() throws Exception {
		
		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		
		setTitle("HIM - HFT Intern Manager");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 580);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 354, 551);
		getContentPane().add(panel);
		panel.setLayout(null);

		textFieldBenutzer = new JTextField();
		textFieldBenutzer.setToolTipText("Matrikel- / Personalnummer");
		textFieldBenutzer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textFieldBenutzer.setText("");
			}
		});
		textFieldBenutzer.setForeground(Color.GRAY);
		textFieldBenutzer.setText("Matrikel- / Personalnummer");
		textFieldBenutzer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBenutzer.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textFieldBenutzer.setColumns(10);
		textFieldBenutzer.setBounds(10, 216, 334, 32);
		panel.add(textFieldBenutzer);

		textFieldPasswort = new JPasswordField();
		textFieldPasswort.setToolTipText("Kennwort");
		textFieldPasswort.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				textFieldPasswort.setText("");
			}
		});
		textFieldPasswort.setForeground(Color.GRAY);
		textFieldPasswort.setText("Kennwort");
		textFieldPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPasswort.setFont(new Font("Dialog", Font.PLAIN, 12));
		textFieldPasswort.setColumns(10);
		textFieldPasswort.setBounds(10, 259, 334, 32);
		panel.add(textFieldPasswort);

		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(e -> {

			try {
				if (verifyLogin(Integer.parseInt(textFieldBenutzer.getText()), textFieldPasswort.getText())) {
					int role = Datenbank.getUser(Integer.parseInt(textFieldBenutzer.getText())).getRole();

					switch (role) {
					case -1:
						MenuStu ms = new MenuStu(Integer.parseInt(textFieldBenutzer.getText()));
						ms.setVisible(true);
						dispose();
						break;
					case 0:
						MenuBet mb = new MenuBet();
						mb.setVisible(true);
						dispose();
						break;
					case 1:
						MenuPPA mp = new MenuPPA();
						mp.setVisible(true);
						dispose();
					}

				} else {
					JOptionPane.showMessageDialog(btnNewButton_1,
							"Ihr Benutzername und/oder Kennwort ist nicht korrekt. Bitte überprüfen Sie ihre Daten.");
					textFieldBenutzer.setText("");
					textFieldPasswort.setText("");
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBounds(100, 302, 157, 32);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/res/ProjLogo3.png")));
		lblNewLabel.setBounds(10, 59, 334, 126);
		panel.add(lblNewLabel);

		JLabel lblRegistrieren = new JLabel("Jetzt registieren >");
		lblRegistrieren.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
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
		lblRegistrieren.setBounds(100, 345, 157, 14);
		panel.add(lblRegistrieren);

	}

	public static boolean verifyLogin(int id, String passwort) throws Exception {

		if (Datenbank.getUser(id) == null) {

			return false;
		}
		String pass = Datenbank.getUser(id).getUserPass();
		byte[] salt = Datenbank.getUser(id).getUserSalt();
		String hashString = Datenbank.hashPassword(passwort, salt);

		if (hashString.equals(pass))
			return true;
		return false;

	}
}
