public class Main {

  public static int maxSumSubArr(int arr[], int k) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    int low = 0;
    int high = k - 1;
    for (int i = low; i <= high; i++) {
      sum = sum + arr[i];
    }
    while (high < arr.length) {
      maxSum = Math.max(sum, maxSum);
      low++;
      high++;
      if (high < arr.length)
        sum = sum - arr[low - 1] + arr[high];
    }
    return maxSum;
  }

  public static void main(String[] args) {
    System.out.println(maxSumSubArr(new int[] { 100, 200, 300, 400 }, 2));
  }
}
