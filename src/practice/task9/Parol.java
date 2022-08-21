package practice.task9;

import java.util.Scanner;

// Ввести пароль из командной строки и сравнить его со строкой-образцом.
public class Parol {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String psw = input.next();

            if (psw.equals("work")) {
                System.out.println("Верный пароль!");
            } else {
                System.out.println("Неверный пароль!");
            }
        }
    }
