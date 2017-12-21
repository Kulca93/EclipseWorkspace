
public class Grid {

	public char[][] gridBoard = new char[3][3];

	// Initialises Grid
	public void initialiseGrid() {

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++)

				gridBoard[x][y] = 'o';

		}
	}

	// Print Grid
	public void drawGrid() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++)
				System.out.print(gridBoard[x][y] + " ");
			System.out.println("");

		}
	}
}
