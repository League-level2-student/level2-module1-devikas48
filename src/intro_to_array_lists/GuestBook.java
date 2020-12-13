package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.w3c.dom.NameList;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame  = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton leftbutton = new JButton();
	JButton rightbutton = new JButton();
	
	public void run() {
		frame.setVisible(true);
		leftbutton.setText("Add Name");
		rightbutton.setText("View Names");
		leftbutton.addActionListener(this);
		rightbutton.addActionListener(this);
		panel.add(leftbutton);
		panel.add(rightbutton);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonpressed = (JButton) e.getSource();
		if(leftbutton == buttonpressed) {
	String name = JOptionPane.showInputDialog("Enter a name");
	names.add(name);
		}
		if(rightbutton == buttonpressed) {
			String namesList = " ";
		for (int i = 0; i < names.size(); i++) {
			String s = names.get(i);
			namesList = namesList + "Guest #" + (i+1) + " " + s + "\n";
			
		}
		JOptionPane.showMessageDialog(null, namesList);
		}
	}
}
