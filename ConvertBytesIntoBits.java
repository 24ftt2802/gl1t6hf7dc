package Practical_3;

import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of byte(s) to be converted: ");
        int bytes = scanner.nextInt();
        int bits = bytes * 8;
        System.out.println(bytes + " byte(s) is " + bits + " bits.");

        System.out.print("Enter the number of byte(s) to be converted: ");
        int bytes2 = scanner.nextInt();
        int bits2 = bytes * 32;
        System.out.println(bytes2 + " byte(s) is " + bits2 + " bits.");
}
}