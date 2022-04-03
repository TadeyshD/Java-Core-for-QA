package Java_Home_Work.HW_3.Task_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * Для хранения фруктов внутри коробки можно использовать ArrayList;
 * Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f
 * (единицы измерения не важны);
 * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare()
 * в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
 * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * Не забываем про метод добавления фрукта в коробку.
 */
public class Task_2 {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> another_appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> another_orangeBox = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        another_appleBox.add(new Apple());
        another_appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        another_orangeBox.add(new Orange());
        another_orangeBox.add(new Orange());

        appleBox.printWeight();
        another_appleBox.printWeight();
        orangeBox.printWeight();
        another_orangeBox.printWeight();
        System.out.println("**********");
        System.out.println(orangeBox.compare(another_orangeBox));
        System.out.println("**********");
        appleBox.fruit_logistic(another_appleBox);
        appleBox.printWeight();
        another_appleBox.printWeight();
        another_appleBox.fruit_logistic(appleBox);
        appleBox.printWeight();
        another_appleBox.printWeight();
    }
}
