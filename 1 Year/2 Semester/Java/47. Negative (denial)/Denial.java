import java.time.LocalDate;

public class Denial {
    public static boolean notToday(String dateAsString) {
        var date = LocalDate.now();
        return !dateAsString.equals(date.toString());
    }
}