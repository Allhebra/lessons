/*Написано 21.10.17
автор Александр Береговой
Поиск максимального числа в массиве
*/

public class MaximumFinder {

    public static void main(String[] args) {

        double[] array = new double[]{-11.8, 3.2, -2.7, 7.5, 10.7};
        System.out.print(findMaxNumber(array));
    }

    private static double findMaxNumber(double[] array) {

        double max = array[0];
        for (int i=0; i<array.length-1; i++) {
            if (array[i+1] > max) {
                max = array[i+1];
            }
        }
        return max;
    }
}