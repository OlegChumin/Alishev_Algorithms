package lesson_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonachiMyVersion {
    public static void main(String[] args) {
        readDataFromConsole();
    }

    static int readDataFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int number;
        try {
            line = reader.readLine();
            number = Integer.parseInt(line);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return number;
    }

    static int readDataFromConsoleTryWithResources() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return number;
    }

    static void printResultOnConsole(int result) {
        System.out.println("--------------------------------");
        System.out.printf("%n result = %d%n", result);
        System.out.println("--------------------------------");
    }

    private static final class Data {
        private final int value;
        private final Data data;

        public Data(int value, Data data) {
            this.value = value;
            this.data = data != null ? new Data(data.value, data.data) : null;
        }

        public int getValue() {
            return value;
        }

        public Data getData() {
            return data != null ? new Data(data.value, data.data) : null;
        }
    }
}
