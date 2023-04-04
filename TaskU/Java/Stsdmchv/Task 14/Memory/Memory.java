package Try1;
import java.util.Arrays;
import java.util.Scanner;
public class Memory {
    public static void main(String[] args)
    {
        int [] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        boolean check = true;

        while(check)
        {
            Scanner input = new Scanner(System.in); //Считывает первые 2 числа
            System.out.println("Write num:");
            int num = input.nextInt();
            int min = minnum(numbers);
            int id = minid(numbers, min);
            for(int i = 0; i < numbers.length; i++)
            
            {
                if(num > min)
                {
                    numbers[id] = num;
                    System.out.println("Ячейка: " + Arrays.toString(numbers));
                    break;
                }
                
            }
            System.out.println("1 - продолжить, другое - прекратить");
            int a = input.nextInt();
            check = (a==1) ? true:false;
            

        }
    }

    private static int minnum(int[] numbers) //Не трогай, оно и так работает
    {
        int min = Integer.MAX_VALUE;
        for(int i : numbers)
        {
            min = Math.min(min, i);
        }
        System.out.println("Наименьшее число массива: " + min);
        return min;
    } 
    private static int minid(int[] numbers, int min)
    {
        int index = 0;
        for (int i = 0; i< numbers.length; i ++)
        {
            if (numbers[i] == min)
            {
                index = i;
            }
        }
        return index;
    }

}
