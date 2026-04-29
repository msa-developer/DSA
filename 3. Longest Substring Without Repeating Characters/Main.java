import java.util.HashMap;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int maxLen = Integer.MIN_VALUE;
    int low = 0;
    int high = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    while (high < s.length()) {
      char ch = s.charAt(high);
      map.put(ch, map.getOrDefault(ch, 0) + 1);
      while (map.get(ch) > 1) {
        char chlow = s.charAt(low);
        map.put(chlow, map.get(chlow) - 1);
        if (map.get(chlow) == 0)
          map.remove(chlow);
        low++;
      }
      maxLen = Math.max(maxLen, high - low + 1);
      high++;
    }
    return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
  }
}
