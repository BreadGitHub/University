import java.util.Scanner;

class Deletevowel 
{
    public static void main(String[] args)
    {
        System.out.println("Ввод строки:"); //Я не знаю почему он не принимает русский алфавит, проблемы с кодировкой
        Scanner input = new Scanner (System.in);
        String line = input.nextLine(); //Не next, ибо нужна цельная строка
        
        System.out.println("Изначальная строка: " + line);
        lower(line);
    }   
    
    private static void lower(String line)
    {
        line = line.toLowerCase();
        delete(line);
    }

    private static void delete(String line)
    {
        String [] vewel = {"а","я","у","ю","о","е","ё","э","и","ы","a","e","i","o","y"};
        for(int i=0; i < vewel.length; i++)        
        {
            line = line.replace(vewel[i], "");
        }
        
        
        upper(line);
    }

    private static void upper(String line)
    {
        line = line.substring(0,1).toUpperCase() + line.substring(1).toLowerCase();
        print(line);
    }

    private static void print(String line)
    {
        System.out.println("Преобразованная строка: " + line);
    }
}
