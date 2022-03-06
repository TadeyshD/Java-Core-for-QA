package Java_Home_Work.HW_1;

import java.util.Random;

public class Human extends Team {
    Random random = new Random();
    public Human(int number, String name) {
        super(number, name);
        this.setType("human");
    }
    @Override
    public int stamina(){
        int stamina = random.nextInt(100, 500);
        return stamina;
    }
}
