import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for 10 numbers
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        
        // Eliminate duplicates by setting duplicates to 0
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] != 0) {
                    numbers[j] = 0;
                }
            }
        }
        
        // Sort the array
        Arrays.sort(numbers);
        
        // Output distinct numbers (skip zeros)
        System.out.print("The distinct numbers are: ");
        for (int number : numbers) {
            if (number != 0) {
                System.out.print(number + " ");
            }
        }
        
        
    }
}