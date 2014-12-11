import java.awt.event.*;
import javax.swing.*;
import java.awt.*; //needed for pane
public class GuiDemo extends JFrame implements ActionListener{
    private Container pane;
    private JButton Celsius, Farenheit,Convert,clear;
    private JLabel l;
    private JTextField text;
    private Container buttons;
    private Container textyStuff;

    public GuiDemo() {
				this.setTitle("Celsius and Farenheit Converter");
				this.setSize(600,200);
				this.setLocation(100,100);
				this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
				pane = this.getContentPane();
				pane.setLayout(new GridLayout(2,1));

				l = new JLabel("Text:",null,JLabel.CENTER);
				clear = new JButton("Exterminate!");
				Celsius=new JButton("Convert to Celsius");
				Farenheit=new JButton("Convert to Farenheit");
				text = new JTextField(40);

                                // make the buttons call the actionListener
				clear.setActionCommand("delete");
				clear.addActionListener(this);
				Celsius.setActionCommand("makeCelsius");
				Celsius.addActionListener(this);
				Farenheit.setActionCommand("makeFarenheit");
				Farenheit.addActionListener(this);

				buttons = new Container();
				buttons.setLayout(new FlowLayout());
				buttons.add(clear);
				buttons.add(Celsius);
				buttons.add(Farenheit);

 				
				textyStuff = new Container();
				textyStuff.setLayout(new FlowLayout());
				textyStuff.add(l);
				textyStuff.add(text);

				//add the 2 containers
				pane.add(textyStuff);
				pane.add(buttons);
				
		}
                                    //look at which command is being executed, and choose an action
		public void actionPerformed(ActionEvent e){
				String action = e.getActionCommand();
				//System.out.println(action);
		       
				if(action.equals("delete")){
						text.setText("");
				}
				if(action.equals("makeCelsius")){
			
				    String s=text.getText();
				    try{
					double d= Double.parseDouble(s);
				    }
				    catch(NumberFormatException nfe)
					{
					    text.setText("");
					}
				    double num=Double.parseDouble(s);
				    num=((num-32)*5)/9;
				    s=""+num;
				    text.setText(s);
				}
				if(action.equals("makeFarenheit")){
				    String s=text.getText();
				    try{
					double d= Double.parseDouble(s);
				    }
				    catch(NumberFormatException nfe)
					{
					    text.setText("");
					}
				    double num=Double.parseDouble(s);
				    num=((num*9)/5)+32;
				    s=""+num;
				    text.setText(s);
				}
		}

    public static void main(String[] args) {
				GuiDemo g = new GuiDemo();
				g.setVisible(true);
    }

}
