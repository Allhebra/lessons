/*Написано 21.10.17
автор Александр Береговой
проверка массива на порядок элементов (отсортирован/неотсортирован)
*/

public class SortingChecker {

    public static void main(String[] args) {

        int[] ascendingArray = {1,2,3,4,5,6,7,8,9};
        int[] descendingArray = {9,8,7,6,5,4,3,2,1};
        int[] disoderedArray = {1,9,2,8,3,7,4,6,5};

        System.out.println(isAscending(ascendingArray));
        System.out.println(isDescending(ascendingArray));

        System.out.println(isAscending(descendingArray));
        System.out.println(isDescending(descendingArray));

        System.out.println(isAscending(disoderedArray));
        System.out.println(isDescending(disoderedArray));
    }

    private static boolean isAscending(int[] array) {
        boolean isAscending = false;
        for (int i=0; i<array.length-1; i++) {
            if (array[i] < array[i+1]) {
                isAscending = true;
            }
            else {
                isAscending = false;
                break;
            }
        }
        return isAscending;
    }

    private static boolean isDescending(int[] array) {
        boolean isDescending = false;
        for (int i=0; i<array.length-1; i++) {
            if (array[i] > array[i+1]) {
                isDescending = true;
            }
            else {
                isDescending = false;
                break;
            }
        }
        return isDescending;
    }
}