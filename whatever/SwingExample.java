import javax.swing.*;
import java.awt.event.*;

public class SwingExample extends JFrame {

    public SwingExample() {
        super("My Swing Application"); // Set the title of the window

        // Create a button
        JButton button = new JButton("Click Me");

        // Create a label
        JLabel label = new JLabel("Click the button!");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // Change the label text on button click
            }
        });

        // Add components to the frame
        add(button);
        add(label);

        // Set layout manager (optional for simple layouts)
        // We can use setLayout(new FlowLayout()) for horizontal alignment of button and
        // label

        // Set window size and visibility
        setSize(300, 200); // Set the width and height of the window
        setVisible(true); // Make the window visible
    }

    public static void main(String[] args) {
        new SwingExample(); // Create an instance of the SwingExample class
    }
}
