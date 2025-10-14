// Insertion sort always takes an element and places it's in it's correct
// position Example : 14,9,15,12,6,8,13
// If you dry run the code you can see that the time complexity will be the sum
// of natural numbers hence the time complexity is O(n^2) in worst case time
// complexity is : O(n^2) in average case also it is :O(n^2) In best case it is
// : O(n) because if in case the array is already sorted like 1,2,3,4,5

public class InsertionSort {

  public static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void Sort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j] < arr[j - 1]) {
        swap(arr, j - 1, j);
        j--;
      }
    }

    for (int n : arr)
      System.out.println(n);
  }

  public static void main(String[] args) {
    Sort(new int[] {14, 9, 15, 12, 6, 8, 13});
  }
}
