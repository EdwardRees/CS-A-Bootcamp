import java.util.ArrayList;

public class Deck {
  private ArrayList<Card> cards; // When we declare the ArrayList, we must declare what type of values will be in the ArrayList. These cannot be primitives, and if we want to use primitive values, we must use what's called a Wrapper type. This just means int -> Integer. boolean --> Boolean. 

  public Deck(){
    // NOTE: An ArrayList works like an array, BUT we can add values into it. We can also delete values from an ArrayList. This is important for our deck as we can then add Cards and remove Cards from the deck itself.
    this.cards = new ArrayList<Card>(); // optional <Card>, can just be <> but not sure what AP Standard is, so we'll stick with pre-Java 8 templates (I think?)
    this.generateDeck();
  }

  public void generateDeck(){
    String[] suits = { "♣️", "♠️", "♦️", "♥️" };
    String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    for(int i=0; i<suits.length; i++){
      for(int j=0; j<values.length; j++){
        this.cards.add(new Card(suits[i], values[j]));
      }
    }
    // NOTE: Regular for loop above, may be good to introduce enhanced-for loops too? But could add a layer of complexity that may be too extra...
    //for(String suit : suits){
    //  for(String value : values){
    //    this.cards.add(new Card(suit, value));
    //  }
    //}
  }

  public int size(){
    return this.cards.size();
  }

  public void shuffle(){
    for(int i=0; i<this.cards.size(); i++){
      int idx = (int)(Math.random() * this.cards.size());
      int swappedIdx = (int)(Math.random() * this.cards.size());
      Card temp = this.cards.get(idx);
      Card swappedCard = this.cards.get(swappedIdx);
      this.cards.set(idx, swappedCard);
      this.cards.set(swappedIdx, temp);
    }
  }

  public Card drawCard(){
    return this.cards.remove(0);
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder(); // Introduce string builder and why stringbuilder is better than concatenating strings to infinity
    for(Card card : this.cards){ // Good time to use enhanced for loop, again, can be replaced with regular for loop
      str.append(card.toString());
      str.append(",");
    }
    str.deleteCharAt(str.length() - 1); // delete the last ,
    return str.toString();
  }

}
