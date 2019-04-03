package Lesson02;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int S = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int v = scanner.nextInt();
        for (int i = 1; i<=v; i++)
        {
            S = S + i;
        }
        System.out.printf("Сумма чисел от 1 до %d = %d", v, S);
    }
}

//Ввести любое целое положительное число. А программа суммирует все числа от 1 до введенного вами числа.
//Например: Ввели число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.