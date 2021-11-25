package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(130, 0, 544, 361);
		getContentPane().add(panel);
		panel.setLayout(null);

		textFieldBenutzer = new JTextField();
		textFieldBenutzer.setText("Benutzer");
		textFieldBenutzer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBenutzer.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textFieldBenutzer.setColumns(10);
		textFieldBenutzer.setBounds(146, 150, 157, 32);
		panel.add(textFieldBenutzer);

		textFieldPasswort = new JTextField();
		textFieldPasswort.setText("Passwort");
		textFieldPasswort.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPasswort.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textFieldPasswort.setColumns(10);
		textFieldPasswort.setBounds(146, 191, 157, 32);
		panel.add(textFieldPasswort);

		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(e -> {

			if (textFieldBenutzer.getText().equals("test") && textFieldPasswort.getText().equals("test")) {

				MenuStu ms = new MenuStu();
				ms.setVisible(true);

				dispose();
			} else {
				JOptionPane.showMessageDialog(btnNewButton_1, "Falsch");
				textFieldBenutzer.setText("");
				textFieldPasswort.setText("");
			}

		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBounds(146, 234, 157, 32);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Icon/logo");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/res/ProjLogo3.png")));
		lblNewLabel.setBounds(124, 32, 199, 107);
		panel.add(lblNewLabel);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 0, 146, 361);
		getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.RED);

	}
}
