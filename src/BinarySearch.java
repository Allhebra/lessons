/*Написано 27.10.17
автор Александр Береговой
проверка принадлежности введенного числа к массиву, вывод индекса числа либо кода ошибки
*/

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = new int[]{1,3,4,6,8,10,11};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int index = searchNoRecursive(number, array);
        System.out.println(index);
        //готовим аргументы для рекурсивной функции
        int leftRecursive = 0;
        int rightRecursive = array.length-1;
        index = searchWithRecursive(array, leftRecursive, rightRecursive, number);
        System.out.println(index);
    }

    private static int searchNoRecursive(int number, int[] array) {

        int left = 0;
        int right = array.length-1;
        int middle = 0;
        while (left<=right) {
            middle = (left + right) / 2;
            if (array[middle] == number) {
                return middle;
            }
            if (array[middle] < number) {
                left = middle+1;
            }
            else {
                right = middle-1;
            }
        }
        if (left>=right) {
            middle = -1;
        }
        return middle;
    }

    private static int searchWithRecursive(int[] array, int left, int right, int number) {
        if (left>right) {
            return -1;
        }
        int middle = (left + right)/2;
        if (array[middle] == number) {
            return middle;
        }
        if (array[middle] < number) {
            left = middle+1;
        }
        else {
            right = middle-1;
        }
        return searchWithRecursive(array, left, right, number);
    }
}