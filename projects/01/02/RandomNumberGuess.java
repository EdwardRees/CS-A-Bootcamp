import java.util.Scanner;

class Main {
  public static void main(String[] args){
    int gamesPlayed = 1;
    boolean playAgain = true;
    while(playAgain){
      int number = (int)(Math.random() * 100) + 1;
      int guess = 0;
      int guesses = 0;
      // Include this later
      int high = 100;
      int low = 1;
      Scanner input = new Scanner(System.in);
      while (number != guess){
        // Start without high and low
        System.out.print("Enter your guess between " + low + " and " + high + ": ");
        guess = input.nextInt();
        if(number > guess){
          System.out.println("Your guess is too low!");
          low = guess;
        } else if(number < guess){
          System.out.println("Your guess is too high!");
          high = guess;
        } else {
          System.out.println("You got it!");
        }
        guesses = guesses + 1;
        // Can show guesses += 1; then later show guesses++;
      }
      System.out.println("It took you " + guesses + " guesses");
      System.out.print("Would you like to play again? [yes] to play again and [no] to stop. ");
      String choice = input.next();
      if(choice.equals("yes")){
        gamesPlayed++; // explain this is the same as gamesPlayed += 1;
        continue;
      } else if(choice.equals("no")) {
        playAgain = false;
        break;
      } else {
        System.out.println("Invalid input, enter [yes] or [no] to continue.");
        while(!(choice.equals("yes") && choice.equals("no"))){
          System.out.print("Would you like to play again? [yes] to play again and [no] to stop. ");
          choice = input.next();
          if(choice.equals("yes")){
            gamesPlayed++; // explain this is the same as gamesPlayed += 1;
            continue;
          } else if(choice.equals("no")) {
            playAgain = false;
            break;
          }
        }
      }
    }
    System.out.println("You played " + gamesPlayed + " games");
  }
}
