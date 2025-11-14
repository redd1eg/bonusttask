package algorithms;


public class Main {
    public static void main(String[] args) {

        KMP kmp = new KMP();

        // Test 1 — Short string
        String text1 = "ababcabcabab";
        String pattern1 = "abc";
        System.out.println("Short test: found " +
                kmp.search(text1, pattern1) + " matches.");

        // Test 2 — Medium-length string
        String text2 = "abcdabcabcabcabcdabcabcabcabcabababcabcabc";
        String pattern2 = "abcabc";
        System.out.println("Medium test: found " +
                kmp.search(text2, pattern2) + " matches.");

        // Test 3 — Long string
        StringBuilder longText = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            longText.append("abcabd");
        }
        String pattern3 = "abcab";
        System.out.println("Long test: found " +
                kmp.search(longText.toString(), pattern3) + " matches.");
    }
}
