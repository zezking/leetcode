import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
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
        static boolean isIsomorphic2(String s, String t) {

                int[] mappingDictStoT = new int[256];
                Arrays.fill(mappingDictStoT, -1);

                int[] mappingDictTtoS = new int[256];
                Arrays.fill(mappingDictTtoS, -1);

                for (int i = 0; i < s.length(); ++i) {
                        char c1 = s.charAt(i);
                        char c2 = t.charAt(i);

                        //Use ASCII code to create mapping
                        // Case 1: No mapping exists in either of the dictionaries
                        if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                                mappingDictStoT[c1] = c2;
                                mappingDictTtoS[c2] = c1;
                        }

                        // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping
                        // exists and
                        // it doesn't match in either of the dictionaries or both
                        else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                                return false;
                        }
                }

                return true;
        }

        public static void main(String[] args) {
                String s = "egg";
                String t = "add";
                String s2 = "foo";
                String t2 = "bar";
                String s3 = "paper";
                String t3 = "title";
                String s4 = "babc";
                String t4 = "baba";
                System.out.println(isIsomorphic(s, t));
                System.out.println(isIsomorphic(s2, t2));
                System.out.println(isIsomorphic(s3, t3));
                System.out.println(isIsomorphic(s4, t4));
                System.out.println(isIsomorphic2(s, t));
                System.out.println(isIsomorphic2(s2, t2));
                System.out.println(isIsomorphic2(s3, t3));
                System.out.println(isIsomorphic2(s4, t4));
        };

}
