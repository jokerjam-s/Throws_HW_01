package org.example;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Main {
    public static void main(String[] args) {
        int[] a1 = {4, 6, 2, 8, 3};
        int[] a2 = {2, 9, 7, 6};

        Logger logger = Logger.getAnonymousLogger();

        int[] c = makeArray(a1, a2);
        if (c.length == 0) {
            logger.info("Массивы имеют несовместимый размер!");
        } else {
            logger.info("Массив сформирован!");
            logger.info(Arrays.toString(c));
        }
    }

    /**
     * Из формаирование третьего массива из двут
     *
     * @param array1    - массив из которого проводим вычитание
     * @param array2    - массив вычитаемых элементов
     * @return          - новый массив, если сформировать новый массив невозможно - вернет пустой массив
     */
    public static int[] makeArray(int[] array1, int[] array2) {
        int[] c;

        if (array1.length != array2.length) {
            c = new int[]{};
        } else {
            c = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                c[i] = array1[i] - array2[i];
            }
        }

        return c;
    }
}