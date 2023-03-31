import java.math.*;

public class Main {

        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        // a b c
        // first index
        // index step
        // 0 3
        // 3 1
        // 1 2
        // 0 1
        public static void main(String[] args) {

                String keyboard1 = "abcdefghijklmnopqrstuvwxyz", word1 = "cba";
                String keyboard2 = "pqrstuvwxyzabcdefghijklmno", word2 = "leetcode";
                System.out.println(calculateTime1(keyboard1, word1));
                System.out.println(calculateTime1(keyboard2, word2));
                System.out.println(calculateTime2(keyboard1, word1));
                System.out.println(calculateTime2(keyboard2, word2));
        }

        // brute force solution
        // time o(n^2)
        // space o(1)
        static int calculateTime1(String keyboard, String word) {
                int prev = 0;
                int steps = 0;
                for (int i = 0; i < word.length(); i++) {
                        for (int j = 0; j < keyboard.length(); j++) {
                                if (word.charAt(i) == keyboard.charAt(j)) {
                                        steps += Math.abs(prev - j);
                                        prev = j;
                                }
                        }
                }
                return steps;
        };

        static int calculateTime2(String keyboard, String word) {
                int prev = 0;
                int steps = 0;
                int[] keyboardHashMap = new int[26];
                // map the keyboard
                for (int i = 0; i < keyboard.length(); i++) {
                        keyboardHashMap[keyboard.charAt(i) - 'a'] = i;
                }

                for (char c : word.toCharArray()) {
                        steps += Math.abs(prev - keyboardHashMap[c - 'a']);
                        prev = keyboardHashMap[c - 'a'];
                }

                return steps;

        }
}
