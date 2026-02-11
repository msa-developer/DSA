/**
 * segregate
 */
public class segregate {

  public static void answer(int arr[]) {
    int i = 0;
    int j = 1;
    while (j < arr.length) {
      if (arr[j] == 0 && arr[i] == 0) {
        j++;
        i++;
      } else if (arr[j] == 1 && arr[i] == 0) {
        j++;
        i++;
      } else if (arr[i] == 1 && arr[j] == 1) {
        j++;
      } else if (arr[j] == 0 && arr[i] == 1) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    // printing resultant array
    for (int j2 = 0; j2 < arr.length; j2++) {
      System.out.println(arr[j2]);
    }
  }

  public static void main(String[] args) {
    answer(new int[] { 0, 0, 1, 1, 0 });
  }
}

/*
 * Step 1: Initialize two pointers
 * - i = 0 tracks where the next 0 should be placed
 * - j = 1 scans through the array to find 0s
 * 
 * Step 2: Loop through array with while (j < arr.length)
 * 
 * Case 1: arr[j] == 0 && arr[i] == 0
 * - Both pointers at 0, already correct
 * - Move both i++ and j++
 * 
 * Case 2: arr[j] == 1 && arr[i] == 0
 * - Correct order (0 left, 1 right)
 * - Move both i++ and j++
 * 
 * Case 3: arr[i] == 1 && arr[j] == 1
 * - Both are 1s, need to find a 0 first
 * - Only move j++ to keep searching
 * 
 * Case 4: arr[j] == 0 && arr[i] == 1
 * - WRONG order found! 1 is before 0
 * - SWAP arr[i] and arr[j]
 * - This pushes 0 to left and 1 to right
 * 
 * Step 3: Print the final segregated array
 * 
 * Time Complexity: O(n) - single pass
 * Space Complexity: O(1) - in-place swaps
 */
