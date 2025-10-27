package LE_3_gui;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import LE_3.Rectangle;
import java.awt.Color;

public class rectGui {

    private JFrame frmRectangle;
    private JTextField txtWidth;
    private JTextField txtHeight;
    private JLabel lblResultArea;
    private JLabel lblResultPerimeter;
    private JLabel lblNewLabel;
    private JButton btnReset;
    
    /**
	 * Launch the application.
	 */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                rectGui window = new rectGui();
                window.frmRectangle.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    /**
	 * Create the application.
	 */
    public rectGui() {
        initialize();
    }
    
    /**
	 * Initialize the contents of the frame.
	 */
    private void initialize() {
        frmRectangle = new JFrame();
        frmRectangle.setTitle("RECTANGLE");
        frmRectangle.setBounds(100, 100, 500, 350);
        frmRectangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmRectangle.getContentPane().setLayout(null);

        JLabel lblWidth = new JLabel("Width:");
        lblWidth.setForeground(new Color(52, 101, 109));
        lblWidth.setBounds(50, 63, 80, 25);
        lblWidth.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        frmRectangle.getContentPane().add(lblWidth);

        txtWidth = new JTextField();
        txtWidth.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtWidth.setBounds(150, 65, 120, 25);
        frmRectangle.getContentPane().add(txtWidth);
        txtWidth.setColumns(10);

        JLabel lblHeight = new JLabel("Height:");
        lblHeight.setForeground(new Color(52, 101, 109));
        lblHeight.setBounds(50, 110, 80, 25);
        lblHeight.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        frmRectangle.getContentPane().add(lblHeight);

        txtHeight = new JTextField();
        txtHeight.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtHeight.setBounds(150, 112, 120, 25);
        frmRectangle.getContentPane().add(txtHeight);
        txtHeight.setColumns(10);

        JButton btnCalculate = new JButton("CALCULATE!");
        btnCalculate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
        btnCalculate.setBackground(new Color(51, 68, 67));
        btnCalculate.setForeground(new Color(255, 255, 255));
        btnCalculate.setBounds(202, 161, 120, 30);
        frmRectangle.getContentPane().add(btnCalculate);

        lblResultArea = new JLabel("Area: ");
        lblResultArea.setForeground(new Color(52, 101, 109));
        lblResultArea.setBounds(50, 240, 300, 25);
        lblResultArea.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        frmRectangle.getContentPane().add(lblResultArea);

        lblResultPerimeter = new JLabel("Perimeter: ");
        lblResultPerimeter.setForeground(new Color(52, 101, 109));
        lblResultPerimeter.setBounds(50, 266, 300, 25);
        lblResultPerimeter.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        frmRectangle.getContentPane().add(lblResultPerimeter);
        
        lblNewLabel = new JLabel("RECTANGLE CALCULATOR");
        lblNewLabel.setForeground(new Color(51, 68, 67));
        lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        lblNewLabel.setBounds(114, 28, 276, 25);
        frmRectangle.getContentPane().add(lblNewLabel);
        
        btnReset = new JButton("Reset");
        btnReset.setForeground(Color.WHITE);
        btnReset.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
        btnReset.setBackground(new Color(51, 68, 67));
        btnReset.setBounds(225, 201, 80, 25);
        frmRectangle.getContentPane().add(btnReset);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double width = Double.parseDouble(txtWidth.getText());
                    double height = Double.parseDouble(txtHeight.getText());

                    Rectangle rect = new Rectangle(width, height);

                    lblResultArea.setText("Area: " + rect.getArea());
                    lblResultPerimeter.setText("Perimeter: " + rect.getPerimeter());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmRectangle,
                            "Please enter valid numbers for width and height.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
 
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtWidth.setText("");
                txtHeight.setText("");
                lblResultArea.setText("Area: ");
                lblResultPerimeter.setText("Perimeter: ");
            }
        });
    }
}
