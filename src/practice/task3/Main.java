package practice.task3;
//выводит на экран главную и побочную диагонали квадратной матрицы

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max, min;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Введите значения матрицы: ");
        for (int i = 0; i < size; i++) {
            for (int k = 0; k <= size - 1; k++) {
                System.out.println("Введите элемент массива [" + i + "][" + k + "]");
                matrix[i][k] = input.nextInt();
            }
        }//ввод элементов матрицы с клавиатуры
        input.close();
        min = matrix[0][0];
        max = matrix[0][0];
        for (int i = 0; i < size; i++) {
            for (int k = 0; k < size; k++) {
                if (min < matrix[i][k]) {
                    min = matrix[i][k];
                }
                if (max > matrix[i][k]) {
                    max = matrix[i][k];
                }
            }
        }
        System.out.println("Главная диагональ:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }//вывод главной диагонали
        System.out.println("\nПобочная диагональ:");
        for (int i = 0, k = size - 1; i < size && k >= 0; k--, i++) {
            System.out.print(matrix[k][i] + " ");
        }//вывод побочной диагонали
    }
}
