import java.util.Scanner;

class Main {

  // Practice writing functions
  public static int getRow(Scanner input){
    while(true){
      System.out.print("Enter your row: ")
      int row = input.nextInt();
      if(row < 0 || row > 2){
        System.out.println("Invalid row!")
      } else {
        return row;
      }
    }
  }

  public static int getCol(Scanner input){
    while(true){
      System.out.print("Enter your column: ");
      int col = input.nextInt();
      if(col < 0 || col > 2){
        System.out.println("Invalid column!");
      } else {
        return col;
      }
    }
  }

  public static boolean isValid(char[][] board, int row, int col){
    return board[row][col] == '_';
  }

  public static boolean hasHorizontalWin(char[][] board){
    for(int i=0; i<3; i++){
      if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '_'){
        return true;
      }
    }
    return false;
  }
  public static boolean hasVerticalWin(char[][] board){
    for(int i=0; i<3; i++){
      if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '_'){
        return true;
      }
    }
    return false;
  }

  public static boolean hasDiagonalWin(char[][] board){
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '_') {
      return true;
    }
    else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '_') {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    char[][] board = new char[3][3];
    char[] players = {'X', 'O'};
   
    // Setup board
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board[i].length; j++){
        board[i][j] = '_';
      }
    }

    for(let turn = 0; turn < 9; turn++){
      System.out.println("Player " + (turn % 2) + 1 + "turn");
      int row = getRow(input);
      int col = getCol(input);
      while(!isValid(board, row, col)){
        System.out.println("Invalid location!");
        row = getRow(input);
        col = getCol(input);
      }
      board[row][col] = players[turn % 2];
      if(hasHorizontalWin(board) || hasVerticalWin(board) || hasDiagonalWin(board)){
        System.out.println("Player " + ((turn % 2) + 1) + " won!");
        break;
      }
    }


  }
}
