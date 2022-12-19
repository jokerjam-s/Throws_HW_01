package org.example;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Main {
    public static void main(String[] args) {
        int[] array1 = {3,4,6,7,2};
        int[] array2 = {7,4,9,1};

        int[] array3 = summArrays(array1, array2);

        Logger logger = Logger.getAnonymousLogger();
        logger.info(Arrays.toString(array1));
        logger.info(Arrays.toString(array2));
        logger.info(Arrays.toString(array3));
    }

    public static int[] summArrays(int[] a1, int[] a2){
        int[] result = null;
        try {
            if(a1.length != a2.length){
                throw new RuntimeException("Длины массивов не равны!");
            }
            result = new int[a1.length];

            for (int i = 0; i < a1.length; i++) {
                result[i] = a1[i] + a2[i];
            }

        }catch (RuntimeException e){
            Logger logger = Logger.getAnonymousLogger();
            logger.info(e.getMessage());
        }

        return result;
    }
}