package Practical_5;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your message: ");
        String message = input.nextLine();


        System.out.print("Enter the substring to replace: ");
        String substring = input.nextLine();

        System.out.print("Enter replacement string: ");
        String replacement = input.nextLine();

        System.out.println("The updated message is: \n"+message.replaceFirst(substring, replacement));
        



    }
}
