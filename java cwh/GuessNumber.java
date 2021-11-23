import java.util.Random;
import java.util.Scanner;

class Game 
{
    public int number;
    public int userInput;
    public int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;

        if(userInput == number){
            System.out.format("Yes you guessed it Right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(userInput<number){
            System.out.println("Too Low...");
        }
        else if(userInput>number){
            System.out.println("Too High...");
        }
        return false;
    }
}
public class GuessNumber{

    public static void main(String[] args) 
    {
        Game g1 = new Game();
        boolean b = false;
        while(!b){
            g1.takeUserInput();
            g1.isCorrectNumber();
        }
    }
}

