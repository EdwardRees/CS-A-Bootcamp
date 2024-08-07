public class Lecture {
  public static void main(String[] args) {
    /*
     * Yesterday we talked about creating an array to keep track of more than one piece of data. WHat if we wanted to keep track of data that may need rows and columns? For example, if we wanted to create a table of data, we may need more than a single dimension of an array. This is where a 2D array comes in!
     *
     * We can add another pair of square brackets to generate a 2D Array.
     *
     * Let's create a 2D Array of integers that follow a 5x5 grid, containing the following sequence:
     *
     *      1     2     3     4     5 
     *      6     7     8     9     10
     *      11    12    13    14    15
     *      16    17    18    19    20
     *      21    22    23    24    25
     */

    // Task: Create a 2D Array by adding an additional pair of brackets after the type, such as int[][], then set the variable to a new int[5][5]. This allows us to have 5 rows and 5 columns.
    int[][] nums = new int[5][5];

    // Task: Next, create a count variable and set it to 1.
    int count = 1;

    // Given we will work with rows and columns, we need a nested for loop. The outer for loop should go up to nums.length
    for (int row = 0; row < nums.length; row++) {
      // In the inner for loop, go to nums[row].length as this will give us the length of the row, effectively giving us the length of columns.
      for(int col=0; col < nums[row].length; col++){
        // Next, store the count into the row and column. This is done similar to a 1D array, using square brackets. But instead of only doing one set of square brackets, we do two. 
        // This will look like nums[row][col] and set that to the count.
        nums[row][col] = count;

        // Now, increment the count so it goes up by 1 each time.
        count++;
      }
    }

    // If we print out the variable, we won't be able to see the values in the array. Therefore, we will do another nested for loop, looping through the rows and columns, and printing out each value.
    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[row].length; col++) {
        // Since we don't want a new line after each value, we will use a System.out.print and add a space after each value.
        System.out.print(nums[row][col] + " "); 
      }
      // After the inner loop finishes, we will print a new line to show the next row. This prevents the data from printing as one continuous line.
      System.out.println();
    }

    // If we want to change a value in the 2D Array, we would do so just like how we set the value.
    nums[0][0] = 5;

    for (int row = 0; row < nums.length; row++) {
      for (int col = 0; col < nums[row].length; col++) {
        System.out.print(nums[row][col] + " "); 
      }
      System.out.println();
    }

    // Notice that once we change nums[0][0] to 5, we get 5 as the first value. This is because our indexes still start at 0. Row 0 and Column 0 associate with the first row and the first column.
    // Just like with a regular 1D Array, we can only set values in a 2D Array. We cannot add or remove values, but set them to a specific value.
  }
}
