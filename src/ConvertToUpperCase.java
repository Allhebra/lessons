/*Написано 21.10.17
автор Александр Береговой
преобразование элементов массива строк к верхнему регистру
*/

import java.util.Arrays;

public class ConvertToUpperCase {

    public static void main(String[] args) {
        String[] array = {"П аша", "Ма,ша", "Да?ша"};
        System.out.print(Arrays.toString(changeToUpperCase(array)));
    }

    private static String[] changeToUpperCase(String[] array) {
        String a;
        for (int i=0; i<array.length; i++) {
            a = array[i].toUpperCase();
            array[i] = a;
        }
        return array;
    }
}