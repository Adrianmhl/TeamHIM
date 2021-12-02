package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MenuPPA extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuPPA frame = new MenuPPA();
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
	public MenuPPA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 146, 361);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.RED);
		contentPane.add(panel_1);

		JPanel tab2 = new JPanel();
		tab2.setLayout(null);
		tab2.setBackground(Color.RED);
		tab2.setBounds(10, 102, 126, 21);
		panel_1.add(tab2);

		JLabel lblNewLabel_1 = new JLabel("BPS-Formular pr\u00FCfen");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				tabbedPane.setSelectedIndex(0);
			}
		});

		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1.setBounds(0, 0, 126, 21);
		tab2.add(lblNewLabel_1);

		JPanel tab2_1 = new JPanel();
		tab2_1.setLayout(null);
		tab2_1.setBackground(Color.RED);
		tab2_1.setBounds(10, 134, 126, 21);
		panel_1.add(tab2_1);

		JLabel lblNewLabel_1_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				tabbedPane.setSelectedIndex(1);
			}
		});

		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(0, 0, 141, 18);
		tab2_1.add(lblNewLabel_1_1);

		JPanel tab2_2 = new JPanel();
		tab2_2.setLayout(null);
		tab2_2.setBackground(Color.RED);
		tab2_2.setBounds(10, 166, 126, 21);
		panel_1.add(tab2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Betreuerverwaltung");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				tabbedPane.setSelectedIndex(2);
			}
		});

		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(0, 0, 126, 21);
		tab2_2.add(lblNewLabel_1_2);

		JPanel tab2_2_1 = new JPanel();
		tab2_2_1.setLayout(null);
		tab2_2_1.setBackground(Color.RED);
		tab2_2_1.setBounds(10, 198, 126, 21);
		panel_1.add(tab2_2_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				tabbedPane.setSelectedIndex(3);
			}
		});

		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBackground(Color.RED);
		lblNewLabel_1_2_1.setBounds(0, 0, 126, 21);
		tab2_2_1.add(lblNewLabel_1_2_1);

		JPanel tab2_2_2 = new JPanel();
		tab2_2_2.setLayout(null);
		tab2_2_2.setBackground(Color.RED);
		tab2_2_2.setBounds(10, 329, 126, 21);
		panel_1.add(tab2_2_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("Logout");
		lblNewLabel_1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Login log = new Login();
				log.setVisible(true);
				dispose();

			}
		});
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(0, 0, 116, 18);
		tab2_2_2.add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(10, 11, 112, 87);
		panel_1.add(lblNewLabel_5);

		JPanel tab2_2_1_1 = new JPanel();
		tab2_2_1_1.setLayout(null);
		tab2_2_1_1.setBackground(Color.RED);
		tab2_2_1_1.setBounds(10, 307, 126, 21);
		panel_1.add(tab2_2_1_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("Personalnummer");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBackground(Color.RED);
		lblNewLabel_1_2_1_1.setBounds(0, 0, 116, 18);
		tab2_2_1_1.add(lblNewLabel_1_2_1_1);

		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setBounds(10, 0, 112, 87);
		panel_1.add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setBounds(10, 0, 112, 87);
		panel_1.add(lblNewLabel_5_2);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 11, 539, 350);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
	}
}
