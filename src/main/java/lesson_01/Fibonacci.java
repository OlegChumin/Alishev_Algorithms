package lesson_01;

public class Fibonacci {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(fibNative(45));
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime));
    }

    //наивный медленный алгоритм
    private static long fibNative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1L;
        } else {
            return fibNative(n - 1) + fibNative(n - 2);
        }
    }
}
