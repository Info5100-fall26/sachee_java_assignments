package edu.neu.mgen;

import javax.swing.*;
import java.awt.*;


public class CircleColorLab extends JFrame {
    private JComboBox<String> dropDown;
    private JTextField outputField;
    private JPanel circlePanel;
    private Color selectedColor = null;

    public CircleColorLab() {
        setTitle("Color Selector");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        //Creating dropdown for selecting circle color
        String[] circleColors = {"None", "Red", "Blue", "Green"};
        dropDown = new JComboBox<>(circleColors);

        //Create circle panel
        circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                //Draw circle with no color
                g.setColor(Color.BLACK);
                g.drawOval(100, 30, 150, 150);

                //Fill circle with selected color
                if (selectedColor != null) {
                    g.setColor(selectedColor);
                    g.fillOval(100, 30, 150, 150);
                }
            }
        };

        add(circlePanel, BorderLayout.CENTER);

        //Output text field
        outputField = new JTextField(15);
        outputField.setEditable(false);
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2, 2, 10, 10));
        controlPanel.add(new JLabel("Choose a color:"));
        controlPanel.add(dropDown);
        controlPanel.add(new JLabel("Selected color:"));
        controlPanel.add(outputField);
        add(controlPanel, BorderLayout.SOUTH);

        //Handle dropdown selection
        dropDown.addActionListener(e -> {
            String colorSelection = (String) dropDown.getSelectedItem();
            switch(colorSelection) {
                case "Red":
                    selectedColor = Color.RED;
                    break;
                case "Blue":
                    selectedColor = Color.BLUE;
                    break;
                case "Green":
                    selectedColor = Color.GREEN;
                    break;
                default:
                    selectedColor = null;
            }

            if(selectedColor == null) {
                outputField.setText("No color selected");
            } else {
                outputField.setText(colorSelection);
            }

            circlePanel.repaint();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CircleColorLab());
    }
}
