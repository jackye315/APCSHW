import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiDemo extends JFrame {
private Container pane;

    private JButton Celsius,Farenheit;
private JLabel l;
private JTextField t;
private JCheckBox c;
    public GuiDemo() {
this.setTitle("Celsius and Farenheit Converter");
this.setSize(600,400);
this.setLocation(100,100);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);


pane = this.getContentPane();
pane.setLayout(new FlowLayout());

Celsius = new JButton("Do Nothing");
l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
t = new JTextField(12);
c = new JCheckBox("Overclock!!!");
pane.add(l);
pane.add(Celsius);
pane.add(t);
pane.add(c);
}

    public void actionPerformed(ActionEvent e){
	String s=e.getActionCommand();

    }

    public static void main(String[] args) {
        GuiDemo g = new GuiDemo();
        g.setVisible(true);
    }
}

