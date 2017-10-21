/*Написано 21.10.17
автор Александр Береговой
подсчет среднего арифметического четных элементов массива
*/

import java.util.Scanner;

public class AverageFromEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Введите " + i + " элемент массива целого типа: ");
            array[i] = scanner.nextInt();
        }

        double sum = 0;
        int i = 0;
        for (int e:array) {
            if (e%2==0) {
                sum += e;
                i++;
            }
        }
        if (i==0) {
            System.out.print("В введенном массиве нет четных чисел!");
        }
        else {
            double average = sum/i;
            System.out.print(average);
        }
    }
}