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

/*
 * What this code does:
 * Imagine you have a list of numbers and a target number. You need to pick any
 * 3 numbers from your list, add them up, and find which total gets closest to
 * your target.
 * How it works:
 * 
 * Start with a guess — Take the first 3 numbers, add them, and pretend that's
 * your answer for now.
 * Try every possible combo — Use 3 loops to pick every unique group of 3
 * numbers (no repeats, no same number twice).
 * Check if it's better — For each group, see how far their sum is from the
 * target. If it's closer than your current best guess, update your guess.
 * Return the winner — After checking all groups, give back the closest sum you
 * found.
 * 
 * Why Math.abs matters:
 * Without it, -5 looks smaller than 3. But distance is always positive — both
 * -5 and 5 are 5 units away. Math.abs turns everything positive so you compare
 * correctly.
 */
