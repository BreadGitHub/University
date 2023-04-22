
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class Palindrome2 
{
    

    public static void main(String[] args) 
    {
        Entry();
    } 

    private static void Entry()
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Строка:");
            String str = input.nextLine();
            Longest(str);
        }
    }
    private static void Longest(String str)
    {
        
        String[] list = str.split("\\p{Space}");
        List<String> pal = Stream.of(list).filter(s -> s.equals(new StringBuffer(s).reverse().toString())).collect(Collectors.toList());
        String longest = pal.stream().max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get();
        System.out.println("Самый длинный палиндром: " + longest);
    }
        
}