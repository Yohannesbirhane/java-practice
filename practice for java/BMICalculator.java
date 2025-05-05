import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Mass Label and TextField
        JLabel massLabel = new JLabel("Mass (kg):");
        massLabel.setBounds(20, 20, 100, 25);
        frame.add(massLabel);

        JTextField massField = new JTextField();
        massField.setBounds(120, 20, 130, 25);
        frame.add(massField);

        // Height Label and TextField
        JLabel heightLabel = new JLabel("Height (m):");
        heightLabel.setBounds(20, 60, 100, 25);
        frame.add(heightLabel);

        JTextField heightField = new JTextField();
        heightField.setBounds(120, 60, 130, 25);
        frame.add(heightField);

        // Button
        JButton calculateButton = new JButton("Calculate your BMI");
        calculateButton.setBounds(60, 100, 160, 30);
        frame.add(calculateButton);

        // Action Listener for Button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double mass = Double.parseDouble(massField.getText());
                    double height = Double.parseDouble(heightField.getText());

                    if (mass <= 0 || height <= 0) {
                        JOptionPane.showMessageDialog(frame, "Please enter positive values.");
                        return;
                    }

                    double bmi = mass / (height * height);
                    String message = String.format("Your BMI is: %.2f", bmi);
                    JOptionPane.showMessageDialog(frame, message);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
