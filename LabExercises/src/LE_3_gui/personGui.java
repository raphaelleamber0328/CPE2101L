package LE_3_gui;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import LE_3.Person;

public class personGui {

    private JFrame frmPerson;
    private JTextField txtName1;
    private JTextField txtAge1;
    private JTextField txtName2;
    private JTextField txtAge2;
    private JTextArea outputArea;
    private JButton btnCompare, btnReset;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                personGui window = new personGui();
                window.frmPerson.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public personGui() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmPerson = new JFrame();
        frmPerson.setTitle("PERSON");
        frmPerson.setBounds(100, 100, 550, 420);
        frmPerson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmPerson.getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("PERSON COMPARISON");
        lblTitle.setForeground(new Color(51, 68, 67));
        lblTitle.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(120, 20, 300, 30);
        frmPerson.getContentPane().add(lblTitle);

        JLabel lblPerson1 = new JLabel("PERSON 1");
        lblPerson1.setForeground(new Color(52, 101, 109));
        lblPerson1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        lblPerson1.setBounds(40, 70, 100, 20);
        frmPerson.getContentPane().add(lblPerson1);

        JLabel lblName1 = new JLabel("Enter name:");
        lblName1.setForeground(new Color(52, 101, 109));
        lblName1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblName1.setBounds(60, 100, 100, 20);
        frmPerson.getContentPane().add(lblName1);

        txtName1 = new JTextField();
        txtName1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtName1.setBounds(180, 100, 200, 22);
        frmPerson.getContentPane().add(txtName1);

        JLabel lblAge1 = new JLabel("Enter age:");
        lblAge1.setForeground(new Color(52, 101, 109));
        lblAge1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblAge1.setBounds(60, 130, 100, 20);
        frmPerson.getContentPane().add(lblAge1);

        txtAge1 = new JTextField();
        txtAge1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtAge1.setBounds(180, 130, 200, 22);
        frmPerson.getContentPane().add(txtAge1);

        JLabel lblPerson2 = new JLabel("PERSON 2");
        lblPerson2.setForeground(new Color(52, 101, 109));
        lblPerson2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        lblPerson2.setBounds(40, 180, 100, 20);
        frmPerson.getContentPane().add(lblPerson2);

        JLabel lblName2 = new JLabel("Enter name:");
        lblName2.setForeground(new Color(52, 101, 109));
        lblName2.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblName2.setBounds(60, 210, 100, 20);
        frmPerson.getContentPane().add(lblName2);

        txtName2 = new JTextField();
        txtName2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtName2.setBounds(180, 210, 200, 22);
        frmPerson.getContentPane().add(txtName2);

        JLabel lblAge2 = new JLabel("Enter age:");
        lblAge2.setForeground(new Color(52, 101, 109));
        lblAge2.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblAge2.setBounds(60, 240, 100, 20);
        frmPerson.getContentPane().add(lblAge2);

        txtAge2 = new JTextField();
        txtAge2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtAge2.setBounds(180, 240, 200, 22);
        frmPerson.getContentPane().add(txtAge2);

        btnCompare = new JButton("COMPARE!");
        btnCompare.setForeground(Color.WHITE);
        btnCompare.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
        btnCompare.setBackground(new Color(51, 68, 67));
        btnCompare.setBounds(410, 120, 100, 30);
        frmPerson.getContentPane().add(btnCompare);

        btnReset = new JButton("RESET");
        btnReset.setForeground(Color.WHITE);
        btnReset.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
        btnReset.setBackground(new Color(51, 68, 67));
        btnReset.setBounds(410, 170, 100, 30);
        frmPerson.getContentPane().add(btnReset);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(40, 290, 470, 70);
        frmPerson.getContentPane().add(scrollPane);

        outputArea = new JTextArea();
        outputArea.setForeground(new Color(52, 101, 109));
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Segoe UI", Font.BOLD, 14));
        scrollPane.setViewportView(outputArea);

        btnCompare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String name1 = txtName1.getText().trim();
                    int age1 = Integer.parseInt(txtAge1.getText().trim());
                    String name2 = txtName2.getText().trim();
                    int age2 = Integer.parseInt(txtAge2.getText().trim());

                    Person p1 = new Person(name1, age1);
                    Person p2 = new Person(name2, age2);

                    StringBuilder result = new StringBuilder();
                    result.append("Are the two persons equal? " + p1.equals(p2) + "\n");
                    result.append("Do they have the same age? " + (p1.getAge() == p2.getAge()) + "\n");

                    if (p1.getAge() > p2.getAge())
                        result.append(p1.getName() + " is older than " + p2.getName());
                    else if (p1.getAge() < p2.getAge())
                        result.append(p1.getName() + " is younger than " + p2.getName());
                    else
                        result.append(p1.getName() + " and " + p2.getName() + " are the same age");

                    outputArea.setText(result.toString());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frmPerson,
                        "Please enter valid ages (numbers only).",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtName1.setText("");
                txtAge1.setText("");
                txtName2.setText("");
                txtAge2.setText("");
                outputArea.setText("");
            }
        });
    }
}
