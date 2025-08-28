package Practical_4;

import java.util.Scanner;

public class ReverseOfInteger {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();
        
        // Extract each digit using modulo and division operations
        int hundreds = number / 100;        // Extract hundreds digit
        int tens = (number / 10) % 10;      // Extract tens digit
        int units = number % 10;            // Extract units digit
        
        // Form the reverse number
        int reverse = (units * 100) + (tens * 10) + hundreds;
        
        System.out.println("The reverse of " + number + " is " + reverse);
        
        
    }
}
