package Lesson02;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        if (num < 10) {System.out.printf("%d - меньше десяти.", num);}
        else if (num == 10) {System.out.printf("%d - равно десяти.", num);}
        else  {System.out.printf("%d - больше десяти.", num);}
    }

}


//Ввести с клавиатуры число  большее, меньшее или равное 10.
//Если ввели чисто 10, вывести в консоль сообщение “(ваше число) равно 10”
//Если меньше, “(ваше число) меньше 10”
//Если больше, то “(ваше число) больше 10”