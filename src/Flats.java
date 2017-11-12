/*Написано 12.11.17
 *автор Александр Береговой
 *задача "квартиры"
 */

import java.util.Scanner;

public class Flats {

    private static final int FLAT_ON_FLOOR = 4;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество подьездов: ");
        int porchInBuilding = scanner.nextInt();
        System.out.println("Введите количество этажей: ");
        int floorInPorch = scanner.nextInt();
        System.out.println("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();

        int flatInPorch = FLAT_ON_FLOOR*floorInPorch;

        if (flatNumber > 0 && flatNumber <= FLAT_ON_FLOOR*floorInPorch*porchInBuilding) {
            System.out.println(getPorch(flatNumber, flatInPorch) + " подьезд");
            System.out.println(getFloor(flatNumber, floorInPorch, flatInPorch) + " этаж");
            System.out.println(getFlatLocation(flatNumber));
            schema(porchInBuilding, floorInPorch);
        }
        else {
            System.out.println("Квартира с таким номером в данном доме отсутствует");
        }

        /*цикл для проверки правильности алгоритма
         *for (int i=1; i<=80; i++) {
         *    System.out.println(getPorch(i, flatInPorch) + " подьезд " + getFloor(i, floorNumber, flatInPorch) + " этаж");
         *}
         */
    }

    private static int getPorch(int flatNumber, int flatInPorch) {

        int porchNumber;
        if (flatNumber % flatInPorch==0) {
            porchNumber = flatNumber/flatInPorch;
        }
        else {
            porchNumber = flatNumber/flatInPorch + 1;
        }
        return porchNumber;
    }

    private static int getFloor(int flatNumber, int floorInPorch, int flatInPorch) {

        int florNumber;
        if ((flatNumber % flatInPorch) % FLAT_ON_FLOOR==0) {
            if (flatNumber % flatInPorch==0) {
                florNumber = floorInPorch;
            }
            else {
                florNumber = (flatNumber % flatInPorch) / FLAT_ON_FLOOR;
            }
        }
        else {
            florNumber = (flatNumber % flatInPorch) / FLAT_ON_FLOOR + 1;
        }
        return florNumber;
    }

    private static String getFlatLocation(int flatNumber) {

        int location = flatNumber%FLAT_ON_FLOOR;
        switch (location) {
            case 1: return "ближняя слева";
            case 2: return "дальняя слева";
            case 3: return "дальняя справа";
            case 0: return "ближняя справа";
        }
        return "";
    }

    //метод для визуализации расположения квартир
    private static void schema(int porchInBuilding, int floorInPorch) {

        for (int i=floorInPorch; i>0; i--) {
            for (int j=1; j<=porchInBuilding; j++) {
                for (int k=1; k<=FLAT_ON_FLOOR; k++) {
                    System.out.printf("%4d", (i - 1) * FLAT_ON_FLOOR + (j - 1) * floorInPorch * FLAT_ON_FLOOR +k);
                }
                System.out.print("  || ");
            }
            System.out.println();
        }
    }
}
