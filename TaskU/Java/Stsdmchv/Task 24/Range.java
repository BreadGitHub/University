import java.util.Scanner;
public class Range {
    public static void main(String[] args)
    {
        Entry();
    }

    private static void Entry()
    {
        Scanner input = new Scanner(System.in); // 
        
        System.out.print("M: ");
        int M = input.nextInt();

        System.out.print("N:");
        int N = input.nextInt();

        System.out.print("Сколько делителей?:");
        int DivNum = input.nextInt();
        int[] DivList= new int[DivNum];
        for (int i = 0; i < DivNum; i ++)
        {
            System.out.print("Делитель:");
            DivList[i] = input.nextInt();
            System.out.println(i+1 +"-ый делитель: "+DivList[i]);
        }
        Solve(M, N, DivList);
    }
    //Суммируем числа которые делятся на конкретный делитель без остатка
    private static void Solve(int M, int N, int[] DivList) 
    {
        for (int div : DivList) // [1,2,3,4,5,6,7,8] % 2?  => 2+4+6+8 = 20
        {
            int sum = 0;
            for (int n = M; n <= N; n++)
            {
                if (n % div == 0)
                {
                    sum += n;
                   
                }
            }
            System.out.println("Сумма = " + div + ":" + sum);
        }
        
    }

    
}
