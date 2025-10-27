package LE_2_gui;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class dayoftheWeek {

    private JFrame frmDayOfThe;
    private JTextField textField;   // Year
    private JTextField textField_1; // Month
    private JTextField textField_2; // Day
    private JTextArea txtrDayOfThe; // Result display
    private JLabel lblNewLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    dayoftheWeek window = new dayoftheWeek();
                    window.frmDayOfThe.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public dayoftheWeek() {
        initialize();
    }

    private void initialize() {
        frmDayOfThe = new JFrame();
        frmDayOfThe.getContentPane().setForeground(new Color(255, 255, 255));
        frmDayOfThe.setFont(new Font("Arial", Font.BOLD, 12));
        frmDayOfThe.setTitle("DAY OF THE WEEK");
        frmDayOfThe.setBounds(100, 100, 500, 300);
        frmDayOfThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmDayOfThe.getContentPane().setLayout(null);

        // RESET button
        JButton btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        btnReset.setBackground(new Color(0, 64, 0));
        btnReset.setForeground(new Color(255, 255, 255));
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                txtrDayOfThe.setText("DAY OF THE WEEK IS :");
            }
        });
        btnReset.setBounds(392, 233, 84, 20);
        frmDayOfThe.getContentPane().add(btnReset);

        textField = new JTextField(); // Year
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        textField.setBounds(280, 58, 84, 18);
        frmDayOfThe.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField(); // Month
        textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        textField_1.setColumns(10);
        textField_1.setBounds(280, 86, 84, 18);
        frmDayOfThe.getContentPane().add(textField_1);

        textField_2 = new JTextField(); // Day
        textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        textField_2.setColumns(10);
        textField_2.setBounds(280, 114, 84, 18);
        frmDayOfThe.getContentPane().add(textField_2);

        // ENTER button
        JButton btnEnter = new JButton("ENTER");
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(textField.getText());
                    int month = Integer.parseInt(textField_1.getText());
                    int dayofMonth = Integer.parseInt(textField_2.getText());

                    if (month == 1) {
                        month = 13;
                        year -= 1;
                    }
                    if (month == 2) {
                        month = 14;
                        year -= 1;
                    }

                    int j = year / 100;
                    int k = year % 100;

                    int h = (dayofMonth + (26 * (month + 1)) / 10
                            + k + k / 4 + j / 4 + 5 * j) % 7;

                    String dayOfWeek = "";
                    switch (h) {
                        case 0: dayOfWeek = "SATURDAY!"; break;
                        case 1: dayOfWeek = "SUNDAY!"; break;
                        case 2: dayOfWeek = "MONDAY!"; break;
                        case 3: dayOfWeek = "TUESDAY!"; break;
                        case 4: dayOfWeek = "WEDNESDAY!"; break;
                        case 5: dayOfWeek = "THURSDAY!"; break;
                        case 6: dayOfWeek = "FRIDAY!"; break;
                    }

                    txtrDayOfThe.setText("Day of the week is : " + dayOfWeek);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frmDayOfThe,
                            "Please enter valid numbers for Year, Month, and Day!",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnEnter.setForeground(new Color(255, 255, 255));
        btnEnter.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        btnEnter.setBackground(new Color(0, 64, 0));
        btnEnter.setBounds(184, 157, 84, 20);
        frmDayOfThe.getContentPane().add(btnEnter);

        // Labels
        JTextArea txtrEnterYear = new JTextArea();
        txtrEnterYear.setForeground(new Color(130, 226, 88));
        txtrEnterYear.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        txtrEnterYear.setBackground(new Color(240, 240, 240));
        txtrEnterYear.setText("Enter year: (e.g., 2016) :");
        txtrEnterYear.setBounds(10, 55, 165, 20);
        frmDayOfThe.getContentPane().add(txtrEnterYear);

        JTextArea txtrEnterMonth = new JTextArea();
        txtrEnterMonth.setForeground(new Color(130, 226, 88));
        txtrEnterMonth.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        txtrEnterMonth.setText("Enter Month (1 - 12) :");
        txtrEnterMonth.setBackground(SystemColor.menu);
        txtrEnterMonth.setBounds(10, 83, 150, 20);
        frmDayOfThe.getContentPane().add(txtrEnterMonth);

        JTextArea txtrEnterTheDay = new JTextArea();
        txtrEnterTheDay.setForeground(new Color(130, 226, 88));
        txtrEnterTheDay.setText("Enter the day of the month (1 - 31) :");
        txtrEnterTheDay.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        txtrEnterTheDay.setBackground(SystemColor.menu);
        txtrEnterTheDay.setBounds(10, 113, 233, 20);
        frmDayOfThe.getContentPane().add(txtrEnterTheDay);

        txtrDayOfThe = new JTextArea();
        txtrDayOfThe.setForeground(new Color(43, 101, 18));
        txtrDayOfThe.setText("Day of the week is :");
        txtrDayOfThe.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
        txtrDayOfThe.setBackground(SystemColor.menu);
        txtrDayOfThe.setBounds(14, 187, 350, 25);
        frmDayOfThe.getContentPane().add(txtrDayOfThe);
        
        lblNewLabel = new JLabel("DAY OF THE WEEK SIMULATOR");
        lblNewLabel.setForeground(new Color(0, 64, 0));
        lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        lblNewLabel.setBounds(76, 10, 320, 29);
        frmDayOfThe.getContentPane().add(lblNewLabel);
    }
}
