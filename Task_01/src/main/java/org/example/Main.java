package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Main {
    private static List<String> menuList = Arrays.asList(
            "1 - вызвать метод 1 (divide by zero)",
            "2 - вызвать метод 2 (file not found)",
            "3 - вызвать метод 3 (number format)",
            "0 - выход"
    );

    public static void main(String[] args) throws IOException {
        int menu;

        while ((menu = showMenu(menuList)) > 0) {
            switch (menu) {
                case 1 -> MethodOne(10);
                case 2 -> MethodTwo("NotExist.file");
                case 3 -> MethodThree("o564");
            }
        }
    }

    /**
     * деление на 0
     */
    public static int MethodOne(int number) {
        int a = 0;

        try {
            a = number / a;
        }
        catch (Exception e){
            e.printStackTrace(System.err);
        }
        return a;
    }

    /**
     * отсутствие ресурса
     */
    public static String MethodTwo(String fileName)  {
        String stringFromFile = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            stringFromFile = reader.readLine();
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace(System.err);
        }

        return stringFromFile;
    }


    /**
     * Ошибка приведения к численному типу
     */
    public static int MethodThree(String value) {
        int result = 0;
        try {
            result = Integer.parseInt(value);
        }
        catch (Exception e){
            e.printStackTrace(System.err);
        }
        return result;
    }

    /**
     * меню
     */
    public static int showMenu(List<String> list) {
        int menu;
        Scanner scanner = new Scanner(System.in);
        list.stream().forEach(System.out::println);
        System.out.print("> ");

        menu = scanner.nextInt();

        return (menu < 0 || menu >= list.size()) ? 0 : menu;
    }
}