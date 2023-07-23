package lesson_02;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1); // -1 маркер == fibNaiv() с текущим n не был еще вызван
        System.out.println(fibNaive(n, mem));
    }

    //наивный медленный алгоритм
    private static long fibNaive(int n, long[] mem) {
        if(mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }

        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;
        return result;
    }
}
