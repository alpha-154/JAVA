package basics_03;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Array of size 5 with default values (0)
        int[] predefinedNumbers = { 1, 2, 3, 4, 5 }; // Array with initial values

        // Accessing array elements
        System.out.println(numbers[0]); // Output: 0
        System.out.println(predefinedNumbers[2]); // Output: 3

        int[] numbers1 = { 10, 20, 30, 40, 50 };

        // Using a for loop
        for (int i = 0; i < numbers1.length; i++) {

            System.out.println("first loop " + numbers1[i]);
        }

        // Using an enhanced for loop
        for (int num : numbers) {
            System.out.println("second loop " + num);
        }

        int[][] matrix = new int[3][3]; // 3x3 matrix of integers with default values

        int[][] predefinedMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int value = predefinedMatrix[1][2]; // Accesses element at second row, third column (6)

        System.out.println(value);
        System.out.println("predefinedMatrix's length is: " + predefinedMatrix.length);

        for (int i = 0; i < predefinedMatrix.length; i++) {
            for (int j = 0; j < predefinedMatrix[i].length; j++) {
                System.out.print(predefinedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        //Alternative way to print the predefinedMatrix
        for (int[] row : predefinedMatrix){
            for (int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        // Working with Arrays (finding the max & min value in an array)
        int[] arr = { 3, 5, 1, 8, 2 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Working with Arrays (finding the sum & average value in an array)

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        // Jagged Arrays

        System.out.println("------------JaggedArray------------");

        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[3]; // Second row has 3 columns
        jaggedArray[2] = new int[1]; // Third row has 1 column

        for(int i = 0; i < jaggedArray.length; i++){
            for (int j = 0; j < jaggedArray[i].length; j++){
                jaggedArray[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int [] row: jaggedArray){
            for (int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // Multidimensional Arrays Beyond 2D

        int[][][] cube = new int[3][3][3]; // 3x3x3 array (cube)
        cube[0][1][2] = 5; // Example of accessing the third layer

        // Array Utility Methods (from java.util.Arrays)
        int[] nums = { 4, 2, 7, 1 };
        Arrays.sort(nums); // Sorts the array in ascending order

        int index = Arrays.binarySearch(nums, 2); // Searches for element '2' (requires sorted array)
        System.out.println("Index of 2: " + index);

        System.out.println(Arrays.toString(nums)); // Prints the array as a string



        // Interacting with the Class
        System.out.println("------------ Interacting with Classs ------------");

        Student s1 = new Student("Faham", 80);
        Student s2 = new Student("Dmyein", 60);
        Student s3 = new Student("Tarzan", 49);

        Student[] students = new Student[3]; 
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name + ":" + " " + students[i].marks + " " + students[i].isPassed());
        // }

       //Printing values of students with Enhanced For loop
        for(Student s : students){
            System.out.println(s.name + ":" + " " + s.marks + " " + s.isPassed());
        }



        System.out.println("------------------------");
    }
}
