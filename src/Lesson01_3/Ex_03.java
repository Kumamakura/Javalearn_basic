package Lesson01_3;

import java.util.Scanner;
import java.lang.Math;

public class Ex_03 {
    public static void main(String[] args) {
        int r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга:");
        r = scanner.nextInt();
        System.out.println("Площадь круга с радиусом " + r + " = " + Math.PI*r*r);


    }
}
