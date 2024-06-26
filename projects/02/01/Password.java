class Main {

  public static String generate(int length){
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String upper = lower.toUpperCase(); // First string function
    String digits = "0123456789";

    String password = "";
    int type;
    int index;
    for(int i=0; i<length; i++){
      type = (int)(Math.random() * 3) + 1;
      if(type == 1){
        index = (int)(Math.random() * lower.length()); // length of string
        password += lower.charAt(index);
      } else if(type == 2){
        index = (int)(Math.random() * upper.length()); // length of string
        password += upper.charAt(index);
      } else {
        index = (int)(Math.random() * digits.length());
        password += digits.charAt(index);
      }
    }
    return password;
  }

  public static boolean valid(String password){
    if(password.length() < 8){
      return false;
    }

    if(password.equals("password")){
      return false;
    }

    if(password.equalsIgnoreCase("password")){ // change above statement to this to show the difference between equals and equalsIgnoreCase
      return false;
    }

    boolean containsUpper = false;
    boolean containsLower = false;
    boolean containsDigit = false;

    for(int i=0; i<password.length(); i++){
      if(Character.isLowerCase(password.charAt(i))){
        containsLower = true;
      } else if(Character.isUpperCase(password.charAt(i))) {
        containsUpper = true;
      } else if(Character.isDigit(password.charAt(i))){
        containsDigit = true;
      }
      if(containsLower && containsUpper && containsDigit) {
        break; // could early return too, just change bottom return to return false then
      }
    }
    return containsUpper && containsLower && containsDigit; // and statement in java
  }

  public static void main(String[] args){
    String password = generate(10);
    System.out.println(password);
    if(!valid(password)){
      System.out.println("Invalid password! Regenerate it!");
    } else {
      System.out.println("Valid password!");
    }
  }
}
