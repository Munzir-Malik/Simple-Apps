import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int tries = 3;
    int userGuess;
    int randomNum = rand.nextInt(10) + 1; //Limit generated random numbers between 1-10

    System.out.println("Welcome to \"Guess The Number Game.\"");
    System.out.println("You should guess a number between 1-10,");
    System.out.println("note that you've three tries if you missed them all you will loose.\n");

    while(tries > 0){ // Continue play the game until 3 wrong tries
      System.out.println("Guess the number.");
      System.out.println( tries + " tries left.");
      userGuess = input.nextInt();

      if(userGuess < 1 || userGuess > 10){ // Check number range [Should be in range 1-10]
        System.out.println("Unvaild number, enter a number between 1-10");
        continue;
      }

      if(userGuess == randomNum) { // Check if the player win or not.
        System.out.println("That's right, the number is: " + randomNum);
        System.out.println("You win!");
        break;
      }
      else if(tries == 1){
        System.out.println("You lose, you didn't guess the number in three times.");
        System.out.println("The number is: " + randomNum);
        break;
      }else { // Track user's guesses
        System.out.println("Wrong guess. Hint: Try a " + (userGuess > randomNum ? "smaller" : "bigger") + " number.\n");
        tries--;
      }
    }

    input.close();
  }
}
