/*Написано 04.10.17
автор Александр Береговой
вызов одной функции из другой функции
*/

import java.util.Scanner;

public class PrintAndRead {

    static int printAndRead(String inputInvitation) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(inputInvitation);
        int intNumber = scanner.nextInt();
        return intNumber;
    }

    public static void main(String[] args) {

        int a = printAndRead("Введите целое число: ");
        int b = printAndRead("Введите второе целое число: ");
        int c = printAndRead("Введите еще одно целое число: ");

        System.out.printf(" %d\n %d\n %d", a, b, c);

    }
}