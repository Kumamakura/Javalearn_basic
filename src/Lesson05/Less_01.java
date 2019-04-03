package Lesson05;

class Car {

    String mark;
    String color;
    int year;
    double engineVolume;
    int power;

    void ride(){

    }

    void fly(){

    }

    Car(String mark, int year, String color, double engineVolume, int power){
        this.mark = mark;
        this.year = year;
        this.color = color;
        this.engineVolume = engineVolume;
        this.power = power;
    }
}

class TochkaCar{

    TochkaCar(){

            this.mark = "TochkaCar";
            this.year = 2019;
            this.color = "red";
            this.engineVolume = 1.2;
            this.power = 138;
        }

    String mark;
    String color;
    int year;
    double engineVolume;
    int power;
}

class Sample{

    {
        TochkaCar tc = new TochkaCar();
        Car car1 = new Car("Tochka car", 2019, "red", 1.2, 138);

        /*
        car1.color = "red";
        car1.power = 138;
        car1.engineVolume = 1.2;
        car1.mark = "TochkaCar";
        car1.year = 2019;
        */

        car1.ride();
        car1.fly();

    }
}
