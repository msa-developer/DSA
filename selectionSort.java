// Example : 13 46 24 52 20 9
// The output should be :
// 9
// 13
// 20
// 24
// 46
// 52
// In Selection Sort We Select Minimum Element Of The Array And Then Sort
// The Time Complexity Is Near About O(n^2)

public class selectionSort {

  public static void sort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[j] < arr[index])
          index = j;
      }
      int temp = arr[index];
      arr[index] = arr[i];
      arr[i] = temp;
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    sort(new int[] {13, 46, 24, 52, 20, 9});
  }
}
