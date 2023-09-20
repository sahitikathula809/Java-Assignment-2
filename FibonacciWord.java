public class FibonacciWord {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            String result = fibonacciWord(i);
            System.out.println("f(" + i + ") = " + result);
        }
    }

    public static String fibonacciWord(int n) {
        if (n == 0) {
            return "a";
        } else if (n == 1) {
            return "b";
        } else {
            String[] fibonacciWords = new String[n + 1];
            fibonacciWords[0] = "a";
            fibonacciWords[1] = "b";

            for (int i = 2; i <= n; i++) {
                fibonacciWords[i] = fibonacciWords[i - 1] + fibonacciWords[i - 2];
            }

            return fibonacciWords[n];
        }
    }
}
