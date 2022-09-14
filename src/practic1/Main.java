package practic1;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(5);
        obj.setDlina(11.1);
        System.out.println(obj.square());
        System.out.println(obj.toString());
        System.out.println(obj.getDlina());

        Scanner sc = new Scanner(System.in);
        int len = 0;
        System.out.println("Введите длину массива");
        if(sc.hasNextInt()) {
            len = sc.nextInt();
        }
        else {
            System.out.println("Error");
        }

        int sum = 0;
        double sr = 0;
        int [] mas = new int[len];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        sr = sum/mas.length;

        int max_value = mas[0];
        int min_value = mas[0];

        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > max_value) {
                max_value = mas[i];
            }
            if(mas[i] < min_value) {
                min_value = mas[i];
            }
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее арифметическое значение = " + sr);
        System.out.println("Максимальный элемент: " + max_value);
        System.out.println("Минимальный элемент: " + min_value);

        String s = "1";
        for(int i = 2; i <=10; i++) {
            s = s + "+1/" + i;
        }
        System.out.println("Гармонический ряд:" + s);

        for(int i=0;i< args.length;i++) {
            System.out.println("Аргументы кнсоли:" + args[i]);
        }

        System.out.println("Введите число для факториала");
        int numb = sc.nextInt();
        Factorial(numb);

        Random rand = new Random();
        int [] mas2 = new int[len];
        for(int i=0; i < mas2.length; i++)
        {
            mas2[i] = rand.nextInt(1000);
            System.out.print(mas2);
        }
    }

    public static void Factorial(int number) {
        long factorial = 1;
        for(int i=2;i<=number;i++) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }


}