package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CoinFlip implements ActionListener{
	JButton startButton; //button that starts the game
	JButton resetButton; //button that resets the game
	JLabel messageLabel; //label that signifies waiting
CoinFlip(){
	JFrame jfrm = new JFrame("Head Of Tail");
	jfrm.setLayout(new FlowLayout());
	jfrm.setSize(200, 150);
	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	messageLabel = new JLabel("Waiting....");
	startButton = new JButton("Click to flip!");
	startButton.addActionListener(this);
	resetButton = new JButton("Reset");
	resetButton.addActionListener(this);
	jfrm.add(startButton);
	jfrm.add(resetButton);
	jfrm.add(messageLabel);
	// Display the frame.
	jfrm.setVisible(true);
}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startButton) {
			FunctionalCF coinFlip = (min, max) -> (int)(Math.random()* ((max-1) + min)) + min;
			int end = coinFlip.function(1, 2);
			CFFunc compare1 = (n) -> n == 1;
			CFFunc compare2 = (n) -> n == 2;
			if(compare1.func(end)) {
				messageLabel.setText("The result is heads!");
			}
			
			if(compare2.func(end)) {
				messageLabel.setText("The result is tails!");
			}
		} else if(e.getSource() == resetButton) {
			messageLabel.setText("Waiting...");
		}
	}
	
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
		Flip run = () -> new CoinFlip();
			run.function();
	}
}
