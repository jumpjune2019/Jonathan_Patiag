package grid;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GridChallenge extends JFrame {
	JLabel toplbl = new JLabel("Basic Matrix Demo");
	JLabel bottomlbl = new JLabel("No seat selected");
	
	public GridChallenge(String title) {
		super(title);
		addComponent(); //call the function that will create the grid
	}
	
	/*
	 * This function adds the components necessary to make the grid
	 * 
	 */
	void addComponent() {
		//set JFrame layout to be BorderLayout
				setLayout(new BorderLayout());

				//setting up the swing labels
				//also centering them so they won't stick to the left
				toplbl.setHorizontalAlignment(JLabel.CENTER);
				toplbl.setVerticalAlignment(JLabel.CENTER);
				
				bottomlbl.setHorizontalAlignment(JLabel.CENTER);
				bottomlbl.setVerticalAlignment(JLabel.CENTER);
				
				//adding the middle component, a JPAnel with a box format
				Container box = getContentPane();
				box.add(toplbl, BorderLayout.NORTH);
				box.add(bottomlbl, BorderLayout.SOUTH);
				
				/*
				 * Generate the rows and columns randomly
				 */
				int a = 2;
				int b = 5;
				int rows = numRandom(a, b);
				int cols = numRandom(a, b);
				
				/*
				 * Make width and height
				 */
				int gridHeight = (rows * 50) + 80;
				int gridWidth = cols * 50;
				
				this.setSize(gridWidth, gridHeight); //set size of frame to width and height
				
				JPanel pMatrix = createBoard(rows, cols); //create a panel with random rows and cols
				
				box.add(pMatrix, BorderLayout.CENTER); //once finished, add the jpanel in the middle
	}
	
	/*
	 * This function creates the JPanel. It also sets up the variables needed
	 * for the createCell function below
	 */
    private JPanel createBoard(int width, int height) {
    	char letter = 'A'; //set the letter to the row name
        final JPanel board = new JPanel(new GridLayout(width, height));
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
            	JPanel cell = createCell(letter,j);
            	board.add(cell); //adds the cell here
            } 
            letter++; //this will increment in accordance to ASCII lettering number order
        }
        return board;
    }
    
    /*
     * This function creates the cells with boxlayout
     * inside the JPanel
     */
    private JPanel createCell(char a, int x) {
    	JPanel cell = new JPanel();
    	
    	cell.setLayout(new BoxLayout(cell, BoxLayout.Y_AXIS));
    	cell.setSize(50,50);
    	
    	JButton button = new JButton(a + "-" + (x+1));
    	JLabel label = new JLabel("    " + a + "-" + (x+1));
    	
    	/*
    	 * Throwing in a little lambda function here that
    	 * sets text in the button inside the box.
    	 */
    	button.addActionListener((e) -> {
				bottomlbl.setText(button.getText());
		});
    	
    	/*
    	 * adds label and button to the new cell
    	 */
    	cell.add(label); 
    	cell.add(button);
    
    	return cell;
    }
	
    //returns a random number between 2 and 5, including the min and max
	public static int numRandom(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}