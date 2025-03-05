/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawshapes;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class DrawShapes extends JPanel {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public DrawShapes() {
        // Font is Arial size 18 and is italicized
        font = new Font("Arial", Font.ITALIC, 18);

        // Some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.pink;

        // Colors can be created using Red, Green, Blue values
        blueColor = new Color(0, 0, 122);

        // Set the background color
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        // Set font
        graph.setFont(font);

        // Create a title
        graph.drawString("Draw Shapes", 90, 20);

        // Set the color for the first shape
        graph.setColor(blueColor);

        // Draw a Rectangle using drawRect(x, y, width, height)
        graph.drawRect(120, 120, 120, 120);

        // This will fill a rectangle
        graph.fillRect(115, 115, 90, 90);

        // Set the color for the next shape
        graph.setColor(redColor);

        // Draw a circle using drawArc(x, y, width, height, startAngle, arcAngle)
        graph.drawArc(110, 110, 50, 50, 0, 360);
    // Set color for next shape
        graph.setColor(Color.CYAN);

        // Draw another rectangle
        graph.drawRect(50, 50, 50, 50);

        // This will fill a rectangle
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes Example");
        DrawShapes panel = new DrawShapes();
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

    
