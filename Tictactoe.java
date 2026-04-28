import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static char humanSymbol = 'X'; // Assigned in UC2

    public static void main(String[] args) {
        initializeBoard(); // From UC1
        
        int slot = getUsersSlot(); // From UC3
        updateBoard(slot, humanSymbol);
        
        printBoard(); // From UC1
    }

    /**
     * Updates the board array based on the slot number provided.
     * Maps 1-9 to array indices [0,0] through [2,2].
     */
    static void updateBoard(int slot, char symbol) {
        // Mapping logic:
        // 1 -> [0,0], 2 -> [0,1], 3 -> [0,2]
        // 4 -> [1,0], 5 -> [1,1], 6 -> [1,2]
        // 7 -> [2,0], 8 -> [2,1], 9 -> [2,2]
        
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        board[row][col] = symbol;
        System.out.println("Board updated at slot " + slot);
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) board[i][j] = '-';
        }
    }

    static int getUsersSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter slot (1-9): ");
        return scanner.nextInt();
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + (j < 2 ? " | " : ""));
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }
}
