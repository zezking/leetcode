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
                System.out.println(calculateTime(keyboard1, word1));
                System.out.println(calculateTime(keyboard2, word2));
        }

        // brute force solution
        static int calculateTime(String keyboard, String word) {
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

}
