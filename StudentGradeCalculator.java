import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of grades
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();

        // Create an array to store the grades
        double[] grades = new double[numberOfGrades];

        // Input each grade
        double sum = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Calculate the average
        double average = sum / numberOfGrades;

        // Display the average grade
        System.out.printf("The average grade is: %.2f\n", average);

        scanner.close();
    }
}
