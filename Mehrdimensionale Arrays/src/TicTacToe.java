import java.util.Iterator;
import java.util.Scanner;

public class TicTacToe {
	final static int PLAYER1 = 1; // value for Player 1
	final static int PLAYER2 = 2; // value for Player 2
	static int playersChoiceI = 0; // the players choice for i
	static int playersChoiceJ = 0; // the players choice for j

	public static void main(String[] args) {
		// TODO deklaration an initialisation of gameField
		int currentPlayer = PLAYER1; // the current Palyer starts with Player 1
		boolean victory = false; // true if someone has won
		int[][] gameField = new int[3][3];

		Scanner input = new Scanner(System.in);

		do { // TODO Game Loop
			printGameField(gameField);
			// TODO
			// Aufforderung
			// Eingabe der Werte
			eingabeWerte(currentPlayer, gameField, input);
			// Spielfeld Ã¤ndern
			// checkWin();
			victory = checkWin(currentPlayer, gameField);
			// swapPlayer();
			if (victory == false) {
				currentPlayer = swapPlayer(currentPlayer);
			}
			// spielfeldGrößeÄndern();
			
		} while (!victory);

		input.close();
		printGameField(gameField);
		System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
	}

	static void eingabeWerte(int currentPlayer, int[][] gameField, Scanner input) {

		do {
			System.out.println("Player " + currentPlayer);
			System.out.println("Wählen Sie Ihre Position Y (Y-Achse)");
			playersChoiceJ = input.nextInt();
			System.out.println("Wählen Sie Ihre Position I (X-Achse)");
			playersChoiceI = input.nextInt();

			if (playersChoiceI <= 0 || playersChoiceJ <= 0 || playersChoiceI >= 4 || playersChoiceJ >= 4) {
				System.out.println("Liegt nicht im Spielfeld!");
				System.out.println("Wählen Sie erneut:");
				System.out.println();

			} else if (gameField[playersChoiceJ - 1][playersChoiceI - 1] != 0) {
				System.out.println("Das Feld ist bereits belegt!");

			}

		} while (playersChoiceI <= 0 || playersChoiceJ <= 0 || playersChoiceI >= 4 || playersChoiceJ >= 4
				|| gameField[playersChoiceJ - 1][playersChoiceI - 1] != 0);

		gameField[playersChoiceJ - 1][playersChoiceI - 1] = currentPlayer;

	}

	/**
	 * prints the gameField
	 */
	private static void printGameField(int[][] gameField) {
		System.out.println("    |\t1\t2\t3");
		System.out.println("--------------------------");
		// TODO
		System.out.println();
		for (int i = 0; i < gameField.length; i++) {
			System.out.print((i + 1) + "   |");
			for (int j = 0; j < gameField[i].length; j++) {
				System.out.print("\t" + gameField[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * swaps the current Player
	 */
	private static int swapPlayer(int currentPlayer) {
		// TODO
		if (currentPlayer == PLAYER1) {
			currentPlayer = PLAYER2;
		} else {
			currentPlayer = PLAYER1;
		}
		return currentPlayer;
	}

	private static void spielfeldÄndern(int currentPlayer, int[][] gameField, int playersChoiceI, int playersChoiceJ) {
		// TODO Auto-generated method stub

		gameField[playersChoiceJ][playersChoiceI] = currentPlayer;
		System.out.println(gameField[playersChoiceJ][playersChoiceI]);
	}

	private static void spielfeldGrößeÄndern(Scanner input, int gameField[][]) {
		// TODO Auto-generated method stub
		int xrichtung = 0;
		int yrichtung = 0;
		boolean aendern = false;
		System.out.println("Möchten Sie die Spielfeldgröße ändern? (TRUE oder False)");
		aendern = input.nextBoolean();

		if (aendern == true) {
			System.out.println("Geben Sie die neue Größe in X-Richtung an: ");
			xrichtung = input.nextInt();
		}
	}

	/**
	 * checkWin
	 * 
	 * @param currentPlayer
	 * @param gameField
	 * @param playersChoisI
	 * @param playersChoisJ
	 * @return true if currentPlayer wins
	 */
	private static boolean checkWin(int currentPlayer, int[][] gameField) {
		// TODO
		playersChoiceI--;
		playersChoiceJ--;
		int counter = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;

		for (int j = 0; j < gameField[playersChoiceJ].length; j++) {
			if (gameField[playersChoiceJ][j] == currentPlayer) {
				counter++;
			}
		}
		for (int i = 0; i < gameField[playersChoiceI].length; i++) {
			if (gameField[i][playersChoiceI] == currentPlayer) {
				counter2++;
			}
		}
		for (int k = 0; k < gameField.length; k++) {
			if (gameField[k][k] == currentPlayer) {
				counter3++;
			}
		}
		for (int p = gameField.length - 1; p >= 0; p--) {
			if (gameField[p][gameField.length - 1 - p] == currentPlayer) {
				counter4++;
			}

		}

		if (counter == gameField.length || counter2 == gameField.length || counter3 == gameField.length
				|| counter4 == gameField.length) {
			return true;

		}

		return false;
	}

}
