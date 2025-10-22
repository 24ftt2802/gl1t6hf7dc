import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create array with numbers 0-9 and shuffle once
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Shuffle the array once
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int)(Math.random() * numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
        
        int chances = 10;
        boolean won = false;
        
        while (chances > 0 && !won) {
            System.out.println("Guess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }
            
            // Count correct guesses
            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }
            
            // Check if user won
            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
            } else {
                chances--;
                if (chances > 0) {
                    System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
                } else {
                    System.out.println("The actual number is " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + ". You lose.");
                }
            }
        }
        
       
    }
}
