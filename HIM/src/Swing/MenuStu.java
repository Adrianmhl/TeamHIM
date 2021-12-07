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
import javax.swing.JLayeredPane;
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

	private JLabel lblStatus;
	private JLabel lblUnternehmen;
	private JLabel lblFirmenanschrift;
	private JLabel lblURL;
	private JLabel lblFirmenbetreuer;
	private JLabel lblAbteilung;
	private JLabel lblTelefon;
	private JLabel lblEmail;
	private JLabel lblZeitraum;
	private JLabel Themenbereich;
	private JLabel lblKurzbeschreibung;

	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	private JTextField txtUnternehmen;
	private JTextField txtBeschreibung;
	private JTextField txtFirmenanschrift;
	private JTextField txtAbteilung;
	private JTextField txtThemenbereich;
	private JTextField txtTelefon;
	private JTextField txtMail;
	private JTextField txtFirmenbetreuerName;
	private JRadioButton rdbtnZeitraum1;
	private JRadioButton rdbtnZeitraum2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_BPSFormularAbgabe;
	private JPanel panel_2;

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

	private void bpsVisible(int matrikelnum) throws Exception{

	
		for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {

			if (matrikelnum == Datenbank.getBPSlist().get(i).getId()
					&& Datenbank.getBPSlist().get(i).getStatus().equals("beantragt")) {

				lblStatus.setText(Datenbank.getBPSlist().get(i).getStatus());
				lblUnternehmen.setText(Datenbank.getBPSlist().get(i).getUnternehmen());
				lblFirmenanschrift.setText(Datenbank.getBPSlist().get(i).getFirmenanschrift());
				lblFirmenbetreuer.setText(Datenbank.getBPSlist().get(i).getFirmenbetreuerName());
				lblAbteilung.setText(Datenbank.getBPSlist().get(i).getAbteilung());
				lblTelefon.setText(Datenbank.getBPSlist().get(i).getTelefon());
				lblEmail.setText(Datenbank.getBPSlist().get(i).getMail());
				lblZeitraum.setText(Datenbank.getBPSlist().get(i).getZeitraum());
				Themenbereich.setText(Datenbank.getBPSlist().get(i).getThemenbereich());
				lblKurzbeschreibung.setText(Datenbank.getBPSlist().get(i).getKurzbeschreibung());

				panel_2.setVisible(true);
				panel_BPSFormularAbgabe.setVisible(false);

			}

			if (matrikelnum == Datenbank.getBPSlist().get(i).getId() && Datenbank.getBPSlist().get(i).getStatus().equals("offen")) {

				panel_2.setVisible(false);
				panel_BPSFormularAbgabe.setVisible(true);

			}

		}
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
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 146, 571);
		panel_1.setBackground(Color.RED);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(MenuStu.class.getResource("/res/ProjLogo.jpeg")));
		lblNewLabel_5.setBounds(14, 11, 112, 87);
		panel_1.add(lblNewLabel_5);

		JLabel lblMatrikelnummerLeiste = new JLabel(Integer.toString(matrikelnum));
		lblMatrikelnummerLeiste.setBounds(10, 488, 116, 23);
		panel_1.add(lblMatrikelnummerLeiste);
		lblMatrikelnummerLeiste.setHorizontalAlignment(SwingConstants.LEFT);
		lblMatrikelnummerLeiste.setForeground(Color.WHITE);
		lblMatrikelnummerLeiste.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMatrikelnummerLeiste.setBackground(Color.RED);

		JLabel lblNewLabel_1_2_2 = new JLabel("Log Out");
		lblNewLabel_1_2_2.setBounds(10, 522, 116, 23);
		panel_1.add(lblNewLabel_1_2_2);
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

		JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
		lblNewLabel_1_2_1.setBounds(10, 213, 126, 23);
		panel_1.add(lblNewLabel_1_2_1);
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBackground(Color.RED);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);

				// update Für Profil!!!

			}
		});
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));

		JLabel lblNewLabel_1_2 = new JLabel("Dokumente");
		lblNewLabel_1_2.setBounds(10, 177, 126, 23);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 12));

		JLabel lblNewLabel_1_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_1_1.setBounds(10, 143, 126, 23);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 12));

		JLabel lblNewLabel_1 = new JLabel("Anmeldung BPS");
		lblNewLabel_1.setBounds(10, 109, 126, 23);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 0, 649, 571);
		contentPane.add(tabbedPane);

		panel_BPSFormularAbgabe = new JPanel();
		panel_BPSFormularAbgabe.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_BPSFormularAbgabe, null);
		panel_BPSFormularAbgabe.setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 649, 543);
		panel_BPSFormularAbgabe.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 5, 69, 42, 61, 198, 121, 0 };
		gbl_panel_2.rowHeights = new int[] { 5, 23, 23, 23, 23, 23, 23, 23, 23, 5, 23, 23, 23, 23, 0, 0, 23, 0, 0, 0, 0,
				0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLayeredPane layeredPane_1 = new JLayeredPane();
		GridBagConstraints gbc_layeredPane_1 = new GridBagConstraints();
		gbc_layeredPane_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_layeredPane_1.insets = new Insets(0, 0, 5, 5);
		gbc_layeredPane_1.gridx = 0;
		gbc_layeredPane_1.gridy = 0;
		panel_2.add(layeredPane_1, gbc_layeredPane_1);

		JLabel lblNewLabel_3_2 = new JLabel("Anmeldung des BPS");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_3_2 = new GridBagConstraints();
		gbc_lblNewLabel_3_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_2.gridx = 1;
		gbc_lblNewLabel_3_2.gridy = 1;
		panel_2.add(lblNewLabel_3_2, gbc_lblNewLabel_3_2);

		JLabel lblNewLabel_6_1 = new JLabel("Status");
		lblNewLabel_6_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6_1.gridx = 4;
		gbc_lblNewLabel_6_1.gridy = 1;
		panel_2.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);

		lblStatus = new JLabel("New label");
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.insets = new Insets(0, 0, 5, 0);
		gbc_lblStatus.gridx = 5;
		gbc_lblStatus.gridy = 1;
		panel_2.add(lblStatus, gbc_lblStatus);

		JLabel lblNewLabel_6 = new JLabel("Unternehmen");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 2;
		gbc_lblNewLabel_6.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 4;
		panel_2.add(lblNewLabel_6, gbc_lblNewLabel_6);

		lblUnternehmen = new JLabel("New label");
		lblUnternehmen.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblUnternehmen = new GridBagConstraints();
		gbc_lblUnternehmen.anchor = GridBagConstraints.WEST;
		gbc_lblUnternehmen.fill = GridBagConstraints.VERTICAL;
		gbc_lblUnternehmen.insets = new Insets(0, 0, 5, 5);
		gbc_lblUnternehmen.gridx = 4;
		gbc_lblUnternehmen.gridy = 4;
		panel_2.add(lblUnternehmen, gbc_lblUnternehmen);

		JLabel lblNewLabel_7 = new JLabel("Firmenanschrift");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.gridwidth = 2;
		gbc_lblNewLabel_7.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 5;
		panel_2.add(lblNewLabel_7, gbc_lblNewLabel_7);

		lblFirmenanschrift = new JLabel("New label");
		lblFirmenanschrift.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFirmenanschrift = new GridBagConstraints();
		gbc_lblFirmenanschrift.anchor = GridBagConstraints.WEST;
		gbc_lblFirmenanschrift.fill = GridBagConstraints.VERTICAL;
		gbc_lblFirmenanschrift.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirmenanschrift.gridx = 4;
		gbc_lblFirmenanschrift.gridy = 5;
		panel_2.add(lblFirmenanschrift, gbc_lblFirmenanschrift);

		JLabel lblNewLabel_7_1 = new JLabel("URL");
		lblNewLabel_7_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_1 = new GridBagConstraints();
		gbc_lblNewLabel_7_1.gridwidth = 2;
		gbc_lblNewLabel_7_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_7_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_1.gridx = 1;
		gbc_lblNewLabel_7_1.gridy = 6;
		panel_2.add(lblNewLabel_7_1, gbc_lblNewLabel_7_1);

		lblURL = new JLabel("New label");
		lblURL.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblURL = new GridBagConstraints();
		gbc_lblURL.anchor = GridBagConstraints.WEST;
		gbc_lblURL.fill = GridBagConstraints.VERTICAL;
		gbc_lblURL.insets = new Insets(0, 0, 5, 5);
		gbc_lblURL.gridx = 4;
		gbc_lblURL.gridy = 6;
		panel_2.add(lblURL, gbc_lblURL);

		JButton btnNewButton_3 = new JButton("Antrag bearbeiten");
		btnNewButton_3.addActionListener(e-> {
				panel_BPSFormularAbgabe.setVisible(true);
				panel_2.setVisible(false);
				try {
					for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {

						if (matrikelnum == Datenbank.getBPSlist().get(i).getId()
								&& Datenbank.getBPSlist().get(i).getStatus().equals("beantragt")) {

						/**
						 * radiobutton
						 */

							txtUnternehmen.setText(Datenbank.getBPSlist().get(i).getUnternehmen());
							txtFirmenanschrift.setText(Datenbank.getBPSlist().get(i).getFirmenanschrift());
							txtFirmenbetreuerName.setText(Datenbank.getBPSlist().get(i).getFirmenbetreuerName());
							txtAbteilung.setText(Datenbank.getBPSlist().get(i).getAbteilung());
							txtTelefon.setText(Datenbank.getBPSlist().get(i).getTelefon());
							txtMail.setText(Datenbank.getBPSlist().get(i).getMail());
							Themenbereich.setText(Datenbank.getBPSlist().get(i).getThemenbereich());
							txtBeschreibung.setText(Datenbank.getBPSlist().get(i).getKurzbeschreibung());

						}

					}
					
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
		});

		JLabel lblNewLabel_7_2 = new JLabel("Firmenbetreuer");
		lblNewLabel_7_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_2 = new GridBagConstraints();
		gbc_lblNewLabel_7_2.gridwidth = 2;
		gbc_lblNewLabel_7_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_7_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_2.gridx = 1;
		gbc_lblNewLabel_7_2.gridy = 8;
		panel_2.add(lblNewLabel_7_2, gbc_lblNewLabel_7_2);

		lblFirmenbetreuer = new JLabel("New label");
		lblFirmenbetreuer.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFirmenbetreuer = new GridBagConstraints();
		gbc_lblFirmenbetreuer.anchor = GridBagConstraints.WEST;
		gbc_lblFirmenbetreuer.fill = GridBagConstraints.VERTICAL;
		gbc_lblFirmenbetreuer.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirmenbetreuer.gridx = 4;
		gbc_lblFirmenbetreuer.gridy = 8;
		panel_2.add(lblFirmenbetreuer, gbc_lblFirmenbetreuer);

		JLabel lblNewLabel_7_4 = new JLabel("Abteilung");
		lblNewLabel_7_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_4 = new GridBagConstraints();
		gbc_lblNewLabel_7_4.gridwidth = 2;
		gbc_lblNewLabel_7_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_7_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_4.gridx = 1;
		gbc_lblNewLabel_7_4.gridy = 9;
		panel_2.add(lblNewLabel_7_4, gbc_lblNewLabel_7_4);

		lblAbteilung = new JLabel("New label");
		lblAbteilung.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblAbteilung = new GridBagConstraints();
		gbc_lblAbteilung.anchor = GridBagConstraints.WEST;
		gbc_lblAbteilung.fill = GridBagConstraints.VERTICAL;
		gbc_lblAbteilung.insets = new Insets(0, 0, 5, 5);
		gbc_lblAbteilung.gridx = 4;
		gbc_lblAbteilung.gridy = 9;
		panel_2.add(lblAbteilung, gbc_lblAbteilung);

		JLabel lblNewLabel_7_5 = new JLabel("Telefon");
		lblNewLabel_7_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_5 = new GridBagConstraints();
		gbc_lblNewLabel_7_5.gridwidth = 2;
		gbc_lblNewLabel_7_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_5.gridx = 1;
		gbc_lblNewLabel_7_5.gridy = 10;
		panel_2.add(lblNewLabel_7_5, gbc_lblNewLabel_7_5);

		lblTelefon = new JLabel("New label");
		lblTelefon.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblTelefon = new GridBagConstraints();
		gbc_lblTelefon.anchor = GridBagConstraints.WEST;
		gbc_lblTelefon.fill = GridBagConstraints.VERTICAL;
		gbc_lblTelefon.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefon.gridx = 4;
		gbc_lblTelefon.gridy = 10;
		panel_2.add(lblTelefon, gbc_lblTelefon);

		JLabel lblNewLabel_7_6 = new JLabel("Email");
		lblNewLabel_7_6.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_6 = new GridBagConstraints();
		gbc_lblNewLabel_7_6.gridwidth = 2;
		gbc_lblNewLabel_7_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7_6.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_7_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_6.gridx = 1;
		gbc_lblNewLabel_7_6.gridy = 11;
		panel_2.add(lblNewLabel_7_6, gbc_lblNewLabel_7_6);

		lblEmail = new JLabel("New label");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.fill = GridBagConstraints.VERTICAL;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 4;
		gbc_lblEmail.gridy = 11;
		panel_2.add(lblEmail, gbc_lblEmail);

		JLabel lblNewLabel_7_7 = new JLabel("Zeitraum");
		lblNewLabel_7_7.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_7 = new GridBagConstraints();
		gbc_lblNewLabel_7_7.gridwidth = 2;
		gbc_lblNewLabel_7_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7_7.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_7_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_7.gridx = 1;
		gbc_lblNewLabel_7_7.gridy = 13;
		panel_2.add(lblNewLabel_7_7, gbc_lblNewLabel_7_7);

		lblZeitraum = new JLabel("New label");
		lblZeitraum.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblZeitraum = new GridBagConstraints();
		gbc_lblZeitraum.anchor = GridBagConstraints.WEST;
		gbc_lblZeitraum.fill = GridBagConstraints.VERTICAL;
		gbc_lblZeitraum.insets = new Insets(0, 0, 5, 5);
		gbc_lblZeitraum.gridx = 4;
		gbc_lblZeitraum.gridy = 13;
		panel_2.add(lblZeitraum, gbc_lblZeitraum);

		JLabel lblThemenbereich2 = new JLabel("Themenbereich");
		lblThemenbereich2.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblThemenbereich2 = new GridBagConstraints();
		gbc_lblThemenbereich2.gridwidth = 2;
		gbc_lblThemenbereich2.fill = GridBagConstraints.BOTH;
		gbc_lblThemenbereich2.insets = new Insets(0, 0, 5, 5);
		gbc_lblThemenbereich2.gridx = 1;
		gbc_lblThemenbereich2.gridy = 14;
		panel_2.add(lblThemenbereich2, gbc_lblThemenbereich2);

		Themenbereich = new JLabel("New label");
		Themenbereich.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_Themenbereich = new GridBagConstraints();
		gbc_Themenbereich.anchor = GridBagConstraints.NORTHWEST;
		gbc_Themenbereich.insets = new Insets(0, 0, 5, 5);
		gbc_Themenbereich.gridx = 4;
		gbc_Themenbereich.gridy = 14;
		panel_2.add(Themenbereich, gbc_Themenbereich);

		JLabel lblNewLabel_7_9 = new JLabel("Kurzbeschreibung");
		lblNewLabel_7_9.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7_9 = new GridBagConstraints();
		gbc_lblNewLabel_7_9.gridwidth = 2;
		gbc_lblNewLabel_7_9.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_7_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7_9.gridx = 1;
		gbc_lblNewLabel_7_9.gridy = 16;
		panel_2.add(lblNewLabel_7_9, gbc_lblNewLabel_7_9);

		lblKurzbeschreibung = new JLabel("New label");
		lblKurzbeschreibung.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblKurzbeschreibung = new GridBagConstraints();
		gbc_lblKurzbeschreibung.gridheight = 3;
		gbc_lblKurzbeschreibung.anchor = GridBagConstraints.WEST;
		gbc_lblKurzbeschreibung.fill = GridBagConstraints.VERTICAL;
		gbc_lblKurzbeschreibung.insets = new Insets(0, 0, 5, 5);
		gbc_lblKurzbeschreibung.gridx = 4;
		gbc_lblKurzbeschreibung.gridy = 16;
		panel_2.add(lblKurzbeschreibung, gbc_lblKurzbeschreibung);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 20;
		panel_2.add(btnNewButton_3, gbc_btnNewButton_3);

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
		txtUnternehmen.setBounds(35, 40, 340, 22);
		panel_BPSFormularAbgabe.add(txtUnternehmen);

		JButton btnNewButton = new JButton("Antrag abgeben");
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
							txtMail.getText(), datum, txtThemenbereich.getText(), txtBeschreibung.getText(),
							"beantragt");

					Datenbank.updateBPS(matrikelnum, bps);

					JOptionPane.showMessageDialog(btnNewButton, "BPS - Antrag wurde an das PPA übermittelt ");
					bpsVisible(matrikelnum);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(35, 447, 121, 23);
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
		txtBeschreibung.setBounds(35, 337, 340, 99);
		panel_BPSFormularAbgabe.add(txtBeschreibung);

		rdbtnZeitraum1 = new JRadioButton("01.03 - 31.08");
		buttonGroup.add(rdbtnZeitraum1);
		rdbtnZeitraum1.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnZeitraum1.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnZeitraum1.setBackground(Color.WHITE);
		rdbtnZeitraum1.setBounds(149, 271, 109, 22);
		panel_BPSFormularAbgabe.add(rdbtnZeitraum1);

		rdbtnZeitraum2 = new JRadioButton("01.09 - 28.02");
		buttonGroup.add(rdbtnZeitraum2);
		rdbtnZeitraum2.setFont(new Font("Dialog", Font.PLAIN, 12));
		rdbtnZeitraum2.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnZeitraum2.setBackground(Color.WHITE);
		rdbtnZeitraum2.setBounds(266, 271, 109, 22);
		panel_BPSFormularAbgabe.add(rdbtnZeitraum2);

		JLabel lblNewLabel_2 = new JLabel("Zeitraum");
		lblNewLabel_2.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblNewLabel_2.setBounds(35, 271, 80, 22);
		panel_BPSFormularAbgabe.add(lblNewLabel_2);

		txtFirmenanschrift = new JTextField();
		txtFirmenanschrift.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFirmenanschrift.setText("");

			}
		});
		txtFirmenanschrift.setText("Firmenanschrift");
		txtFirmenanschrift.setForeground(Color.GRAY);
		txtFirmenanschrift.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtFirmenanschrift.setColumns(10);
		txtFirmenanschrift.setBounds(35, 73, 340, 22);
		panel_BPSFormularAbgabe.add(txtFirmenanschrift);

		txtAbteilung = new JTextField();
		txtAbteilung.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAbteilung.setText("");

			}
		});
		txtAbteilung.setText("Abteilung");
		txtAbteilung.setForeground(Color.GRAY);
		txtAbteilung.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtAbteilung.setColumns(10);
		txtAbteilung.setBounds(35, 172, 340, 22);
		panel_BPSFormularAbgabe.add(txtAbteilung);

		txtThemenbereich = new JTextField();
		txtThemenbereich.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtThemenbereich.setText("");
			}
		});
		txtThemenbereich.setText("Themenbereich");
		txtThemenbereich.setForeground(Color.GRAY);
		txtThemenbereich.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtThemenbereich.setColumns(10);
		txtThemenbereich.setBounds(35, 304, 340, 22);
		panel_BPSFormularAbgabe.add(txtThemenbereich);

		txtTelefon = new JTextField();
		txtTelefon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefon.setText("");
			}
		});
		txtTelefon.setText("Telefon");
		txtTelefon.setForeground(Color.GRAY);
		txtTelefon.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtTelefon.setColumns(10);
		txtTelefon.setBounds(35, 205, 340, 22);
		panel_BPSFormularAbgabe.add(txtTelefon);

		txtMail = new JTextField();
		txtMail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMail.setText("");
			}
		});
		txtMail.setText("Email");
		txtMail.setForeground(Color.GRAY);
		txtMail.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtMail.setColumns(10);
		txtMail.setBounds(35, 238, 340, 22);
		panel_BPSFormularAbgabe.add(txtMail);

		txtFirmenbetreuerName = new JTextField();
		txtFirmenbetreuerName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFirmenbetreuerName.setText("");
			}
		});
		txtFirmenbetreuerName.setText("Name");
		txtFirmenbetreuerName.setForeground(Color.GRAY);
		txtFirmenbetreuerName.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtFirmenbetreuerName.setColumns(10);
		txtFirmenbetreuerName.setBounds(35, 139, 340, 22);
		panel_BPSFormularAbgabe.add(txtFirmenbetreuerName);

		JLabel lblNewLabel_4 = new JLabel("Firmenbetreuer");
		lblNewLabel_4.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblNewLabel_4.setBounds(35, 106, 99, 22);
		panel_BPSFormularAbgabe.add(lblNewLabel_4);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 5, 5);
		panel_BPSFormularAbgabe.add(tabbedPane_1);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		panel_BPSFormularAbgabe.add(layeredPane);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 5, 5);
		panel_BPSFormularAbgabe.add(tabbedPane_3);

		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(0, 0, 1, 1);
		panel_BPSFormularAbgabe.add(layeredPane_2);

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

		bpsVisible(matrikelnum);
	}
}
