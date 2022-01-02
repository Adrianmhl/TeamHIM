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
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.BPS;
import Objekte.PdfFilter;
import Objekte.Studierende;

import java.awt.ScrollPane;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

import java.awt.Component;

public class MenuPPA extends JFrame {

	private JPanel contentPane;
	
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuPPA frame = new MenuPPA(1);
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
	@SuppressWarnings("serial")
	public MenuPPA(int ppaNum) throws Exception{
		setMinimumSize(new Dimension(640, 480));
		setLocationByPlatform(true);
		setSize(new Dimension(640, 480));
		
		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		
		setTitle("HIM - HFT Intern Manager");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{93, 438, 0};
		gbl_contentPane.rowHeights = new int[]{361, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 50.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.decode("#CD201F"));
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.insets = new Insets(0, 0, 0, 5);
				gbc_panel_1.gridx = 0;
				gbc_panel_1.gridy = 0;
				contentPane.add(panel_1, gbc_panel_1);
										GridBagLayout gbl_panel_1 = new GridBagLayout();
										gbl_panel_1.columnWidths = new int[] {50, 0};
										gbl_panel_1.rowHeights = new int[]{98, 112, 0};
										gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
										gbl_panel_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
										panel_1.setLayout(gbl_panel_1);
																		
																				JLabel lblNewLabel_5_5 = new JLabel("");
																				GridBagConstraints gbc_lblNewLabel_5_5 = new GridBagConstraints();
																				gbc_lblNewLabel_5_5.fill = GridBagConstraints.BOTH;
																				gbc_lblNewLabel_5_5.insets = new Insets(0, 0, 5, 0);
																				gbc_lblNewLabel_5_5.gridx = 0;
																				gbc_lblNewLabel_5_5.gridy = 0;
																				panel_1.add(lblNewLabel_5_5, gbc_lblNewLabel_5_5);
																
																		JLabel lblNewLabel_5_2 = new JLabel("");
																		GridBagConstraints gbc_lblNewLabel_5_2 = new GridBagConstraints();
																		gbc_lblNewLabel_5_2.fill = GridBagConstraints.BOTH;
																		gbc_lblNewLabel_5_2.insets = new Insets(0, 0, 5, 0);
																		gbc_lblNewLabel_5_2.gridx = 0;
																		gbc_lblNewLabel_5_2.gridy = 0;
																		panel_1.add(lblNewLabel_5_2, gbc_lblNewLabel_5_2);
														
																JLabel lblNewLabel_5_4 = new JLabel("");
																GridBagConstraints gbc_lblNewLabel_5_4 = new GridBagConstraints();
																gbc_lblNewLabel_5_4.fill = GridBagConstraints.BOTH;
																gbc_lblNewLabel_5_4.insets = new Insets(0, 0, 5, 0);
																gbc_lblNewLabel_5_4.gridx = 0;
																gbc_lblNewLabel_5_4.gridy = 0;
																panel_1.add(lblNewLabel_5_4, gbc_lblNewLabel_5_4);
												
														JLabel lblNewLabel_5_1 = new JLabel("");
														GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
														gbc_lblNewLabel_5_1.fill = GridBagConstraints.BOTH;
														gbc_lblNewLabel_5_1.insets = new Insets(0, 0, 5, 0);
														gbc_lblNewLabel_5_1.gridx = 0;
														gbc_lblNewLabel_5_1.gridy = 0;
														panel_1.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
										
												JLabel lblNewLabel_5_3 = new JLabel("");
												GridBagConstraints gbc_lblNewLabel_5_3 = new GridBagConstraints();
												gbc_lblNewLabel_5_3.fill = GridBagConstraints.BOTH;
												gbc_lblNewLabel_5_3.insets = new Insets(0, 0, 5, 0);
												gbc_lblNewLabel_5_3.gridx = 0;
												gbc_lblNewLabel_5_3.gridy = 0;
												panel_1.add(lblNewLabel_5_3, gbc_lblNewLabel_5_3);
												
														JLabel lblNewLabel_1_2_2 = new JLabel("Log Out");
														GridBagConstraints gbc_lblNewLabel_1_2_2 = new GridBagConstraints();
														gbc_lblNewLabel_1_2_2.insets = new Insets(0, 10, 10, 0);
														gbc_lblNewLabel_1_2_2.anchor = GridBagConstraints.SOUTH;
														gbc_lblNewLabel_1_2_2.fill = GridBagConstraints.HORIZONTAL;
														gbc_lblNewLabel_1_2_2.gridx = 0;
														gbc_lblNewLabel_1_2_2.gridy = 1;
														panel_1.add(lblNewLabel_1_2_2, gbc_lblNewLabel_1_2_2);
														lblNewLabel_1_2_2.addMouseListener(new MouseAdapter() {
															@Override
															public void mouseClicked(MouseEvent e) {

																Login log;
																try {
																	log = new Login();
																	log.setVisible(true);
																} catch (Exception e1) {
																	e1.printStackTrace();
																}

																dispose();

															}
														});
														lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
														lblNewLabel_1_2_2.setForeground(Color.WHITE);
														lblNewLabel_1_2_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		
				
				
						JPanel panel_BPS = new JPanel();
						panel_BPS.setBackground(Color.WHITE);
						GridBagConstraints gbc_panel_BPS = new GridBagConstraints();
						gbc_panel_BPS.fill = GridBagConstraints.BOTH;
						contentPane.add(panel_BPS, gbc_panel_BPS);
								GridBagLayout gbl_panel_BPS = new GridBagLayout();
								gbl_panel_BPS.columnWidths = new int[]{527, 0};
								gbl_panel_BPS.rowHeights = new int[]{45, 280, 40, 33, 0};
								gbl_panel_BPS.columnWeights = new double[]{1.0, Double.MIN_VALUE};
								gbl_panel_BPS.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
								panel_BPS.setLayout(gbl_panel_BPS);
										
												JLabel lblNewLabel_3_1_2_2 = new JLabel("BPS-Formular pr\u00FCfen");
												lblNewLabel_3_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
												lblNewLabel_3_1_2_2.setFont(new Font("Arial", Font.BOLD, 12));
												GridBagConstraints gbc_lblNewLabel_3_1_2_2 = new GridBagConstraints();
												gbc_lblNewLabel_3_1_2_2.fill = GridBagConstraints.BOTH;
												gbc_lblNewLabel_3_1_2_2.insets = new Insets(0, 0, 5, 0);
												gbc_lblNewLabel_3_1_2_2.gridx = 0;
												gbc_lblNewLabel_3_1_2_2.gridy = 0;
												panel_BPS.add(lblNewLabel_3_1_2_2, gbc_lblNewLabel_3_1_2_2);
										
												JScrollPane scrollPane = new JScrollPane();
												GridBagConstraints gbc_scrollPane = new GridBagConstraints();
												gbc_scrollPane.fill = GridBagConstraints.BOTH;
												gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
												gbc_scrollPane.gridx = 0;
												gbc_scrollPane.gridy = 1;
												panel_BPS.add(scrollPane, gbc_scrollPane);
												
														table = new JTable();
														table.addMouseListener(new MouseAdapter() {
															  public void mouseClicked(MouseEvent e) {
															    if (e.getClickCount() == 2) {
															      JTable click = (JTable)e.getSource();
															      int row = click.getSelectedRow();
															      
															      
																try {
																	if(table.getValueAt(row, 2).equals("beantragt")) { 
																		StudentPopup popup;
																		popup = new StudentPopup(Datenbank.getBPS((int) table.getValueAt(row, 0)));
																		popup.setVisible(true);
																	}
																	else if(table.getValueAt(row, 2).equals("Bewerber")){
																		ApplicationChooser popup;
																		popup= new ApplicationChooser((int) table.getValueAt(row, 0));
																		popup.setVisible(true);
																		
																	}
																	else if(table.getValueAt(row, 2).equals("Abgeschlossen")){
																		CheckFiles popup;
																		popup= new CheckFiles((int) table.getValueAt(row, 0));
																		popup.setVisible(true);
																	}
																} catch (Exception e1) {
																	e1.printStackTrace();
																}
															      
															    }
															  }
															});
														
														scrollPane.setViewportView(table);
														table.setModel(
																new DefaultTableModel(new Object[][] {}, new String[] { "Matrikelnummer", "Praxisstelle", "Status" }) {

																	@Override
																	public boolean isCellEditable(int row, int column) {
																		return false;
																	}
																	
																});
														
														JPanel panel = new JPanel();
														panel.setBackground(Color.WHITE);
														GridBagConstraints gbc_panel = new GridBagConstraints();
														gbc_panel.fill = GridBagConstraints.BOTH;
														gbc_panel.gridx = 0;
														gbc_panel.gridy = 3;
														panel_BPS.add(panel, gbc_panel);
														GridBagLayout gbl_panel = new GridBagLayout();
														gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 46, 0, 0};
														gbl_panel.rowHeights = new int[]{40, 0};
														gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
														gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
														panel.setLayout(gbl_panel);
														
														JCheckBox best_offen = new JCheckBox("Best\u00E4tigung offen");
														best_offen.setAlignmentY(Component.BOTTOM_ALIGNMENT);
														GridBagConstraints gbc_best_offen = new GridBagConstraints();
														gbc_best_offen.anchor = GridBagConstraints.SOUTH;
														gbc_best_offen.insets = new Insets(0, 0, 0, 5);
														gbc_best_offen.gridx = 1;
														gbc_best_offen.gridy = 0;
														
														panel.add(best_offen, gbc_best_offen);
														
														JCheckBox zut_offen = new JCheckBox("Zuteilung offen");
														zut_offen.setAlignmentY(Component.BOTTOM_ALIGNMENT);
														GridBagConstraints gbc_zut_offen = new GridBagConstraints();
														gbc_zut_offen.anchor = GridBagConstraints.SOUTH;
														gbc_zut_offen.insets = new Insets(0, 0, 0, 5);
														gbc_zut_offen.gridx = 2;
														gbc_zut_offen.gridy = 0;
														
														panel.add(zut_offen, gbc_zut_offen);
														
														JCheckBox doc_pr = new JCheckBox("Dokumente pr\u00FCfen");
														GridBagConstraints gbc_doc_pr = new GridBagConstraints();
														gbc_doc_pr.anchor = GridBagConstraints.SOUTH;
														gbc_doc_pr.insets = new Insets(0, 0, 0, 5);
														gbc_doc_pr.gridx = 3;
														gbc_doc_pr.gridy = 0;
														
														panel.add(doc_pr, gbc_doc_pr);
														
														best_offen.addActionListener(e->{
															try {
																refreshBPSinJTable(best_offen,zut_offen,doc_pr);
															} catch (Exception e1) {
																e1.printStackTrace();
															}
														});
														zut_offen.addActionListener(e->{
															try {
																refreshBPSinJTable(best_offen,zut_offen,doc_pr);
															} catch (Exception e1) {
																e1.printStackTrace();
															}
														});
														doc_pr.addActionListener(e->{
															try {
																refreshBPSinJTable(best_offen,zut_offen,doc_pr);
															} catch (Exception e1) {
																e1.printStackTrace();
															}
														});
														
														JButton anzeigeButton = new JButton("Liste anzeigen");
														anzeigeButton.addActionListener(e->{
															try {
																createExcel(ppaNum);
															} catch (Exception e1) {
																// TODO Auto-generated catch block
																e1.printStackTrace();
															}
														});
														GridBagConstraints gbc_anzeigeButton = new GridBagConstraints();
														gbc_anzeigeButton.insets = new Insets(0, 0, 0, 5);
														gbc_anzeigeButton.gridx = 4;
														gbc_anzeigeButton.gridy = 0;
														panel.add(anzeigeButton, gbc_anzeigeButton);
														JButton btnNewButton_2 = new JButton("Absolventenliste");
														btnNewButton_2.setActionCommand("Aktualisieren");
														btnNewButton_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
														GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
														gbc_btnNewButton_2.anchor = GridBagConstraints.SOUTHEAST;
														gbc_btnNewButton_2.gridx = 5;
														gbc_btnNewButton_2.gridy = 0;
														panel.add(btnNewButton_2, gbc_btnNewButton_2);
														JTextField pathField=new JTextField();
														
														btnNewButton_2.addActionListener(e->{
															try {
																JFileChooser chooser = new JFileChooser();
																chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
																int input = chooser.showOpenDialog(null);
																if (input == JFileChooser.APPROVE_OPTION) {
																	Datenbank.setPpaPath(ppaNum,chooser.getSelectedFile().getCanonicalPath());
																}		
															} catch (Exception e1) {
									
																e1.printStackTrace();
															}
															
														});
														table.getColumnModel().getColumn(0).setPreferredWidth(105);
														table.getColumnModel().getColumn(1).setPreferredWidth(105);
														table.getColumnModel().getColumn(2).setPreferredWidth(105);
		
		

		JLabel lblNewLabel_3_1_2 = new JLabel("Praktikumsverwaltung");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_2.setBounds(10, 0, 252, 32);
	}

	

	public void refreshBPSinJTable(JCheckBox best_offen, JCheckBox zut_offen, JCheckBox dok_pr) throws Exception{
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		Object[] rowData = new Object[3];
		
		ArrayList <BPS> bpsList=new ArrayList <BPS>();
		bpsList=Datenbank.getBPSlist();
		if(best_offen.isSelected()) {
			for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {
				if(bpsList.get(i).getStatus().length()>1&&bpsList.get(i).getStatus().equals("beantragt")) {
					rowData[0] = bpsList.get(i).getId();
					rowData[1] = bpsList.get(i).getUnternehmen();
					rowData[2] = bpsList.get(i).getStatus();
					model.addRow(rowData);
				}
			}
		}
		if(zut_offen.isSelected()) {
			for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {
				if(bpsList.get(i).getStatus().length()>1&&bpsList.get(i).getStatus().equals("Bewerber")) {
					rowData[0] = bpsList.get(i).getId();
					rowData[1] = bpsList.get(i).getUnternehmen();
					rowData[2] = bpsList.get(i).getStatus();
					model.addRow(rowData);
				}
			}
		}
		if(dok_pr.isSelected()) {
			checkStudentDocuments();
			for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {
				if(bpsList.get(i).getStatus().length()>1&&bpsList.get(i).getStatus().equals("Abgeschlossen")) {
					rowData[0] = bpsList.get(i).getId();
					rowData[1] = bpsList.get(i).getUnternehmen();
					rowData[2] = bpsList.get(i).getStatus();
					model.addRow(rowData);
				}
			}
		}

	}
	public void checkStudentDocuments() throws Exception {
		
		ArrayList <Studierende>studentList=new ArrayList <Studierende>();
		studentList=Datenbank.getStudentlist();
		
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getBericht()!=null) {
					if(studentList.get(i).getNachweis()!=null&&studentList.get(i).getVertrag()!=null&&Datenbank.checkBesuchBericht(studentList.get(i).getUserId())&&!Datenbank.getBPS(studentList.get(i).getUserId()).getStatus().equals("Beendet")) {
						Datenbank.updateBPSStatus("Abgeschlossen", studentList.get(i).getUserId());
				}
			}
		}
	}
	private void createExcel(int ppaNum) throws Exception { 
	
		 
		System.out.println(Datenbank.getPpaPath(ppaNum));
		String filename = ""+Datenbank.getPpaPath(ppaNum)+"\\Absolventen.xlsx";  
		
		HSSFWorkbook workbook = new HSSFWorkbook(); 
        
    
        HSSFSheet sheet = workbook.createSheet("Absolventen");
        Map<String, Object[]> data = Datenbank.getAbsolventen();
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] rowData = data.get(key);
            int cellnum = 0;
            for (Object cellData : rowData)
            {
            	Cell cell = row.createCell(cellnum++);
            	if(cellData instanceof String)
            		cell.setCellValue((String)cellData);
            	else if(cellData instanceof Integer)
            		cell.setCellValue((Integer)cellData);
            }
        }
        
            
            FileOutputStream outputStream = new FileOutputStream(new File(filename));
            workbook.write(outputStream);
            outputStream.close();
	} 
 
	
}
