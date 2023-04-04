
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Repetition {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        output(str);
    }

    private static void output(String str)
    {
        System.out.println("Преобразованная строка: "+ replace(str));
    }
    
    private static String replace(String str)
    {
       Pattern pt = Pattern.compile("(?i)(\\b\\w+\\b)(.*?) \\b\\1\\b"); //Разбери
       Matcher mt = pt.matcher(str);
       while (mt.find())
       {
            str = mt.replaceAll("$1$2");
            mt = pt.matcher(str);
       }
       return str;
    }



    
}
