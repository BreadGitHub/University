public class Method_call_chains {
    public static void main(String[] args) {
        var name = "hexlet";

        
        var capitalized = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
                
        System.out.println(capitalized);
    }
}
