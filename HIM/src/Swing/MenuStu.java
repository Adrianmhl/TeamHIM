package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
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
import Objekte.PdfFilter;
import Objekte.Studierende;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JCheckBox;

public class MenuStu extends JFrame {

	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuStu frame = new MenuStu(333);
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

		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 110, 1140, 0 };
		gbl_contentPane.rowHeights = new int[] { 658, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 50.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		ImageIcon imageIcon = new ImageIcon("/res/ProjLogo2.png");
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(112, 87, java.awt.Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(newimg);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.decode("#CD201F"));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{126, 0};
		gbl_panel_1.rowHeights = new int[]{87, 225, 23, 278, 23, 23, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
				
						JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
						GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
						gbc_lblNewLabel_1_2_1.anchor = GridBagConstraints.WEST;
						gbc_lblNewLabel_1_2_1.fill = GridBagConstraints.VERTICAL;
						gbc_lblNewLabel_1_2_1.insets = new Insets(0, 0, 5, 0);
						gbc_lblNewLabel_1_2_1.gridx = 0;
						gbc_lblNewLabel_1_2_1.gridy = 2;
						panel_1.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
						lblNewLabel_1_2_1.setForeground(Color.WHITE);
						lblNewLabel_1_2_1.setBackground(Color.decode("#CD201F"));
						lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
						lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								tabbedPane.setSelectedIndex(3);

								// update Für Profil!!!

							}
						});
						lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 12));
				
						JLabel lblMatrikelnummerLeiste = new JLabel(Integer.toString(matrikelnum));
						GridBagConstraints gbc_lblMatrikelnummerLeiste = new GridBagConstraints();
						gbc_lblMatrikelnummerLeiste.anchor = GridBagConstraints.WEST;
						gbc_lblMatrikelnummerLeiste.fill = GridBagConstraints.VERTICAL;
						gbc_lblMatrikelnummerLeiste.insets = new Insets(0, 0, 5, 0);
						gbc_lblMatrikelnummerLeiste.gridx = 0;
						gbc_lblMatrikelnummerLeiste.gridy = 4;
						panel_1.add(lblMatrikelnummerLeiste, gbc_lblMatrikelnummerLeiste);
						lblMatrikelnummerLeiste.setHorizontalAlignment(SwingConstants.LEFT);
						lblMatrikelnummerLeiste.setForeground(Color.WHITE);
						lblMatrikelnummerLeiste.setFont(new Font("Dialog", Font.PLAIN, 12));
						lblMatrikelnummerLeiste.setBackground(Color.decode("#CD201F"));
		
				JLabel lblNewLabel_1_2_2 = new JLabel("Log Out");
				GridBagConstraints gbc_lblNewLabel_1_2_2 = new GridBagConstraints();
				gbc_lblNewLabel_1_2_2.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel_1_2_2.gridx = 0;
				gbc_lblNewLabel_1_2_2.gridy = 5;
				panel_1.add(lblNewLabel_1_2_2, gbc_lblNewLabel_1_2_2);
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

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 0;
		contentPane.add(tabbedPane, gbc_tabbedPane);

		JPanel panel_Praktikumsverwaltung = new JPanel();
		panel_Praktikumsverwaltung.setBackground(Color.WHITE);
		tabbedPane.addTab("New tab", null, panel_Praktikumsverwaltung, null);
		GridBagLayout gbl_panel_Praktikumsverwaltung = new GridBagLayout();
		gbl_panel_Praktikumsverwaltung.columnWidths = new int[] { 776, 0 };
		gbl_panel_Praktikumsverwaltung.rowHeights = new int[] { 32, 86, 178, 309, 0 };
		gbl_panel_Praktikumsverwaltung.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_Praktikumsverwaltung.rowWeights = new double[] { 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		panel_Praktikumsverwaltung.setLayout(gbl_panel_Praktikumsverwaltung);

		JLabel lblNewLabel_3_1 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3_1.gridx = 0;
		gbc_lblNewLabel_3_1.gridy = 0;
		panel_Praktikumsverwaltung.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
				JPanel panel_Praktikumsverwaltungl_2 = new JPanel();
				panel_Praktikumsverwaltungl_2.setBackground(Color.WHITE);
				GridBagConstraints gbc_panel_Praktikumsverwaltungl_2 = new GridBagConstraints();
				gbc_panel_Praktikumsverwaltungl_2.insets = new Insets(0, 0, 5, 0);
				gbc_panel_Praktikumsverwaltungl_2.fill = GridBagConstraints.BOTH;
				gbc_panel_Praktikumsverwaltungl_2.gridx = 0;
				gbc_panel_Praktikumsverwaltungl_2.gridy = 2;
				panel_Praktikumsverwaltung.add(panel_Praktikumsverwaltungl_2, gbc_panel_Praktikumsverwaltungl_2);
				GridBagLayout gbl_panel_Praktikumsverwaltungl_2 = new GridBagLayout();
				gbl_panel_Praktikumsverwaltungl_2.columnWidths = new int[] { 209, 0, 135, 153, 170, 304, 0 };
				gbl_panel_Praktikumsverwaltungl_2.rowHeights = new int[] { 0, 0, 0, 0 };
				gbl_panel_Praktikumsverwaltungl_2.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panel_Praktikumsverwaltungl_2.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
				panel_Praktikumsverwaltungl_2.setLayout(gbl_panel_Praktikumsverwaltungl_2);
																
																JLabel lblAnmeldung = new JLabel("Auf R\u00FCckmeldung warten");
																GridBagConstraints gbc_lblAnmeldung = new GridBagConstraints();
																gbc_lblAnmeldung.insets = new Insets(0, 0, 5, 5);
																gbc_lblAnmeldung.gridx = 0;
																gbc_lblAnmeldung.gridy = 1;
																panel_Praktikumsverwaltungl_2.add(lblAnmeldung, gbc_lblAnmeldung);
																
																JLabel betreuerName = new JLabel("Betreuer:");
																GridBagConstraints gbc_betreuerName = new GridBagConstraints();
																gbc_betreuerName.insets = new Insets(0, 0, 5, 5);
																gbc_betreuerName.gridx = 1;
																gbc_betreuerName.gridy = 1;
																panel_Praktikumsverwaltungl_2.add(betreuerName, gbc_betreuerName);
																JButton btnNewButton_2_2 = new JButton("Vertrag ansehen");
																GridBagConstraints gbc_btnNewButton_2_2 = new GridBagConstraints();
																gbc_btnNewButton_2_2.insets = new Insets(0, 0, 5, 5);
																gbc_btnNewButton_2_2.anchor = GridBagConstraints.NORTH;
																gbc_btnNewButton_2_2.fill = GridBagConstraints.HORIZONTAL;
																gbc_btnNewButton_2_2.gridx = 2;
																gbc_btnNewButton_2_2.gridy = 1;
																panel_Praktikumsverwaltungl_2.add(btnNewButton_2_2, gbc_btnNewButton_2_2);
																
																
																
																
																
																
																
																btnNewButton_2_2.addActionListener(e -> {
																	try {

																		JFileChooser chooser = new JFileChooser();
																		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
																			if (PdfFilter.getExtension(chooser.getSelectedFile()).equals(".pdf"))
																				Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), matrikelnum, "vertrag");
																			else
																				Datenbank.download(chooser.getSelectedFile().getAbsolutePath().concat(".pdf"), matrikelnum,
																						"vertrag");
																		}

																	} catch (Exception e1) {
																		e1.printStackTrace();
																	}
																});
																		
																				JButton btnNewButton_2 = new JButton("T\u00E4tigkeitsnachweis ansehen");
																				GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
																				gbc_btnNewButton_2.anchor = GridBagConstraints.NORTH;
																				gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
																				gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
																				gbc_btnNewButton_2.gridx = 3;
																				gbc_btnNewButton_2.gridy = 1;
																				panel_Praktikumsverwaltungl_2.add(btnNewButton_2, gbc_btnNewButton_2);
																				btnNewButton_2.addActionListener(e -> {

																					try {
																						JFileChooser chooser = new JFileChooser();
																						if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
																							if (PdfFilter.getExtension(chooser.getSelectedFile()).equals(".pdf"))
																								Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), matrikelnum, "nachweis");
																							else
																								Datenbank.download(chooser.getSelectedFile().getAbsolutePath().concat(".pdf"), matrikelnum,
																										"nachweis");
																						}
																					} catch (Exception e1) {
																						e1.printStackTrace();
																					}
																				});
																
																		JButton btnNewButton_2_1 = new JButton("Bericht ansehen");
																		GridBagConstraints gbc_btnNewButton_2_1 = new GridBagConstraints();
																		gbc_btnNewButton_2_1.anchor = GridBagConstraints.NORTH;
																		gbc_btnNewButton_2_1.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btnNewButton_2_1.insets = new Insets(0, 0, 5, 5);
																		gbc_btnNewButton_2_1.gridx = 4;
																		gbc_btnNewButton_2_1.gridy = 1;
																		panel_Praktikumsverwaltungl_2.add(btnNewButton_2_1, gbc_btnNewButton_2_1);
																		btnNewButton_2_1.addActionListener(e -> {
																			try {

																				JFileChooser chooser = new JFileChooser();
																				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
																					if (PdfFilter.getExtension(chooser.getSelectedFile()).equals(".pdf"))
																						Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), matrikelnum, "bericht");
																					else
																						Datenbank.download(chooser.getSelectedFile().getAbsolutePath().concat(".pdf"), matrikelnum,
																								"bericht");
																				}
																			} catch (Exception e1) {
																				e1.printStackTrace();
																			}
																		});
																
																JLabel lblFeedback = new JLabel("Auf R\u00FCckmeldung warten");
																GridBagConstraints gbc_lblFeedback = new GridBagConstraints();
																gbc_lblFeedback.insets = new Insets(0, 0, 5, 0);
																gbc_lblFeedback.gridx = 5;
																gbc_lblFeedback.gridy = 1;
																panel_Praktikumsverwaltungl_2.add(lblFeedback, gbc_lblFeedback);
																
																JButton btnBpsAnmeldungHochladen = new JButton("BPS Anmeldung Hochladen");
																
																GridBagConstraints gbc_btnBpsAnmeldungHochladen = new GridBagConstraints();
																gbc_btnBpsAnmeldungHochladen.insets = new Insets(0, 0, 0, 5);
																gbc_btnBpsAnmeldungHochladen.gridx = 0;
																gbc_btnBpsAnmeldungHochladen.gridy = 2;
																panel_Praktikumsverwaltungl_2.add(btnBpsAnmeldungHochladen, gbc_btnBpsAnmeldungHochladen);
																
																JLabel lblBetreuerName = new JLabel("keine Zuteilung");
																GridBagConstraints gbc_lblBetreuerName = new GridBagConstraints();
																gbc_lblBetreuerName.insets = new Insets(0, 0, 0, 5);
																gbc_lblBetreuerName.gridx = 1;
																gbc_lblBetreuerName.gridy = 2;
																panel_Praktikumsverwaltungl_2.add(lblBetreuerName, gbc_lblBetreuerName);
																JButton btnNewButton_1_2 = new JButton("Vertrag hochladen");
																GridBagConstraints gbc_btnNewButton_1_2 = new GridBagConstraints();
																gbc_btnNewButton_1_2.anchor = GridBagConstraints.NORTH;
																gbc_btnNewButton_1_2.fill = GridBagConstraints.HORIZONTAL;
																gbc_btnNewButton_1_2.insets = new Insets(0, 0, 0, 5);
																gbc_btnNewButton_1_2.gridx = 2;
																gbc_btnNewButton_1_2.gridy = 2;
																panel_Praktikumsverwaltungl_2.add(btnNewButton_1_2, gbc_btnNewButton_1_2);
																btnNewButton_1_2.addActionListener(e -> {
																	try {
																		JFileChooser chooser = new JFileChooser();
																		chooser.addChoosableFileFilter(new PdfFilter());
																		int input = chooser.showOpenDialog(null);
																		if (input == JFileChooser.APPROVE_OPTION) {
																			File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
																			Datenbank.upload(inFileNachweis, matrikelnum, "vertrag", false);
																		}
																	} catch (Exception e1) {
																		e1.printStackTrace();
																	}
																});
																
																		JButton btnNewButton_1 = new JButton("T\u00E4tigkeitsnachweis hochladen");
																		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
																		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTH;
																		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
																		gbc_btnNewButton_1.gridx = 3;
																		gbc_btnNewButton_1.gridy = 2;
																		panel_Praktikumsverwaltungl_2.add(btnNewButton_1, gbc_btnNewButton_1);
																		btnNewButton_1.addActionListener(e -> {

																			try {
																				JFileChooser chooser = new JFileChooser();
																				chooser.addChoosableFileFilter(new PdfFilter());
																				int input = chooser.showOpenDialog(null);
																				if (input == JFileChooser.APPROVE_OPTION) {
																					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
																					Datenbank.upload(inFileNachweis, matrikelnum, "nachweis", false);
																				}
																			} catch (Exception e1) {
																				e1.printStackTrace();
																			}
																		});
																
																		JButton btnNewButton_1_1 = new JButton("Bericht hochladen");
																		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
																		gbc_btnNewButton_1_1.anchor = GridBagConstraints.NORTH;
																		gbc_btnNewButton_1_1.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 0, 5);
																		gbc_btnNewButton_1_1.gridx = 4;
																		gbc_btnNewButton_1_1.gridy = 2;
																		panel_Praktikumsverwaltungl_2.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
																		btnNewButton_1_1.addActionListener(e -> {

																			try {
																				JFileChooser chooser = new JFileChooser();
																				chooser.addChoosableFileFilter(new PdfFilter());
																				int input = chooser.showOpenDialog(null);
																				if (input == JFileChooser.APPROVE_OPTION) {
																					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
																					Datenbank.upload(inFileNachweis, matrikelnum, "bericht", true);
																					Datenbank.sendFeedback(matrikelnum, null);
																				}

																			} catch (Exception e1) {
																				e1.printStackTrace();
																			}
																		});
																
																JButton btnNewButton_4 = new JButton("Feedback ansehen");
																GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
																gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
																gbc_btnNewButton_4.gridx = 5;
																gbc_btnNewButton_4.gridy = 2;
																panel_Praktikumsverwaltungl_2.add(btnNewButton_4, gbc_btnNewButton_4);
																
																btnNewButton_4.addActionListener(e->{
																	
																			try {
																				JFileChooser chooser = new JFileChooser();
																				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
																					if (PdfFilter.getExtension(chooser.getSelectedFile()).equals(".pdf"))
																						Datenbank.getFeedback(matrikelnum, chooser.getSelectedFile().getAbsolutePath());
																					else
																				Datenbank.getFeedback( matrikelnum, chooser.getSelectedFile().getAbsolutePath().concat(".pdf"));
																				}
																			} 
																			catch (Exception e1) {
																				
																				e1.printStackTrace();
																			}
																	
																});
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.anchor = GridBagConstraints.NORTH;
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 3;
		panel_Praktikumsverwaltung.add(progressBar, gbc_progressBar);

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
		btnBpsAnmeldungHochladen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new BPSAbgabe(matrikelnum).setVisible(true);
					update(matrikelnum,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2,lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
																					}
		});
		update(matrikelnum,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
	}
	
	
	public void update(int matnum,JLabel betreuerName, JButton btnNewButton_1_1, JButton btnNewButton_1, JButton btnNewButton_1_2, JLabel lblBetreuerName, JLabel lblAnmeldung,JButton btnNewButton_2_2, JButton btnNewButton_2,JButton btnNewButton_2_1, JLabel lblFeedback, JButton btnNewButton_4, JProgressBar progressBar) throws Exception {
		btnNewButton_2_2.setVisible(false);
		btnNewButton_2_1.setVisible(false);
		btnNewButton_2.setVisible(false);
		lblAnmeldung.setVisible(false);
		lblFeedback.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_1_2.setVisible(false);
		btnNewButton_1.setVisible(false);
		btnNewButton_1_1.setVisible(false);
		lblBetreuerName.setVisible(false);
		betreuerName.setVisible(false);
		if(Datenbank.getBPS(matnum)!=null) {
			lblAnmeldung.setVisible(true);
			if(!Datenbank.getBPS(matnum).getStatus().equals("beantragt")&&!Datenbank.getBPS(matnum).getStatus().equals("")) {
				lblAnmeldung.setText("Angenommen");
				lblAnmeldung.setVisible(true);
				progressBar.setValue(10);
				lblBetreuerName.setVisible(true);
				betreuerName.setVisible(true);
				if(Datenbank.getBetreuer(matnum)!=null) {
					lblBetreuerName.setText(Datenbank.getBetreuer(matnum));
					progressBar.setValue(20);
					Studierende  student= (Studierende) Datenbank.getUser(matnum);
					btnNewButton_1_2.setVisible(true);
					if(student.getVertrag()!=null) {
						progressBar.setValue(30);
						btnNewButton_2_2.setVisible(true);
						btnNewButton_1.setVisible(true);
						if(student.getNachweis()!=null) {
							progressBar.setValue(30);
							btnNewButton_2.setVisible(true);
							btnNewButton_1_1.setVisible(true);
							System.out.println(Datenbank.checkBericht(matnum));
							if(Datenbank.checkBericht(matnum)&&student.getBericht()==null&&!Datenbank.checkFeedback(matnum)) {
								lblFeedback.setVisible(true);
								lblFeedback.setText("Bericht wird geprüft");
								btnNewButton_2_1.setVisible(true);
								
							}
							else if(student.getBericht()!=null) {
								lblFeedback.setText("Bericht wurde akzeptiert");
								lblFeedback.setVisible(true);
								btnNewButton_2_1.setVisible(true);
								progressBar.setValue(100);
							}
							else if(student.getBericht()==null&&Datenbank.checkFeedback(matnum)) {
							
							lblFeedback.setText("Bericht muss überarbeitet werden");
							lblFeedback.setVisible(true);
							btnNewButton_2_1.setVisible(true);
							btnNewButton_4.setVisible(true);
							}
						}
					}
				}
				
			}
		}
		
		
	}
}
