package Lesson06;

public class Car11{

    private int gasoline=0;
    private int gaz=0;
    private int charge=0;

    void ride(int litrs, int typeFuel){
        switch(typeFuel){
            case 0:
                if((gasoline-litrs)<=0){
                    System.out.println("Ты пытаешься потратить "+litrs+" литров(а) топлива. У меня нет столько топлива для поездки. Заправься!");
                } else {
                    gasoline=gasoline-litrs;
                    System.out.println("Я проехался и потратил "+litrs+" литров(а).");
                }
                break;
            case 1:
                if((gaz-litrs)<=0){
                    System.out.println("Ты пытаешься потратить "+litrs+" литров(а) газа. У меня нет столько топлива для поездки. Заправься!");
                } else {
                    gaz=gaz-litrs;
                    System.out.println("Я проехался и потратил "+litrs+" литров(а) газа.");
                }
                break;
            case 2:
                if((charge-litrs)<=0){
                    System.out.println("Ты пытаешься потратить "+litrs+" % заряда аккумулятор. У меня разражен аккумулятор. Заряди его!");
                } else {
                    charge=charge-litrs;
                    System.out.println("Я проехался и потратил "+litrs+" % заряда аккумулятор. Осталось "+charge+"% заряда.");
                }
                break;
        }
    }

    void refuel(int litrs, int typeFuel){
        switch(typeFuel){
            case 0:
                gasoline=gasoline+litrs;
                System.out.println("Долили "+litrs+" литров(а). Сейчас в баке "+gasoline+" литров(а).");
                break;
            case 1:
                gaz=gaz+litrs;
                System.out.println("Долили "+litrs+" литров(а) газа. Сейчас в баке "+gaz+" литров(а) газа.");
                break;
            case 2:
                charge=charge+litrs;
                System.out.println("Зарядился на "+litrs+" %. Сейчас аккумулятор заряжен на "+charge+" %");
                break;
        }
    }
}
