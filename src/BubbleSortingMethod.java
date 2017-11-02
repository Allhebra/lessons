/*Написано 31.10.17
автор Александр Береговой
сортировка массива пузырьком
*/

import java.util.Arrays;

public class BubbleSortingMethod {

    public static void main(String[] args) {

        int[] array = new int[]{12, 3, 4, 6, 8, 10, 11};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] sortedArray = bubbleSorting(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }

    private static int[] bubbleSorting(int[] array) {

        for (int i=array.length-1; i>1; i--){
            boolean flag = false;
            for (int j=0; j < i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Алгоритм отработал по оптимизированному варианту");
                break;
            }
        }
        return array;
    }
}