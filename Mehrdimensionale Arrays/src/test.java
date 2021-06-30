//import java.util.Scanner;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String input = new Scanner(System.in);

		String text = JOptionPane.showInputDialog(null, "Wie alt bist du ?");
		try {
			String input = null;
			int alter = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, "Du bist " + alter + " Jahre alt");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Du Depp diese is nix Zahl");
		}
	}

}
