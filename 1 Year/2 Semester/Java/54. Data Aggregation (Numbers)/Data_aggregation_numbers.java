public class Data_aggregation_numbers {
    public static int multiplyNumbersFromRange(int start, int finish) {
        var i = start;
        var result = 1;

        while (i <= finish) {
          result = result * i;
          i = i + 1;
        }

        return result;
    }
}
