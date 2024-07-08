public class DiceData {
  public static int[][] generateDice(int n){
    int[][] dice = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        dice[i][j] = i + j + 2;
      }
    }
    return dice;
  }

  public static void printDice(int[][] dice){
    for(int i=0; i<dice.length; i++){
      for(int j=0; j<dice[i].length; j++){
        System.out.print(dice[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[] sumRows(int[][] dice){
    int[] rows = new int[dice.length];
    for(int i=0; i<dice.length; i++){
      int sum = 0;
      for(int j=0; j<dice[i].length; j++){
        sum += dice[i][j];
      }
      rows[i] = sum;
    }
    return rows;
  }

  public static int[] sumCols(int[][] dice){
    int[] cols = new int[dice.length];
    for(int i=0; i<dice.length; i++){
      int sum = 0;
      for(int j=0; j<dice[i].length; j++){
        sum += dice[j][i];
      }
      cols[i] = sum;
    }
    return cols;
  }

  public static int sumDice(int[][] dice){
    int sum = 0;
    for(int i=0; i<dice.length; i++){
      for(int j=0; j<dice[i].length; j++){
        sum += dice[i][j];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[][] dice = generateDice(6);
    printDice(dice);

    System.out.println("Rows");
    int[] rowSums = sumRows(dice);
    for(int row : rowSums){
      System.out.println(row);
    }

    System.out.println("Columns");
    int[] colSums = sumCols(dice);
    for(int col : colSums){
      System.out.println(col);
    }
    System.out.println();
  } 
}
