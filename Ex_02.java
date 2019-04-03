package Lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 0},};
        System.out.println("Задание 4.а:");
        for (int i = 0; i < a.length; i++)
        {System.out.println(Arrays.toString(a[i]));}

        System.out.println("Размер первого ряда массива равен " + (a[0].length+1));
        System.out.println("Размер второго ряда массива равен " + (a[1].length+1));

        //Матрица чисел, значения и размерность задаются с клавиатуры
        System.out.println("\nЗадание 4.б:\nВведите количество строк в массиве: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Введите количество столбцов в массиве: ");
        int M = scanner.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент массива arr[" + i + "][" + j + "]:");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ваш массив: ");
        for (int i = 0; i < arr.length; i++)
        {System.out.println(Arrays.toString(arr[i]));}
        System.out.println("Размер ряда введенного массива равен " + (arr.length+1));

    }
}



//4) Выведите в консоль размер ряда двухмерного массива.
//     а) Значения задать самому
//     б) Значения заданы с клавиатуры
