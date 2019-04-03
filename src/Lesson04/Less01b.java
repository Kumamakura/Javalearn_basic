package Lesson04;

import java.util.Arrays;

public class Less01b {

    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 3, 0};

        Double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Задание №1.a.\nСреднее арифметическое элементов массива: " + avg);

        float avg2 = 0;
        for (int i = 0; i < arr.length; i++) {
            avg2 += arr[i];
        }
        avg2 /= arr.length;

        System.out.println("Задание №1.b.\nСреднее арифметическое элементов массива: " + avg2);


    }
}

//1) Задан массив А, состоящий из n чисел. Найти среднее арифметическое его элементов. Массив произвольный не менее 5 элементов
