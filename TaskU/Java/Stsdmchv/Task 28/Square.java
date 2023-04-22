import java.util.Scanner;
public class Square {

    public static void main(String[] args)
    {
        Entry();
    }

    private static void Entry()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        if (n % 2 != 0 && 0 < n && n < 100000)
        {
            Solver(n);
        }
        else{
            System.out.println("Нерешаемо либо нарушает условие");
        }
    }
    
    private static void Solver(int n) //25-16 = n => √(25 - 16) = √n 
    {
        int left = ((n-3)/2+1)*((n-3)/2+1);
        int right = (((n-3)/2+1) + 1)*(((n-3)/2+1) + 1);
        System.out.println("Находится между двумя квадратами: " + (left + " -> " + n + " -> " + right));
    }
}
