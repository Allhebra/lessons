/*Написано 28.10.17
автор Александр Береговой
рекурсивная версия алгоритма Евклида(нахождение наибольшего общего делителя)
*/

import java.util.Scanner;

public class EvklidAlgorithmRecursive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.printf("Наибольший общий делитель чисел %d и %d равен %d", a, b, searchWithRecursive(a, b));
    }

    private static int searchWithRecursive(int a, int b) {

        int nod;
        if ((a % b) == 0) {
            nod = b;
            return nod;
        } else {
            int temporary = a;
            a = b;
            b = temporary % b;
            return searchWithRecursive(a, b);
        }
    }
}