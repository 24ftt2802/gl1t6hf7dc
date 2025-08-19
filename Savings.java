package Practical_3;

import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        //Constant
        final int DAYS_PER_MONTH = 30;
        
        
        System.out.print("What is your target amount? $");
        double targetAmount = scanner.nextDouble();
        System.out.print("How many month(s) to reach your goal? ");
        int months = scanner.nextInt();
        int totalDays = months * DAYS_PER_MONTH;
        double dailySavings = targetAmount / totalDays;
        System.out.printf("The amount you need to save per day is $%.2f%n", dailySavings);

        
        System.out.print("What is your target amount? $");
        double targetAmount2 = scanner.nextDouble();
        System.out.print("How many month(s) to reach your goal? ");
        int months2 = scanner.nextInt();
        int totalDays2 = months2 * DAYS_PER_MONTH;
        double dailySavings2 = targetAmount2 / totalDays2;
        System.out.printf("The amount you need to save per day is $%.2f%n", dailySavings2);
}
}
