package Simple1;

import java.util.Scanner;

public class Simple //Простое имеет два делителя
{
    static int var = 2;
    public static void main(String[] args) //Input
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Check(n);
    }

    private static void Check(int n) //Solve
    { 
        if (n>1) {
            if (n % var !=0) 
            {
                var ++;
                Check(n);
            }
            else if (n % var == 0) 
            {
                Output(var, n);
            } 
        }
    }

    private static void Output(int var, int n) //Print
    {
        if (var == n)
        {
            System.out.println(n + " simple.");
        }
        else 
        {
            System.out.println(n + " not simple.");
        }
    }
}
