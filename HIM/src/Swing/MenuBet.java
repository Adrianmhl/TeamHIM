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
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme;

import Datenbank.Datenbank;
import Objekte.PdfFilter;
import Objekte.Zuteilung;

import javax.swing.JScrollPane;
import javax.swing.JList;

public class MenuBet extends JFrame {
	private JTabbedPane tabbedPane;
	private JPanel contentPane;
	static JTable table;
	static JTable studentTable;
	public JScrollPane scrollPane;
	public JScrollPane scrollPane2;
	private final JPanel panel_Profil_2 = new JPanel();
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

		setResizable(false);
		setTitle("HIM - HFT Intern Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 146, 361);
		panel_1.setBackground(Color.RED);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(MenuBet.class.getResource("/res/ProjLogo.jpeg")));
		lblNewLabel_5.setBounds(10, 11, 112, 87);
		panel_1.add(lblNewLabel_5);

		JPanel tab2_2 = new JPanel();
		tab2_2.setBackground(Color.RED);
		tab2_2.setBounds(10, 166, 126, 21);
		panel_1.add(tab2_2);

		JLabel lblNewLabel_1_2 = new JLabel("Besuchsbericht");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setBounds(0, 0, 116, 18);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		tab2_2.setLayout(null);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 11));
		tab2_2.add(lblNewLabel_1_2);

		JPanel tab2_2_1 = new JPanel();
		tab2_2_1.setBackground(Color.RED);
		tab2_2_1.setBounds(10, 198, 126, 21);
		panel_1.add(tab2_2_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Profil");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setBackground(Color.RED);
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

		JPanel tab2_2_2 = new JPanel();
		tab2_2_2.setLayout(null);
		tab2_2_2.setBackground(Color.RED);
		tab2_2_2.setBounds(0, 329, 136, 21);
		panel_1.add(tab2_2_2);

		JLabel lblNewLabel_1_2_2 = new JLabel("Log Out");
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
		lblNewLabel_1_2_2.setBounds(10, 0, 116, 18);
		tab2_2_2.add(lblNewLabel_1_2_2);

		JPanel tab2_2_3 = new JPanel();
		tab2_2_3.setLayout(null);
		tab2_2_3.setBackground(Color.RED);
		tab2_2_3.setBounds(10, 134, 126, 21);
		panel_1.add(tab2_2_3);

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
		
		JPanel tab2_2_1_1 = new JPanel();
		tab2_2_1_1.setLayout(null);
		tab2_2_1_1.setBackground(Color.RED);
		tab2_2_1_1.setBounds(10, 230, 126, 21);
		panel_1.add(tab2_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Studenten");
		lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBackground(Color.RED);
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
		
		
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(145, 0, 539, 361);
		contentPane.add(tabbedPane);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("Bewerbung", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Bewerbung auf BPS-Student");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 0, 252, 32);
		panel_3.add(lblNewLabel_3);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 33, 390, 218);
		panel_3.add(scrollPane);

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
		
		JButton btnNewButton = new JButton("Bewerben");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRowCount()>0)
					try {
						Datenbank.studBetreuerMatch((int) table.getValueAt(table.getSelectedRow(), 0), id);
						JOptionPane.showConfirmDialog(null, "beworben");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				else
				System.out.println("Bitte eine Zeile auswählen!");
			}
		});
		
		btnNewButton.setBounds(321, 280, 89, 23);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aktualisieren");
		btnNewButton_1.addActionListener(e->{
			try {
				refreshBPSinJTable();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		btnNewButton_1.setBounds(20, 280, 117, 23);
		panel_3.add(btnNewButton_1);
	

		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Besuchsbericht", null, panel_4, null);
		panel_4.setLayout(null);

		JButton btnNewButton_2 = new JButton("hochladen");
		btnNewButton_2.setBounds(332, 268, 89, 23);
		panel_4.add(btnNewButton_2);

		JLabel lblNewLabel_3_1 = new JLabel("Besuchsbericht");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(10, 0, 252, 32);
		panel_4.add(lblNewLabel_3_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane.addTab("Profil", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Profil");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3_1_1_1.setBounds(10, 0, 252, 32);
		panel_6.add(lblNewLabel_3_1_1_1);
		panel_Profil_2.setBounds(20, 43, 377, 193);
		panel_6.add(panel_Profil_2);
		panel_Profil_2.setBackground(Color.WHITE);
		GridBagLayout gbl_panel_Profil_2 = new GridBagLayout();
		gbl_panel_Profil_2.columnWidths = new int[] { 114, 46, 0, 0, 0 };
		gbl_panel_Profil_2.rowHeights = new int[] { 14, 14, 14, 14, 0, 14, 0, 0 };
		gbl_panel_Profil_2.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_Profil_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_Profil_2.setLayout(gbl_panel_Profil_2);

		JLabel lblProfilMatrikelnummer = new JLabel("Personalnummer");
		lblProfilMatrikelnummer.setFont(new Font("Arial", Font.BOLD, 11));
		GridBagConstraints gbc_lblProfilMatrikelnummer = new GridBagConstraints();
		gbc_lblProfilMatrikelnummer.anchor = GridBagConstraints.WEST;
		gbc_lblProfilMatrikelnummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfilMatrikelnummer.gridx = 0;
		gbc_lblProfilMatrikelnummer.gridy = 0;
		panel_Profil_2.add(lblProfilMatrikelnummer, gbc_lblProfilMatrikelnummer);

		JLabel lblProfilMatrikelnummerOutput = new JLabel(Integer.toString(id));
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

		JLabel lblProfilNameOutput = new JLabel(Datenbank.getUser(id).getUserName());
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

		JLabel lblProfilVornameOutput = new JLabel(Datenbank.getUser(id).getUserVorname());
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

		JLabel lblProfilEmailOutput = new JLabel(Datenbank.getUser(id).getUserMail());
		GridBagConstraints gbc_lblProfilEmailOutput = new GridBagConstraints();
		gbc_lblProfilEmailOutput.anchor = GridBagConstraints.WEST;
		gbc_lblProfilEmailOutput.insets = new Insets(0, 0, 5, 0);
		gbc_lblProfilEmailOutput.gridx = 3;
		gbc_lblProfilEmailOutput.gridy = 3;
		panel_Profil_2.add(lblProfilEmailOutput, gbc_lblProfilEmailOutput);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(Color.WHITE);
		tabbedPane.addTab("Studenten", null, panel5, null);
		
	    
		scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(20, 33, 390, 218);
	    studentTable = new JTable();
		
		studentTable.setToolTipText("");

		studentTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Matrikelnummer", "Name","Vorname", "Praxisstelle"}) {

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		});
		scrollPane2.setViewportView(studentTable);
		panel5.add(scrollPane2);
		
	    
	      JButton btnNewButton_3 = new JButton("Aktualisieren");
	      btnNewButton_3.addActionListener(e->{
	    	  try {
				refreshStudentList(id);
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
	      });
	      btnNewButton_3.setBounds(20, 277, 150, 23);
	      panel5.add(btnNewButton_3);
	      
	      JButton btnNewButton_4 = new JButton("Besuchsbericht Abgeben");
	      btnNewButton_4.setBounds(260, 277, 150, 23);
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
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			else
			System.out.println("Bitte eine Zeile auswählen!");
	    	 
				
	      });
	      
	      panel5.add(btnNewButton_4);
	      
		
	}

	public class MyRenderer implements TableCellRenderer {
	   
	      
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			JButton button = new JButton("Bewerben");
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				System.out.println(button.getAlignmentX());

				
				}
			});  
			return button;
		}

	}
	
	public void refreshBPSinJTable() throws Exception{

		Datenbank.getBPSlist();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		Object[] rowData = new Object[5];
		
		for (int i = 0; i < Datenbank.getBPSlist().size(); i++) {
			if(!Datenbank.getBPSlist().get(i).getStatus().equals("beantragt")&&!Datenbank.getBPSlist().get(i).getStatus().equals("Zugeteilt")) {
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
