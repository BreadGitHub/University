public class Variables_and_concatenation {
    public static void main(String[] args) {
        var info = "We couldn't verify you mother's maiden name.";
        var intro = "Here is important information about your account security.";

        var firstName = "Joffrey";
        var greeting = "Hello";

        var first = greeting + ", " + firstName + "!";
        
        System.out.println(first);
        System.out.println(intro);
        System.out.println(info);
    }
}