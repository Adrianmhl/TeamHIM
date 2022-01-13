package Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.Bewerbung;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.UIManager;

public class ApplicationChooser extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Ein Popup, in dem das PPA einen Betreuer aus der Bewerberliste für einen Studenten auswählen kann
	 * @param id
	 * @throws Exception
	 */
	public ApplicationChooser(int id) throws Exception {
		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JScrollPane scrollPane = new JScrollPane();
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 0;
			contentPanel.add(scrollPane, gbc_scrollPane);
			{
				table = new JTable();
				table.setToolTipText("");
				table.setModel(
						new DefaultTableModel(new Object[][] {}, new String[] {"Rang", "ID","Name"  }) {

							@Override
							public boolean isCellEditable(int row, int column) {
								return false;
							}
							
						});
				scrollPane.setViewportView(table);
				applicationTableData(id);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Zuteilen");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(table.getSelectedRowCount()>0)
							try {
								Datenbank.zuteilung(id, (int) table.getValueAt(table.getSelectedRow(), 1));
								new JOptionPane().showMessageDialog(null, "Zugeteilt");
								dispose();
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						else
							new JOptionPane().showMessageDialog(null, "Bitte eine Zeile auswählen");
					}
				});
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
			}
		}
	}
	
	public void applicationTableData(int id) throws Exception{

		Datenbank.getBPSlist();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		Object[] rowData = new Object[3];
		
		for (int i = 0; i < Datenbank.getApplicationList(id).size(); i++) {
			rowData[0] = Datenbank.getApplicationList(id).get(i).getCount();
			rowData[1] =Datenbank.getApplicationList(id).get(i).getProf();
			rowData[2] = Datenbank.getUser(Datenbank.getApplicationList(id).get(i).getProf()).getUserName();
			
			model.addRow(rowData);
		}

	}

}
