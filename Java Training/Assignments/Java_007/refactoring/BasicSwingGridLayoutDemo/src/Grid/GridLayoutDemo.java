package Grid;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class GridLayoutDemo  implements ActionListener {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public GridLayoutDemo(){
      prepare.function(); //lambda function
   }
   
   /*
    * Change this function to be a lambda block
    */
   LayoutGrid prepare = () ->{
      mainFrame = new JFrame("Grid Layout Example");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      // new school way to close a window using a lambda expression
      mainFrame.addWindowListener(new WindowAdapter() {
         Window windowClosing = (WindowEvent windowEvent) -> System.exit(0);
             // this is the way to force a java application to gracefully exit
        	 // when not going to end via the main method entry point    
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   };
  
   /*
    * This void function throws an exception
    * so this falls under another interface I made, Grid!
    */
   Grid show =  () ->  {
      headerLabel.setText("Layout in action: GridLayout");      
      statusLabel.setText("Press a button, I dare you...");
      JPanel panel = new JPanel();
      panel.setBackground(Color.CYAN);
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(2,3);
      layout.setHgap(10);
      layout.setVgap(10);
      panel.setLayout(layout);
      int length = 6;
      JButton[] buttons = new JButton[length];
      int x;
      String prefixLabel = "Button ";
      for (x = 0; x < length; x++) {
    	  buttons[x] = new JButton(prefixLabel.concat(Integer.toString(x + 1)));
    	  buttons[x].addActionListener(this);
    	  panel.add(buttons[x]);
      }
      
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   };
 
   public void actionPerformed(ActionEvent ae) {
	   statusLabel.setText(ae.getActionCommand());
   }
   
   public static void main(String[] args){
	   /*
	    * the runnnable and run function
	    * that was here is replaced
	    * by a lambda function
	    */
		LayoutGrid run = () -> {
				GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();  
			    gridLayoutDemo.show.function(); //block lambda replaced this function
		};    
		run.function();
   }
}