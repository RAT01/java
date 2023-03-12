import java.awt.*;
import java.awt.event.*;

public class InterestCalculator extends Frame implements ActionListener {
    // Text fields
    private TextField principalField, yearsField, rateField, interestField, finalAmountField;
    // Buttons
    private Button calculateButton, finalAmountButton;

    public InterestCalculator() {
        // Set up the UI
        setTitle("Interest Calculator");
        setLayout(new GridLayout(6, 2));
        setSize(720, 1080);
        // Add labels and text fields
        add(new Label("Principal Amount"));
        principalField = new TextField();
        add(principalField);
        add(new Label("No. of Years"));
        yearsField = new TextField();
        add(yearsField);
        add(new Label("Rate of Interest"));
        rateField = new TextField();
        add(rateField);

        add(new Label(""));
        add(new Label(""));
        add(new Label("Interest"));
        interestField = new TextField();
        interestField.setEditable(false);
        add(interestField);
        add(new Label("Final Amount"));
        finalAmountField = new TextField();
        finalAmountField.setEditable(false);
        add(finalAmountField);
        // Add buttons and attach action listeners
        calculateButton = new Button("Calculate Interest");
        add(calculateButton);
        calculateButton.addActionListener(this);
        finalAmountButton = new Button("Final Amount");
        add(finalAmountButton);
        finalAmountButton.addActionListener(this);
        // Show the UI
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public void actionPerformed(ActionEvent e) {
        // Get the input values
        double principal = Double.parseDouble(principalField.getText());
        double years = Double.parseDouble(yearsField.getText());

        double rate = Double.parseDouble(rateField.getText());
        // Calculate interest and final amount
        double interest = (principal * years * rate) / 100.0;
        double finalAmount = principal + interest;
        // Update the output fields
        if (e.getSource() == calculateButton) {
            interestField.setText(String.format("%.2f", interest));
        } else if (e.getSource() == finalAmountButton) {
            finalAmountField.setText(String.format("%.2f", finalAmount));
        }
    }

    public static void main(String[] args) {
        new InterestCalculator();
    }
}
