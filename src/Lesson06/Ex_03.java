package Lesson06;

import java.util.Scanner;

class Ex_03 {

    public static void main(String[] args) {
        Student[] institute = new Student[7];

        institute[0] = new Student("Иванов", 4);
        institute[1] = new Student("Петрова", 2);
        institute[2] = new Student("Кожура", 2);
        institute[3] = new Student("Малинка", 1);
        institute[4] = new Student("Вермишелькина", 3);
        institute[5] = new Student("Твиридзе", 4);
        institute[6] = new Student("Соболева", 3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер курса: ");
        int number = scanner.nextInt();

        for (int i = 0; i < institute.length; i++) {

            if (institute[i].course == number) {
                System.out.println(institute[i].secondName);
            }
        }
    }
}

class Student {

    String secondName;
    int course;

    Student(String secondName, int course) {
        this.secondName = secondName;
        this.course = course;
    }
}

//3: Спроектировать обьект Student, у студента есть фамилия и номер курса на котором он учится.
//3': Создать массив студентов разных курсов.
//Ввести номер курса с клавиатуры и вывести фамилии всех студентов с этого курса.