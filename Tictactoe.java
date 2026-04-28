public class TicTacToe {

    // Initializing the board with empty cells ('-')
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        // --- UC4 Demo: Converting slot to index ---
        int slot = 7; 
        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);
        
        System.out.println("Slot " + slot + " converts to: Row " + row + ", Column " + col);

        // --- UC5 Demo: Validating the move ---
        if (isValidMove(row, col)) {
            System.out.println("Move is valid. You can place your symbol here!");
        } else {
            System.out.println("Move is invalid. Please try another slot.");
        }
    }

    // UC4: Mapping Slot (1-9) to Row Index (0-2)
    static int getRowFromSlot(int slot) {
        // (slot - 1) adjusts for 0-based indexing before division
        return (slot - 1) / 3;
    }

    // UC4: Mapping Slot (1-9) to Column Index (0-2)
    static int getColFromSlot(int slot) {
        // (slot - 1) adjusts for 0-based indexing before modulo
        return (slot - 1) % 3;
    }

    // UC5: Checking if the move is within bounds and the cell is empty
    static boolean isValidMove(int row, int col) {
        // 1. Check if indices are within the 0-2 range
        boolean inBounds = (row >= 0 && row < 3) && (col >= 0 && col < 3);
        
        // 2. Check if the cell is empty
        // We only check the board if inBounds is true to prevent ArrayOutOfBounds errors
        if (inBounds) {
            return board[row][col] == '-';
        }
        
        return false;
    }
}
