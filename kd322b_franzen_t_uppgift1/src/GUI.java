import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class GUI {

	private JFrame frame;
	private JTable table;
	private JTextField txtAndreasAndreasson;
	private JTextField textField;
	private JTextField txtGata;
	private JTextField txtAndreasandreassongmailcom;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 613, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 98, 182, 118);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Andreas", "Andreasson"},
				{"Per", "Persson"},
				{"Sven", "Svensson"},
				{".....", "......"},
				{".....", null},
			},
			new String[] {
				"F\u00F6rnamn", "Efternamn"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnDetaljvyMedlem = new JButton("Detaljvy Medlem");
		btnDetaljvyMedlem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNamn.setForeground(Color.WHITE);
		lblNamn.setBounds(42, 256, 99, 16);
		frame.getContentPane().add(lblNamn);
		
		JLabel lblPersonnr = new JLabel("Personnr:");
		lblPersonnr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPersonnr.setForeground(Color.WHITE);
		lblPersonnr.setBounds(42, 285, 99, 16);
		frame.getContentPane().add(lblPersonnr);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdress.setForeground(Color.WHITE);
		lblAdress.setBounds(42, 316, 99, 16);
		frame.getContentPane().add(lblAdress);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(42, 345, 99, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblTelefonnr = new JLabel("Telefonnr:");
		lblTelefonnr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefonnr.setForeground(Color.WHITE);
		lblTelefonnr.setBounds(42, 374, 99, 16);
		frame.getContentPane().add(lblTelefonnr);
		
		JLabel lblFitness = new JLabel("Fitness 23/7");
		lblFitness.setForeground(Color.WHITE);
		lblFitness.setHorizontalAlignment(SwingConstants.CENTER);
		lblFitness.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFitness.setBounds(196, 13, 182, 68);
		frame.getContentPane().add(lblFitness);
		btnDetaljvyMedlem.setBounds(243, 102, 134, 29);
		frame.getContentPane().add(btnDetaljvyMedlem);
		
		JLabel lblNewLabel = new JLabel("Photo_Member");
		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/images/6965402423_fcf6046956_m.jpg")));
		lblNewLabel.setBounds(353, 256, 134, 139);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMedlemmar = new JLabel("Medlemmar");
		lblMedlemmar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMedlemmar.setBounds(42, 75, 210, 16);
		frame.getContentPane().add(lblMedlemmar);
		
		txtAndreasAndreasson = new JTextField();
		txtAndreasAndreasson.setText("Andreas Andreasson");
		txtAndreasAndreasson.setBounds(136, 255, 196, 22);
		frame.getContentPane().add(txtAndreasAndreasson);
		txtAndreasAndreasson.setColumns(10);
		
		textField = new JTextField();
		textField.setText("000000-0000");
		textField.setBounds(136, 285, 196, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtGata = new JTextField();
		txtGata.setText("Gata 1, 200 00, Stad");
		txtGata.setBounds(136, 315, 196, 22);
		frame.getContentPane().add(txtGata);
		txtGata.setColumns(10);
		
		txtAndreasandreassongmailcom = new JTextField();
		txtAndreasandreassongmailcom.setText("andreas.andreasson@gmail.com");
		txtAndreasandreassongmailcom.setBounds(136, 344, 196, 22);
		frame.getContentPane().add(txtAndreasandreassongmailcom);
		txtAndreasandreassongmailcom.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("070 000 000");
		textField_1.setBounds(136, 373, 196, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(449, 408, 134, 29);
		frame.getContentPane().add(btnSpara);
		
		JLabel lblBGPicture = new JLabel("Menu");
		lblBGPicture.setIcon(new ImageIcon(GUI.class.getResource("/images/10621772123_8a03995745_z.jpg")));
		lblBGPicture.setBounds(12, 13, 574, 427);
		frame.getContentPane().add(lblBGPicture);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenu mnNewMenu_1 = new JMenu("Skriv ut");
		mnArkiv.add(mnNewMenu_1);
		
		JMenu mnAvsluta = new JMenu("Avsluta");
		mnArkiv.add(mnAvsluta);
		
		JMenu mnNewMenu = new JMenu("Medlem");
		menuBar.add(mnNewMenu);
		
		JMenu mnNyMedlem = new JMenu("Ny medlem");
		mnNewMenu.add(mnNyMedlem);
		
		JMenu mnHittaMedlem = new JMenu("Hitta medlem");
		mnNewMenu.add(mnHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenu mnNewMenu_2 = new JMenu("Hj\u00E4lp");
		mnHjlp.add(mnNewMenu_2);
		
		JMenu mnOmProgrammet = new JMenu("Om programmet");
		mnHjlp.add(mnOmProgrammet);
	}
}
