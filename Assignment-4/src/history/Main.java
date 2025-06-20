package history;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HistoryManager<String> manager = new HistoryManager<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Undo/Redo System (Type 'exit' to quit):");

        while (true) {
            System.out.println("\nCurrent State: " + manager.getCurrentState());
            System.out.print("Enter command (add <val> / undo / redo / exit): ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) break;

            if (input.startsWith("add ")) {
                String value = input.substring(4);
                manager.addState(value);
            } else if (input.equalsIgnoreCase("undo")) {
                try {
                    manager.undo();
                } catch (IllegalStateException e) {
                    System.out.println("❗ " + e.getMessage());
                }
            } else if (input.equalsIgnoreCase("redo")) {
                try {
                    manager.redo();
                } catch (IllegalStateException e) {
                    System.out.println("❗ " + e.getMessage());
                }
            } else {
                System.out.println("❗ Invalid command.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}