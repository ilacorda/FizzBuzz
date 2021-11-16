public class FizzBuzz {
    public static String of(int i) {

        if (i == 0) return "0";

        return _of(i);
    }

    private static String _of(int i) {
        String str = "";

        if (i % 3 == 0) str += "Fizz";

        if (i % 5 == 0) str += "Buzz";

        return str.isEmpty() ? String.valueOf(i) : str;
    }
}
