package Java_Home_Work.HW_3.Task_2;

public class Fruit {
    private int weight;
    private String type;
    public static int fruit_count;

    public Fruit(String type, int weight) {
        this.type = type;
        this.weight = weight;
        ++fruit_count;
    }

    public String get_fruit(){
        return (type + " " + weight + "f.");
    }
    public void print_fruit(){
        System.out.println(get_fruit());
    }

    public String getType() {
        return type;
    }
    public int getWeight() {
        return weight;
    }


}
