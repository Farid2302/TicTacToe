public class TicTacToe {

    // Assuming the board is already initialized elsewhere in the class
    static char[][] board = new char[3][3];

    /**
     * Checks all possible winning patterns for the given symbol.
     * @param symbol The symbol to check ('X' or 'O')
     * @return true if the symbol has a winning line, false otherwise.
     */
    static boolean hasWon(char symbol) {
        // 1. Check Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }

        // 2. Check Columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }

        // 3. Check Diagonals
        // Top-left to bottom-right
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        // Top-right to bottom-left
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }

        // No winning pattern found
        return false;
    }
}
