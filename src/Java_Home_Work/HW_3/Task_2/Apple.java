package Java_Home_Work.HW_3.Task_2;

public class Apple extends Fruit{
    public static int apple_count = 0;

    public Apple() {
        super("Apple", 1);
        ++apple_count;


    }
    public static String how_much_apple(){
        return ("We have a " + apple_count + " apple " + " in this box." );
    }
    public static void get_how_much_apple(){
        System.out.println(how_much_apple());
    }

}

