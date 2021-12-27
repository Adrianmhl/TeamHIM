package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.PdfFilter;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Insets;
import java.io.File;

import javax.swing.JTextArea;
import java.awt.Color;

public class Feedback extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Feedback dialog = new Feedback(1);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws UnsupportedLookAndFeelException 
	 */
	public Feedback(int matnum) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{469, 0};
		gbl_contentPanel.rowHeights = new int[]{51, 245, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JTextPane txtpnWollenSieDen = new JTextPane();
			txtpnWollenSieDen.setEditable(false);
			txtpnWollenSieDen.setText("Wollen sie den Bericht Annehmen? \n Wenn nicht, f\u00FCllen sie bitte das Feedbackfeld unten aus und klickenn sie anschlie\u00DFend auf \"Ablenen\"");
			GridBagConstraints gbc_txtpnWollenSieDen = new GridBagConstraints();
			gbc_txtpnWollenSieDen.insets = new Insets(0, 0, 5, 0);
			gbc_txtpnWollenSieDen.fill = GridBagConstraints.BOTH;
			gbc_txtpnWollenSieDen.gridx = 0;
			gbc_txtpnWollenSieDen.gridy = 0;
			contentPanel.add(txtpnWollenSieDen, gbc_txtpnWollenSieDen);
		}
		{
			JTextArea textArea = new JTextArea();
			textArea.setBackground(Color.WHITE);
			textArea.setToolTipText("Feedback hier eingeben");
			GridBagConstraints gbc_textArea = new GridBagConstraints();
			gbc_textArea.fill = GridBagConstraints.BOTH;
			gbc_textArea.gridx = 0;
			gbc_textArea.gridy = 1;
			contentPanel.add(textArea, gbc_textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Annehmen");
				okButton.addActionListener(e->{
					try {
						Datenbank.acceptBericht(matnum);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Ablenen");
				cancelButton.addActionListener(e->{
					JFileChooser chooser = new JFileChooser();
					chooser.addChoosableFileFilter(new PdfFilter());
					int input = chooser.showOpenDialog(null);
					if (input == JFileChooser.APPROVE_OPTION) {
						File feedback = new File(chooser.getSelectedFile().getAbsolutePath());
						dispose();
					}
					else JOptionPane.showMessageDialog(null, "Bitte laden sie die von ihnen mit Feedback versehene PDF Datei hoch!");
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
