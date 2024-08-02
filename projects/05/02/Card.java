public class Card {
 
  private String suit;
  private String value;

  public Card(String suit, String value){
    this.suit = suit;
    this.value = value;
  }

  public String getSuit() {
      return suit;
  }

  public String getValue() {
      return value;
  }

  public void setSuit(String suit) {
      this.suit = suit;
  }

  public void setValue(String value) {
      this.value = value;
  }

  @Override
  public String toString() {
      return this.suit + this.value;
  }

  public boolean isAce(){
    return this.value == "A";
  }

  public int getCardValue(){
    if(this.value == "A"){
      return 11;
    }
    else if(this.value == "K" || this.value == "Q" || this.value == "J"){
      return 10;
    }
    else {
      return Integer.parseInt(this.value);
    }
    // Can also use switch statement
    /*
      switch(this.value){
      case "A":
        return 11;
        case "K":
        case "Q":
        case "J":
        return 10;
        default:
        return Integer.parseInt(this.value);
      } 
     */
  }

}
