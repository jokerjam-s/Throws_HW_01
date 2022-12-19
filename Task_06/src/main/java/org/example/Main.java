package org.example;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Реализуйте метод, принимающий в качестве аргументов двумерный массив.
 * Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется.
 * Как бы вы реализовали подобный метод.
 */

public class Main {
    public static void main(String[] args) {
        int[][] array ={
                {2,4,5},
                {2,4,5,7},
                {2,4,5},
        };

        Logger logger = Logger.getAnonymousLogger();
        switch (testArray(array)){
            case -1 -> logger.info("длины не совпадают");
            case 0 -> logger.info("передан не массив");
            case 1 -> logger.info("длины совпадают");
        }

        logger.info(Arrays.deepToString(array));
    }

    /**
     * Проверка длин строк и столбцов
     * @param array : массив для проверки
     * @return      : 1 - длины совпадают, -1 - не совпадают, 0 - массив равен null
     */
    public static int testArray(int[][] array){
        if(array == null){
            return 0;
        }

        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if(array.length != array[i].length){
                result = -1;
                break;
            }
        }

        return result;
    }
}