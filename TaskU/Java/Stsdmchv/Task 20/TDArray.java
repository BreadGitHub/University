import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class TDArray 
{
    public static void main(String[] args) 
    
    // 1  1  1  1  1  1  1  1  1
    // 1  2  2  2  2  2  2  2  1
    // 1  2  3  3  3  3  3  2  1
    // 1  2  3  4  4  4  3  2  1
    // 1  2  3  4  5  4  3  2  1
    // 1  2  3  4  4  4  3  2  1
    // 1  2  3  3  3  3  3  2  1
    // 1  2  2  2  2  2  2  2  1
    // 1  1  1  1  1  1  1  1  1 
    
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Строк:");
        int row = input.nextInt();

        System.out.println("Колонн:");
        int col = input.nextInt();

        FillOne(row, col);
    }

    private static void FillOne(int row, int col) 
    {
        System.out.println("1...");
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            
            for (int j = 0; j < col; j ++)
            {
                
                array[i][j] = 1;
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(Arrays.toString(array[i]));
        }
        FillSecond(array, row, col);
    }

    private static void FillSecond(int[][] array, int row, int col) 
    {
        System.out.println("2...");

        for (int i = 1; i <= Math.min(row, col) / 2; i++)
        {
            int value = i+1;
            
            for (int j = i; j < row - i; j++)
            {
                
                array[i][j] = value;
                array[row - i - 1][j] = value;
            }

            for(int j = i; j < row - i; j ++) 
            {
                
                array[j][i] = value;
                array[j][col-i-1] = value;
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(Arrays.toString(array[i]));
        }
        Save(array, row, col);
    }

    private static void Check(int value)
    {
        System.out.println("Обработка: " + value);
    }
    private static void Save(int[][] array, int row, int col) 
    {
        // for (int i = 0; i < array.length; i++)
        // {
        //     System.out.println(Arrays.toString(array[i]));
        // }
        System.out.println("Save...");
        try {
            BufferedWriter save = new BufferedWriter(new FileWriter("Array.txt")); //Почему у filewriter нету метода newLine?!
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    save.write(String.valueOf(array[i][j]) + " ");
                }
                save.newLine();
            }
            save.flush();
            save.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
