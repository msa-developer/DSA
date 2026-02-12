import java.util.Arrays;

/**
 * Main
 */
public class Main {

  public static int[] solution(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) Math.pow(nums[i], 2);
    }
    Arrays.sort(nums);
    return nums;
  }

  public static void main(String[] args) {
    int arr[] = solution(new int[] { -4, -1, 0, 3, 10 });
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
