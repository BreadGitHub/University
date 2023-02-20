public class Forming_string_is_while {
    public static String reverse(String str) {
       
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i);
            i = i - 1;
        }

        return result;
       
    }
}