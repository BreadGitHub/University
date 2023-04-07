public class strcount {
    public static void main(String[] args)
    {
    int i = 1;
    int j = 1;
    String symbol = "a";
    String[] alfabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String text = "Hello Stas";
    text = text.toLowerCase();
    while(i<(alfabet.length-1))
    {
        System.out.print(symbol + "-");        
        System.out.println((text + "\0").split(symbol).length - 1);        
        symbol = alfabet[j];
        j++;
        i++;    
    }
    }    
}
