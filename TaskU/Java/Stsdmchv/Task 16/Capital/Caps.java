package Try1;
import java.util.Scanner;
public class Caps {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Строка: " + str);
        decide(str);
    }
    private static void decide(String str)
    {
        boolean check = true;
        while (check)
        {
            if (str.isEmpty())
            {
                main(null);
                check = false;
            }
            int upp = 0;
            int low = 0;
            for(char ch: str.toCharArray())
            {
                if (Character.isUpperCase(ch))
                ++upp;
                if (Character.isLowerCase(ch))
                ++low;      
            }
            System.out.println("Uppdercase: " + upp + " LowerCase: " + low);
            answer(str, upp, low);
            check = false;
        }
    }
    private static void answer(String str, int upp, int low)
    {
        String ans = upp>low ? str.toUpperCase() : str.toLowerCase();
        System.out.println("Преобразованная строка: " + ans);
    }
}
