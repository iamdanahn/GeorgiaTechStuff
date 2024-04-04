import java.util.Scanner;
public class Battleship {
	public static void main(String[] args) {
    // 1. Print out starting message
		System.out.println("Welcome to Battleship!");

		// 2. Prompt each user to enter coordinates for 5 ships
		// 3. Create two 5x5 grid Location Boards to store each players ship location
		char[][] locationBoardP1 = new char[5][5];
		char[][] locationBoardP2 = new char[5][5];
		buildInitialBoard(locationBoardP1);
		buildInitialBoard(locationBoardP2);
		enterStartingShipCoordinates(locationBoardP1, 1);
		enterStartingShipCoordinates(locationBoardP2, 2);

		// 4. Create two more 5x5 grid Target History Boards to track hits and misses
		char[][] targetBoardP1 = new char[5][5];
		char[][] targetBoardP2 = new char[5][5];
		buildInitialBoard(targetBoardP1);
		buildInitialBoard(targetBoardP2);

		// 5. Prompt Player 1 to enter a coordinate to fire upon. You can expect the user input will be two ints separated by a space.
		boolean gameOn = true;
		boolean playerOneTurn = true;
		while (gameOn) {
			if (playerOneTurn) {
				fireShot(locationBoardP1, targetBoardP1, 1, 2);
			} else {
				fireShot(locationBoardP2, targetBoardP2, 2, 1);
			}


		}

	}

	private static void fireShot(char[][] locationBoard, char[][] targetBoard, int playerNum, int opponent) {
		Scanner input = new Scanner(System.in);
		System.out.println(String.format("Player %s, enter hit row/column:", String.valueOf(playerNum)));
		
		boolean insertingCoordinates = true;
		while (insertingCoordinates) {
			String location = input.nextLine();

			String[] parts = location.split(" ");
			int row = Integer.parseInt(parts[0]);
			int col = Integer.parseInt(parts[1]);

			if (!isValidCoordinates(row, col)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				continue;
			} else {
				if (locationBoard[row][col] == 'O') {
					System.out.println("You already fired on this spot. Choose different coordinates.");
				} else if (locationBoard[row][col] == '-') {
					System.out.println("PLAYER " + playerNum + " MISSED!");
				} else if (locationBoard[row][col] == '@') {
					System.out.println("PLAYER " + playerNum + " HIT PLAYER " + opponent + "'s SHIP!");
					
				}
			}
			
		}

	}

	private static void enterStartingShipCoordinates(char[][] playerBoard, int playerNum) {
		Scanner input = new Scanner(System.in);
		System.out.println(String.format("PLAYER %s, ENTER YOUR SHIPS' COORDINATES.", String.valueOf(playerNum)));

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter ship " + i + " location:");
			boolean insertingCoordinates = true;

			while (insertingCoordinates) {
				String location = input.nextLine();
				
				String[] parts = location.split(" ");
				int row = Integer.parseInt(parts[0]);
				int col = Integer.parseInt(parts[1]);

				if (isValidCoordinates(row, col) && playerBoard[row][col] == '-') {
					playerBoard[row][col] = '@';
					insertingCoordinates = false;
				} else if (isValidCoordinates(row, col) && playerBoard[row][col] == '@') {
					System.out.println("You already have a ship there. Choose different coordinates.");
				} else {
					System.out.println("Invalid coordinates. Choose different coordinates.");
				}
			}
		}

		printBattleShip(playerBoard);
		for (int i = 0; i < 100; i++) {
			System.out.println(" ");
		}
	}

	private static boolean isValidCoordinates(int row, int col) {
		return (row >= 0 && row < 5) && (col >= 0 && col < 5);
	}

	private static void buildInitialBoard(char[][] playerBoard) {
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				playerBoard[row][column] = '-';
			}
		}
		// printBattleShip(playerBoard);
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