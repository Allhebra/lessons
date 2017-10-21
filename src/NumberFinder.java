/*Написано 21.10.17
автор Александр Береговой
Поиск введенного с консоли числа в массиве
*/

import java.util.Scanner;

public class NumberFinder {

    public static void main(String[] args) {

        double[] array = new double[]{3.2, 2.7, 7.5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите вещественное число: ");
        double number = scanner.nextDouble();
        System.out.print(findNumber(number, array));
    }

    private static int findNumber(double number, double[] array) {

        for (int i=0; i<array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return  -1;
    }
}