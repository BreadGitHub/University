public class Geron {
    public static void main(String[] args)
    {
        System.out.println("Стороны: А = 15, B = 20, C = 25");
        int A = 15;
        int B = 20; 
        int C = 25;
        solve(A, B, C);
    }

    private static void solve(int A, int B, int C)
    {
        int ptr  = (A+B+C)/2;
        System.out.println("Answer:" + Math.sqrt(ptr*(ptr-A)*(ptr-B)*(ptr-C)));
    }

    
}
