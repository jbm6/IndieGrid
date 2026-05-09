public class SeatingChart {
    private char[][] grid;
    private final int rows = 5;
    private final int cols = 6;

    public SeatingChart() {
        grid = new char[rows][cols];
        resetSeats(); // Initializes the grid with 'O'
    }

    // Displays the 5x6 grid to the console
    public void displayGrid() {
        System.out.println("\n  1 2 3 4 5 6 (Columns)");
        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " "); // Row numbers
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Updates a seat to 'X' if it is 'O'
    public boolean reserveSeat(int r, int c) {
        if (grid[r][c] == 'O') {
            grid[r][c] = 'X';
            return true;
        }
        return false;
    }

    // Resets the entire grid for the Admin
    public void resetSeats() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = 'O';
            }
        }
    }
}