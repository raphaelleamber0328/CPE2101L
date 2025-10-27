package LE_2_gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class decHex {

	private JFrame frmDecimalToHexadecimal;
	private JTextField textField;  
	private JTextField textField_1; 
	private JButton btnReset;
	private JLabel lblDecimalToHexadecimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					decHex window = new decHex();
					window.frmDecimalToHexadecimal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public decHex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDecimalToHexadecimal = new JFrame();
		frmDecimalToHexadecimal.setTitle("Decimal to Hexidecimal");
		frmDecimalToHexadecimal.setBounds(100, 100, 450, 300);
		frmDecimalToHexadecimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDecimalToHexadecimal.getContentPane().setLayout(null);

		// Label for input
		JLabel lblNewLabel = new JLabel("Enter a decimal number :");
		lblNewLabel.setForeground(new Color(234, 94, 118));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setBounds(45, 74, 174, 18);
		frmDecimalToHexadecimal.getContentPane().add(lblNewLabel);

		// Label for output
		JLabel lblHexadecimal = new JLabel("HEXADECIMAL VALUE:");
		lblHexadecimal.setForeground(new Color(155, 36, 45));
		lblHexadecimal.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblHexadecimal.setBounds(45, 102, 174, 18);
		frmDecimalToHexadecimal.getContentPane().add(lblHexadecimal);

		// Input text field
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(279, 74, 96, 18);
		frmDecimalToHexadecimal.getContentPane().add(textField);
		textField.setColumns(10);

		// Convert button
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.setBackground(new Color(254, 180, 200));
		btnConvert.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		btnConvert.setBounds(159, 167, 84, 20);
		frmDecimalToHexadecimal.getContentPane().add(btnConvert);

		// Output text field
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setForeground(SystemColor.menuText);
		textField_1.setBackground(SystemColor.control);
		textField_1.setBounds(279, 102, 96, 18);
		textField_1.setEditable(false); // output only
		frmDecimalToHexadecimal.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				textField_1.setText("");
				
				textField.requestFocus();
			}
		});
		btnReset.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		btnReset.setBackground(new Color(254, 180, 200));
		btnReset.setBounds(159, 197, 84, 20);
		frmDecimalToHexadecimal.getContentPane().add(btnReset);
		
		lblDecimalToHexadecimal = new JLabel("Decimal to Hexadecimal Converter");
		lblDecimalToHexadecimal.setForeground(new Color(155, 36, 45));
		lblDecimalToHexadecimal.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblDecimalToHexadecimal.setBounds(45, 10, 360, 44);
		frmDecimalToHexadecimal.getContentPane().add(lblDecimalToHexadecimal);

		// Action for Convert Button
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int decNum = Integer.parseInt(textField.getText());
					String hexa = convertToHex(decNum);
					textField_1.setText(hexa);
				} catch (NumberFormatException ex) {
					textField_1.setText("Invalid input!");
				}
			}
		});
	}

	private String convertToHex(int decNum) {
		int num = decNum;
		String hexa = "";

		if (num == 0) return "0";

		while (num > 0) {
			int remainder = num % 16;
			String hexNum;

			switch (remainder) {
				case 10: hexNum = "A"; break;
				case 11: hexNum = "B"; break;
				case 12: hexNum = "C"; break;
				case 13: hexNum = "D"; break;
				case 14: hexNum = "E"; break;
				case 15: hexNum = "F"; break;
				default: hexNum = remainder + ""; break;
			}

			hexa = hexNum + hexa; 
			num = num / 16;
		}
		return hexa;
	}
}
