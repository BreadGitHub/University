public class Method_Call_Expression {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        var firstnum = 0;
        var lastnum = text.length() - 1;

        var firstIndex = text.charAt(0);
        var lastIndex = text.charAt(lastnum);

        System.out.println("First: " + firstIndex);
        System.out.println("Last: " + lastIndex);
        
    }
}