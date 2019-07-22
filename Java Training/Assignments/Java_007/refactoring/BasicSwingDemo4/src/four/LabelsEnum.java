package four;

import java.awt.BorderLayout;

enum LabelsEnum {
	CENTER("Center", BorderLayout.CENTER), 
	EAST("East", BorderLayout.EAST), 
	NORTH("North", BorderLayout.NORTH), 
	SOUTH("South", BorderLayout.SOUTH), 
	WEST("West", BorderLayout.WEST);
	
	private String label;
	private String position;
	
	// Constructor
	LabelsEnum(String l, String p) { 
		label = l;
		position = p;
	}
	
	
	//getter functions replaced with lambda expressions
	Position getl = () -> label;
	
	Position getp = () -> position;
}