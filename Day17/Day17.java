import java.util.*;

class Day17 {
    public static void main(String[] args) {
        String str = "abcabcdabc";
        boolean[] seen = new boolean[256];
        int left = 0, max_len = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);

            while (seen[c]) {
                seen[str.charAt(left)] = false;
                left++;
            }

            seen[c] = true;
            max_len = Math.max(max_len, right - left + 1);
        }

        System.out.println("Length of longest substring without duplicates: " + max_len);
    }
}
