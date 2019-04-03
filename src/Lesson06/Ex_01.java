package Lesson06;

class Ex_01 {


    public static void main(String[] args) {

        Human[] people = new Human[5];

        people[0] = new Human(21, 180, 90, "Kain");
        people[1] = new Human(18, 160, 45, "Saya");
        people[2] = new Human(17, 140, 40, "Maria");
        people[3] = new Human(24, 170, 60, "Ivan");
        people[4] = new Human(16, 178, 65, "Natasha");

        for (int i = 0; i < 5; i++) {
            if (people[i].age > 18) System.out.println(people[i].name);
        }
    }
}

class Human {

    int age;
    int height;
    int weight;
    String name;

    Human(int age, int height, int weight, String name)   //конструктор класса
    {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    int aging(int years)   //метод "старение"
    {
        age = age + years;
        return (age);
    }
}


//0:Спроектировать класс Human.
//Какие параметры(переменные) он должен включать в себя? Подсказка(обязательное поле age - возраст)
//1: Создать массив из обьектов Human. (У каждого обьекта значение age должно быть разным)
//Пройтись по циклу и вывести в консоль имена людей чей возраст > 18 лет