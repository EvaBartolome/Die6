import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerReadCSVFile {
    public void run() throws FileNotFoundException {
        File dataFile = new File("TestScoresByClass.csv");
        Scanner scanner = new Scanner(dataFile);
        scanner.useDelimiter("\n");

        // Print the header
        System.out.println("Class: Avg score");

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            // Split the line into an array of values using a comma as the delimiter
            String[] values = line.split(",");

            // Check if there are at least 11 values (1 class number + 10 test scores)
            if (values.length >= 11) {
                String classNumber = values[0];
                int totalScore = 0;

                // Loop through the test scores and calculate the total score
                for (int i = 1; i < 11; i++) {
                    totalScore += Integer.parseInt(values[i]);
                }

                // Calculate the average score for the class
                int averageScore = totalScore / 10;

                // Print the class number and its average score
                System.out.println(classNumber + ": " + averageScore);
            }
        }
    }

    public static void main(String[] args) {
        try {
            ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
            srCsv.run();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            System.out.println("There's an error someplace. Try using the debugger to find it!");
        }
    }
}