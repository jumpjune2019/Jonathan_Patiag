package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GameDice implements ActionListener {
	JButton startButton;
	JButton quitButton;
	JTextField playerText;
	JTextField compText;
	JTextField messageText;
	GameDice(){
		JFrame jfrm = new JFrame("Game of Dice");
		jfrm.setLayout(new BorderLayout());
		jfrm.setSize(1000, 500);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		messageText = new JTextField("Welcome to the dice game! Feeling lucky? (Change window size to see action)");
		messageText.setHorizontalAlignment(JTextField.CENTER);
		playerText = new JTextField("");
		compText = new JTextField("");
		startButton = new JButton("Play");
		startButton.addActionListener(this);
		quitButton = new JButton("Quit");
		quitButton.addActionListener(this);
		jfrm.add(startButton, BorderLayout.NORTH);
		jfrm.add(quitButton, BorderLayout.SOUTH);
		jfrm.add(messageText, BorderLayout.CENTER);
		jfrm.add(playerText, BorderLayout.WEST);
		jfrm.add(compText, BorderLayout.EAST);
		// Display the frame.
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == quitButton) {
			messageText.setText("Thank you for playing! See ya!");
			System.exit(0);
		} else if (e.getSource() == startButton) {
			int xplay = 0, yplay = 0, xcomp = 0, ycomp = 0, sumplay = 0, sumcomp = 0;
			String[][] pair = new String[6][6]; // initialise the 2-d String array
			/*
			 * For the next few lines,
			 * we insert all labels inside the 2-D array
			 */
			pair[0][0] = "Snake Eyes";
			pair[0][1] = "Australian yo";
			pair[0][2] = "Little Jo from Komomo";
			pair[0][3] = "No field five";
			pair[0][4] = "Easy six";
			pair[0][5] = "Six one you're done";
			pair[1][0] = "Ace caught in a deuce";
			pair[1][1] = "Ballerina";
			pair[1][2] = "The fever";
			pair[1][3] = "Jimmie Hicks";
			pair[1][4] = "Benny Blue";
			pair[1][5] = "Easy eight";
			pair[2][0] = "Easy four";
			pair[2][1] = "OJ";
			pair[2][2] = "Brooklyn Forest";
			pair[2][3] = "Big Red";
			pair[2][4] = "Eighter from Decatur";
			pair[2][5] = "Nina from Pasadena";
			pair[3][0] = "Little Phoebe";
			pair[3][1] = "Easy six";
			pair[3][2] = "Skinny Mckinney";
			pair[3][3] = "Square pair";
			pair[3][4] = "Railroad nine";
			pair[3][5] = "Big one on the end";
			pair[4][0] = "Sixie from Dixie";
			pair[4][1] = "Skinny Dugan";
			pair[4][2] = "Easy eight";
			pair[4][3] = "Jesse James";
			pair[4][4] = "Puppy paws";
			pair[4][5] = "Yo";
			pair[5][0] = "The devil";
			pair[5][1] = "Easy eight";
			pair[5][2] = "Lou Brown";
			pair[5][3] = "Tennessee";
			pair[5][4] = "Six five no jive";
			pair[5][5] = "Midnight";
			GameInterface dieRoll = (a, b) -> (int)(Math.random()* ((b-1) + a)) + a;
			CheckInterface check = (a, b) -> {
				if (a > b) {
					messageText.setText("You win!!!");
				} else if (a < b) {
					messageText.setText("I win!!!");
				} else if (a == b) {
					messageText.setText("We tied, it seems.");
				}
			};
	 		xplay = dieRoll.function(1, 6);
			yplay = dieRoll.function(1, 6);
			xcomp = dieRoll.function(1, 6);
			ycomp = dieRoll.function(1, 6);
			playerText.setText("You have rolled a " +xplay+ " and " +yplay+ ", the " +pair[xplay-1][yplay-1]+ "!"); //results of rolls
			compText.setText("I have rolled a " +xcomp+ " and " +ycomp+ ", the " +pair[xcomp-1][ycomp-1]+ "!");
			sumplay = xplay + yplay;
			sumcomp = xcomp + ycomp;
			if((xplay == yplay) && (xcomp != ycomp) && sumplay == sumcomp) {
				messageText.setText("You Win by a double! LUCKY!!!");
			} else if((xcomp == ycomp) && (xplay != yplay) && sumplay == sumcomp) {
				messageText.setText("I Win by a double! TOO BAD!!!");
			} else {
				check.function(sumplay, sumcomp);
			}
		}
		
	}
	
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
		Roll run = () -> new GameDice();
			run.function();
	}
}
