package Lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Less02 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите количество элементов в массиве, не менее 5:"); //надо придумать валидацию ввода

            int N = scanner.nextInt();
            int[] arr = new int[N];

            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < arr.length; i++)
            {arr[i] = scanner.nextInt();}
            System.out.println("\nВаш массив: " + Arrays.toString(arr));

            int max = 0;
            int min = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max)
                    max = arr[i];
                if(arr[i] < min)
                    min = arr[i];
            }
            System.out.println("Задание №0.\nНаибольшее число в массиве: " + max);

            Arrays.sort(arr);
            System.out.println("Задание №0.a.\nНаибольшее число в массиве: " + arr[N-1]);

            //System.out.println("Задание №1.\nСреднее арифметическое элементов массива: " + avground);

            int count = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] >= 0)
                    count++;
            }
            System.out.println("Задание №2.\nКоличество положительных элементов массива: " + count);


    }
}
