package org.example;

import org.w3c.dom.ranges.RangeException;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

public class Main {
    public static void main(String[] args) {
        int[] array1 = {4,8,-2,3,9};
        int[] array2 = {9,7,5,-1,0};

        int[] array3 = divideArray(array1, array2);

        Logger logger = Logger.getAnonymousLogger();
        logger.info(Arrays.toString(array1));
        logger.info(Arrays.toString(array2));
        logger.info(Arrays.toString(array3));
    }

    public static int[] divideArray(int[] a1, int[] a2) throws RangeException {
        int[] result = new int[0];

        try {
            if(a1.length != a2.length){
                throw new RuntimeException("Неверный размер массивов");
            }

            result = new int[a1.length];
            for (int i = 0; i < a1.length; i++) {
                try {
                    result[i] = a1[i] / a2[i];
                }catch (ArithmeticException a){
                    result[i] = 0;
                }
            }

        } catch (RuntimeException e){
            Logger logger = Logger.getAnonymousLogger();
            logger.info(e.getMessage());
        }

        return result;
    }
}