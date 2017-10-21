/*Написано 20.10.17
автор Александр Береговой
перестановка элементов массива в обратном порядке
*/

import java.util.Arrays;

public class ArrayOverturning {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i<array.length; i++) {
            int a = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = a;
            if ((array.length-1)/2-i==0) {
                break;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}