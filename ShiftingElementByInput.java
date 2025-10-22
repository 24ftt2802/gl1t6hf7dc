import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        
        // Ask user for the number of numbers
        System.out.println("How many numbers are there?");
        int count = input.nextInt();
        
        // Create array and capture numbers
        int[] numbers = new int[count];
        System.out.println("Enter the " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
        }
        
        // Ask user for number of left shifts
        System.out.println("Enter number of left shift:");
        int shift = input.nextInt();
        
        // Perform left shift
        for (int i = 0; i < shift; i++) {
            int temp = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = temp;
        }
        
        // Output the shifted arrangement
        System.out.print("The shifted arrangement is:\n");
        for (int number : numbers) {
            System.out.print(number);
        }
        
    }
}