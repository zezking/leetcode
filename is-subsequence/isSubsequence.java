import java.util.ArrayList;

public class Main {
        static boolean isSubsequence(String s, String t) {
                // Assume s length is shorter than t
                int leftBound = s.length(), rightBound = t.length();
                int pointerLeft = 0, pointerRight = 0;
                while (pointerLeft < leftBound && pointerRight<rightBound) {

                        if (s.charAt(pointerLeft) == t.charAt(pointerRight)) {
                                pointerLeft += 1;
                        }

                        pointerRight += 1;
                }
                
                return pointerLeft == leftBound;
        }

        public static void main(String[] args) {
                String s = "abc";
                String t = "ahbgdc";
                String s2 = "axc";
                String t2 = "ahbgdc";
                String s3 = "acb";
                String t3 = "ahbgdc";
                System.out.println(isSubsequence(s, t));
                System.out.println(isSubsequence(s2, t2));
                System.out.println(isSubsequence(s3, t3));
                System.out.println(isSubsequence2(s, t));
                System.out.println(isSubsequence2(s2, t2));
        };

}
