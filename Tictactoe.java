public class TicTacToe {

    // 2D Array to represent the 3x3 board
    static char[][] board = new char[3][3];

    /**
     * Entry point of the program.
     */
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /**
     * Initializes the 3x3 board by filling each cell with '-' 
     * using nested loops.
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * Prints the Tic-Tac-Toe board with separators.
     */
    static void printBoard() {
        System.out.println("Current Board:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + board[row][col] + " ");
                
                // Print vertical separator only between columns
                if (col < 2) {
                    System.out.print("|");
                }
            }
            System.out.println(); // Move to the next row
            
            // Print horizontal separator between rows
            if (row < 2) {
                System.out.println("-----------");
            }
        }
    }
}
