import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        
        return maxLength;
    }
}