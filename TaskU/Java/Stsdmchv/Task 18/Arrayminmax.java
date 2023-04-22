import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class arrayminmax 
{
    public static void main(String[] args)
    {        
        Array();
    }

    private static void Array() //Создать массив и вывести информацию о первом наибольшем числе и его позиции
    {
        int[] Array = new int[8];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Array.length; i ++)
        {
            System.out.println("Write the numbers:");
            int a = input.nextInt();
            Array[i] = a;
        }
        System.out.println("Array:" + Arrays.toString(Array));
        System.out.println("Max num:" + Findmaxvalue(Array) + " id:" + Findmaxvalueid(Array, Findmaxvalue(Array)));
        Solve(Array, Findmaxvalue(Array), Findmaxvalueid(Array, Findmaxvalue(Array)));
    }
    private static Integer Findmaxvalue(int[] Array) //Найти максимальное значение

    {
        int maxNum = Array[0];

        for (int j : Array) 
        {
            if (j > maxNum)
                maxNum = j;
        }
        return maxNum;
    }
    private static Integer Findmaxvalueid(int[] Array, int maxNum) //Найти где находится максимальное значение
    {
        int id = 0;
        for (int i = 0; i < Array.length; i ++)
        {   
            if(Array[i] == maxNum)
            {
                id = i;
                break;
            }
        }
        return id;
    }
    private static void Solve(int[] Array, int maxNum, int id)
    {
        int[] ArrayLeft = new int[8];
        int[] ArrayRight = new int[8];
      

        for (int i = 0; i < Array.length; i ++)
        {
            
            if (i < id)
            {
                ArrayLeft[i] = Array[i];
            }
            if (i > id)
            {
                ArrayRight[i] = Array[i];
            }

        }
        System.out.println("ArrayLeft: " + Arrays.toString(ArrayLeft) + "; ArrayRight: " + Arrays.toString(ArrayRight));                         
    }
}
