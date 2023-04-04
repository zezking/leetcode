import java.text.MessageFormat;

public class Main {

        /*
         * The isBadVersion API is defined in the parent class VersionControl.
         * boolean isBadVersion(int version);
         */
        public static void main(String[] args) {

                firstBadVersion(2);
        }

        // This is dummy method.
        static boolean isBadVersion(int n) {
                return true;
        }

        static int firstBadVersion(int n) {
                // Run method in the Leetcode IDE as the isBadVersion API is not properly defined here
                int left = 1;
                int right = n;
                while (left < right) {
                        int mid = left + (right - left) / 2;
                        if (isBadVersion(mid)) {
                                right = mid;
                        } else {
                                mid = left + 1;
                        }
                }
                return left;
        };

}
