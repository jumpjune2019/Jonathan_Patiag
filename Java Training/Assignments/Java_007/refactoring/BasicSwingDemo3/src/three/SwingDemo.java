package three;

//A simple Swing Class
import javax.swing.*;

class SwingDemo {
	private JFrame jfrm;
	SwingDemo(String title) {
		// Create a new JFrame container.
		jfrm = new JFrame(title);
	}
	SwingThree get = () -> jfrm; //getter replaced with a lambda expression
}