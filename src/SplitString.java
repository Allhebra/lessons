/*Написано 05.11.17
 *автор Александр Береговой
 *разбиение строки
 */

public class SplitString {

    public static void main(String[] args) {

        String string = "1, 2, 3, 4, 5";
        String[] array = string.split(", ");
        int sum = 0;
        for (String str:array) {
            sum += Integer.parseInt(str);
        }
        System.out.print(sum);
    }
}
