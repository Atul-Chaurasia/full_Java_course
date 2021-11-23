import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur Choice 0 for Rock, 1 for paper, 2 for Scissor : ");
        int userInput = sc.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(3);
                                                // 0 for Rock
        if(userInput == computer)               // 1 for Paper
        {                                       // 2 for Scissor
            System.out.println("...Draw...");
        }
        else if(userInput == 0 && computer == 2 || userInput == 1 && computer == 0 || userInput == 2 && computer == 1)
        {
            System.out.println("...You Win....");
        }
        else{
            System.out.println("...Computer Win...");
        }

        // System.out.println("Computer Choice : "+computer);

        if(computer == 0)
        {
            System.out.println("Computer Choice : Rock");
        }
        else if(computer == 1)
        {
            System.out.println("Computer Choice : Paper");
        }
        else if(computer == 2)
        {
            System.out.println("Computer Choice : Scissor");
        }
    }
}