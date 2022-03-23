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
            for (Apple x: apple){
                x.print();
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
    }


}

