package Practical_3;

import java.util.Scanner;

public class CharacterToUnicode {
     public static void main (String[]args){


        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int unicodeValue = character;
        System.out.println("The Unicode for character " + character + " is " + unicodeValue);

        System.out.print("Enter a character: ");
        char character2 = scanner.next().charAt(0);
        int unicodeValue2 = character2;
        System.out.println("The Unicode for character " + character2 + " is " + unicodeValue2);

        System.out.print("Enter a character: ");
        char character3 = scanner.next().charAt(0);
        int unicodeValue3 = character3;
        System.out.println("The Unicode for character " + character3 + " is " + unicodeValue3);
}
}