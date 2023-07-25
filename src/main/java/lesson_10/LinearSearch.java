package lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Random;

public class LinearSearch {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] array = generateIntRandomArray(getLengthOfArrayToGenerate());

    }

    private static int getLengthOfArrayToGenerate() {
        System.out.println("Pls. enter length of array to be generated: ");
        try {
            return Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] generateIntRandomArray(int nLength) {
        return new int[nLength];
    }

}
