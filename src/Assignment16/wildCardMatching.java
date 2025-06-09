package Assignment16;

public class wildCardMatching {
    public static void main(String[] args) {
        String pattern = "a*b?c";
        String text = "aabxc";

        int i = pattern.length() - 1;
        int j = text.length() - 1;

        boolean result = match(i, j, pattern, text);
        System.out.println( result);
    }

    static boolean match(int i, int j, String S1, String S2) {
        if (i < 0 && j < 0)
            return true;

        if (i < 0 && j >= 0)
            return false;

        if (j < 0 && i >= 0)
            return isAllStars(S1, i);

        if (S1.charAt(i) == S2.charAt(j) || S1.charAt(i) == '?')
            return match(i - 1, j - 1, S1, S2);
        else {
            if (S1.charAt(i) == '*')
                return match(i - 1, j, S1, S2) || match(i, j - 1, S1, S2);
            else
                return false;
        }
    }

    static boolean isAllStars(String S, int i) {
        for (int k = 0; k <= i; k++) {
            if (S.charAt(k) != '*')
                return false;
        }
        return true;
    }
}
