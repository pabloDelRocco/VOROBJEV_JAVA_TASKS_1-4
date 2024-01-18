package org.example;

import java.util.Scanner;

public class Tests { //описываем класс Tests

    public void testTask1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Тестовое задание 1 \nВведите число: ");
        int number = scan.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public void testTask2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Тестовое задание 2 \nВведите имя: ");
        String name = scan.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void testTask3() {
        System.out.println("Тестовое задание 3");
        int[] array = {1, 3, 5, 9, 12, 15, 18, 20, 25, 27};
        System.out.println("Элементы массива, кратные 3:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}