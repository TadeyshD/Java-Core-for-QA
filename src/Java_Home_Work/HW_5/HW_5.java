package Java_Home_Work.HW_5;
/**
 *1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 * Структура csv файла:
 * | Строка заголовок с набором столбцов |
 * | Набор строк с целочисленными значениями |
 * | * Разделитель между столбцами - символ точка с запятой (;) |
 *
 * Пример:
 * Value 1;Value 2;Value 3
 * 100;200;123
 * 300;400;500
 * Для хранения данных использовать класс вида:
 * public class AppData {
 *   private String[] header;
 *   private int[][] data;
 *
 *  // ...
 * }
 */

import java.io.File;
import java.util.Arrays;

public class HW_5 {
    public static void main(String[] args) {
       File file = new File("C:\\Users\\Tadeysh\\Desktop\\Java Core for QA\\Java-Core-for-QA\\src\\Java_Home_Work\\HW_5\\test");
        File file2 = new File("C:\\Users\\Tadeysh\\Desktop\\Java Core for QA\\Java-Core-for-QA\\src\\Java_Home_Work\\HW_5\\test");

       Param param = new Param();
        param.read(file);
        System.out.println(Arrays.toString(param.getHead()));
        System.out.println(Arrays.toString(param.getData()[0]));
        System.out.println(Arrays.toString(param.getData()[10]));
        param.write_data(file2);
    }
}
