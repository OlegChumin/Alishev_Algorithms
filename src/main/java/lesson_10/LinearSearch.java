package lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LinearSearch {
    private static final Random random = new Random();

    public static void main(String[] args) {
        generateIntRandomArray(9);

    }

    private static int getLengthOfArrayToGenerate() throws IOException {
        return Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
    }

    private static int[] generateIntRandomArray(int nLength) {
        return new int[nLength];
    }

}
