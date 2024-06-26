import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int wins = 0;
    int losses = 0;
    int games = 10;
    for(int i=0; i<games; i++){
      System.out.print("Enter your move: Rock, Paper, or Scissors:");
      String choice = input.next();
      System.out.println();
      int computer = (int)(Math.random() * 3) + 1;
      if(choice.equals("rock")) { // Explain why this must be equals and not ==
        if(computer == 1) {
          System.out.println("You both played rock, tie game!");
        } else if(computer == 2){
          System.out.println("You played rock, the computer played paper. You lose!");
          losses++;
        } else{
          System.out.println("You played rock, the computer played scissors. You win!");
          wins++;
        }
      } else if(choice.equals("paper")) { // Explain why this must be equals and not ==
        if(computer == 1) {
          System.out.println("You played paper, the computer played rock. You win!");
          wins++;
        } else if(computer == 2){
          System.out.println("You both played paper, tie game!");
        } else{
          System.out.println("You played paper, the computer played scissors. You lose!");
          losses++;
        }
      } else if(choice.equals("scissors")) { // Explain why this must be equals and not ==
        if(computer == 1) {
          System.out.println("You played scissors, the computer played rock. You lose!");
          losses++;
        } else if(computer == 2){
          System.out.println("You played scissors, the computer played paper. You win!");
          wins++;
        } else{
          System.out.println("You both played scissors, tie game!");
        }
      }
      System.out.println();
    }
    System.out.println("After " + games + " games, you won " + wins + " games, lost " + losses + " games, and tied " + (games - wins - losses) + " games!");
  }
}
