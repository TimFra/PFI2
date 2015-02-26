package kd322b_franzen_t_uppgift3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class mainGUI extends JFrame {
	private BikeStore bikestore;
	private Bike bike;
	private JPanel contentPane;
	private JTextField inputColorField;
	private JTextField inputSizeField;
	private JTextField inputPriceField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGUI frame = new mainGUI();
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
	public mainGUI() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea allBikeField = new JTextArea();

		allBikeField.setEditable(false);
		allBikeField.setBounds(25, 38, 260, 401);
		contentPane.add(allBikeField);
		//allBikeField.setText(bikestore.getAllBikes());
		
		inputColorField = new JTextField("Color");
		inputColorField.setBounds(319, 38, 168, 22);
		contentPane.add(inputColorField);
		inputColorField.setColumns(10);
		
		inputSizeField = new JTextField("Size");
		inputSizeField.setBounds(319, 97, 166, 22);
		contentPane.add(inputSizeField);
		inputSizeField.setColumns(10);
		
		inputPriceField = new JTextField("Price");
		inputPriceField.setBounds(319, 155, 169, 22);
		contentPane.add(inputPriceField);
		inputPriceField.setColumns(10);
		
		/** Funktion för knapp */
		JButton btnAddNewBike = new JButton("New Bike");
		btnAddNewBike.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				String col = inputColorField.getText();
				String siz = inputSizeField.getText();
				String pri = inputPriceField.getText();
					
				bikestore.addBike(col, siz, pri);
				//System.out.println("COLOR VALUE:" + inputColorField.getText() + "SIZE VALUE:" + inputSizeField.getText() + "PRICE VALUE:" + inputPriceField.getText());
			}
		});
		btnAddNewBike.setBounds(356, 241, 97, 25);
		contentPane.add(btnAddNewBike);
		
		JLabel lblBikesInStorage = new JLabel("Bikes in storage");
		lblBikesInStorage.setBounds(28, 9, 90, 16);
		contentPane.add(lblBikesInStorage);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(319, 24, 56, 16);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size (2-28)");
		lblSize.setBounds(319, 83, 90, 16);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price (0-300000)");
		lblPrice.setBounds(319, 140, 105, 16);
		contentPane.add(lblPrice);
		

		
		
			 
		 
	}
}
