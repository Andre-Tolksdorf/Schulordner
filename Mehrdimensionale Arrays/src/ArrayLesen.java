import java.util.Scanner;

public class ArrayLesen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int eingabe = 0;
		int[] myArray = { 1, 2, 3 };

		while (true) {

			System.out.println("Bitte geben Sie das zu lesende Element an:");
			eingabe = input.nextInt();
			try {
				System.out.println(myArray[eingabe]);
				break;
				
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.toString());

			}
		}
		System.out.println("ENDE");
		input.close();

	}
}





