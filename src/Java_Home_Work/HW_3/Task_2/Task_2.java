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

            Apple app1 = new Apple();
            Orange orange1 = new Orange();
            System.out.println(app1.getWeight());
            System.out.println(orange1.getWeight());


            FruitBox<Apple> appleBox = new FruitBox<Apple>(app1, 3);
            System.out.println(appleBox.getWeight());
            FruitBox<Orange> orangeBox = new FruitBox<Orange>(orange1, 2);
            System.out.println(orangeBox.getWeight());

            System.out.println();
            System.out.println(orangeBox.compare(appleBox));

        }
    }


    abstract class Fruit {

        private float weight;

        void setWeight(float weight) {
            this.weight = weight;
        }

        float getWeight() {
            return weight;
        }

        Fruit(){
        }
    }

    class Orange extends Fruit{

        Orange() {
            this.setWeight(1.5f);
        }
    }

    class Apple extends Fruit {

        Apple() {
            this.setWeight(1.0f);
        }
    }

    class FruitBox<T extends Fruit> {

        private T obj;
        private int fruitCount;

        public FruitBox(T obj, int fruitCount) {
            this.obj = obj;
            this.fruitCount = fruitCount;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }

        public void addFruit(int num) {
            fruitCount += num;
        }

        float getWeight() {
            float boxWeight = fruitCount * obj.getWeight();
            return boxWeight;
        }

        public boolean compare(FruitBox<?> box) {
            return this.getWeight() == box.getWeight();
        }
        }

