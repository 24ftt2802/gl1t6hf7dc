package Practical_4;

import java.util.Scanner;

public class MathQuiz {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Generate two random numbers between 0 and 100
        int num1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);
        
        int correctSum = num1 + num2;
        int correctModulus = num1 % num2;
        
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int userSum = input.nextInt();
        
        boolean isSumCorrect = (userSum == correctSum);
        System.out.println(userSum + " | = " + isSumCorrect);
        System.out.println(num1 + " + " + num2 + " = " + userSum + " is " + isSumCorrect);
        System.out.println();
        
        System.out.println("What is " + num1 + " % " + num2 + " ?");
        int userModulus = input.nextInt();
        
        boolean isModulusCorrect = (userModulus == correctModulus);
        System.out.println(userModulus + " | = " + isModulusCorrect);
        System.out.println(num1 + " % " + num2 + " = " + userModulus + " is " + isModulusCorrect);
        
        
    }
}
