package four;

import javax.swing.*;
public class MyLabel {
	private String position;

	MyLabel() {
		
	}
	
	/*
	 * Made the two functions here lambda,
	 * but had to swap the order so the layout would be defined
	 * before the Label lambda function could work.
	 */
	
	Set layout = (JFrame jF, JLabel jl) -> {
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setVerticalAlignment(JLabel.CENTER);
		jF.add(jl, position);
	};
	
	Label set = (String l, String p, JFrame jf) -> {
		position = p;
		JLabel lb = new JLabel(l);
		layout.function(jf, lb);
		return lb;
	};
}
