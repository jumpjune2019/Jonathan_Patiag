package swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Main implements ListSelectionListener {
		//variables
		JList<String> jlst;
		JFrame jfrm;
		JLabel jlab;
		JLabel label;
		JComboBox box;
		JPanel panel1, panel2, panel3, all;
		// Create an array of names.
		String transport[] = { "train", "car", "airplane"};
		Main() {
			// Create a new JFrame container.
			jfrm = new JFrame("SwingComboBox");
			jfrm.setLocationRelativeTo(null);
			// Specify a gridbag layout
			jfrm.setLayout(new GridBagLayout());
			// Give the frame an initial size.
			jfrm.setSize(300, 200);
			// Terminate the program when the user closes the application.
			jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jlab = new JLabel("Select Transport");
			label = new JLabel(" ");
			panel1 = new JPanel();
			panel2 = new JPanel();
			panel3 = new JPanel();
			all = new JPanel();
			all.setLayout(new BoxLayout (all, BoxLayout.Y_AXIS));
			box = new JComboBox(transport);
			//set size of box
			box.setPreferredSize(new Dimension(200, 20));
			//cast text to item selected
			box.addActionListener(e -> {
				String str = (String) box.getSelectedItem();
				label.setText("Selected Panel: " + str);
			});
			
			panel1.add(jlab);
			panel2.add(box);
			panel3.add(label);
			all.add(panel1);
			all.add(panel2);
			all.add(panel3);
			
			jfrm.add(all);
			jfrm.setVisible(true);		}
		
		// Handle list selection events.
		public void valueChanged(ListSelectionEvent le) {
			// Get the index of the changed item.
			int idx = jlst.getSelectedIndex();
			// Display selection, if item was selected.
			if(idx != -1) {
				jlab.setText("Current selection: " + transport[idx]);
			} else {
				// Otherwise, reprompt.
				jlab.setText("Please choose a name");
			}
		}

		public static void main(String args[]) {
			// Create the frame on the event dispatching thread.
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new Main();
				}
			});
		}
	}