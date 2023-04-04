public class Return_loop {
    public static boolean hasChar(String str, char ch) {
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }

            i += 1;
        }

        return false;
    }
}