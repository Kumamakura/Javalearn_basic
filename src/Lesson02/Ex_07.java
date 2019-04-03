package Lesson02;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {
        System.out.println("Сколько будет 2 + 2:");
        Scanner scanner = new Scanner(System.in);
        for (int x = 0; x <= 2; x++) {
            String otvet = scanner.nextLine();
            if (otvet.equals("4") || otvet.equals("четыре") || otvet.equals("Четыре"))
            {System.out.println("Это правильный ответ!"); return;}
            else {System.out.println("Подумай еще");}
            System.out.println("Ответ:");
        }
        System.out.println("Правильный ответ - 4.");
    }
;}


//Загадать загадку.
//Вывести в консоль текст загадки, и дать 3 попытки на правильный ответ.
//Условия:
//   Ответ должен быть из одного слова или числа
//   Если ответ верный завершить программу и вывести в консоль  фразу -: ”Это правильный ответ!”
//   Если ответ не верный, но есть попытки, вывести текст “Подумай еще”
//   Если попытки кончились завершить выполнение программы и вывести правильный ответ в консоль.
//
//Пример :
//Сколько будет 2 + 2
//Ответ: 2
//Подумай еще
//Ответ: 3
//Подумай еще
//Ответ: 4
//Правильно!