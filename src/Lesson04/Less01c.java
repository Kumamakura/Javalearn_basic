package Lesson04;

import java.util.Arrays;

public class Less01c {

    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 3, 0};

        System.out.println("\nВаш массив: " + Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                count++;
        }
        System.out.println("Задание №2.\nКоличество положительных элементов массива: " + count);

    }
}

//2) Найти количество положительных элементов массива