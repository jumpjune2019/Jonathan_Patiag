package two;

//A simple Swing Class
import javax.swing.*;

class SwingDemo {
	private JFrame jfrm;
	SwingDemo(String title) {
		// Create a new JFrame container.
		jfrm = new JFrame(title);
	}
	SwingTwo get = () -> jfrm; //replaced the get with a lambda expression
}
