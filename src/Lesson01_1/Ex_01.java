package Lesson01_1;

import java.util.Scanner;

public class Ex_01
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя.");
                String name = scanner.nextLine();
        System.out.println("Меня зовут " + name + ".");
    }
}