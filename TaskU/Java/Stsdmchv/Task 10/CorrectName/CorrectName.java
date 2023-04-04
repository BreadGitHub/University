
import java.util.Scanner;

class CorrectName //Когда нибудь я буду добавлять конструктор
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.next();
        Correct(name);
    }   

    private static void Correct(String name)
    {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();//разделить name на часть от 0 до 1 и в верхний регистр + часть от 1 до конца в нижний регистр
        Print(name);
    }

    private static void Print(String name)
    {
        System.out.println("Hello, " + name);
    }
}
