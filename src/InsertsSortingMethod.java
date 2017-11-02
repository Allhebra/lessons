/*Написано 01.11.17
автор Александр Береговой
сортировка массива вставками
*/

import java.util.Arrays;

public class InsertsSortingMethod {

    public static void main(String[] args) {

        int[] array = new int[]{12, 3, 0, 4, 6, 1, 8, 10, 11};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] sortedArray = insertsSorting(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }

    private static int[] insertsSorting(int[] array) {

        for (int i=1; i<array.length; i++){
            int temp = array[i];
            for (int j=i-1;; j--) {
                if (temp<array[j]) {
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                if (j==0) {
                    break;
                }
            }
        }
        return array;
    }
}