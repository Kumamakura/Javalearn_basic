package Lesson07;

class Animal {

    int age;
    String name;

    void eat(String Food){}
}


class Cat extends Animal{

    @Override                               //переопределение метода родителя
    void eat(String food){
        if (food != "meat") return;
        else {}
    }
}


class Lesson_01{

    Cat cat = new Cat();

}
