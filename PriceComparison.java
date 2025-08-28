package Practical_4;

import java.util.Scanner;

public class PriceComparison {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the price of the 1st package: $");
        double price1 = input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        double weight1 = input.nextDouble();
        
        System.out.println();
        
        System.out.print("Enter the price of the 2nd package: $");
        double price2 = input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        double weight2 = input.nextDouble();
        
        System.out.println();
        
        // Calculate price per gram for both packages
        double value1 = weight1 / price1;  
        double value2 = weight2 / price2;  
        
        // Determine which package offers better value
        String result = (value1 > value2) ? "1st" : "2nd";
        
        System.out.println("It is worth more to buy the " + result + " package");
        
        
    }
}
