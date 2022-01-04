package Swing;

import java.awt.Color;
import java.awt.Component;
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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.PdfFilter;


import javax.swing.JScrollPane;
import javax.swing.JList;

public class MenuBet extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	static JTable table;
	static JTable studentTable;
	public JScrollPane scrollPane;
	public JScrollPane scrollPane2;
	public JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MenuBet frame = new MenuBet(11);
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
	public MenuBet(int id) throws Exception {
		
		UIManager.setLookAndFeel(new FlatAtomOneLightContrastIJTheme());
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{93, 518, 0};
		gbl_contentPane.rowHeights = new int[]{361, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 50.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.decode("#CD201F"));
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.insets = new Insets(0, 0, 0, 5);
				gbc_panel_1.fill = GridBagConstraints.BOTH;
				gbc_panel_1.gridx = 0;
				gbc_panel_1.gridy = 0;
				contentPane.add(panel_1, gbc_panel_1);
						GridBagLayout gbl_panel_1 = new GridBagLayout();
						gbl_panel_1.columnWidths = new int[] {90, 0};
						gbl_panel_1.rowHeights = new int[]{90, 21, 21, 21, 21, 236, 0, 0};
						gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
						gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
						panel_1.setLayout(gbl_panel_1);
								
										JPanel tab2_2_3 = new JPanel();
										tab2_2_3.setLayout(null);
										tab2_2_3.setBackground(Color.decode("#CD201F"));
										GridBagConstraints gbc_tab2_2_3 = new GridBagConstraints();
										gbc_tab2_2_3.fill = GridBagConstraints.BOTH;
										gbc_tab2_2_3.insets = new Insets(0, 0, 5, 0);
										gbc_tab2_2_3.gridx = 0;
										gbc_tab2_2_3.gridy = 1;
										panel_1.add(tab2_2_3, gbc_tab2_2_3);
										
												JLabel lblNewLabel_1_1 = new JLabel("Bewerbung");
												lblNewLabel_1_1.setBounds(0, 0, 126, 24);
												tab2_2_3.add(lblNewLabel_1_1);
												lblNewLabel_1_1.setForeground(Color.WHITE);
												lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
												lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
													@Override
													public void mouseClicked(MouseEvent e) {
														tabbedPane.setSelectedIndex(0);
													}
												});
												lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 11));
								
										JPanel tab2_2 = new JPanel();
										tab2_2.setBackground(Color.decode("#CD201F"));
										GridBagConstraints gbc_tab2_2 = new GridBagConstraints();
										gbc_tab2_2.fill = GridBagConstraints.BOTH;
										gbc_tab2_2.insets = new Insets(0, 0, 5, 0);
										gbc_tab2_2.gridx = 0;
										gbc_tab2_2.gridy = 2;
										panel_1.add(tab2_2, gbc_tab2_2);
												tab2_2.setLayout(null);
						
								JPanel tab2_2_1 = new JPanel();
								tab2_2_1.setBackground(Color.decode("#CD201F"));
								GridBagConstraints gbc_tab2_2_1 = new GridBagConstraints();
								gbc_tab2_2_1.fill = GridBagConstraints.BOTH;
								gbc_tab2_2_1.insets = new Insets(0, 0, 5, 0);
								gbc_tab2_2_1.gridx = 0;
								gbc_tab2_2_1.gridy = 3;
								panel_1.add(tab2_2_1, gbc_tab2_2_1);
								
										JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
										lblNewLabel_1_2_1.setForeground(Color.WHITE);
										lblNewLabel_1_2_1.setBackground(Color.decode("#CD201F"));
										lblNewLabel_1_2_1.setBounds(0, 0, 116, 18);
										lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
										lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
											@Override
											public void mouseClicked(MouseEvent e) {
												tabbedPane.setSelectedIndex(2);
											}
										});
										tab2_2_1.setLayout(null);
										lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 11));
										tab2_2_1.add(lblNewLabel_1_2_1);
						
						JPanel tab2_2_1_1 = new JPanel();
						tab2_2_1_1.setLayout(null);
						tab2_2_1_1.setBackground(Color.decode("#CD201F"));
						GridBagConstraints gbc_tab2_2_1_1 = new GridBagConstraints();
						gbc_tab2_2_1_1.fill = GridBagConstraints.BOTH;
						gbc_tab2_2_1_1.insets = new Insets(0, 0, 5, 0);
						gbc_tab2_2_1_1.gridx = 0;
						gbc_tab2_2_1_1.gridy = 4;
						panel_1.add(tab2_2_1_1, gbc_tab2_2_1_1);
						
						JLabel lblNewLabel_1_2_1_1 = new JLabel("Studenten");
						lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
						lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
						lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 11));
						lblNewLabel_1_2_1_1.setBackground(Color.decode("#CD201F"));
						lblNewLabel_1_2_1_1.setBounds(0, 0, 116, 18);
						tab2_2_1_1.add(lblNewLabel_1_2_1_1);
						lblNewLabel_1_2_1_1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								tabbedPane.setSelectedIndex(3);
								try {
									refreshStudentList(id);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
										
												JLabel lblNewLabel_1_2_2 = new JLabel("Log Out");
												GridBagConstraints gbc_lblNewLabel_1_2_2 = new GridBagConstraints();
												gbc_lblNewLabel_1_2_2.anchor = GridBagConstraints.SOUTH;
												gbc_lblNewLabel_1_2_2.fill = GridBagConstraints.HORIZONTAL;
												gbc_lblNewLabel_1_2_2.gridx = 0;
												gbc_lblNewLabel_1_2_2.gridy = 6;
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
															e1.printStackTrace();
														}
														dispose();

													}
												});
												lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
												lblNewLabel_1_2_2.setFont(new Font("Arial", Font.BOLD, 11));
		
		
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 0;
		
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
				panel_3 = new JPanel();
				panel_3.setBackground(Color.WHITE);
				tabbedPane.addTab("Bewerbung", null, panel_3, null);
						GridBagLayout gbl_panel_3 = new GridBagLayout();
						gbl_panel_3.columnWidths = new int[]{513, 0};
						gbl_panel_3.rowHeights = new int[]{32, 306, 0, 23, 0};
						gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
						gbl_panel_3.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
						panel_3.setLayout(gbl_panel_3);
						
								JLabel lblNewLabel_3 = new JLabel("Bewerbung auf BPS-Student");
								lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
								lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
								GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
								gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
								gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
								gbc_lblNewLabel_3.gridx = 0;
								gbc_lblNewLabel_3.gridy = 0;
								panel_3.add(lblNewLabel_3, gbc_lblNewLabel_3);
						
								scrollPane = new JScrollPane();
								GridBagConstraints gbc_scrollPane = new GridBagConstraints();
								gbc_scrollPane.fill = GridBagConstraints.BOTH;
								gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
								gbc_scrollPane.gridx = 0;
								gbc_scrollPane.gridy = 1;
								panel_3.add(scrollPane, gbc_scrollPane);
								
										table = new JTable();
										scrollPane.setViewportView(table);
										table.setToolTipText("");
										
												table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Matrikelnummer", "Name","Vorname", "Praxisstelle", "Status" }) {
										
													@Override
													public boolean isCellEditable(int row, int column) {
														return false;
													}
													
												});
												
														JPanel panel_2 = new JPanel();
														scrollPane.setColumnHeaderView(panel_2);
														panel_2.setBackground(Color.WHITE);
														panel_2.setForeground(Color.WHITE);
						
						JPanel panel = new JPanel();
						panel.setBackground(Color.WHITE);
						GridBagConstraints gbc_panel = new GridBagConstraints();
						gbc_panel.fill = GridBagConstraints.BOTH;
						gbc_panel.gridx = 0;
						gbc_panel.gridy = 3;
						panel_3.add(panel, gbc_panel);
						GridBagLayout gbl_panel = new GridBagLayout();
						gbl_panel.columnWidths = new int[]{128, 289, 0, 0};
						gbl_panel.rowHeights = new int[]{0, 0};
						gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
						gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
						panel.setLayout(gbl_panel);
						
						
						
						JButton btnNewButton = new JButton("Bewerben");
						GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
						gbc_btnNewButton.anchor = GridBagConstraints.EAST;
						gbc_btnNewButton.gridx = 2;
						gbc_btnNewButton.gridy = 0;
						panel.add(btnNewButton, gbc_btnNewButton);
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(table.getSelectedRowCount()>0)
									try {
										Datenbank.studBetreuerMatch((int) table.getValueAt(table.getSelectedRow(), 0), id);
										JOptionPane.showMessageDialog(null, "Erfolgreich beworben!");
									} catch (Exception e1) {
										JOptionPane.showMessageDialog(null, "Sie haben sich bereits beworben!");
									}
								else
									JOptionPane.showMessageDialog(null,"Bitte eine Zeile auswählen!");
							}
						});
																			
																			JPanel panel5 = new JPanel();
																			panel5.setBackground(Color.WHITE);
																			tabbedPane.addTab("Studenten", null, panel5, null);
																			GridBagLayout gbl_panel5 = new GridBagLayout();
																			gbl_panel5.columnWidths = new int[]{516, 0};
																			gbl_panel5.rowHeights = new int[]{33, 283, 20, 45, 0};
																			gbl_panel5.columnWeights = new double[]{1.0, Double.MIN_VALUE};
																			gbl_panel5.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
																			panel5.setLayout(gbl_panel5);
	      
	      JLabel lblNewLabel = new JLabel("Meine Studenten");
	      GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
	      gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
	      gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
	      gbc_lblNewLabel.gridx = 0;
	      gbc_lblNewLabel.gridy = 0;
	      panel5.add(lblNewLabel, gbc_lblNewLabel);
	      
	    
	      scrollPane2 = new JScrollPane();
	      studentTable = new JTable();
	      
	      studentTable.setToolTipText("");
	      
	      		studentTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Matrikelnummer", "Name","Vorname", "Praxisstelle"}) {
	      
	      			@Override
	      			public boolean isCellEditable(int row, int column) {
	      				return false;
	      			}
	      			
	      		});
	      		scrollPane2.setViewportView(studentTable);
	      		GridBagConstraints gbc_scrollPane2 = new GridBagConstraints();
	      		gbc_scrollPane2.fill = GridBagConstraints.BOTH;
	      		gbc_scrollPane2.insets = new Insets(0, 0, 5, 0);
	      		gbc_scrollPane2.gridx = 0;
	      		gbc_scrollPane2.gridy = 1;
	      		panel5.add(scrollPane2, gbc_scrollPane2);
	      
	      JPanel panel_5 = new JPanel();
	      panel_5.setBackground(Color.WHITE);
	      GridBagConstraints gbc_panel_5 = new GridBagConstraints();
	      gbc_panel_5.fill = GridBagConstraints.BOTH;
	      gbc_panel_5.gridx = 0;
	      gbc_panel_5.gridy = 3;
	      panel5.add(panel_5, gbc_panel_5);
	      GridBagLayout gbl_panel_5 = new GridBagLayout();
	      gbl_panel_5.columnWidths = new int[]{131, 246, 0, 0, 0};
	      gbl_panel_5.rowHeights = new int[]{0, 0, 0};
	      gbl_panel_5.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
	      gbl_panel_5.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
	      panel_5.setLayout(gbl_panel_5);
	      
	    
	      
	      
	      JButton btnNewButton_4 = new JButton("Besuchsbericht Abgeben");
	      GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
	      gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
	      gbc_btnNewButton_4.gridx = 2;
	      gbc_btnNewButton_4.gridy = 0;
	      panel_5.add(btnNewButton_4, gbc_btnNewButton_4);
	      btnNewButton_4.addActionListener(e->{
	    	  	if(studentTable.getSelectedRowCount()>0)
				try {
					JFileChooser chooser = new JFileChooser();
					
					chooser.addChoosableFileFilter(new PdfFilter());
					
					int input = chooser.showOpenDialog(null);
					try {
						if (input == JFileChooser.APPROVE_OPTION) {
							File file = new File(chooser.getSelectedFile().getAbsolutePath());
							if(!file.getName().contains(".pdf")) throw new Exception() ;
							if(JOptionPane.showConfirmDialog(null, "Wollen sie diesen Bericht ("+file.getName()+") wirklich Hochladen?")==JOptionPane.OK_OPTION);
								Datenbank.uploadBesuchsBericht(file, (int) studentTable.getValueAt(studentTable.getSelectedRow(),0));
							}
						}
						catch(Exception e3) {
							e3.printStackTrace();
							JOptionPane.showMessageDialog(null,"Bitte eine PDF-Datei auswählen");
						}
					refreshStudentList(id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			else
			System.out.println("Bitte eine Zeile auswählen!");
	    	 
	    	  	
	      });
	      
	      JButton btnNewButton_5 = new JButton("Bericht pr\u00FCfen");
	      GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
	      gbc_btnNewButton_5.fill = GridBagConstraints.HORIZONTAL;
	      gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
	      gbc_btnNewButton_5.gridx = 3;
	      gbc_btnNewButton_5.gridy = 0;
	      panel_5.add(btnNewButton_5, gbc_btnNewButton_5);
	      btnNewButton_5.addActionListener(e->{
	    	  	if(studentTable.getSelectedRowCount()>0) {
	    	  		JFileChooser chooser = new JFileChooser();
				if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
				try {
					if(PdfFilter.getExtension(chooser.getSelectedFile()).equals(".pdf"))
						Datenbank.download(chooser.getSelectedFile().getAbsolutePath(), (int) studentTable.getValueAt(studentTable.getSelectedRow(),0), "bericht");
					else
						Datenbank.download(chooser.getSelectedFile().getAbsolutePath().concat(".pdf"), (int) studentTable.getValueAt(studentTable.getSelectedRow(),0), "bericht");
				} 
				catch (Exception e1) {
					e1.printStackTrace();		
				}
			else
			System.out.println("Bitte eine Zeile auswählen!");
	    	  	}
				
	      });
	      
	      JButton btnNewButton_2 = new JButton("Feedback geben");
	      GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
	      gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
	      gbc_btnNewButton_2.gridx = 3;
	      gbc_btnNewButton_2.gridy = 1;
	      btnNewButton_2.addActionListener(e->{
	    	  try {
	    		if(studentTable.getSelectedRowCount()>0)
				new Feedback((int) studentTable.getValueAt(studentTable.getSelectedRow(),0)).setVisible(true);
	    		refreshStudentList(id);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
	      });
	      btnNewButton_4.setVisible(false);
		  btnNewButton_5.setVisible(false);
		  btnNewButton_2.setVisible(false);
	      panel_5.add(btnNewButton_2, gbc_btnNewButton_2);
	      studentTable.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
				  	try {
				  		
				  		btnNewButton_2.setVisible(false);
						if(!Datenbank.checkBesuchBericht((int) studentTable.getValueAt(studentTable.getSelectedRow(), 0)))
							btnNewButton_4.setVisible(true);
						
						else
							btnNewButton_4.setVisible(false);
						
						if(Datenbank.checkBericht((int) studentTable.getValueAt(studentTable.getSelectedRow(), 0))) {
							if(!Datenbank.checkFeedback((int) studentTable.getValueAt(studentTable.getSelectedRow(), 0))&&!Datenbank.getBPS((int) studentTable.getValueAt(studentTable.getSelectedRow(), 0)).getStatus().equals("Beendet")) {
								btnNewButton_2.setVisible(true);
								btnNewButton_5.setVisible(true);
								
							}
							else {
								btnNewButton_2.setVisible(false);
								btnNewButton_5.setVisible(false);
								
							}
						}
						else 
							btnNewButton_5.setVisible(false);
						
						
							
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				  }
				});
	      tabbedPane.addChangeListener(e->{
				try {
					if(tabbedPane.getSelectedIndex()==0) {
						refreshBPSinJTable();
					}
					else {
						refreshStudentList(id);
					} 
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}
			});
	      refreshBPSinJTable();
			refreshStudentList(id);
		
	}

	
	
	public void refreshBPSinJTable() throws Exception{

		Datenbank.getBPSlist();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		Object[] rowData = new Object[5];
		
		for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {
			if(Datenbank.getBPSlist().get(i).getStatus().equals("offen")||Datenbank.getBPSlist().get(i).getStatus().equals("Bewerber")) {
			rowData[0] = Datenbank.getBPSlist().get(i).getId();
			rowData[1] = Datenbank.getUser(Datenbank.getBPSlist().get(i).getId()).getUserName();
			rowData[2] = Datenbank.getUser(Datenbank.getBPSlist().get(i).getId()).getUserVorname();
			rowData[3] = Datenbank.getBPSlist().get(i).getUnternehmen();
			rowData[4] = Datenbank.getBPSlist().get(i).getStatus();
			model.addRow(rowData);
			}
		}

	} 
	
	public void refreshStudentList(int betnum) throws Exception{

		
		DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
		model.setRowCount(0);
		Object[] rowData = new Object[4];
		
		for (int i = 0; i < Datenbank.getStudentList(betnum).size(); i++) {
			rowData[0] = Datenbank.getStudentList(betnum).get(i);
			rowData[1] =Datenbank.getUser(Datenbank.getStudentList(betnum).get(i)).getUserName();
			rowData[2]= Datenbank.getUser(Datenbank.getStudentList(betnum).get(i)).getUserVorname();
			rowData[3] = Datenbank.getBPS(Datenbank.getStudentList(betnum).get(i)).getUnternehmen();
			model.addRow(rowData);
			
		}

	}
}
