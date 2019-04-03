package Lesson01_2;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону прямоугольника А:");
        a = scanner.nextInt();
        System.out.println("Введите сторону прямоугольника B:");
        b = scanner.nextInt();
        System.out.println("Площадь прямоугольника = " + a*b);

    }
}
