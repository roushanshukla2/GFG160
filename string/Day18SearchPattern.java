package string;

import java.util.ArrayList;

public class Day18SearchPattern {
  /*  public ArrayList<Integer> search(String pat, String text) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sizeText = text.length();
        int sizePat = pat.length();

        for (int i = 0; i <= sizeText - sizePat; i++) {
            boolean flag = true;
            for (int j = 0; j < sizePat; j++) {
                if (text.charAt(i + j) != pat.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(i); // 0-based index
            }
        }

        return result;
    }	
//    Time complexity O(n*m)
	
	*/
	
	static void buildLPS(String pat, int[] lps) {
        int length = 0;
        lps[0] = 0;

        int i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    // KMP search function
    static ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();

        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();

        buildLPS(pat, lps); // ✅ Corrected: pass lps, not txt

        int i = 0, j = 0;
        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                res.add(i - j);   // 0-based indexing
                j = lps[j - 1];   // Move j to the next best match
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        return res;
    }
}
