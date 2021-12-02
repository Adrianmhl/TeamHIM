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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		lblNewLabel_5.setIcon(new ImageIcon(MenuPPA.class.getResource("/res/ProjLogo.jpeg")));
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
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setBounds(10, 11, 112, 87);
		panel_1.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		lblNewLabel_5_4.setBounds(10, 11, 112, 87);
		panel_1.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("");
		lblNewLabel_5_5.setBounds(10, 11, 112, 87);
		panel_1.add(lblNewLabel_5_5);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 11, 539, 350);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("\u00D6ffnen");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(31, 193, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00D6ffnen");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1.setBounds(156, 193, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u00D6ffnen");
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(284, 193, 89, 23);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\u00D6ffnen");
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(412, 193, 89, 23);
		panel_2.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel = new JLabel("T\u00E4tigkeitsnachweis");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(29, 168, 118, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblBericht = new JLabel("Bericht");
		lblBericht.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBericht.setBounds(181, 168, 64, 14);
		panel_2.add(lblBericht);
		
		JLabel lblBpsvertrag = new JLabel("BPS-Vertrag");
		lblBpsvertrag.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBpsvertrag.setBounds(294, 168, 118, 14);
		panel_2.add(lblBpsvertrag);
		
		JLabel lblBesuchsbericht = new JLabel("Besuchsbericht");
		lblBesuchsbericht.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBesuchsbericht.setBounds(412, 168, 89, 14);
		panel_2.add(lblBesuchsbericht);
		
		JLabel lblNewLabel_2 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(21, 11, 177, 14);
		panel_2.add(lblNewLabel_2);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_Profil_2 = new JPanel();
		panel_Profil_2.setBackground(Color.WHITE);
		panel_Profil_2.setBounds(10, 11, 450, 212);
		panel_4.add(panel_Profil_2);
		GridBagLayout gbl_panel_Profil_2 = new GridBagLayout();
		gbl_panel_Profil_2.columnWidths = new int[]{114, 46, 0, 0, 0};
		gbl_panel_Profil_2.rowHeights = new int[]{14, 14, 14, 14, 0, 14, 0, 0};
		gbl_panel_Profil_2.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_Profil_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Profil_2.setLayout(gbl_panel_Profil_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.WEST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		panel_Profil_2.add(lblName, gbc_lblName);
		
		JLabel lblProfilMatrikelnummerOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilMatrikelnummerOutput = new GridBagConstraints();
		gbc_lblProfilMatrikelnummerOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilMatrikelnummerOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilMatrikelnummerOutput.gridx = 3;
		gbc_lblProfilMatrikelnummerOutput.gridy = 0;
		panel_Profil_2.add(lblProfilMatrikelnummerOutput, gbc_lblProfilMatrikelnummerOutput);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblVorname = new GridBagConstraints();
		gbc_lblVorname.anchor = GridBagConstraints.WEST;
		gbc_lblVorname.insets = new Insets(0, 0, 5, 5);
		gbc_lblVorname.gridx = 0;
		gbc_lblVorname.gridy = 1;
		panel_Profil_2.add(lblVorname, gbc_lblVorname);
		
		JLabel lblProfilNameOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilNameOutput = new GridBagConstraints();
		gbc_lblProfilNameOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilNameOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilNameOutput.gridx = 3;
		gbc_lblProfilNameOutput.gridy = 1;
		panel_Profil_2.add(lblProfilNameOutput, gbc_lblProfilNameOutput);
		
		JLabel lblPersonalnummer = new JLabel("Personalnummer");
		lblPersonalnummer.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblPersonalnummer = new GridBagConstraints();
		gbc_lblPersonalnummer.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalnummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalnummer.gridx = 0;
		gbc_lblPersonalnummer.gridy = 2;
		panel_Profil_2.add(lblPersonalnummer, gbc_lblPersonalnummer);
		
		JLabel lblProfilVornameOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilVornameOutput = new GridBagConstraints();
		gbc_lblProfilVornameOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilVornameOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilVornameOutput.gridx = 3;
		gbc_lblProfilVornameOutput.gridy = 2;
		panel_Profil_2.add(lblProfilVornameOutput, gbc_lblProfilVornameOutput);
		
		JLabel lblProfilEmail = new JLabel("Email");
		lblProfilEmail.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilEmail = new GridBagConstraints();
		gbc_lblProfilEmail.anchor = GridBagConstraints.WEST;
		gbc_lblProfilEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilEmail.gridx = 0;
		gbc_lblProfilEmail.gridy = 3;
		panel_Profil_2.add(lblProfilEmail, gbc_lblProfilEmail);
		
		JLabel lblProfilEmailOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilEmailOutput = new GridBagConstraints();
		gbc_lblProfilEmailOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilEmailOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilEmailOutput.gridx = 3;
		gbc_lblProfilEmailOutput.gridy = 3;
		panel_Profil_2.add(lblProfilEmailOutput, gbc_lblProfilEmailOutput);
		
		JLabel lblProfilPraxisstelleOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilPraxisstelleOutput = new GridBagConstraints();
		gbc_lblProfilPraxisstelleOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilPraxisstelleOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilPraxisstelleOutput.gridx = 3;
		gbc_lblProfilPraxisstelleOutput.gridy = 4;
		panel_Profil_2.add(lblProfilPraxisstelleOutput, gbc_lblProfilPraxisstelleOutput);
		
		JLabel lblProfilZeitraumOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilZeitraumOutput = new GridBagConstraints();
		gbc_lblProfilZeitraumOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilZeitraumOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilZeitraumOutput.gridx = 3;
		gbc_lblProfilZeitraumOutput.gridy = 5;
		panel_Profil_2.add(lblProfilZeitraumOutput, gbc_lblProfilZeitraumOutput);
		
		JLabel lblProfilBetreuerOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilBetreuerOutput = new GridBagConstraints();
		gbc_lblProfilBetreuerOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilBetreuerOutput.gridx = 3;
		gbc_lblProfilBetreuerOutput.gridy = 6;
		panel_Profil_2.add(lblProfilBetreuerOutput, gbc_lblProfilBetreuerOutput);
	}
}
