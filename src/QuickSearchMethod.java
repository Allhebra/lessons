/*Написано 02.11.17
автор Александр Береговой
быстрая сортировка
*/

import java.util.Arrays;

public class QuickSearchMethod {

    private static int[] array = new int[]{12, 3, 0, 4, 6, 8, 9};

    public static void main(String[] args) {

        System.out.println("Исходный массив: " + Arrays.toString(array));
        int left = 0;
        int right = array.length-1;
        quickSorting(array, left, right);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    private static void quickSorting(int[] array, int left, int right) {

        if (array.length==1) {
            return;
        }
        if (array.length==2) {
            if (array[0]>array[1]) {
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
        }
        if (left >= right)
            return;
        int i = left, j = right;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quickSorting(array, left, cur);
        quickSorting(array,(cur+1), right);
    }
}