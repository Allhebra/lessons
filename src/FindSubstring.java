/*Написано 15.10.17
автор Александр Береговой
Поиск подстроки максимальной длины
*/

import java.util.Scanner;
import static java.lang.String.valueOf;
import static java.lang.Character.toLowerCase;

public class FindSubstring {

    private static String result = "";
    private static String substring = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();

        if (string.length()==0) {
            System.out.println("Вы ввели пустую строку!");
        }
        else {
            int substringLength = 1;
            int index = 0;

            while (index < string.length()) {
                int k = countOfRepeatings(string, index);
                if (k >= substringLength) {
                    substringLength = k;
                    result = substring;
                    index += k;
                } else {
                    index++;
                }
            }
            System.out.printf("Вы ввели: %s%nДлина максимальной подстроки: %d%nПодстрока: %s", string, substringLength, result);
        }
    }

    private static int countOfRepeatings(String string, int index) {

        int count = 1;
        substring = valueOf(string.charAt(index));
        for (int i = index; i<(string.length()-1); i++) {
            if (toLowerCase(string.charAt(i)) == toLowerCase(string.charAt(i + 1))) {
                substring += valueOf(string.charAt(i + 1));
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}