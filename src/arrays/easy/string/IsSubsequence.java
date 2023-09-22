package arrays.easy.string;

public class IsSubsequence {
    public static void main(String[] args) {


    }
    public boolean isSubsequence(String s, String t) {

        int slen = s.length();
        int tlen = t.length();

        int j = 0;
        for (int i = 0; i < tlen; i++) {
            if (j < slen && s.charAt(i) == t.charAt(i)) {

                j++;
            }
        }

        return j == slen;
    }
}
