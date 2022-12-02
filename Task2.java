// Реализуйте алгоритм сортировки пузырьком числового массива, результат
// после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        int[] massive = { 8, 3, 7, 5, 1 };
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("log.txt", true);

                fileOutputStream.write(Arrays.toString(massive).getBytes());

                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }

            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    isSorted = false;

                    temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
