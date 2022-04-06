package Java_Home_Work.HW_4.Phone_Book;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
 * номер телефона по фамилии. Следует учесть, что под одной фамилией может
 * быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Phone {
    public static void main(String[] args) {
        PhoneBook list_of_number = new PhoneBook();
        list_of_number.add("Bill", "547 65 23");
        list_of_number.add("Bill", "547 89 63");

        list_of_number.add("Sam", "545 56 87");

        System.out.println(list_of_number.getPhone_book("Bill"));

    }

}
