package Java_Home_Work.HW_1;

import java.util.Random;

public class Courses {
    Random random = new Random();

    public Courses() {
        this.duration();
    }
    public int duration(){
        int duration = random.nextInt(200,600);
        return duration;
    }
    public void print_courses(){
        System.out.println(duration());
    }

    public int getDuration() {
        return duration();
    }
}
