package Lesson03;
import java.util.Arrays;
public class Less01 {
    public static void main(String[] args) {
        int[] myArray = new int[4]; //ключевое слово new для объявления массива, тип, размер - резервируется память
        int[] myArray2 = {1, 2, 3, 4, 5}; //нумерация начинается с нуля
        //бывают одномерные и многомерные (матрица)
        int [] myArray3 = {1, 6, 8, 4, 0};
        Arrays.sort(myArray3);

        for (int i = 0; i < myArray3.length; i++) {
            System.out.print(myArray3[i]);
        }

        int[][] a1 = new int[5][]; //можно указывать только первое значение размера (строки), в каждой строке свой одномерный массив
        a1[0] = new int[1];
        a1[1] = new int[2];
        a1[4] = new int[5];

        for (int[] a1Index : a1) {
            for (int anAnA1 : a1Index){
                System.out.print(anAnA1);
            }
            System.out.println();
        }

    }
}