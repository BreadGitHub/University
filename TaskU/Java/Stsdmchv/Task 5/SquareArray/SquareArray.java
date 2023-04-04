import java.util.Scanner;

public class SquareArray 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        
        System.out.println("Insert array elements:");
        
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }

        System.out.println();
        System.out.println("Подсчет суммы:");

        solve(size, array);
    }
    private static void solve(int size, int[] array)
    {
        int ans = 0;
        for(int i = 0; i < size; i++)
        {
            ans = ans + array[i]*array[i];
            
        }
        
        System.out.println("Square sum: " + ans);
    }
}
