import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {

  private ArrayList<Hand> players;
  private Deck deck;
  
  public BlackJack(int count){
    this.players = new ArrayList<Hand>();
    this.deck = new Deck();
    for(int i=0; i<count; i++){
      Hand hand = new Hand();
      for(int j=0; j<2; j++){
        hand.addCard(this.deck.drawCard());
      }
      this.players.add(hand);
    }
  }

  public BlackJack(){
    this(2);
    System.out.println("No player count provided, defaulting to 2 players");
  }

  public boolean playable(){
    for(int i=0; i<this.players.size(); i++){
      if(this.players.get(i).getCanPlay()){
        return true;
      }
    }
    return false;
  }

  public void findWinner(){
    int max = 0;
    int winnerIndex = -1;
    for(int i=0; i<this.players.size(); i++){
      if(this.players.get(i).getHandValue() > max && this.players.get(i).getHandValue() <= 21){
        max = this.players.get(i).getHandValue();
        winnerIndex = i;
      }
    }
    if(winnerIndex > -1){
      System.out.println("Player " + (winnerIndex + 1) + " won!");
    } else {
      System.out.println("No winner!");
    }
  }

  public void play(){
    Scanner input = new Scanner(System.in);
    for(int turn=0; turn<this.players.size(); turn++){
      Hand current = this.players.get(turn);
      while(current.getCanPlay()){
        System.out.println(current);
        System.out.print("Player " + (turn + 1) + ": Hit or stay? ");
        String choice = input.next();
        if(choice.equalsIgnoreCase("hit")){
          current.addCard(this.deck.drawCard());
          if(current.getHandValue() > 21){
            current.setCanPlay(false);
          }
        } else if(choice.equalsIgnoreCase("stay")){
            current.setCanPlay(false);
        }
      }
      System.out.print("\033[H\033[2J");  // Clears console
      System.out.flush(); 
    }
    this.findWinner();
  }

  public static void main(String[] args) {
    BlackJack game = new BlackJack(2);
    game.play();
  }
}
