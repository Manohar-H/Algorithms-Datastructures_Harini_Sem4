import java.util.Scanner;

public class TemperatureAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the number of days
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        // 2. Store the temperatures in an array
        double[] temperatures = new double[numDays];
        double sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        // 3. Calculate the average temperature
        double average = sum / numDays;
        System.out.printf("Average temperature: %.2f\n", average);

        // 4. Count how many temperatures are above average
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Number of days above average temperature: " + countAboveAverage);

        scanner.close();
    }
}