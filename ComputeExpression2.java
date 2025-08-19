package Practical_2;

public class ComputeExpression2 {
    public static void main(String[] args) {
        
        // calculates numerator
        double numerator = 7.5*2.5-1.5*3;
        // calculates denominator
        double denominator = 4-2.5;

        double result = numerator / denominator;
        
        System.out.println("The result of 7.5 x 2.5 - 1.5 x 3");
        System.out.println("              -------------------   is " + result);
        System.out.println("                  4 - 2.5");
    }
}
