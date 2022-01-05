package Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
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
import javax.swing.JSeparator;

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
					MenuStu frame = new MenuStu(999);
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
		setResizable(false);

		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 130, 1140, 0 };
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
		gbl_panel_1.rowHeights = new int[]{73, 287, 263, 36, 66, 23, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
						
						JLabel lblNewLabel = new JLabel(new ImageIcon(MenuStu.class.getResource("/res/LogoStudent.png")));
						GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
						gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
						gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
						gbc_lblNewLabel.gridx = 0;
						gbc_lblNewLabel.gridy = 1;
						panel_1.add(lblNewLabel, gbc_lblNewLabel);
						
				
						JLabel lblMatrikelnummerLeiste = new JLabel(Integer.toString(matrikelnum));
						GridBagConstraints gbc_lblMatrikelnummerLeiste = new GridBagConstraints();
						gbc_lblMatrikelnummerLeiste.anchor = GridBagConstraints.WEST;
						gbc_lblMatrikelnummerLeiste.fill = GridBagConstraints.VERTICAL;
						gbc_lblMatrikelnummerLeiste.insets = new Insets(0, 0, 5, 0);
						gbc_lblMatrikelnummerLeiste.gridx = 0;
						gbc_lblMatrikelnummerLeiste.gridy = 3;
						panel_1.add(lblMatrikelnummerLeiste, gbc_lblMatrikelnummerLeiste);
						lblMatrikelnummerLeiste.setHorizontalAlignment(SwingConstants.LEFT);
						lblMatrikelnummerLeiste.setForeground(Color.decode("#f7f1e3"));
						lblMatrikelnummerLeiste.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));
						lblMatrikelnummerLeiste.setBackground(Color.decode("#CD201F"));
		
				JLabel lblNewLabel_1_2_2 = new JLabel("Log Out");
				GridBagConstraints gbc_lblNewLabel_1_2_2 = new GridBagConstraints();
				gbc_lblNewLabel_1_2_2.anchor = GridBagConstraints.WEST;
				gbc_lblNewLabel_1_2_2.gridx = 0;
				gbc_lblNewLabel_1_2_2.gridy = 5;
				panel_1.add(lblNewLabel_1_2_2, gbc_lblNewLabel_1_2_2);
				lblNewLabel_1_2_2.setForeground(Color.decode("#f7f1e3"));
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
				lblNewLabel_1_2_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 15));

		
	

		JPanel panel_Praktikumsverwaltung = new JPanel();
		panel_Praktikumsverwaltung.setBackground(Color.WHITE);
		
		contentPane.add(panel_Praktikumsverwaltung);
		GridBagLayout gbl_panel_Praktikumsverwaltung = new GridBagLayout();
		gbl_panel_Praktikumsverwaltung.columnWidths = new int[] { 776, 0 };
		gbl_panel_Praktikumsverwaltung.rowHeights = new int[] { 291, 73, 196, 0 };
		gbl_panel_Praktikumsverwaltung.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_Praktikumsverwaltung.rowWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		panel_Praktikumsverwaltung.setLayout(gbl_panel_Praktikumsverwaltung);
				
				JLabel lblStatus = new JLabel("Gl\u00FCckwunsch, sie haben das BPS erfolgreich abgeschlossen!");
				lblStatus.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
				GridBagConstraints gbc_lblStatus = new GridBagConstraints();
				gbc_lblStatus.insets = new Insets(0, 0, 5, 0);
				gbc_lblStatus.gridx = 0;
				gbc_lblStatus.gridy = 0;
				panel_Praktikumsverwaltung.add(lblStatus, gbc_lblStatus);
		
				JPanel panel_Praktikumsverwaltungl_2 = new JPanel();
				panel_Praktikumsverwaltungl_2.setBackground(Color.WHITE);
				GridBagConstraints gbc_panel_Praktikumsverwaltungl_2 = new GridBagConstraints();
				gbc_panel_Praktikumsverwaltungl_2.insets = new Insets(0, 0, 5, 0);
				gbc_panel_Praktikumsverwaltungl_2.fill = GridBagConstraints.BOTH;
				gbc_panel_Praktikumsverwaltungl_2.gridx = 0;
				gbc_panel_Praktikumsverwaltungl_2.gridy = 1;
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
																
																
																
																
																
																
																
																
																		
																				JButton btnNewButton_2 = new JButton("T\u00E4tigkeitsnachweis ansehen");
																				GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
																				gbc_btnNewButton_2.anchor = GridBagConstraints.NORTH;
																				gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
																				gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
																				gbc_btnNewButton_2.gridx = 3;
																				gbc_btnNewButton_2.gridy = 1;
																				panel_Praktikumsverwaltungl_2.add(btnNewButton_2, gbc_btnNewButton_2);
																				
																
																		JButton btnNewButton_2_1 = new JButton("Bericht ansehen");
																		GridBagConstraints gbc_btnNewButton_2_1 = new GridBagConstraints();
																		gbc_btnNewButton_2_1.anchor = GridBagConstraints.NORTH;
																		gbc_btnNewButton_2_1.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btnNewButton_2_1.insets = new Insets(0, 0, 5, 5);
																		gbc_btnNewButton_2_1.gridx = 4;
																		gbc_btnNewButton_2_1.gridy = 1;
																		panel_Praktikumsverwaltungl_2.add(btnNewButton_2_1, gbc_btnNewButton_2_1);
																		
																
																JLabel lblFeedback = new JLabel("Auf R\u00FCckmeldung warten");
																GridBagConstraints gbc_lblFeedback = new GridBagConstraints();
																gbc_lblFeedback.insets = new Insets(0, 0, 5, 0);
																gbc_lblFeedback.gridx = 5;
																gbc_lblFeedback.gridy = 1;
																panel_Praktikumsverwaltungl_2.add(lblFeedback, gbc_lblFeedback);
																
																JButton btnBpsAnmeldungHochladen = new JButton("BPS Anmeldung Hochladen");
																
																GridBagConstraints gbc_btnBpsAnmeldungHochladen = new GridBagConstraints();
																gbc_btnBpsAnmeldungHochladen.fill = GridBagConstraints.HORIZONTAL;
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
																
																
																		JButton btnNewButton_1 = new JButton("T\u00E4tigkeitsnachweis hochladen");
																		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
																		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTH;
																		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
																		gbc_btnNewButton_1.gridx = 3;
																		gbc_btnNewButton_1.gridy = 2;
																		panel_Praktikumsverwaltungl_2.add(btnNewButton_1, gbc_btnNewButton_1);
																		
																
																		JButton btnNewButton_1_1 = new JButton("Bericht hochladen");
																		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
																		gbc_btnNewButton_1_1.anchor = GridBagConstraints.NORTH;
																		gbc_btnNewButton_1_1.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 0, 5);
																		gbc_btnNewButton_1_1.gridx = 4;
																		gbc_btnNewButton_1_1.gridy = 2;
																		panel_Praktikumsverwaltungl_2.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
																		
																
																JButton btnNewButton_4 = new JButton("Feedback ansehen");
																GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
																gbc_btnNewButton_4.fill = GridBagConstraints.HORIZONTAL;
																gbc_btnNewButton_4.gridx = 5;
																gbc_btnNewButton_4.gridy = 2;
																panel_Praktikumsverwaltungl_2.add(btnNewButton_4, gbc_btnNewButton_4);
																
																
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.decode("#487eb0"));
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.anchor = GridBagConstraints.NORTH;
		gbc_progressBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 2;
		panel_Praktikumsverwaltung.add(progressBar, gbc_progressBar);
		btnBpsAnmeldungHochladen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new BPSAbgabe(matrikelnum).setVisible(true);
					update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2,lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
																					}
		});
		update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
		
		
		
	
		btnNewButton_1_2.addActionListener(e -> {
			try {
				JFileChooser chooser = new JFileChooser();
				chooser.addChoosableFileFilter(new PdfFilter());
				int input = chooser.showOpenDialog(null);
				if (input == JFileChooser.APPROVE_OPTION) {
					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
					Datenbank.upload(inFileNachweis, matrikelnum, "vertrag", false);
				}
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
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
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
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
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		});
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
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
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
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		btnNewButton_1.addActionListener(e -> {

			try {
				JFileChooser chooser = new JFileChooser();
				chooser.addChoosableFileFilter(new PdfFilter());
				int input = chooser.showOpenDialog(null);
				if (input == JFileChooser.APPROVE_OPTION) {
					File inFileNachweis = new File(chooser.getSelectedFile().getAbsolutePath());
					Datenbank.upload(inFileNachweis, matrikelnum, "nachweis", false);
				}
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		btnNewButton_4.addActionListener(e->{
			
			try {
				JFileChooser chooser = new JFileChooser();
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
					if (PdfFilter.getExtension(chooser.getSelectedFile()).equals(".pdf"))
						Datenbank.getFeedback(matrikelnum, chooser.getSelectedFile().getAbsolutePath());
					else
				Datenbank.getFeedback( matrikelnum, chooser.getSelectedFile().getAbsolutePath().concat(".pdf"));
				}
				update(matrikelnum,lblStatus,betreuerName,btnNewButton_1_1,btnNewButton_1, btnNewButton_1_2, lblBetreuerName,lblAnmeldung,btnNewButton_2_2,btnNewButton_2,btnNewButton_2_1,lblFeedback,btnNewButton_4,progressBar);
			} 
			catch (Exception e1) {
				
				e1.printStackTrace();
			}
	
});
	}
	
	
	public void update(int matnum,JLabel lblStatus, JLabel betreuerName, JButton btnNewButton_1_1, JButton btnNewButton_1, JButton btnNewButton_1_2, JLabel lblBetreuerName, JLabel lblAnmeldung,JButton btnNewButton_2_2, JButton btnNewButton_2,JButton btnNewButton_2_1, JLabel lblFeedback, JButton btnNewButton_4, JProgressBar progressBar) throws Exception {
		btnNewButton_2_2.setEnabled(false);
		btnNewButton_2_1.setEnabled(false);
		btnNewButton_2.setEnabled(false);
		lblAnmeldung.setVisible(false);
		lblFeedback.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1_1.setEnabled(false);
		lblBetreuerName.setVisible(false);
		betreuerName.setVisible(false);
		lblStatus.setText("Bitte BPS-Anmeldung ausfüllen und hochladen.");
		if(Datenbank.getBPS(matnum)!=null) {
			lblAnmeldung.setVisible(true);
			progressBar.setValue(21);
			lblStatus.setText("Das PPA prüft nun ihre BPS-Anmeldung, bitte entwas Geduld");
			if(!Datenbank.getBPS(matnum).getStatus().equals("beantragt")&&!Datenbank.getBPS(matnum).getStatus().equals("")) {
				lblAnmeldung.setText("Angenommen");
				lblAnmeldung.setVisible(true);
				progressBar.setValue(27);
				lblBetreuerName.setVisible(true);
				betreuerName.setVisible(true);
				lblStatus.setText("Ihre BPS-Anmeldung wurde akzeptiert, Betreuer bewerben sich nun und werden zugeteilt.");
				if(Datenbank.getBetreuer(matnum)!=null) {
					lblBetreuerName.setText(Datenbank.getBetreuer(matnum));
					
					progressBar.setValue(38);
					Studierende  student= (Studierende) Datenbank.getUser(matnum);
					btnNewButton_1_2.setEnabled(true);
					lblStatus.setText("Ein Betreuer wurde ihnen zugeteilt, laden sie nun bitte ihren BPS-Vertrag mit dem Unternehmen hoch!");
					if(student.getVertrag()!=null) {
						progressBar.setValue(55);
						btnNewButton_2_2.setEnabled(true);
						btnNewButton_1.setEnabled(true);
						lblStatus.setText("Laden sie bitte den Beschäftigungsnachweis hoch!");
						if(student.getNachweis()!=null) {
							progressBar.setValue(71);
							btnNewButton_2.setEnabled(true);
							btnNewButton_1_1.setEnabled(true);
							lblStatus.setText("Laden sie als Letztes bitte den von ihnen verfassten Praktikumsbericht hoch!");
							if(Datenbank.checkBericht(matnum)&&student.getBericht()==null&&!Datenbank.checkFeedback(matnum)) {
								lblFeedback.setVisible(true);
								lblFeedback.setText("Bericht wird geprüft");
								btnNewButton_2_1.setEnabled(true);
								lblStatus.setText("Ihr Praktikumsbericht wird durch ihren Betreuer überprüft.");
							}
							else if(student.getBericht()!=null) {
								lblFeedback.setText("Bericht wurde akzeptiert");
								lblFeedback.setVisible(true);
								btnNewButton_2_1.setEnabled(true);
								lblStatus.setText("Der Betreuer hat ihren Bericht akzeptiert, das PPA prüft nun ihre Dateien.");
								if(Datenbank.getBPS(matnum).getStatus().equals("Beendet")){
									lblStatus.setText("Glückwunsch, sie haben das BPS erfolgreich abgeschlossen!");
									progressBar.setValue(100);
								}
							}
							else if(student.getBericht()==null&&Datenbank.checkFeedback(matnum)) {
							lblStatus.setText("Bericht leider abgelehnt. Bitte lesen sie die Feedback Datei und laden sie einen überarbeiteten Bericht hoch.");
							lblFeedback.setText("Bericht muss überarbeitet werden");
							lblFeedback.setVisible(true);
							btnNewButton_2_1.setEnabled(true);
							btnNewButton_4.setVisible(true);
							}
						}
					}
				}
				
			}
		}
		
		
	}
}
