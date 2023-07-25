package lesson_10;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    private static Random random = new Random();
    private static final int END_RANGE_OF_RANDOM = 1_000_001;

    public static void main(String[] args) {
        int[] array = generateAndFillIntRandomArray(getLengthOfArrayToBeGenerated());
        int randomElement = getRandomElementFromArray(array);
        System.out.println("randomElement = " + randomElement);
        long startTime = System.currentTimeMillis();
        int indexOfElement = linearSearchOfRandomElementInArray(array, randomElement);
        long endTime = System.currentTimeMillis();

        System.out.println("indexOfElement = " + indexOfElement);
        System.out.println("Время поиска элемента = " + randomElement + " = " + (endTime - startTime) + " индекс элемента = " + indexOfElement);
        System.out.println("Проверка, элемент из массива по индексу " + indexOfElement + " = " + array[indexOfElement]);
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
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(END_RANGE_OF_RANDOM);
        }
        return array;
    }

    private static int getRandomElementFromArray(int[] array) {
        int randomIndex = random.nextInt(array.length - 1);
        return array[randomIndex];
    }

    private static int linearSearchOfRandomElementInArray(int[] array, int searchingElement) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (searchingElement == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
