class Main {
  public static void printNums(int low, int high){
    System.out.println("Printing numbers between " + low + " and " + high);
    for(int i=low; i<=high; i++){
      System.out.println(i);
    }
  }

  public static int sum(int low, int high){
    System.out.println("This function will calculate the sum of all integers between " + low + " and " + high);
    int total = 0;
    for(int i=low; i<=high; i++){
      total += i;
    }
    return total;
  }

  public static void main(String[] args){
    printNums(5, 10);
    System.out.println();
    System.out.println(sum(5, 10));
  }
}
