package extra;

import javax.swing.JOptionPane;

public class Secretboxthingy {
	public static void main(String[] args) {
		String password = "passsword";
		String message = JOptionPane.showInputDialog("Enter a SECRET message");
		String correct = JOptionPane
				.showInputDialog("You will only see the message if you enter the correct password down below");
		if (correct.equals("passsword")) {
			JOptionPane.showMessageDialog(null, "" + message);
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDERRR");
		}

	}
}
