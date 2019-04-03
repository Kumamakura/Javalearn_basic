package Lesson02;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой день месяца: ");
        int day = scanner.nextInt();
        if (day > 0)
        {{if (day < 10) {System.out.printf("Число %d - это первая декада месяца.", day);}
        else if (day < 22) {System.out.printf("Число %d - это вторая декада месяца.", day);}
        else if (day <=31) {System.out.printf("Число %d - это третья декада месяца.", day);}
        else {System.out.println("Ты поехавший!");}}
        }
        else {System.out.println("Ты поехавший!");}
}}


//Определить в какую декаду месяца попадает число (первая, вторая, третья).
//Ввести число
//1 : 1-10
//2 : 10-21
//3 : 22-31
//Если ввели число больше 31 вывести  в  консоль “Ты поехавший” и завершить исполнение программы.
//Пример: Вывести в консоль “Число 2 это первая декада”