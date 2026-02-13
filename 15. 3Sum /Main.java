import java.util.*;

/**
 * Main
 */
public class Main {

  public static List<List<Integer>> BruteForceSolution(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int sum = nums[i] + nums[j] + nums[k];
          if (sum == 0) {
            List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
            Collections.sort(triplet);
            result.add(triplet);
          }
        }
      }
    }
    return new ArrayList<>(result);
  }

  public static void main(String[] args) {
    System.out.println(BruteForceSolution(new int[] { -1, 0, 1, 2, -1, -4 }));
  }
}
