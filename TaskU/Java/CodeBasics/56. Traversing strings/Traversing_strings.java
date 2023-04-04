public class Traversing_strings {
    public static void printReversedNameBySymbol(String name) {

        var i = name.length() - 1;
        while (i >= 0) {
            System.out.println(name.charAt(i));
            i = i - 1;
        }
        
    }
}
