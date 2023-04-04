public class String_immutability {
    public static void main(String[] args) {
        var email = " SupporT@hexlet.io\n";

        email = email.toLowerCase();
        email = email.trim();
        System.out.println(email);
    }
}