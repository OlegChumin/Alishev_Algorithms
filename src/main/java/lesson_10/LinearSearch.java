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
    private static final Random random = new Random();
    private static final int END_RANGE_OF_RANDOM = 1_000_001;

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
        Arrays.fill(array, random.nextInt(END_RANGE_OF_RANDOM));
        return array;
    }

    private static int getRandomElementFromArray(int[] array) {
        return array[random.nextInt(array.length - 1)];
    }

}
