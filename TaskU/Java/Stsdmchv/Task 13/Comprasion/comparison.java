
import java.util.Scanner;

public class comparison
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Считывает первые 2 числа
        System.out.println("Write 2 num:");
        String [] numbers = input.nextLine().split(" ");
        
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);  
        System.out.println("num 1: " + num1 + "; num 2: " + num2);
        if (num1 != num2)
        {
            compare(num1, num2);
        }
        else
        {
            main(args);
        }
    }

    private static void compare(int num1, int num2)
    {
        int step =  num1 > num2 ? num2 : num1; //Вместо 29 строк if else
        int start = step;
        int end = num1 > num2 ? num1 : num2;
        System.out.println("step: " + step + ", start: " + start + ", end: " + end);
        solve(step, start, end);
    }

    private static void solve(int step, int start, int end)
    {
        int num = start;
        System.out.print("Output: " + start + ", ");
        for(int i = 0; i < end-1; i ++)
        {
            num = (num+step);
            System.out.print(num); 
            
            if (i == end - 1)
            {
                System.out.print(".");
            }
            else
            {
                System.out.print(", ");
            }
            
        }
        System.out.println();
        num = step;
        System.out.print("Output(squares): " + start*start + ", ");
        for(int i = 0; i < end-1; i ++)
        {
            num = (num+step);
            System.out.print(num*num); 
            
            if (i == end - 1)
            {
                System.out.print(".");
            }
            else
            {
                System.out.print(", ");
            }
            
        }
    }
    
}   

