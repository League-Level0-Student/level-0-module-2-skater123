package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VootingBooth {
	public static void main(String[] args) {
		String voting = JOptionPane.showInputDialog(null, "HEY I GOT A QUESTION HOW OLD ARE YOU");
		int votingtAsSint = Integer.parseInt(voting);

		if (18 < votingtAsSint) {
			JOptionPane.showMessageDialog(null, "alright man you get to vote");
		}

		if (18 > votingtAsSint) {
			JOptionPane.showMessageDialog(null, "sorry little dude but you are too young");

		}

	}
}