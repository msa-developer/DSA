
/**
 * TwoSum
 */

public class TwoSum {
  public static int[] pointerAppTwo(int[] arr, int target) {
    int i = 0;
    int j = arr.length - 1;
    int sum = 0;

    while (i < j) {
      sum = arr[i] + arr[j];

      if (sum > target) {
        j--;
      } else if (sum < target) {
        i++;
      } else if (sum == target) {
        return new int[] { (i + 1), (j + 1) };
      }
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    pointerAppTwo(new int[] { 2, 3, 4 }, 6);
  }
}

// Step-by-Step Explanation:
// 1. Place pointer i at the start and pointer j at the end of the array.
// 2. Calculate sum = numbers[i] + numbers[j].
// 3. If sum > target → move j left (j--).
// 4. If sum < target → move i right (i++).
// 5. If sum == target → solution found.
// 6. Return the indices as [i + 1, j + 1] (1-based indexing as required).
