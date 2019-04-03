package Lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a.length; i++)
        {a[i] = scanner.nextInt();}

        System.out.println("\n1. Массив: " + Arrays.toString(a)); //выводим массив, преобразовав его в строку

        int s = Arrays.stream(a).sum(); //превращаем массив в поток, что позволяет выполнять операцию суммирования
        System.out.println("2. Сумма элементов массива равна " + s);

        Arrays.sort(a);
        System.out.println("3. Отсортированный массив: " + Arrays.toString(a));

    }
}


//1) Инициализируйте целочисленный массив длинной 5, ввод значений производить с клавиатуры. Выведите результат в консоль.
//2) Просуммируйте все элементы массива. Выведите в консоль.
//3) Отсортируйте элементы в строках массива по возрастанию
//4) Выведите в консоль размер ряда двухмерного массива.
//     а) Значения задать самому
//     б) Значения заданы с клавиатуры