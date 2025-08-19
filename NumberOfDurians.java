package Practical_3;

import java.util.Scanner;

public class NumberOfDurians {
    public static void main (String[]args){

    Scanner scanner = new Scanner(System.in);
        
        // Fixed price of durian
        final double DURIAN_PRICE = 15.75;
       
        System.out.println("Each durian cost $" + DURIAN_PRICE);
        System.out.print("How much money do you have? $");
        double money = scanner.nextDouble();
        int numberOfDurians = (int) (money / DURIAN_PRICE);
        System.out.println("The number of durian(s) you can buy is " + numberOfDurians);

       
        System.out.println("Each durian cost $" + DURIAN_PRICE);
        System.out.print("How much money do you have? $");
        double money2 = scanner.nextDouble();
        int numberOfDurians2 = (int) (money2 / DURIAN_PRICE);
        System.out.println("The number of durian(s) you can buy is " + numberOfDurians2);

        
        System.out.println("Each durian cost $" + DURIAN_PRICE);
        System.out.print("How much money do you have? $");
        double money3 = scanner.nextDouble();
        int numberOfDurians3 = (int) (money3 / DURIAN_PRICE);
        System.out.println("The number of durian(s) you can buy is " + numberOfDurians3);


}
}