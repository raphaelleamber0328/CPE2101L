package LE_2_gui;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;

public class headsTails {

    private JFrame frmHeadsOrTails;
    private JSpinner spinner;
    private JLabel lblHeadsResult;
    private JLabel lblTailsResult;
    private JLabel lblTotalResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	headsTails window = new headsTails();
                    window.frmHeadsOrTails.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public headsTails() {
        initialize();
    }

    private void initialize() {
        frmHeadsOrTails = new JFrame();
        frmHeadsOrTails.setTitle("Heads or Tails");
        frmHeadsOrTails.setBounds(100, 100, 500, 400);
        frmHeadsOrTails.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHeadsOrTails.getContentPane().setLayout(null);

        JLabel lblTitle = new JLabel("Flip the Coin Simulation");
        lblTitle.setForeground(new Color(0, 0, 64));
        lblTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        lblTitle.setBounds(100, 20, 350, 40);
        frmHeadsOrTails.getContentPane().add(lblTitle);

        JLabel lblFlips = new JLabel("Number of Flips:");
        lblFlips.setForeground(new Color(81, 81, 255));
        lblFlips.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblFlips.setBounds(50, 80, 150, 30);
        frmHeadsOrTails.getContentPane().add(lblFlips);

        spinner = new JSpinner(new SpinnerNumberModel(1000, 1, 10000000, 1));
        spinner.setBounds(220, 85, 100, 25);
        frmHeadsOrTails.getContentPane().add(spinner);

        JButton btnFlip = new JButton("Flip!");
        btnFlip.setForeground(new Color(255, 255, 255));
        btnFlip.setBackground(new Color(0, 0, 128));
        btnFlip.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btnFlip.setBounds(180, 130, 120, 40);
        frmHeadsOrTails.getContentPane().add(btnFlip);

        JLabel lblHeads = new JLabel("Heads:");
        lblHeads.setForeground(new Color(0, 64, 128));
        lblHeads.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblHeads.setBounds(50, 200, 80, 30);
        frmHeadsOrTails.getContentPane().add(lblHeads);

        lblHeadsResult = new JLabel("0");
        lblHeadsResult.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblHeadsResult.setBounds(140, 200, 150, 30);
        frmHeadsOrTails.getContentPane().add(lblHeadsResult);

        JLabel lblTails = new JLabel("Tails:");
        lblTails.setForeground(new Color(0, 64, 128));
        lblTails.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblTails.setBounds(50, 240, 80, 30);
        frmHeadsOrTails.getContentPane().add(lblTails);

        lblTailsResult = new JLabel("0");
        lblTailsResult.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTailsResult.setBounds(140, 240, 150, 30);
        frmHeadsOrTails.getContentPane().add(lblTailsResult);

        JLabel lblTotal = new JLabel("Total Flips:");
        lblTotal.setForeground(new Color(128, 0, 0));
        lblTotal.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblTotal.setBounds(50, 280, 120, 30);
        frmHeadsOrTails.getContentPane().add(lblTotal);

        lblTotalResult = new JLabel("0");
        lblTotalResult.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTotalResult.setBounds(170, 280, 150, 30);
        frmHeadsOrTails.getContentPane().add(lblTotalResult);

        btnFlip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int flips = (Integer) spinner.getValue();
                int heads = 0, tails = 0;
                Random rand = new Random();

                for (int i = 0; i < flips; i++) {
                    if (rand.nextBoolean()) {
                        heads++;
                    } else {
                        tails++;
                    }
                }

                lblHeadsResult.setText(String.format("%,d", heads));
                lblTailsResult.setText(String.format("%,d", tails));
                lblTotalResult.setText(String.format("%,d", flips));
            }
        });
    }
}
