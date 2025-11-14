package algorithms;


public class KMP {


    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int j = 0; // length of previous longest prefix suffix

        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            lps[i] = j;
        }
        return lps;
    }


    public int search(String text, String pattern) {
        if (pattern.isEmpty()) return 0;

        int[] lps = buildLPS(pattern);
        int j = 0; // index for pattern
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1];
            }

            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            if (j == pattern.length()) {
                count++;
                j = lps[j - 1];
            }
        }
        return count;
    }
}
