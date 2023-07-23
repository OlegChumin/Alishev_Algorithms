package lesson_02;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        System.out.println(fibNaive(n, mem));
    }

    //наивный медленный алгоритм
    private static long fibNaive(int n, long[] mem) {
        if (n <= 1) {
            return n;
        }
        return fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
    }

    private static long fibEffective(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}
