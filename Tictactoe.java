import java.util.Random;

public class TicTacToe {

    // Assuming existing board and symbol variables
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        // Triggers the computer move logic
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random rand = new Random();
        boolean moved = false;

        while (!moved) {
            // 1. Generate random slot 1-9
            int slot = rand.nextInt(9) + 1;

            // 2. Convert to indices (Logic from UC4)
            int row = getRowFromSlot(slot);
            int col = getColFromSlot(slot);

            // 3. Validate move (Logic from UC5)
            if (isValidMove(row, col)) {
                // 4. Place move (Logic from UC6)
                placeMove(row, col, computerSymbol);
                System.out.println("Computer chose slot: " + slot);
                moved = true;
            }
        }
    }

    // Helper methods (Reused from previous steps)
    static int getRowFromSlot(int slot) { return (slot - 1) / 3; }
    
    static int getColFromSlot(int slot) { return (slot - 1) % 3; }

    static boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3) && (col >= 0 && col < 3) && board[row][col] == '-';
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}
