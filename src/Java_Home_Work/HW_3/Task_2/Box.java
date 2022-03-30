package Java_Home_Work.HW_3.Task_2;


public class Box <T extends Fruit>{
    private T [] fruit_box;

    public Box (T... fruit_box){
        this.fruit_box = fruit_box;
    }
}


