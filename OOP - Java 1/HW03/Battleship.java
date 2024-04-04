import java.util.Scanner;
public class Battleship {
	public static void main(String[] args) {
    // 1. Print out starting message
		System.out.println("Welcome to Battleship!");

		// 2. Prompt each user to enter coordinates for 5 ships
		char[][] p1Board = new char[5][5];
		char[][] p2Board = new char[5][5];
		buildInitialBoard(p1Board);
		buildInitialBoard(p2Board);

	}

	private static void buildInitialBoard(char[][] playerBoard) {
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				playerBoard[row][column] = '-';
			}
		}
		printBattleShip(playerBoard);
	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}