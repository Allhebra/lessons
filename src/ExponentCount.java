/*Написано 28.10.17
автор Александр Береговой
возведение в степень рекурсивным и не рекурсивным методом
*/

import java.util.Scanner;

public class ExponentCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();

        int index = calculateNoRecursive(a, b);
        System.out.println(index);
        index = calculateWithRecursive(a, b);
        System.out.println(index);
    }

    private static int calculateNoRecursive(int a, int b) {

        int result = 1;
        for (int i = 0; i<b; i++) {
            result *=a;
        }
        return result;
    }

    private static int calculateWithRecursive(int a, int b) {

        if (b!=1) {
            return a*calculateWithRecursive(a, --b);
        }
        else {
            return a;
        }
        //return b!=1 ? a*calculateWithRecursive(a,--b) : a;
    }
}