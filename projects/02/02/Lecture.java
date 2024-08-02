public class Lecture {
  public static void main(String[] args) {
    /*
     * So far, we've only worked with ways of storing single values. Let's look at how we can store multiple values together using an array.
     *
     * An array is a collection of a single type. An array has a set size. We can set values into it, but we cannot add or remove values from an array.
     *
     * There are two ways of creating an array. The first requires us to set values in the beginning, while the second allows us to create the space, where we can later store values in them. 
     *
     * Let's look at both of these ways.
     */

    // Create an array of numbers with 10 numbers in the array. Immediately store values into the array.
    int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Create another array of numbers with a size of 10. We can populate this later.
    int[] nums2 = new int[10];

    // Accessing elements in an array
    /*
     * In order to get the elements of the array, we can use square brackets and an index. Indexes start at 0. This means, if we want to get 1 from nums1, we would say nums1[0].
     */

    // Task: Print out the first 3 numbers from nums1
    System.out.println(nums1[0]);
    System.out.println(nums1[1]);
    System.out.println(nums1[2]);
   
    // if we want to know how many values are in an array, we can use the .length property of an array.
    // For example.
    System.out.println(nums1.length);

    // Task: Using a for loop and the length of nums1, print out each number in the array of nums1
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]); 
    }
    
    //// What happens if we try to loop through an array that we haven't set the values of yet?
    //// Task/Experimentation: Try looping through nums2 and print out each number in the array.
    //for (int i = 0; i < nums2.length; i++) {
    // System.out.println(nums2[i]); 
    //}
    //
    //// 

    /*
     * So far, we've been using nums1 where we put in the numbers itself. What if we wanted to populate an array using a for loop? We can do this with nums2.
     */
    // Task: Using a for loop, populate nums2 with the squares of each number counting from 1
    // TODO wording
    for (int i = 0; i < nums2.length; i++) {
      int num = i + 1;
      nums2[i] = num*num;
    }

    // Task: Using a for loop, print out each number in nums2
    for (int i = 0; i < nums2.length; i++) {
      System.out.println(nums2[i]); 
    }

    /*
     * Now, a challenge for you.
     * Task: Create another integer array with a size of 15. 
     * Task: Store 15 random numbers between 1 and 100 into it.
     */

    int[] nums3 = new int[15];
    for(int i=0; i<nums3.length; i++){
      nums3[i] = (int)(Math.random() * 100) + 1;
    }

    // Task: Print out the random numbers after
    for (int i = 0; i < nums3.length; i++) {
      System.out.println(nums3[i]);
    }

    // Task: Last challenge, find the sum of the numbers in the array of random numbers
    int sum = 0;
    for (int i = 0; i < nums3.length; i++) {
      sum += nums3[i]; 
    }
    // Print out the sum after
    System.out.println(sum);

  }
}
