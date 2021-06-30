import java.util.Scanner;

public class CaesarVerschl�sselung {

	static String TextEingabe = "";
	static int schl�ssel = 0;

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
			System.out.println("    6: Eingabe des Schl�ssels");
			System.out.println("    0: Prgramm beenden!");

			eingabe = input.nextInt();
			if (eingabe < 0 || eingabe >= 7) {
				System.out.println("Nicht in der Men�auswahl vorhanden!");
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
				schl�sselEingabe(input);
				System.out.println(schl�ssel);
				break;

			default:
				break;
			}

		} while (eingabe != 0);
		
		 input.close();

	}

	public static String eingabeText(Scanner input) {
		System.out.println("Sie k�nnen nun Ihren Text eingeben");
		input.nextLine();
		TextEingabe = input.nextLine();

		return TextEingabe;
	}

	public static void schl�sselEingabe(Scanner input) {
		try {
			System.out.println("Hier k�nnen Sie Ihren Schl�ssel eingeben von 1-25");
			schl�ssel = input.nextInt();
			if(schl�ssel >= 1 && schl�ssel <= 25) {
				System.out.println("Ihr Schl�ssel ist : " + schl�ssel);
			}
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Nicht zul�ssig!");
		}

		
	}
}
