package Lesson03;
import java.util.Arrays;
import java.util.Scanner;

public class Less02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("'%d' ", a[i]);
        }

    }
}
