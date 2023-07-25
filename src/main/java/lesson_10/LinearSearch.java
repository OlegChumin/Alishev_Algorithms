package lesson_10;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class LinearSearch {
    private static Random random = new Random();
    private static final int START_RANGE_OF_RANDOM = 0;
    private static final int END_RANGE_OF_RANDOM = 1_000_000;

    public static void main(String[] args) {
        int[] array = generateAndFillIntRandomArray(getLengthOfArrayToBeGenerated());
    }

    private static int getLengthOfArrayToBeGenerated() {
        System.out.println("Pls. enter length of array to be generated: ");
        try {
            return Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] generateAndFillIntRandomArray(int nLength) {
        int[] array = new int[nLength];
        Arrays.fill(array, random.nextInt(101));
        return array;
    }

}
