package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	
 	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		JLabel topLabel = new JLabel("Push A Button");
		JLabel response = new JLabel("");
	    JButton fungi = new JButton();
	    fungi.setText("Fungi");
	    JButton dairy = new JButton();
	    dairy.setText("Dairy");
	    JButton reset = new JButton();
	    reset.setText("Reset");
	    fungi.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	         	response.setText("fungi");            	
	         }
	     });

	     dairy.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         	response.setText("dairy");
	         }
	     });
	     
	     reset.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         	response.setText("");
	         }
	     });
	     pane.add(topLabel);
	     pane.add(fungi);
	     pane.add(dairy);
	     pane.add(response);
	     pane.add(reset);
	}
	
 	public static void createAndShowGUI() {
 		JFrame frame = new JFrame("ButtonImage");
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