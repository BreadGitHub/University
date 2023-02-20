import org.apache.commons.lang3.StringUtils;

public class String_comparison {
    public static boolean isPalindrome(String word) {
        var reversedWord = StringUtils.reverse(word);
        return word.equalsIgnoreCase(reversedWord);
    }
}