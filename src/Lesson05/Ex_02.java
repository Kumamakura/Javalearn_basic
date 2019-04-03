package Lesson05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int A = scanner.nextInt();
        System.out.println("Введите второе число, оно должно быть больше первого:");
        int B = scanner.nextInt();

        primeNumber: //метка, показывает, куда перейти
        for (int i = A+1; i < B; i++) {
            for (int j = A+1; j < i; j++) {
                if (i % j == 0) continue primeNumber; //Если число при делении на предыдущие не дало остатка, то проверяем следующее
            }
            System.out.println(i);
        }
    }
}

/*
Ввести два числа A и B. Число B должно быть больше, чем A.
Вывести все простые числа в интервале между А и B в консоль
Число простое, если при делении на любое число от 2 до n-1 есть остаток.


 */