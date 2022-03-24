package Java_Home_Work.HW_3.Task_2;

public class Fruit {
    private int weight;
    private String type;
    public static int fruit_count;
    public static int sum;

    public Fruit(String type, int weight) {
        this.type = type;
        this.weight = weight;
        ++fruit_count;
        this.sum = sum();
    }

    public String get_fruit(){
        return (type + " " + weight + "f.");
    }
    public void print(){
        System.out.println(get_fruit());
    }

    public int sum(){
        return weight * fruit_count;
    }
    public void get_sum(){
        System.out.println(sum());
    }

    public String getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }

}
