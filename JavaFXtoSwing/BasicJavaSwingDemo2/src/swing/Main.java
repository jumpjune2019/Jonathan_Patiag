package swing;
//A JavaFX application with a label

//A JavaFX application with a label

import javax.swing.*;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	final static boolean shouldWeightX = true;
	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JButton btn = new JButton();
		btn.setText("Say 'Hello World'");
		if (shouldWeightX) {
            c.weightx = 0.5;
		}
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 0;
		c.gridy = 0;
		pane.add(btn, c);
	    JLabel myLabel = new JLabel("  ");
	    c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 0;
		c.gridy = -5;
		pane.add(myLabel, c);
	    btn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	         	myLabel.setText("Hello world!");            	
	         }
	     });
	    JButton btn2 = new JButton();
	    btn2.setText("Reset");
	     btn2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         	myLabel.setText("  ");
	         }
	     });
	     c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 0;
		c.gridy = 10;
	     pane.add(btn2, c);
	}
	
public static void createAndShowGUI() {
	JFrame frame = new JFrame("HelloWorldSwing");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	addComponentsToPane(frame.getContentPane());
 //Display the window.
   frame.pack();
   frame.setVisible(true);	
}

public static void main(String[] args) {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});;
	}
}