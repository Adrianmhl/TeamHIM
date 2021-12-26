package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class CheckFiles extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CheckFiles dialog = new CheckFiles();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CheckFiles() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JPanel panel_Praktikumsverwaltung = new JPanel();
		panel_Praktikumsverwaltung.setBackground(Color.WHITE);
		GridBagLayout gbl_panel_Praktikumsverwaltung = new GridBagLayout();
		gbl_panel_Praktikumsverwaltung.columnWidths = new int[]{136, 136, 136, 136, 0};
		gbl_panel_Praktikumsverwaltung.rowHeights = new int[]{96, 61, 14, 23, 0};
		gbl_panel_Praktikumsverwaltung.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_Praktikumsverwaltung.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_Praktikumsverwaltung.setLayout(gbl_panel_Praktikumsverwaltung);
		
				JLabel lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setIcon(new ImageIcon(MenuPPA.class.getResource("/res/document_file_document_icon_159190.png")));
				GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
				gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
				gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_4.gridx = 0;
				gbc_lblNewLabel_4.gridy = 1;
				panel_Praktikumsverwaltung.add(lblNewLabel_4, gbc_lblNewLabel_4);
						
								JLabel lblNewLabel_4_1 = new JLabel("");
								lblNewLabel_4_1
										.setIcon(new ImageIcon(MenuPPA.class.getResource("/res/document_file_document_icon_159190.png")));
								GridBagConstraints gbc_lblNewLabel_4_1 = new GridBagConstraints();
								gbc_lblNewLabel_4_1.fill = GridBagConstraints.VERTICAL;
								gbc_lblNewLabel_4_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblNewLabel_4_1.gridx = 1;
								gbc_lblNewLabel_4_1.gridy = 1;
								panel_Praktikumsverwaltung.add(lblNewLabel_4_1, gbc_lblNewLabel_4_1);
				
						JLabel lblNewLabel_4_1_1 = new JLabel("");
						lblNewLabel_4_1_1
								.setIcon(new ImageIcon(MenuPPA.class.getResource("/res/document_file_document_icon_159190.png")));
						GridBagConstraints gbc_lblNewLabel_4_1_1 = new GridBagConstraints();
						gbc_lblNewLabel_4_1_1.fill = GridBagConstraints.VERTICAL;
						gbc_lblNewLabel_4_1_1.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel_4_1_1.gridx = 2;
						gbc_lblNewLabel_4_1_1.gridy = 1;
						panel_Praktikumsverwaltung.add(lblNewLabel_4_1_1, gbc_lblNewLabel_4_1_1);
				
						JLabel lblNewLabel_4_1_1_1 = new JLabel("");
						lblNewLabel_4_1_1_1
								.setIcon(new ImageIcon(MenuPPA.class.getResource("/res/document_file_document_icon_159190.png")));
						GridBagConstraints gbc_lblNewLabel_4_1_1_1 = new GridBagConstraints();
						gbc_lblNewLabel_4_1_1_1.fill = GridBagConstraints.VERTICAL;
						gbc_lblNewLabel_4_1_1_1.insets = new Insets(0, 0, 5, 0);
						gbc_lblNewLabel_4_1_1_1.gridx = 3;
						gbc_lblNewLabel_4_1_1_1.gridy = 1;
						panel_Praktikumsverwaltung.add(lblNewLabel_4_1_1_1, gbc_lblNewLabel_4_1_1_1);
				
						JLabel lblNewLabel = new JLabel("T\u00E4tigkeitsnachweis");
						lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
						GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
						gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
						gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
						gbc_lblNewLabel.gridx = 0;
						gbc_lblNewLabel.gridy = 2;
						panel_Praktikumsverwaltung.add(lblNewLabel, gbc_lblNewLabel);
		
				JLabel lblBericht = new JLabel("Bericht");
				lblBericht.setFont(new Font("Arial", Font.BOLD, 11));
				GridBagConstraints gbc_lblBericht = new GridBagConstraints();
				gbc_lblBericht.fill = GridBagConstraints.VERTICAL;
				gbc_lblBericht.insets = new Insets(0, 0, 5, 5);
				gbc_lblBericht.gridx = 1;
				gbc_lblBericht.gridy = 2;
				panel_Praktikumsverwaltung.add(lblBericht, gbc_lblBericht);
				
						JLabel lblBpsvertrag = new JLabel("BPS-Vertrag");
						lblBpsvertrag.setFont(new Font("Arial", Font.BOLD, 11));
						GridBagConstraints gbc_lblBpsvertrag = new GridBagConstraints();
						gbc_lblBpsvertrag.fill = GridBagConstraints.VERTICAL;
						gbc_lblBpsvertrag.insets = new Insets(0, 0, 5, 5);
						gbc_lblBpsvertrag.gridx = 2;
						gbc_lblBpsvertrag.gridy = 2;
						panel_Praktikumsverwaltung.add(lblBpsvertrag, gbc_lblBpsvertrag);
		
				JLabel lblBesuchsbericht = new JLabel("Besuchsbericht");
				lblBesuchsbericht.setFont(new Font("Arial", Font.BOLD, 11));
				GridBagConstraints gbc_lblBesuchsbericht = new GridBagConstraints();
				gbc_lblBesuchsbericht.fill = GridBagConstraints.VERTICAL;
				gbc_lblBesuchsbericht.insets = new Insets(0, 0, 5, 0);
				gbc_lblBesuchsbericht.gridx = 3;
				gbc_lblBesuchsbericht.gridy = 2;
				panel_Praktikumsverwaltung.add(lblBesuchsbericht, gbc_lblBesuchsbericht);
		
				JButton btnNewButton = new JButton("\u00D6ffnen");
				btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
				btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					}
				});
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
				gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
				gbc_btnNewButton.gridx = 0;
				gbc_btnNewButton.gridy = 3;
				panel_Praktikumsverwaltung.add(btnNewButton, gbc_btnNewButton);
		
				JButton btnNewButton_1 = new JButton("\u00D6ffnen");
				btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.fill = GridBagConstraints.VERTICAL;
				gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
				gbc_btnNewButton_1.gridx = 1;
				gbc_btnNewButton_1.gridy = 3;
				panel_Praktikumsverwaltung.add(btnNewButton_1, gbc_btnNewButton_1);
		
				JButton btnNewButton_1_1_1 = new JButton("\u00D6ffnen");
				btnNewButton_1_1_1.setFont(new Font("Arial", Font.BOLD, 11));
				btnNewButton_1_1_1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					}
				});
				
						JButton btnNewButton_1_1 = new JButton("\u00D6ffnen");
						btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 11));
						GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
						gbc_btnNewButton_1_1.fill = GridBagConstraints.VERTICAL;
						gbc_btnNewButton_1_1.insets = new Insets(0, 0, 0, 5);
						gbc_btnNewButton_1_1.gridx = 2;
						gbc_btnNewButton_1_1.gridy = 3;
						panel_Praktikumsverwaltung.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
						
				GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
				gbc_btnNewButton_1_1_1.fill = GridBagConstraints.VERTICAL;
				gbc_btnNewButton_1_1_1.gridx = 3;
				gbc_btnNewButton_1_1_1.gridy = 3;
				panel_Praktikumsverwaltung.add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
				contentPanel.add(panel_Praktikumsverwaltung);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
