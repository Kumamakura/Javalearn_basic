package Lesson05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, от 2 до 10:");
        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}

/*
1)
Ввести число N (N >= 2 < 10)
Вывести в консоль таблицу умножения числа N от 1 до 10
Пример: N = 2
2 * 1 = 2
2 * 2 = 4
...
2 * 10 = 20
 */