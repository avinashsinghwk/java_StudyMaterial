package Practice_Problem_CWH;
import java.util.Random;
import java.util.Scanner;

class game
{
    Random R = new Random();
    Scanner S = new Scanner(System.in);
    private int rand, userInput, no_Guess = 0;
    public game()
    {
        this.rand = R.nextInt(0, 101);
    }
    public void userInput()
    {
        System.out.print("Enter a number : ");
        this.userInput = S.nextInt();
        if(userInput > 100 || userInput < 0)
        {
            System.out.println("Choose a number between 0 to 100");
            userInput();
        }
        else
        {
            this.no_Guess++;
            isCorrectNumber();
        }
    }
    public void isCorrectNumber()
    {
        if(rand == userInput)
        {
            System.out.println("You Guessed right in " + no_Guess + " times");
        }
        else if (rand > userInput)
        {
            System.out.println("The correct no. is greater than " + userInput);
            userInput();
        }
        else
        {
            System.out.println("The correct no. is less than " + userInput);
            userInput();
        }  
    }
    
}
public class Ex_3_Lec_43_Guess_The_Number {
    public static void main(String[] args) {
        // Create a class game, which allows a user to play "Guess the Number" game once. Game should have the following methods.
        // 1. Constructor to generate the random number
        // 2. TakeUserInput() to take a user input of number
        // 3. isCorrectNumber() to detect the number entered by the user is true
        // 4. Use properties such as No.Of.guesses(int), etc to get this task done
        // 5. Getters and Setters for no. of guesses

        System.out.println(".......Guess The Number........");
        game play = new game();
        play.userInput();

    }
    
}
