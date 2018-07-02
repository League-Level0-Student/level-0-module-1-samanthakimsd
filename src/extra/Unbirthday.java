package extra;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birth = JOptionPane.showInputDialog("What is your birthday? e.g. 1/23");
		if (birth.equals("7/2")) {
			System.out.println("HAPPY BIRTHDAY!!!");

		} else {
			System.out.println("HAPPY UNBIRTHDAY");
		}
	}
}
