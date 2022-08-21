package practice.task1;//программа выводит числа заданого массива в обратном порядке

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an amount of numbers: ");
        int amount = scan.nextInt();
        int[] sent = new int[amount];
        System.out.println("Enter these numbers: ");
        for (int i = 0; i < amount; i++) {
            sent[i] = scan.nextInt();
        }
        for (int i = amount - 1; i >= 0; i--) {
            System.out.print(sent[i] + " ");
        }
    }
}
