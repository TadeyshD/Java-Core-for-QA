package Java_Home_Work.HW_3.Task_2;


import java.util.ArrayList;

public class Box <T extends Fruit> {

    ArrayList<T> fruit_list = new ArrayList<>();

    public void add(T fruit) {
        fruit_list.add(fruit);
    }

    public float getWeight() {
        if (fruit_list.size() == 0) {
            return 0;
        }
        return fruit_list.size() * fruit_list.get(0).getWeight();
    }

    public void printWeight() {
        System.out.println(getWeight());
    }

    public boolean compare(Box<?> boxComp1) {
        return (getWeight() == boxComp1.getWeight());
//        if (getWeight() == boxComp1.getWeight()) {
//            System.out.println("Boxes are equal.");
//        }
//        if (getWeight() > boxComp1.getWeight()) {
//            System.out.println("Box 1 is larger than box 2.");
//        }
//
//        else{
//            System.out.println("Box 2 is larger than box 1.");
//        }
    }

    public void fruit_logistic(Box<T> box_for_pour){
            box_for_pour.fruit_list.addAll(this.fruit_list);
            this.fruit_list.clear();

    }

    public ArrayList<T> getFruit_list() {
        return fruit_list;
    }

    public void setFruit_list(ArrayList<T> fruit_list) {
        this.fruit_list = fruit_list;
    }
}
