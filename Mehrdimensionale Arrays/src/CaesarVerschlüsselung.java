import java.util.Scanner;

public class CaesarVerschlüsselung {

	static String TextEingabe = "";
	static int schlüssel = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe = 0;

		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Bitte treffen Sie eine Auswahl:");
			System.out.println("    1: Eingabe der Nachricht");
			System.out.println("    2: Encode");
			System.out.println("    3: Decode");
			System.out.println("    4: DecodeAll");
			System.out.println("    5: Ausgabe");
			System.out.println("    6: Eingabe des Schlüssels");
			System.out.println("    0: Prgramm beenden!");

			eingabe = input.nextInt();
			if (eingabe < 0 || eingabe >= 7) {
				System.out.println("Nicht in der Menüauswahl vorhanden!");
				System.out.println();
			}

			switch (eingabe) {
			case 1:
				eingabeText(input);
				System.out.println(TextEingabe);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				schlüsselEingabe(input);
				System.out.println(schlüssel);
				break;

			default:
				break;
			}

		} while (eingabe != 0);
		
		 input.close();

	}

	public static String eingabeText(Scanner input) {
		System.out.println("Sie können nun Ihren Text eingeben");
		input.nextLine();
		TextEingabe = input.nextLine();

		return TextEingabe;
	}

	public static void schlüsselEingabe(Scanner input) {
		try {
			System.out.println("Hier können Sie Ihren Schlüssel eingeben von 1-25");
			schlüssel = input.nextInt();
			if(schlüssel >= 1 && schlüssel <= 25) {
				System.out.println("Ihr Schlüssel ist : " + schlüssel);
			}
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Nicht zulässig!");
		}

		
	}
}
