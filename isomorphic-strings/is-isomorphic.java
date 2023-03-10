import java.util.Map;
import java.util.HashMap;

public class Main {
        static boolean isIsomorphic(String s, String t) {

                Map<String, String> hashMapStoT = new HashMap<String, String>();
                Map<String, String> hashMapTtoS = new HashMap<String, String>();
                for (int i = 0; i < s.length(); i++) {
                        String cS = String.valueOf(s.charAt(i));
                        String cT = String.valueOf(t.charAt(i));
                        if (hashMapStoT.get(cS) == null) {
                                hashMapStoT.put(cS, cT);
                        } else if (!hashMapStoT.get(cS).equals(cT)) {
                                return false;
                        }
                        if (hashMapTtoS.get(cT) == null) {
                                hashMapTtoS.put(cT, cS);
                        } else if (!hashMapTtoS.get(cT).equals(cS)) {
                                return false;
                        }

                }
                return true;
        }

        // Solution 2
        // static boolean isIsomorphic2(String s, String t) {
        //
        // }

        public static void main(String[] args) {
                String s = "egg";
                String t = "add";
                String s2 = "foo";
                String t2 = "bar";
                String s3 = "paper";
                String t3 = "title";
                System.out.println(isIsomorphic(s, t));
                System.out.println(isIsomorphic(s2, t2));
                System.out.println(isIsomorphic(s3, t3));
                // System.out.println(isIsomorphic2(s, t));
                // System.out.println(isIsomorphic2(s2, t2));
                // System.out.println(isIsomorphic2(s3, t3));
        };

}
