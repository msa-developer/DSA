// Adjacent swapping takes place in bubbleSort algorithm
// example :- 13, 24, 46, 20, 9, 52
// output should be :
// 9 13 20 24 46 52
// Time Complexity is around O(n^2)
// Example 2 is [1,2,3,4,5,6]
// when array is already sorted then we don't need to run the loop that means we
// can reduce the time complexity of O(n^2) to O(n)
// so hence we use arryIsSorted because if the array is sorted in the first
// iteration only we comes to know
// Remember that for bubbleSort The best time complexity is O(n) and the worst
// time complexity is O(n^2)

public class bubbleSort {
  public static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  public static void bubble(int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
      boolean arrayIsSorted = true;
      for (int j = 0; j < i; j++) {
        if (arr[j + 1] < arr[j]) {
          swap(arr, j, j + 1);
          arrayIsSorted = false;
        }
      }
      if (arrayIsSorted) {
        break;
      }
    }

    for (int n : arr) {
      System.out.println(n);
    }
  }
  public static void main(String[] args) {
    bubble(new int[] {13, 24, 46, 20, 9, 52});
  }
}
