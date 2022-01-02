package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.BPS;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class StudentPopup extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			StudentPopup dialog = new StudentPopup(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws Exception 
	 */
	public StudentPopup(BPS bps) throws Exception {
		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel(bps.toString());
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Akzeptieren");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(e->{
					try {
						Datenbank.updateBPSStatus("offen", bps.getId());
						new JOptionPane().showMessageDialog(null, "Bestätigt");
						dispose();
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				});
			}
			{
				JButton cancelButton = new JButton("Ablehnen");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(e->{
					dispose();
				});
			}
		}
	}

}
