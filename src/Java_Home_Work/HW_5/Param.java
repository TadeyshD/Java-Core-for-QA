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

import java.io.*;

public class Param {
    private String[] head;
    private int[][] data;


    public String[] getHead() {
        return head;
    }

    public void setHead(String[] head) {
        this.head = head;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void read(File file){
        int size = 0;
        try(BufferedReader bfr = new BufferedReader(new FileReader(file))){
            String line;
        while ((line = bfr.readLine()) != null){
        size++;
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        head = new String[3];
        data = new int[size-1][];
    try {

    }
    }
}
