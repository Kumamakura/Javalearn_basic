package Lesson04;

import java.util.Arrays;

public class Less01d {
    public static void main(String[] args) {
        int[] arr = {1, 7, -5, 3, 0};
        int min = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            } else if (arr[i] > arr[max]) {
                max = i;
            }
        }
        int buff = arr[min];
        arr[min] = arr[max];
        arr[max] = buff;
        System.out.println("Задание №3.\nИзменённый массив: " + Arrays.toString(arr));
    }
}

//3) Поменять местами минимальный и максимальный элементы
