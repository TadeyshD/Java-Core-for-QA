package Java_Home_Work.HW_3.Task_2;

public class Fruit {
    private int weight;
    private String type;

    public Fruit(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}