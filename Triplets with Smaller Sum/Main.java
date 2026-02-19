/**
 * Main
 */
public class Main {

  public static long solution(int n, int sum, long arr[]) {
    long smallestSum = (arr[0] + arr[1] + arr[2]);
    int k = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        long store = (arr[i] + arr[j] + arr[k]);
        if (smallestSum > store) {
          smallestSum = store;
        }
      }
    }
    return smallestSum;
  }

  public static void main(String[] args) {
    long result = solution(4, 2, new long[] { -2, 0, 1, 3 });
    System.out.println(result);
  }
}
