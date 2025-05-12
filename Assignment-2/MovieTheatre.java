import java.util.Scanner;

public class MovieTheatre {

    private static final int ROWS = 5;
    private static final int COLS = 5;
    private static final char[][] seats = new char[ROWS][COLS];  // O = available, X = reserved

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeSeats();

        while (true) {
            System.out.println("\n--- Movie Theatre Menu ---");
            System.out.println("1. View Seating Chart");
            System.out.println("2. Reserve a Seat");
            System.out.println("3. Cancel a Reservation");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printSeatingChart();
                    break;
                case 2:
                    reserveSeat(scanner);
                    break;
                case 3:
                    cancelSeat(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Movie Theatre system!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void initializeSeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                seats[i][j] = 'O'; // O means the seat is available
            }
        }
    }

    private static void printSeatingChart() {
        System.out.println("\nSeating Chart (O = Available, X = Reserved):");
        for (int i = 0; i < ROWS; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void reserveSeat(Scanner scanner) {
        System.out.print("Enter row (1-" + ROWS + "): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Enter column (1-" + COLS + "): ");
        int col = scanner.nextInt() - 1;

        if (isValidSeat(row, col)) {
            if (seats[row][col] == 'O') {
                seats[row][col] = 'X';
                System.out.println("Seat reserved successfully!");
            } else {
                System.out.println("Seat is already taken. Here's what's available:");
                suggestAvailableSeats();
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    private static void cancelSeat(Scanner scanner) {
        System.out.print("Enter row to cancel (1-" + ROWS + "): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Enter column to cancel (1-" + COLS + "): ");
        int col = scanner.nextInt() - 1;

        if (isValidSeat(row, col)) {
            if (seats[row][col] == 'X') {
                seats[row][col] = 'O';
                System.out.println("Reservation cancelled.");
            } else {
                System.out.println("That seat wasn't reserved.");
            }
        } else {
            System.out.println("Invalid seat position.");
        }
    }

    private static void suggestAvailableSeats() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (seats[i][j] == 'O') {
                    System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + " is available.");
                }
            }
        }
    }

    private static boolean isValidSeat(int row, int col) {
        return row >= 0 && row < ROWS && col >= 0 && col < COLS;
    }
}
