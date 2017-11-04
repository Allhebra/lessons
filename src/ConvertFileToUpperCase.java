/*Написано 04.11.17
автор Александр Береговой
копирование из файла в файл с переводом в верхний регистр
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ConvertFileToUpperCase {

    public  static  void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        try (Scanner scanner= new Scanner(new FileInputStream("./src/input.txt"), "utf-8");
                PrintWriter printWriter = new PrintWriter("./src/output.txt", "utf-8")){
            while (scanner.hasNextLine()) {
                printWriter.println(scanner.nextLine().toUpperCase());
            }
        }
    }
}
