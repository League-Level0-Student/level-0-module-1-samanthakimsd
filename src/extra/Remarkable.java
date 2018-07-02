package extra;

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String people = JOptionPane.showInputDialog("Insert Jenna, Nick, Matt, or Sami to find out a fun fact");

		if (people.equals("Nick")) {

			JOptionPane.showMessageDialog(null, "Nick likes chez amnd MARSHMELLOWS");
		} else if (people.equals("Sami")) {
			JOptionPane.showMessageDialog(null, "Sami likes ice cream");
		} else if (people.equals("Jenna")) {
			JOptionPane.showMessageDialog(null, "Jenna plays volleyball");
		} else if (people.equals("Matt")) {
			JOptionPane.showMessageDialog(null, "Matt taught scuba in Hawaii");
		}
	}
}
