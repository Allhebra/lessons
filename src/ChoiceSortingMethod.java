/*Написано 31.10.17
автор Александр Береговой
сортировка массива выбором
*/

import java.util.Arrays;

public class ChoiceSortingMethod {

    public static void main(String[] args) {

        int[] array = new int[]{12, 3, 4, 0, 6, 1, 8, 10, 11};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] sortedArray = choiseSorting(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }

    private static int[] choiseSorting(int[] array) {

        for (int i=0; i<array.length-1; i++) {
            int min = array[i];
            int index_min = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j + 1] < min) {
                    min = array[j + 1];
                    index_min = j + 1;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index_min] = temp;
        }
        return array;
    }
}