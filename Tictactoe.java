import java.util.Scanner;

public class TicTacToe {

    /**
     * Entry point of the program. Reads slot input and prints it back
     * to verify correct user input handling.
     */
    public static void main(String[] args) {
        int slot = getUsersSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * @return The slot number entered by the user.
     */
    static int getUsersSlot() {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a slot number (1-9): ");
        
        // Read the integer input
        int slot = scanner.nextInt();
        
        // Return the captured value
        return slot;
    }
}
