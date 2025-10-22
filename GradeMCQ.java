import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[][] studentAnswers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},  
            {'C', 'D', 'D', 'A', 'B', 'D'},  
            {'D', 'D', 'A', 'B', 'B', 'A'},  
            {'C', 'A', 'D', 'A', 'B', 'C'}  
        };
        
        System.out.println("Enter the key to the MCQ:");
        String keyInput = input.nextLine();
        char[] key = new char[6];
        
        for (int i = 0; i < 6; i++) {
            key[i] = keyInput.charAt(i * 2); // Skip spaces
        }
        
        for (int i = 0; i < studentAnswers.length; i++) {
            int correctCount = 0;
            
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            
            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.%n", 
                            i, correctCount, result);
        }
        
    }
}