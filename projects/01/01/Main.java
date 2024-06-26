import java.util.Scanner;

class Main {
  public static void main(String[] args){
    // Introduce each data type one at a time
    String name = "Edward";
    int age = 24;
    double y = 2.2; // TODO Change to something relevant
    boolean isStudent = true;

    // Concatenate and print out the name
    System.out.println("Hello " + name);

    // Print out the age concatenated to the string too.
    System.out.println("Age: " + age);

    // Do the same for the other variables

    // Coin Flip
    int coin = (int)(Math.random() * 2);
    if(coin == 1){
      System.out.println("Heads");
    } else {
      System.out.println("Tails");
    }

    // Dice Guesser
    Scanner input = new Scanner(System.in);
    int dice = (int)(Math.random() * 6) + 1;
    System.out.print("Dice has been rolled, enter your guess: ");
    int guess = input.nextInt();
    if (dice == guess){
      System.out.println("You got it!");
    } else {
      System.out.println("Nope, it was " + dice);
    }

  }
}
