import java.util.Arrays;

public class Main {

        static int longestPalindrome(String s) {
                // initialize an array of 256 in length for ASCII mapping 
                int[] wordMap = new int[256];
                int total = 0;
                Arrays.fill(wordMap, 0);
                for (int i = 0; i < s.length(); i++) {
                        char c = s.charAt(i);
                        wordMap[c]++;
                        if (wordMap[c] == 2) {
                                total += 2;
                                wordMap[c] = 0;
                        }
                }
                return total + 1 > s.length() ? total : total + 1;
        }

        public static void main(String[] args) {
                String s1 = "abccccdd";
                String s2 = "a";
                String s3 = "ccc";
                System.out.println(longestPalindrome(s1));
                System.out.println(longestPalindrome(s2));
                System.out.println(longestPalindrome(s3));
        };
}
