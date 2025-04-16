package string;

public class Day19MinCharsAddPalindrome {
	public static int minChar(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "$" + rev;

        int[] lps = computeLPSArray(combined);
        return n - lps[lps.length - 1];
    }

    // Function to compute the LPS array (KMP utility)
    public static int[] computeLPSArray(String pat) {
        int n = pat.length();
        int[] lps = new int[n];

        lps[0] = 0;
        int len = 0, i = 1;

        while (i < n) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
//    Uncomment to test the method
//    public static void main(String[] args) {
//        String s = "AACECAAAA";
//        System.out.println(minChar(s));
//    }
}
	
	

