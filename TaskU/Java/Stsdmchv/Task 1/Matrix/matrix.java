package University.Semester;

import java.util.Random;

//Транспонировать матрицу
public class matrix {
 
    public static void main(String[] args) {
       
        // часть 1 - создаем матрицу n на n
        Random r=new Random();
        int [][]a= new int[4][4];
        for(int i=0;i<a.length;i++)             
        {                                            
        for(int j=0;j<a.length;j++)         
        {                                   
            a[i][j]=r.nextInt(5);   
            
        }                                    
                  
        }
        int n = a.length;
        // часть 2 - выводит на экран начальную матрицу
        System.out.println("Начальная матрица");
        System.out.println("--------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
 
        // часть 3 - транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
 
        // часть 4 - выводит на экран транспонированную матрицу
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("--------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
 
    }
}