/*Написано 17.10.17
автор Александр Береговой
Программа проверяет введенную строку, является она палиндромом или нет
*/

import java.util.Scanner;
import static java.lang.Character.isSpaceChar;
import static java.lang.Character.toLowerCase;

public class Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        if (string.length()==0) {
            System.out.println("Вы ввели пустую строку!");
        }
        else {
            boolean isPalindrom = false;
            int i = 0;
            int j = string.length() - 1;
            while (i < j) {
                if (isSpaceChar(toLowerCase(string.charAt(i)))) {
                    i++;
                }
                if (isSpaceChar(toLowerCase(string.charAt(j)))) {
                    j--;
                }
                if (i == j || i > j) {
                    break;
                }
                if (toLowerCase(string.charAt(i)) == toLowerCase(string.charAt(j))) {
                    isPalindrom = true;
                    i++;
                    j--;
                }
                else {
                    isPalindrom = false;
                    break;
                }
            }
            if (isPalindrom) {
                System.out.print("Введенная вами строка является палиндромом");
            }
            else {
                System.out.print("Введенная вами строка не является палиндромом");
            }
        }
    }
}