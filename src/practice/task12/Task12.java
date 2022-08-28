package practice.task12;
/*  Ввести n чисел с консоли.
    Найти самое короткое и самое длинное число. Вывести найденные числа и их длину. */

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число элементов n: ");
        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "-й элемент: ");
            a[i] = input.nextInt();
        }

        if (n > 0) {
            int min = Math.abs(a[0]), max = Math.abs(a[0]);
            for (int value : a) {
                if (Math.abs(value) > max) {
                    max = Math.abs(value);
                }
                if (Math.abs(value) < min) {
                    min = Math.abs(value);
                }
            }

            int minDigitsCount = getDigitsCount(min), maxDigitsCount = getDigitsCount(max);

            System.out.println("Самое короткое число = " + min + ", количество знаков = " + minDigitsCount);
            System.out.println("Самое длинное число = " + max + ", количество знаков = " + maxDigitsCount);
        } else {
            System.out.print("Невозможно найти самое короткое и длинное число");
        }
    }

    public static int getDigitsCount(int value) {
        int digitsCount = 0;
        while (value > 0) {
            digitsCount++;
            value /= 10;
        }
        return digitsCount;
    }

}
