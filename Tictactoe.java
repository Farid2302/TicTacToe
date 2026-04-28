public class TicTacToe {

    // Assuming the board is initialized with '-' in all cells
    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests draw detection logic.
     */
    public static void main(String[] args) {
        // Example check:
        System.out.println("Is the game a draw? " + isDraw());
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * @return true if the board is full (draw), false if moves are still possible.
     */
    static boolean isDraw() {
        // Iterate through every row
        for (int r = 0; r < 3; r++) {
            // Iterate through every column in the current row
            for (int c = 0; c < 3; c++) {
                // If we find an empty cell, the game is still active
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        // If we finish the loops without returning false, no empty cells exist
        return true;
    }
}
