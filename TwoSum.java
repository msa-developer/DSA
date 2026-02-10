
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
