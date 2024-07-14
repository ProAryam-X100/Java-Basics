//Aryam Aseiri ProAryam-X100
//Simple code for the basics of the Java programming language 

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BasicsOfTheJava {

    public static void main(String[] args) {
        // 1. Basic data types
        int number = 10; 
        double price = 19.99;
        boolean isJavaFun = true;
        char grade = 'A';
        String message = "Hello, World!"; 
        float temperature = 36.5f; 
        short smallNumber = 32767;

        // 2. Screen printing
        System.out.println("Number: " + number);
        System.out.println("Price: " + price);
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);
        System.out.println("Temperature: " + temperature);
        System.out.println("Small Number: " + smallNumber);

        // 3. Flow Control: if-else
        if (number > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is 5 or less");
        }

        // 4. Flow Control: switch
        System.out.println("\nEnter a number between 1 and 3:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose option 1");
                break;
            case 2:
                System.out.println("You chose option 2");
                break;
            case 3:
                System.out.println("You chose option 3");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        // 5. Flow Control: loop-for
        System.out.println("\nLooping from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 6. Flow Control: loop-while
        int count = 1;
        System.out.println("\nCounting from 1 to 3 using while loop:");
        while (count <= 3) {
            System.out.println("Count = " + count);
            count++;
        }

        // 7. Arrays

        // Definition of an array of type int
        int[] numbersArray = {1, 2, 3, 4, 5};
        System.out.println("\nPrinting array elements:");
        for (int num : numbersArray) {
            System.out.println(num);
        }

        // operations on arrays: calculating the sum of elements
        int sum = 0;
        for (int num : numbersArray) {
            sum += num;
        }
        System.out.println("Sum of numbersArray: " + sum);

        // operations on Arrays: finding the largest element
        int max = numbersArray[0];
        for (int num : numbersArray) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max value in numbersArray: " + max);

        // operations on arrays:reversing the order of elements
        int[] reversedArray = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            reversedArray[i] = numbersArray[numbersArray.length - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int num : reversedArray) {
            System.out.println(num);
        }

        // Define an array of type float
        float[] floatArray = {1.1f, 2.2f, 3.3f};
        System.out.println("\nPrinting floatArray elements:");
        for (float num : floatArray) {
            System.out.println(num);
        }

        // Define an array of type short
        short[] shortArray = {1000, 2000, 3000};
        System.out.println("\nPrinting shortArray elements:");
        for (short num : shortArray) {
            System.out.println(num);
        }

        // 8. ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("\nFruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. working with files: writing to a file
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("This is a test file.\n");
            writer.write("Here is some more content.");
            writer.close();
            System.out.println("\nData written to example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 10. working with files:reading from a file
        try {
            File file = new File("example.txt");
            Scanner fileScanner = new Scanner(file);
            System.out.println("\nReading data from example.txt:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // 11. Exception handling: try-catch-finally
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("\nError: Division by zero");
        } finally {
            System.out.println("This block is always executed.");
        }

        // 12. Using 2D-arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\nPrinting 2D array (matrix):");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // 13. Operations on 2D-arrays: calculating the sum of elements
        int matrixSum = 0;
        for (int[] row : matrix) {
            for (int elem : row) {
                matrixSum += elem;
            }
        }
        System.out.println("Sum of all elements in the matrix: " + matrixSum);

        // 14. Operations on 2D-arrays: calculating the largest element
        int matrixMax = matrix[0][0];
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem > matrixMax) {
                    matrixMax = elem;
                }
            }
        }
        System.out.println("Max value in the matrix: " + matrixMax);

        scanner.close();
    }
}