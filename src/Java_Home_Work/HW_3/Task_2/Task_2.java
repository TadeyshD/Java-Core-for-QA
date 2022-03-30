package Java_Home_Work.HW_3.Task_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * Не забываем про метод добавления фрукта в коробку.
 */
public class Task_2 {

    public static void main(String[] args) {
    Apple apple1 = new Apple();
    Apple apple2 = new Apple();
    Apple apple3 = new Apple();
    Apple apple4 = new Apple();

    Orange orange1 = new Orange();
    Orange orange2 = new Orange();
    Orange orange3 = new Orange();
    Orange orange4 = new Orange();
    Orange orange5 = new Orange();

    Box <Apple> box_1 = new Box<>(apple1, apple2, apple3, apple4);
    Box <Orange> box_2 = new Box<>(orange1, orange2, orange3, orange4, orange5);



    }
}
