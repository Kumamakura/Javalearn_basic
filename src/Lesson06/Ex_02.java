package Lesson06;

class Car {

    String mark;
    String color;
    int year;
    double fuelСonsumption;
    double gasoline;
    double gaz;
    double charge;

    void rideGasoline (double distance)
    {
        gasoline =  gasoline - fuelСonsumption * distance;
    }

    void rideGaz (double distance)
    {
        gaz =  gaz - fuelСonsumption * distance;
    }

    void rideCharge (double distance)
    {
        charge =  charge - fuelСonsumption * distance;
    }

    void refuel (double fuel)
    {
        gasoline = gasoline + fuel;
    }

    Car(String mark, String color, int year, double fuelСonsumption, double gasoline) {
        this.mark = mark;
        this.year = year;
        this.color = color;
        this.gasoline = gasoline;
    }

}


//2: Создать класс Car. Добавить параметр gasoline. Написать метод для езды автомобиля "ride", который должен тратить топливо.
//Написать метод дозаправки "refuel", который будет пополнять топливо автомобиля.
//2': Автомобиль может ездить на газу  или электричестве. Добавить параметры gaz и charge. Реализовать методы  "ride"  и "refuel"