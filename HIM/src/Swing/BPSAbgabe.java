package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.BPS;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;

public class BPSAbgabe extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField unternehmen;
	private JTextField firmenanschrift;
	private JTextField name;
	private JTextField abteilung;
	private JTextField telefon;
	private JTextField email;
	private JTextField themenbereich;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BPSAbgabe dialog = new BPSAbgabe(111);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Erzeugt ein Fenster zur abgabe des BPS
	 * @param matnum
	 * @throws Exception
	 */
	public BPSAbgabe(int matnum) throws Exception {
		UIManager.setLookAndFeel(new FlatLightLaf());
		setBounds(100, 100, 725, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 558, 55, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 78, 38, 48, 0, 137, 73, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
			JLabel lblNewLabel = new JLabel("Anmeldung des BPS");
			lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 0;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		
			JLabel lblNewLabel_3 = new JLabel("Unternehmen:");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 0;
			gbc_lblNewLabel_3.gridy = 2;
			contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
			unternehmen = new JTextField();
			GridBagConstraints gbc_unternehmen = new GridBagConstraints();
			gbc_unternehmen.insets = new Insets(0, 0, 5, 5);
			gbc_unternehmen.fill = GridBagConstraints.HORIZONTAL;
			gbc_unternehmen.gridx = 1;
			gbc_unternehmen.gridy = 2;
			contentPanel.add(unternehmen, gbc_unternehmen);
			unternehmen.setColumns(10);
		
			JLabel lblNewLabel_4 = new JLabel("Firmenanschrift:");
			GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
			gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4.gridx = 0;
			gbc_lblNewLabel_4.gridy = 3;
			contentPanel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
			firmenanschrift = new JTextField();
			GridBagConstraints gbc_firmenanschrift = new GridBagConstraints();
			gbc_firmenanschrift.insets = new Insets(0, 0, 5, 5);
			gbc_firmenanschrift.fill = GridBagConstraints.HORIZONTAL;
			gbc_firmenanschrift.gridx = 1;
			gbc_firmenanschrift.gridy = 3;
			contentPanel.add(firmenanschrift, gbc_firmenanschrift);
			firmenanschrift.setColumns(10);
		
			JLabel lblNewLabel_1 = new JLabel("Firmenbetreuer");
			lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 5;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
			JLabel lblNewLabel_5 = new JLabel("Name:");
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5.gridx = 0;
			gbc_lblNewLabel_5.gridy = 6;
			contentPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
			name = new JTextField();
			GridBagConstraints gbc_name = new GridBagConstraints();
			gbc_name.insets = new Insets(0, 0, 5, 5);
			gbc_name.fill = GridBagConstraints.HORIZONTAL;
			gbc_name.gridx = 1;
			gbc_name.gridy = 6;
			contentPanel.add(name, gbc_name);
			name.setColumns(10);
		
			JLabel lblNewLabel_6 = new JLabel("Abteilung:");
			GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
			gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_6.gridx = 0;
			gbc_lblNewLabel_6.gridy = 7;
			contentPanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
			abteilung = new JTextField();
			GridBagConstraints gbc_abteilung = new GridBagConstraints();
			gbc_abteilung.insets = new Insets(0, 0, 5, 5);
			gbc_abteilung.fill = GridBagConstraints.HORIZONTAL;
			gbc_abteilung.gridx = 1;
			gbc_abteilung.gridy = 7;
			contentPanel.add(abteilung, gbc_abteilung);
			abteilung.setColumns(10);
		
			JLabel lblNewLabel_7 = new JLabel("Telefon:");
			GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
			gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_7.gridx = 0;
			gbc_lblNewLabel_7.gridy = 8;
			contentPanel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
			telefon = new JTextField();
			GridBagConstraints gbc_telefon = new GridBagConstraints();
			gbc_telefon.insets = new Insets(0, 0, 5, 5);
			gbc_telefon.fill = GridBagConstraints.HORIZONTAL;
			gbc_telefon.gridx = 1;
			gbc_telefon.gridy = 8;
			contentPanel.add(telefon, gbc_telefon);
			telefon.setColumns(10);
		
			JLabel lblNewLabel_8 = new JLabel("E-mail:");
			GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
			gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_8.gridx = 0;
			gbc_lblNewLabel_8.gridy = 9;
			contentPanel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
			email = new JTextField();
			GridBagConstraints gbc_email = new GridBagConstraints();
			gbc_email.insets = new Insets(0, 0, 5, 5);
			gbc_email.fill = GridBagConstraints.HORIZONTAL;
			gbc_email.gridx = 1;
			gbc_email.gridy = 9;
			contentPanel.add(email, gbc_email);
			email.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Zeitraum:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 11;
		contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 11;
			contentPanel.add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{149, 153, 0};
			gbl_panel.rowHeights = new int[]{40, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			
			JRadioButton datum1 = new JRadioButton("01.03.- 31.08.");
			GridBagConstraints gbc_datum1 = new GridBagConstraints();
			gbc_datum1.fill = GridBagConstraints.HORIZONTAL;
			gbc_datum1.insets = new Insets(0, 0, 0, 5);
			gbc_datum1.gridx = 0;
			gbc_datum1.gridy = 0;
			panel.add(datum1, gbc_datum1);
			
			JRadioButton datum2 = new JRadioButton("01.09.- 28.02");
			GridBagConstraints gbc_datum2 = new GridBagConstraints();
			gbc_datum2.fill = GridBagConstraints.HORIZONTAL;
			gbc_datum2.gridx = 1;
			gbc_datum2.gridy = 0;
			ButtonGroup group=new ButtonGroup();
			group.add(datum1);
			group.add(datum2);
			panel.add(datum2, gbc_datum2);
		
			JLabel lblNewLabel_9 = new JLabel("Themenbereich:");
			GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
			gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_9.gridx = 0;
			gbc_lblNewLabel_9.gridy = 13;
			contentPanel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		
		themenbereich = new JTextField();
		GridBagConstraints gbc_themenbereich = new GridBagConstraints();
		gbc_themenbereich.insets = new Insets(0, 0, 5, 5);
		gbc_themenbereich.fill = GridBagConstraints.BOTH;
		gbc_themenbereich.gridx = 1;
		gbc_themenbereich.gridy = 13;
		contentPanel.add(themenbereich, gbc_themenbereich);
		themenbereich.setColumns(10);
		
			JLabel lblNewLabel_10 = new JLabel("Kurzbeschreibung:");
			GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
			gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_10.gridx = 0;
			gbc_lblNewLabel_10.gridy = 14;
			contentPanel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		
			JTextPane kurzBeschreibung = new JTextPane();
			GridBagConstraints gbc_kurzBeschreibung = new GridBagConstraints();
			gbc_kurzBeschreibung.insets = new Insets(0, 0, 5, 5);
			gbc_kurzBeschreibung.fill = GridBagConstraints.BOTH;
			gbc_kurzBeschreibung.gridx = 1;
			gbc_kurzBeschreibung.gridy = 14;
			contentPanel.add(kurzBeschreibung, gbc_kurzBeschreibung);
		
		
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				JButton okButton = new JButton("Abgeben");
				okButton.setActionCommand("OK");
				okButton.addActionListener(e->{
					String datum=null;
					if (datum1.isSelected()) {
						datum = datum1.getText();
					}

					else if (datum2.isSelected()) {
						datum = datum2.getText();
					}
					try {
					if(!unternehmen.getText().equals("")&&!firmenanschrift.getText().equals("")&&!name.getText().equals("")&&!abteilung.getText().equals("")&&!telefon.getText().equals("")
							&&!email.getText().equals("")&&!themenbereich.getText().equals("")&&!kurzBeschreibung.getText().equals("")&&datum!=null) {
					
						BPS bps = new BPS(matnum, unternehmen.getText(), firmenanschrift.getText(),
							name.getText(), abteilung.getText(), telefon.getText(),
							email.getText(), datum, themenbereich.getText(), kurzBeschreibung.getText(),
							"beantragt");
						try {
						Datenbank.createBPS(matnum, bps);
						}
						catch(Exception e2) {
							JOptionPane.showMessageDialog(null, "Sie haben bereits eine Bewerbung hochgeladen");
						}
						dispose();
						
					}
					else JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen");
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			
			
				JButton cancelButton = new JButton("Abbrechen");
				cancelButton.addActionListener(e->{
					dispose();
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			
		
	}
}
