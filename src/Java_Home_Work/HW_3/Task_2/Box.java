package Java_Home_Work.HW_3.Task_2;

import java.util.ArrayList;

public class Box{
    public static void main(String[] args) {
        ArrayList<Apple> apple = new ArrayList<>();
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        apple.add(new Apple());
        for (Apple x: apple) {
            x.print();
            x.get_sum();
        }
        System.out.println("*************************");
        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        for (Orange i: oranges){
            i.print();
        }
        System.out.println(Orange.orange_count);

    }
    public void box_max_weight(){
        int box_weight = 10;
        if (Fruit.sum <= box_weight){
            System.out.println("Лимит коробки превышен");
        }
    }

}

