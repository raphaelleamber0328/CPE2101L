package LE_3_gui;

import java.awt.*;
import javax.swing.*;

import LE_3.gradeDistribution;

public class gradisGui {

    private JFrame frame;
    private JTextField txtA, txtB, txtC, txtD, txtF;
    private JTextArea outputArea;
    private JButton btnGenerate, btnReset;
    
    /**
   	 * Launch the application.
   	 */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                gradisGui window = new gradisGui();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    /**
     * Create the application.
     */
    public gradisGui() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("GRADE DISTRIBUTION");
        frame.setBounds(100, 100, 600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("GRADE DISTRIBUTION GRAPH");
        lblTitle.setForeground(new Color(51, 68, 67));
        lblTitle.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        lblTitle.setBounds(140, 20, 350, 30);
        frame.getContentPane().add(lblTitle);

        JLabel lblA = new JLabel("A grades:");
        lblA.setForeground(new Color(52, 101, 109));
        lblA.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblA.setBounds(50, 70, 100, 25);
        frame.getContentPane().add(lblA);

        txtA = new JTextField();
        txtA.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtA.setBounds(150, 70, 100, 25);
        frame.getContentPane().add(txtA);

        JLabel lblB = new JLabel("B grades:");
        lblB.setForeground(new Color(52, 101, 109));
        lblB.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblB.setBounds(50, 110, 100, 25);
        frame.getContentPane().add(lblB);

        txtB = new JTextField();
        txtB.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtB.setBounds(150, 110, 100, 25);
        frame.getContentPane().add(txtB);

        JLabel lblC = new JLabel("C grades:");
        lblC.setForeground(new Color(52, 101, 109));
        lblC.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblC.setBounds(50, 150, 100, 25);
        frame.getContentPane().add(lblC);

        txtC = new JTextField();
        txtC.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtC.setBounds(150, 150, 100, 25);
        frame.getContentPane().add(txtC);

        JLabel lblD = new JLabel("D grades:");
        lblD.setForeground(new Color(52, 101, 109));
        lblD.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblD.setBounds(50, 190, 100, 25);
        frame.getContentPane().add(lblD);

        txtD = new JTextField();
        txtD.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtD.setBounds(150, 190, 100, 25);
        frame.getContentPane().add(txtD);

        JLabel lblF = new JLabel("F grades:");
        lblF.setForeground(new Color(52, 101, 109));
        lblF.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
        lblF.setBounds(50, 230, 100, 25);
        frame.getContentPane().add(lblF);

        txtF = new JTextField();
        txtF.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        txtF.setBounds(150, 230, 100, 25);
        frame.getContentPane().add(txtF);

        btnGenerate = new JButton("GENERATE GRAPH");
        btnGenerate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
        btnGenerate.setBackground(new Color(51, 68, 67));
        btnGenerate.setForeground(Color.WHITE);
        btnGenerate.setBounds(300, 110, 180, 30);
        frame.getContentPane().add(btnGenerate);

        btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
        btnReset.setBackground(new Color(51, 68, 67));
        btnReset.setForeground(Color.WHITE);
        btnReset.setBounds(300, 160, 180, 30);
        frame.getContentPane().add(btnReset);

        outputArea = new JTextArea();
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBounds(50, 280, 500, 100);
        frame.getContentPane().add(scrollPane);

        
        btnGenerate.addActionListener(e -> generateGraph());
        btnReset.addActionListener(e -> resetFields());
    }

    private void generateGraph() {
        try {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int c = Integer.parseInt(txtC.getText());
            int d = Integer.parseInt(txtD.getText());
            int f = Integer.parseInt(txtF.getText());

            gradeDistribution gd = new gradeDistribution(a, b, c, d, f);

            StringBuilder sb = new StringBuilder();
            sb.append("\n    0    10   20   30   40   50   60   70   80   90   100%\n");
            sb.append("    |----|----|----|----|----|----|----|----|----|----|\n\n");

            sb.append(buildBar("A", gd.getLetterA())).append("\n");
            sb.append(buildBar("B", gd.getLetterB())).append("\n");
            sb.append(buildBar("C", gd.getLetterC())).append("\n");
            sb.append(buildBar("D", gd.getLetterD())).append("\n");
            sb.append(buildBar("F", gd.getLetterF())).append("\n");

            outputArea.setText(sb.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String buildBar(String grade, int percent) {
        int stars = percent / 2;
        StringBuilder bar = new StringBuilder();
        bar.append(String.format("%-3s ", grade));
        for (int i = 0; i < stars; i++) {
            bar.append("*");
        }
        bar.append(" (" + percent + "%)");
        return bar.toString();
    }

    private void resetFields() {
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        txtF.setText("");
        outputArea.setText("");
    }
}
