/**
 * Main
 */
public class Main {

  public static int solution(int arr[], int target) {
    int nearestSum = arr[0] + arr[1] + arr[2];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          if (Math.abs((sum - target)) < Math.abs((nearestSum - target))) {
            nearestSum = sum;
          }
        }
      }
    }
    return nearestSum;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[] { -1, 2, 1, -4 }, 1));
  }
}
