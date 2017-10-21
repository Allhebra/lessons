/*Написано 20.10.17
автор Александр Береговой
создание и вывод в консоль двумерного массива с таблицей умножения
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер таблицы: ");
        int dimention = scanner.nextInt();

        if (dimention!=0) {
            int[][] multiplicationTable = createArray(dimention);
            for (int[] e:multiplicationTable) {
                for (int j:e) {
                    System.out.printf("%5d  ", j);
                }
                System.out.printf(System.lineSeparator());
            }
            for (int[] e:multiplicationTable) {
                System.out.println("    " + Arrays.toString(e));
            }
        }
        else {
            System.out.print ("Вы ввели ноль!");
        }
    }

    private static int[][] createArray(int dimention) {
        int[][] array = new int[dimention][dimention];
        for (int i = 0; i < dimention; i++) {
            for (int j = 0; j < dimention; j++) {
                array[i][j] = (i+1)*(j+1);
            }
        }
        return array;
    }
}