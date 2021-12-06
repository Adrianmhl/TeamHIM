package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.BPS;
import Objekte.Studierende;

public class MenuStu extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	private JTextField txtUnternehmen;
	private JTextField txtBeschreibung;
	private JTextField txtFirmenanschrift;
	private JTextField txtUrl;
	private JTextField txtAbteilung;
	private JTextField txtThemenbereich;
	private JTextField txtTelefon;
	private JTextField txtMail;
	private JTextField txtFirmenbetreuerName;
	private JRadioButton rdbtnZeitraum1;
	private JRadioButton rdbtnZeitraum2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuStu frame = new MenuStu(0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public MenuStu(int matrikelnum) throws Exception {
		try {
			UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Studierende student = (Studierende) Datenbank.getUser(matrikelnum);
		setResizable(false);
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 146, 491);
		panel_1.setBackground(Color.RED);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel tab2 = new JPanel();
		tab2.setBackground(Color.RED);
		tab2.setBounds(10, 102, 126, 21);
		panel_1.add(tab2);

		JLabel lblNewLabel_1 = new JLabel("Anmeldung BPS");
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
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		tab2.add(lblNewLabel_1);

		JPanel tab2_1 = new JPanel();
		tab2_1.setBackground(Color.RED);
		tab2_1.setBounds(10, 134, 126, 21);
		panel_1.add(tab2_1);

		JLabel lblNewLabel_1_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(0, 0, 126, 18);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		tab2_1.setLayout(null);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
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
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));
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

				// update Für Profil!!!

			}
		});
		tab2_2_1.setLayout(null);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		tab2_2_1.add(lblNewLabel_1_2_1);

		JPanel tab2_2_2 = new JPanel();
		tab2_2_2.setLayout(null);
		tab2_2_2.setBackground(Color.RED);
		tab2_2_2.setBounds(10, 329, 126, 21);
		panel_1.add(tab2_2_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("Logout");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Login log;
				try {
					log = new Login();
					log.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				dispose();

			}
		});
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_2.setBounds(0, 0, 116, 18);
		tab2_2_2.add(lblNewLabel_1_2_2);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(MenuStu.class.getResource("/res/ProjLogo.jpeg")));
		lblNewLabel_5.setBounds(10, 11, 112, 87);
		panel_1.add(lblNewLabel_5);

		JPanel tab2_2_1_1 = new JPanel();
		tab2_2_1_1.setLayout(null);
		tab2_2_1_1.setBackground(Color.RED);
		tab2_2_1_1.setBounds(10, 307, 126, 21);
		panel_1.add(tab2_2_1_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel(String.valueOf(matrikelnum));
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBackground(Color.RED);
		lblNewLabel_1_2_1_1.setBounds(0, 0, 116, 18);
		tab2_2_1_1.add(lblNewLabel_1_2_1_1);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 0, 549, 491);
		contentPane.add(tabbedPane);

		JPanel panel_BPSFormularAbgabe = new JPanel();
		panel_BPSFormularAbgabe.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_BPSFormularAbgabe, null);
		panel_BPSFormularAbgabe.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Anmeldung des BPS");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(35, 0, 252, 32);
		panel_BPSFormularAbgabe.add(lblNewLabel_3);

		txtUnternehmen = new JTextField();
		txtUnternehmen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUnternehmen.setText("");

			}
		});
		txtUnternehmen.setForeground(Color.GRAY);
		txtUnternehmen.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtUnternehmen.setText("Unternehmen");
		txtUnternehmen.setColumns(10);
		txtUnternehmen.setBounds(35, 43, 340, 20);
		panel_BPSFormularAbgabe.add(txtUnternehmen);

		JButton btnNewButton = new JButton("best\u00E4tigen");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					String datum = null;

					if (rdbtnZeitraum1.isSelected()) {
						datum = rdbtnZeitraum1.getText();
					}

					if (rdbtnZeitraum2.isSelected()) {
						datum = rdbtnZeitraum2.getText();
					}

					BPS bps = new BPS(matrikelnum, txtUnternehmen.getText(), txtFirmenanschrift.getText(),
							txtFirmenbetreuerName.getText(), txtAbteilung.getText(), txtTelefon.getText(),
							txtMail.getText(), datum, txtThemenbereich.getText(), txtBeschreibung.getText());

					Datenbank.createBPS(matrikelnum, bps);

					JOptionPane.showMessageDialog(btnNewButton,
							"Ihr Benutzername und/oder Kennwort ist nicht korrekt. Bitte überprüfen Sie ihre Daten.");

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(431, 402, 103, 23);
		panel_BPSFormularAbgabe.add(btnNewButton);

		txtBeschreibung = new JTextField();
		txtBeschreibung.setHorizontalAlignment(SwingConstants.LEFT);
		txtBeschreibung.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtBeschreibung.setText("");
			}
		});
		txtBeschreibung.setForeground(Color.GRAY);
		txtBeschreibung.setText("Kurzbeschreibung der geplanten T\u00E4tigkeit");
		txtBeschreibung.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtBeschreibung.setColumns(10);
		txtBeschreibung.setBounds(35, 343, 340, 78);
		panel_BPSFormularAbgabe.add(txtBeschreibung);

		rdbtnZeitraum1 = new JRadioButton("01.03 - 31.08");
		buttonGroup.add(rdbtnZeitraum1);
		rdbtnZeitraum1.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnZeitraum1.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnZeitraum1.setBackground(Color.WHITE);
		rdbtnZeitraum1.setBounds(153, 285, 109, 20);
		panel_BPSFormularAbgabe.add(rdbtnZeitraum1);

		rdbtnZeitraum2 = new JRadioButton("01.09 - 28.02");
		buttonGroup.add(rdbtnZeitraum2);
		rdbtnZeitraum2.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnZeitraum2.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnZeitraum2.setBackground(Color.WHITE);
		rdbtnZeitraum2.setBounds(266, 285, 109, 20);
		panel_BPSFormularAbgabe.add(rdbtnZeitraum2);

		JLabel lblNewLabel_2 = new JLabel("Zeitraum");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(35, 287, 80, 17);
		panel_BPSFormularAbgabe.add(lblNewLabel_2);

		txtFirmenanschrift = new JTextField();
		txtFirmenanschrift.setText("Firmenanschrift");
		txtFirmenanschrift.setForeground(Color.GRAY);
		txtFirmenanschrift.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtFirmenanschrift.setColumns(10);
		txtFirmenanschrift.setBounds(35, 74, 340, 20);
		panel_BPSFormularAbgabe.add(txtFirmenanschrift);

		txtUrl = new JTextField();
		txtUrl.setText("URL des Unternehmens");
		txtUrl.setForeground(Color.GRAY);
		txtUrl.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtUrl.setColumns(10);
		txtUrl.setBounds(35, 105, 340, 20);
		panel_BPSFormularAbgabe.add(txtUrl);

		txtAbteilung = new JTextField();
		txtAbteilung.setText("Abteilung");
		txtAbteilung.setForeground(Color.GRAY);
		txtAbteilung.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtAbteilung.setColumns(10);
		txtAbteilung.setBounds(35, 194, 340, 20);
		panel_BPSFormularAbgabe.add(txtAbteilung);

		txtThemenbereich = new JTextField();
		txtThemenbereich.setText("Themenbereich");
		txtThemenbereich.setForeground(Color.GRAY);
		txtThemenbereich.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtThemenbereich.setColumns(10);
		txtThemenbereich.setBounds(35, 312, 340, 20);
		panel_BPSFormularAbgabe.add(txtThemenbereich);

		txtTelefon = new JTextField();
		txtTelefon.setText("Telefon");
		txtTelefon.setForeground(Color.GRAY);
		txtTelefon.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtTelefon.setColumns(10);
		txtTelefon.setBounds(35, 225, 340, 20);
		panel_BPSFormularAbgabe.add(txtTelefon);

		txtMail = new JTextField();
		txtMail.setText("Email");
		txtMail.setForeground(Color.GRAY);
		txtMail.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtMail.setColumns(10);
		txtMail.setBounds(35, 256, 340, 20);
		panel_BPSFormularAbgabe.add(txtMail);

		txtFirmenbetreuerName = new JTextField();
		txtFirmenbetreuerName.setText("Name");
		txtFirmenbetreuerName.setForeground(Color.GRAY);
		txtFirmenbetreuerName.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtFirmenbetreuerName.setColumns(10);
		txtFirmenbetreuerName.setBounds(35, 163, 340, 20);
		panel_BPSFormularAbgabe.add(txtFirmenbetreuerName);

		JLabel lblNewLabel_4 = new JLabel("Firmenbetreuer");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(35, 136, 340, 20);
		panel_BPSFormularAbgabe.add(lblNewLabel_4);

		JPanel panel_Praktikumsverwaltung = new JPanel();
		panel_Praktikumsverwaltung.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_Praktikumsverwaltung, null);
		panel_Praktikumsverwaltung.setLayout(null);

		JLabel lblNewLabel_3_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 0, 252, 32);
		panel_Praktikumsverwaltung.add(lblNewLabel_3_1);

		JPanel panel_Praktikumsverwaltungl_2 = new JPanel();
		panel_Praktikumsverwaltungl_2.setBackground(Color.WHITE);
		panel_Praktikumsverwaltungl_2.setBounds(10, 54, 468, 190);
		panel_Praktikumsverwaltung.add(panel_Praktikumsverwaltungl_2);
		panel_Praktikumsverwaltungl_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("T\u00E4tigkeitsnachweis");
		lblNewLabel.setBounds(10, 0, 135, 13);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
		panel_Praktikumsverwaltungl_2.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("hochladen");
		btnNewButton_1.setBounds(188, 0, 105, 23);
		panel_Praktikumsverwaltungl_2.add(btnNewButton_1);
		btnNewButton_1.addActionListener(e -> {

			try {
				JFileChooser chooser = new JFileChooser();
				int input = chooser.showOpenDialog(null);
				if (input == JFileChooser.APPROVE_OPTION) {
					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
					Datenbank.upload(inFileNachweis, matrikelnum, "nachweis");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		JButton btnNewButton_2 = new JButton("\u00F6ffnen");
		btnNewButton_2.setBounds(303, 0, 105, 23);
		panel_Praktikumsverwaltungl_2.add(btnNewButton_2);
		btnNewButton_2.addActionListener(e -> {
			try {
				JFileChooser chooser = new JFileChooser();
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
					Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), matrikelnum, "nachweis");

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		JLabel lblBericht = new JLabel("Bericht");
		lblBericht.setBounds(10, 55, 135, 13);
		lblBericht.setFont(new Font("Arial", Font.BOLD, 11));
		panel_Praktikumsverwaltungl_2.add(lblBericht);

		JLabel lblBpsvertrag = new JLabel("BPS-Vertrag");
		lblBpsvertrag.setBounds(10, 111, 135, 13);
		lblBpsvertrag.setFont(new Font("Arial", Font.BOLD, 11));
		panel_Praktikumsverwaltungl_2.add(lblBpsvertrag);

		JButton btnNewButton_1_1 = new JButton("hochladen");
		btnNewButton_1_1.setBounds(188, 55, 105, 23);
		panel_Praktikumsverwaltungl_2.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(e -> {

			try {
				JFileChooser chooser = new JFileChooser();
				int input = chooser.showOpenDialog(null);
				if (input == JFileChooser.APPROVE_OPTION) {
					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
					Datenbank.upload(inFileNachweis, matrikelnum, "bericht");
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		JButton btnNewButton_1_2 = new JButton("hochladen");
		btnNewButton_1_2.setBounds(188, 106, 105, 23);
		panel_Praktikumsverwaltungl_2.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(e -> {
			try {
				JFileChooser chooser = new JFileChooser();
				int input = chooser.showOpenDialog(null);
				if (input == JFileChooser.APPROVE_OPTION) {
					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
					Datenbank.upload(inFileNachweis, matrikelnum, "vertrag");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});

		JButton btnNewButton_2_1 = new JButton("\u00F6ffnen");
		btnNewButton_2_1.setBounds(303, 55, 105, 23);
		panel_Praktikumsverwaltungl_2.add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(e -> {
			try {
				JFileChooser chooser = new JFileChooser();
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
					Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), matrikelnum, "bericht");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		JButton btnNewButton_2_2 = new JButton("\u00F6ffnen");
		btnNewButton_2_2.setBounds(303, 106, 105, 23);
		panel_Praktikumsverwaltungl_2.add(btnNewButton_2_2);
		btnNewButton_2_2.addActionListener(e -> {
			try {
				JFileChooser chooser = new JFileChooser();
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
					Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), matrikelnum, "vertrag");

			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		JPanel panel_Dokumente = new JPanel();
		panel_Dokumente.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_Dokumente, null);
		panel_Dokumente.setLayout(null);

		JLabel lblNewLabel_3_1_1 = new JLabel("Dokumente");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_1.setBounds(10, 0, 252, 32);
		panel_Dokumente.add(lblNewLabel_3_1_1);

		JPanel panel_Profil = new JPanel();
		panel_Profil.setLayout(null);
		panel_Profil.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_Profil, null);

		JPanel panel_Profil_2 = new JPanel();
		panel_Profil_2.setBackground(Color.WHITE);
		panel_Profil_2.setBounds(20, 43, 450, 212);
		panel_Profil.add(panel_Profil_2);
		GridBagLayout gbl_panel_Profil_2 = new GridBagLayout();
		gbl_panel_Profil_2.columnWidths = new int[] { 114, 46, 0, 0, 0 };
		gbl_panel_Profil_2.rowHeights = new int[] { 14, 14, 14, 14, 0, 14, 0, 0 };
		gbl_panel_Profil_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_Profil_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_Profil_2.setLayout(gbl_panel_Profil_2);

		JLabel lblProfilMatrikelnummer = new JLabel("Matrikelnummer");
		lblProfilMatrikelnummer.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilMatrikelnummer = new GridBagConstraints();
		gbc_lblProfilMatrikelnummer.anchor = GridBagConstraints.WEST;
		gbc_lblProfilMatrikelnummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilMatrikelnummer.gridx = 0;
		gbc_lblProfilMatrikelnummer.gridy = 0;
		panel_Profil_2.add(lblProfilMatrikelnummer, gbc_lblProfilMatrikelnummer);

		JLabel lblProfilMatrikelnummerOutput = new JLabel(String.valueOf(matrikelnum));
		GridBagConstraints gbc_lblProfilMatrikelnummerOutput = new GridBagConstraints();
		gbc_lblProfilMatrikelnummerOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilMatrikelnummerOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilMatrikelnummerOutput.gridx = 3;
		gbc_lblProfilMatrikelnummerOutput.gridy = 0;
		panel_Profil_2.add(lblProfilMatrikelnummerOutput, gbc_lblProfilMatrikelnummerOutput);

		JLabel lblProfilName = new JLabel("Name");
		lblProfilName.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilName = new GridBagConstraints();
		gbc_lblProfilName.anchor = GridBagConstraints.WEST;
		gbc_lblProfilName.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilName.gridx = 0;
		gbc_lblProfilName.gridy = 1;
		panel_Profil_2.add(lblProfilName, gbc_lblProfilName);

		JLabel lblProfilNameOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilNameOutput = new GridBagConstraints();
		gbc_lblProfilNameOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilNameOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilNameOutput.gridx = 3;
		gbc_lblProfilNameOutput.gridy = 1;
		panel_Profil_2.add(lblProfilNameOutput, gbc_lblProfilNameOutput);

		JLabel lblProfilVorname = new JLabel("Vorname");
		lblProfilVorname.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilVorname = new GridBagConstraints();
		gbc_lblProfilVorname.anchor = GridBagConstraints.WEST;
		gbc_lblProfilVorname.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilVorname.gridx = 0;
		gbc_lblProfilVorname.gridy = 2;
		panel_Profil_2.add(lblProfilVorname, gbc_lblProfilVorname);

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
		gbc_lblProfilEmailOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilEmailOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilEmailOutput.gridx = 3;
		gbc_lblProfilEmailOutput.gridy = 3;
		panel_Profil_2.add(lblProfilEmailOutput, gbc_lblProfilEmailOutput);

		JLabel lblProfilPraxisstelle = new JLabel("Praxisstelle");
		lblProfilPraxisstelle.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilPraxisstelle = new GridBagConstraints();
		gbc_lblProfilPraxisstelle.anchor = GridBagConstraints.WEST;
		gbc_lblProfilPraxisstelle.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilPraxisstelle.gridx = 0;
		gbc_lblProfilPraxisstelle.gridy = 4;
		panel_Profil_2.add(lblProfilPraxisstelle, gbc_lblProfilPraxisstelle);

		JLabel lblProfilPraxisstelleOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilPraxisstelleOutput = new GridBagConstraints();
		gbc_lblProfilPraxisstelleOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilPraxisstelleOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilPraxisstelleOutput.gridx = 3;
		gbc_lblProfilPraxisstelleOutput.gridy = 4;
		panel_Profil_2.add(lblProfilPraxisstelleOutput, gbc_lblProfilPraxisstelleOutput);

		JLabel lblProfilZeitraum = new JLabel("Zeitraum");
		lblProfilZeitraum.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilZeitraum = new GridBagConstraints();
		gbc_lblProfilZeitraum.anchor = GridBagConstraints.WEST;
		gbc_lblProfilZeitraum.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilZeitraum.gridx = 0;
		gbc_lblProfilZeitraum.gridy = 5;
		panel_Profil_2.add(lblProfilZeitraum, gbc_lblProfilZeitraum);

		JLabel lblProfilZeitraumOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilZeitraumOutput = new GridBagConstraints();
		gbc_lblProfilZeitraumOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilZeitraumOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilZeitraumOutput.gridx = 3;
		gbc_lblProfilZeitraumOutput.gridy = 5;
		panel_Profil_2.add(lblProfilZeitraumOutput, gbc_lblProfilZeitraumOutput);

		JLabel lblProfilBetreuer = new JLabel("Betreuer");
		lblProfilBetreuer.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilBetreuer = new GridBagConstraints();
		gbc_lblProfilBetreuer.anchor = GridBagConstraints.WEST;
		gbc_lblProfilBetreuer.insets = new Insets(0, 0, 0, 5);
		gbc_lblProfilBetreuer.gridx = 0;
		gbc_lblProfilBetreuer.gridy = 6;
		panel_Profil_2.add(lblProfilBetreuer, gbc_lblProfilBetreuer);

		JLabel lblProfilBetreuerOutput = new JLabel("-");
		GridBagConstraints gbc_lblProfilBetreuerOutput = new GridBagConstraints();
		gbc_lblProfilBetreuerOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilBetreuerOutput.gridx = 3;
		gbc_lblProfilBetreuerOutput.gridy = 6;
		panel_Profil_2.add(lblProfilBetreuerOutput, gbc_lblProfilBetreuerOutput);

		JLabel lblNewLabel_3_1_2 = new JLabel("Profil");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(10, 0, 252, 32);
		panel_Profil.add(lblNewLabel_3_1_2);

		JPanel panel = new JPanel();
		panel.setBounds(116, 361, 10, 10);
		contentPane.add(panel);

	}
}
