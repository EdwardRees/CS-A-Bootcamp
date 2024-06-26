import java.util.Scanner;

class Main {

  public static String[] words = {"hello", "world", "computer", "monitor", "tablet", "mouse", "keyboard"};

  public static String getWord(String[] words) {
    int index = (int)(Math.random() * words.length);
    return words[index];
  }

  public static String[] hideWord(String word){
    String[] hidden = new String[word.length()];
    for(int i=0; i<word.length(); i++){
      hidden[i] = "_"; 
    }
    return hidden;
  }

  public static String stringify(String[] hidden){
    String hiddenWord = "";
    for(int i=0; i<hidden.length; i++){
      hiddenWord += hidden[i];
    }
    return hiddenWord;
  }

  public static boolean letterFound(String word, String letter){
    return word.contains(letter);
  }

  public static void replaceFound(String word, String[] hidden, String letter) {
    for(int i=0; i<hidden.length; i++){
      if(letter.equals("" + word.charAt(i))) {
        hidden[i] = letter;
      }
    }
  }

  public static void printHidden(String[] hidden){
    for(int i=0; i<hidden.length; i++){
      System.out.print(hidden[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String word = getWord(words);
    String[] hidden = hideWord(word);

    int guessLimit = 10;

    String hiddenWord = stringify(hidden);

    while(!(word.equalsIgnoreCase(hiddenWord))){
      printHidden(hidden);
      System.out.print("Guess your letter: ");
      String guess = input.next();
      if(letterFound(word, guess)) {
        replaceFound(word, hidden, guess);
      } else {
        System.out.println(guess + " was not found in the word!");
        guessLimit--;
      }
      hiddenWord = stringify(hidden);
      if(guessLimit == 0){
        System.out.println("Out of guesses!");
        break;
      }
    }
    System.out.println("The word was: " + word);
  }
}
