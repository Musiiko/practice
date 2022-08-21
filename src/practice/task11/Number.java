package practice.task11;

import java.util.Scanner;

//Ввести с консоли n целых чисел. На консоль вывести: Числа, которые делятся на 3.

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число элементов n: ");
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "-й элемент: ");
            a[i] = input.nextInt();
        }

        System.out.println("Числа, которые делятся на 3 : ");
        for (int value : a) {
            if (value % 3 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}

