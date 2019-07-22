package three;

import javax.swing.*;
public class MyLabel {
	private String position;

	MyLabel() {
		
	}
	
	JLabel setLabel(String l, String p, JFrame jf) {
		position = p;
		JLabel lb = new JLabel(l);
		setL.function(jf, lb); //the lambda works here
		return lb;
	}
	
	Swing setL = (JFrame jf, JLabel jl) -> jf.add(jl, position); //the setter function is replaced with a lambda expression
}
