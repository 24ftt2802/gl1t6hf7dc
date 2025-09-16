package Practical_6;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int computer = (int)(Math.random()*1000 %3);

        System.out.println("Enter rock(0), paper (1), scissor (2) ");
        int user = input.nextInt();

        String computerStr ="";
        if (computer==0)   computerStr = "rock";
            if (computer==1)   computerStr = "paper";
                if (computer==2)  computerStr = "scissor";
                    

        String userStr = "";
        if (user==0)   userStr = "rock";
            if (user==1)   userStr = "paper";
                if (user==2)  userStr = "scissor";
                    

        String result = "";
        if (user==0 && computer==0)   result = "It is a draw.";
            if (user==1 && computer==1)   result = "It is a draw.";
                if (user==2 && computer==2)  result = "It is a draw.";
                    

        if (user==0 && computer==2)   result = "You win.";
            if (user==1 && computer==0)   result = "You win.";
                if (user==2 && computer==1)  result = "You win.";
                    

        if (user==0 && computer==1)   result = "You lose.";
            if (user==1 && computer==2)   result = "You lose.";
                if (user==2 && computer==0)  result = "You lose.";
                    

        System.out.println("the computer is "+computerStr+" . You are "+userStr+". "+result);
    }
}
