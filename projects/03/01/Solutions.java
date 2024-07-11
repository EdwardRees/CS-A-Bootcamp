public class Solutions {
  public static int[] problem1() {
    int[] nums = new int[100];
    for(int i=0; i<100; i++){
      nums[i] = (int)(Math.random() * 10000) + 1;
    }
    return nums;
  }

  public static int problem2(int[] nums){
    int largest = nums[0];
    for(int i=0; i<nums.length; i++){
      if(largest < nums[i]){
        largest = nums[i];
      }
    }
    return largest;
  }

  public static boolean problem3(String str) {
    int s = 0;
    int e = str.length() - 1;
    while(s < e){
      if(str.charAt(s) != str.charAt(e)){
        return false;
      }
      s++;
      e--;
    }
    return true;
  }

  public static int problem4(String str, char chr) {
    int count = 0;
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i) == chr){
        count++;
      }
    }
    return count;
  }

  public static int problem5(){
    int sum = 0;
    for(int i=0; i<=10000; i++){
      if(i % 3 == 0 || i % 5 == 0){
        sum += i;
      }
    }
    return sum;
  }

  public static String problem6(String[] words) {
    String longestWord = "";
    for(String word : words){
      if(longestWord.length() < word.length()){
        longestWord = word;
      }
    }
    return longestWord;
  }

  public static void main(String[] args) {
    System.out.println(problem3("racecar"));
    System.out.println(problem3("racecars"));
    
    System.out.println(problem4("hello", 'l'));
    System.out.println(problem5());
  }
}
