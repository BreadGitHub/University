
import java.util.Scanner;
public class Square 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Оканчивается ли строка: ");
        String str1 = input.nextLine();
        System.out.println("на строку:");
        String str2 = input.nextLine();
        System.out.println(str1.endsWith(str2));
    }
}
