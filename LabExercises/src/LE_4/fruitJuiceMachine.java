package LE_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fruitJuiceMachine {

    private JFrame frmFruitJuiceMachine;
    private JTextArea outputArea;
    private JTextField paymentField;
    private JLabel balanceLabel;

    private CashRegister register;
    private DispenserType apple, orange, mango, punch;

    private DispenserType currentDispenser = null;
    private String currentProduct = "";
    private int currentCost = 0;
    private int depositedAmount = 0;
    
    /**
  	 * Launch the application.
  	 */

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	fruitJuiceMachine window = new fruitJuiceMachine();
                window.frmFruitJuiceMachine.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    /**
   	 * Create the application.
   	 */
    public fruitJuiceMachine() {
        initialize();
    }
    
    /**
	 * Initialize the contents of the frame.
	 */
    private void initialize() {
        register = new CashRegister();
        apple = new DispenserType(10, 150);
        orange = new DispenserType(10, 200);
        mango = new DispenserType(8, 250);
        punch = new DispenserType(5, 300);


        frmFruitJuiceMachine = new JFrame();
        frmFruitJuiceMachine.setTitle("FRUIT JUICE MACHINE");
        frmFruitJuiceMachine.setBounds(100, 100, 600, 500);
        frmFruitJuiceMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmFruitJuiceMachine.getContentPane().setLayout(null);
        frmFruitJuiceMachine.getContentPane().setBackground(new Color(255, 204, 102)); 

        JLabel title = new JLabel("Fruit Juice Vending Machine");
        title.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
        title.setForeground(new Color(204, 51, 0));
        title.setBounds(120, 20, 400, 30);
        frmFruitJuiceMachine.getContentPane().add(title);

        JButton btnApple = new JButton("Apple Juice ($1.50)");
        btnApple.setBounds(50, 80, 200, 40);
        styleButton(btnApple);
        frmFruitJuiceMachine.getContentPane().add(btnApple);

        JButton btnOrange = new JButton("Orange Juice ($2.00)");
        btnOrange.setBounds(300, 80, 200, 40);
        styleButton(btnOrange);
        frmFruitJuiceMachine.getContentPane().add(btnOrange);

        JButton btnMango = new JButton("Mango Lassi ($2.50)");
        btnMango.setBounds(50, 140, 200, 40);
        styleButton(btnMango);
        frmFruitJuiceMachine.getContentPane().add(btnMango);

        JButton btnPunch = new JButton("Fruit Punch ($3.00)");
        btnPunch.setBounds(300, 140, 200, 40);
        styleButton(btnPunch);
        frmFruitJuiceMachine.getContentPane().add(btnPunch);

        JLabel paymentLabel = new JLabel("Enter Payment ($):");
        paymentLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        paymentLabel.setBounds(50, 200, 150, 30);
        frmFruitJuiceMachine.getContentPane().add(paymentLabel);

        paymentField = new JTextField();
        paymentField.setBounds(200, 200, 100, 30);
        frmFruitJuiceMachine.getContentPane().add(paymentField);

        JButton btnPay = new JButton("Pay");
        btnPay.setBounds(320, 200, 80, 30);
        styleButton(btnPay);
        frmFruitJuiceMachine.getContentPane().add(btnPay);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(outputArea);
        scroll.setBounds(50, 250, 500, 130);
        frmFruitJuiceMachine.getContentPane().add(scroll);

        balanceLabel = new JLabel("Cash Register Balance: $5.00");
        balanceLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        balanceLabel.setBounds(50, 390, 300, 25);
        frmFruitJuiceMachine.getContentPane().add(balanceLabel);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(389, 390, 81, 25);
        styleButton(btnReset);
        frmFruitJuiceMachine.getContentPane().add(btnReset);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(480, 390, 70, 25);
        styleButton(btnExit);
        frmFruitJuiceMachine.getContentPane().add(btnExit);

     
        btnApple.addActionListener(e -> selectProduct("Apple Juice", apple));
        btnOrange.addActionListener(e -> selectProduct("Orange Juice", orange));
        btnMango.addActionListener(e -> selectProduct("Mango Lassi", mango));
        btnPunch.addActionListener(e -> selectProduct("Fruit Punch", punch));

        btnPay.addActionListener(e -> processPayment());
        btnReset.addActionListener(e -> resetTransaction());
        btnExit.addActionListener(e -> System.exit(0));
    }

    private void styleButton(JButton button) {
        button.setBackground(new Color(255, 153, 51));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
    }

    private void selectProduct(String name, DispenserType dispenser) {
        if (dispenser.getNoOfItems() <= 0) {
            outputArea.setText("Sorry, " + name + " is sold out.");
            return;
        }

        currentProduct = name;
        currentDispenser = dispenser;
        currentCost = dispenser.getCost();
        depositedAmount = 0;

        outputArea.setText(name + " selected. Price: " + formatCents(currentCost) + "\nEnter payment and click Pay.");
    }

    private void processPayment() {
        if (currentDispenser == null) {
            outputArea.setText("Please select a product first.");
            return;
        }

        String input = paymentField.getText().trim();
        double amount;
        try {
            amount = Double.parseDouble(input);
            if (amount <= 0) {
                outputArea.setText("Please enter a positive amount.");
                return;
            }
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid payment format.");
            return;
        }

        int cents = (int) Math.round(amount * 100);
        depositedAmount += cents;

        if (depositedAmount < currentCost) {
            int remaining = currentCost - depositedAmount;
            outputArea.setText("You still need " + formatCents(remaining) + ".\nAdd more payment and click Pay.");
        } else {
            currentDispenser.makeSale();
            register.acceptAmount(currentCost);
            int change = depositedAmount - currentCost;

            StringBuilder sb = new StringBuilder();
            sb.append("Dispensing ").append(currentProduct).append(". Enjoy!\n");
            if (change > 0) {
                sb.append("Returning change: ").append(formatCents(change)).append("\n");
            }

            outputArea.setText(sb.toString());
            updateBalance();
            resetTransaction(false);
        }
    }

    private void updateBalance() {
        balanceLabel.setText("Cash Register Balance: " + formatCents(register.getCurrentBalance()));
    }

    private void resetTransaction() {
        resetTransaction(true);
    }

    private void resetTransaction(boolean clearOutput) {
        currentDispenser = null;
        currentProduct = "";
        currentCost = 0;
        depositedAmount = 0;
        paymentField.setText("");
        if (clearOutput) {
            outputArea.setText("");
        }
    }

    private String formatCents(int cents) {
        return String.format("$%d.%02d", cents / 100, cents % 100);
    }
}
