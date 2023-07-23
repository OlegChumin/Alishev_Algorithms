package lesson_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonachiMyVersion {
    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        printResultOnConsole(readDataFromConsoleTryWithResources());
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeEnd - timeStart);

        printResultOnConsole(readDataFromConsoleTryWithResources());
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

    /**
     * Метод readDataFromConsoleTryWithResources будет работать быстрее и предпочтительнее из-за использования
     * try-with-resources. Это связано с тем, что try-with-resources автоматически закрывает ресурсы после завершения
     * блока try, что позволяет избежать утечек ресурсов и сокращает объем кода.
     * <p>
     * В методе readDataFromConsole, BufferedReader не закрывается явно, что может привести к утечке ресурсов, если
     * метод вызывается в контексте другого метода или приложения с большим количеством операций ввода-вывода. Кроме
     * того, в этом методе объект BufferedReader создается вне блока try и закрывается явно, что усложняет код.
     * <p>
     * В методе readDataFromConsoleTryWithResources, BufferedReader создается внутри блока try-with-resources, и после
     * завершения блока try BufferedReader автоматически закрывается. Это упрощает код и гарантирует, что ресурсы будут
     * корректно закрыты даже в случае возникновения исключения. Поэтому второй метод предпочтительнее, и его
     * использование рекомендуется.
     */

    static int readDataFromConsoleTryWithResources() {
        int number;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());
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
