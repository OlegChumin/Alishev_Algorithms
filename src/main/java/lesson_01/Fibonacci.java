package lesson_01;

public class Fibonacci {
    public static void main(String[] args) {

    }

    //наивный медленный алгоритм
    private static long fibNative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1L;
        } else {
            return 0L;
        }
    }
}
