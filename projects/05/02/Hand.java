import java.util.ArrayList;  

public class Hand {
  private ArrayList<Card> cards;
  private boolean canPlay;

  public Hand(){
    this.cards = new ArrayList<>();
    this.canPlay = true;
  }

  public void addCard(Card card){
    this.cards.add(card);
  }

  public void setCanPlay(boolean canPlay){
    this.canPlay = canPlay;
  }

  public boolean getCanPlay(){
    return this.canPlay;
  }

  public int getHandValue(){
    int total = 0;
    for(int i=0; i<this.cards.size(); i++){
      total += this.cards.get(i).getCardValue();
    }
    return total;
  }

  @Override
  public String toString(){
    StringBuilder str = new StringBuilder();
    for(Card card : this.cards){
      str.append(card.toString());
      str.append(",");
    }
    str.deleteCharAt(str.length() - 1); // delete the last ,
    return str.toString();
  }
}
