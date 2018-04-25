// Alia Dudkin
// COSC 1430 -501
// Project #6
// Due date: 4/25/2018
// Description: Program that reads integers, one per line, and displays their sum and percentage of contributions.


import java.util.Scanner;

public class PercentageSum {
    // Creates  an instance of Scanner
    Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        // Creates an object 'self'
        PercentageSum self = new PercentageSum();


        // Asks user amount of numbers they will enter
        int amount = self.getAmount("How many numbers will you enter? ");

        // Create an array
        int [] Percentage = new int[amount];

        // Prints out number of integers to be used
        self.println("Enter " + amount + " integers, one per line:");

        // Assign user input to array elements 'amount' times
        for (int i = 0; i < amount; i++) {
            Percentage[i] = self.keyboard.nextInt();
        }

        // Call method 'countPercentage'
        self.countPercentage(Percentage, amount);

    }

    /**
     * method to output 'message'
     * @param message string
     */
    public void print(String message) {
        System.out.print(message);
    }

    /**
     * method to output 'message' as a line
     * @param message string
     */
    public void println(String message) {
        System.out.println(message);
    }

    /**
     * method to read user input and return it as integer
     * @param message string
     * @return integer
     */
    public int getAmount(String message) {
        print(message);
        return keyboard.nextInt();
    }

    /**
     * method to calculate percentage of number in sum
     * @param sum integer
     * @param number integer
     * @return double
     */
    public double countPercent(int sum, int number) {
        return ((double) number / (double) sum) * 100;
    }

    /**
     * method to calculate sum of integers in array
     * @param numbers integer array
     * @param amount integer
     * @return integer
     */
    public int getSum(int [] numbers, int amount) {
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    /**
     * method to print sum and percentage of each element in array
     * @param numbers integer array
     * @param amount integer
     */
    public void countPercentage(int [] numbers, int amount) {
        int sum = getSum(numbers, amount);
        println("The sum is: " + sum);
        for (int i = 0; i < amount; i++) {
            println(numbers[i] + ", which is " + countPercent(sum, numbers[i]) + "% of the sum.");
        }
    }

}
