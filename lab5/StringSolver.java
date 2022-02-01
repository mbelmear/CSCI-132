package lab5;

import java.util.StringTokenizer;

public class StringSolver {

    String s;

    public StringSolver(String in_str) {
        s = in_str;
    }

    public int m1(String inp) {
        // search through this.s and see how many times "inp" appears
        int count = 0;
        for (int i = 0; i < this.s.length(); i++) {
            if (this.s.substring(i, i + 1).equals(inp)) {
                count++;
            }
        }
        return count;
    }

    public int m2() {
        String sentence = this.s;
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    public String m3() {
        return s.replaceAll("\\s+", "");
    }

    public void m4(String newString) {
        this.s = newString;
        System.out.println("New Sentence: " + this.s);
    }


}
