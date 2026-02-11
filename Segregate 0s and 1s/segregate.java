/**
 * segregate
 */
public class segregate {

  public static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void answer(int arr[]) {
    int i = 0;
    int j = 1;
    while (j < arr.length) {
      if (arr[j] == 0 && arr[i] == 0) {
        j++;
        i++;
      } else if (arr[j] == 1 && arr[i] == 0) {
        j++;
        i++;
      } else if (arr[i] == 1 && arr[j] == 1) {
        j++;
      } else if (arr[j] == 0 && arr[i] == 1) {
        swap(arr, i, j);
      }
    }

    // printing resultant array
    for (int j2 = 0; j2 < arr.length; j2++) {
      System.out.println(arr[j2]);
    }
  }

  public static void main(String[] args) {
    answer(new int[] { 0, 0, 1, 1, 0 });
  }
}
