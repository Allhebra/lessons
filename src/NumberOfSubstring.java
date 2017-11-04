/*Написано 05.11.17
 *автор Александр Береговой
 *расчет количества вхождений подстроки в строку без учета регистра
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOfSubstring {

    public static void main(String[] args) throws FileNotFoundException {

        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner( new FileInputStream("./src/input.txt"))) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
            }
        }
        String string = stringBuilder.toString();
        String substring = "текст";
        System.out.println(getOccurrencesNumber(string, substring));
    }

    private static int getOccurrencesNumber(String string, String substring) {

        String str = string.toLowerCase();
        int startIndex = 0;
        int count = 0;
        while (startIndex<=str.length()) {
            int index = str.indexOf(substring, startIndex);
            if (index == -1) {
                break;
            }
            else {
                startIndex = index+substring.length();
                count++;
            }
        }
        return count;
    }
}
