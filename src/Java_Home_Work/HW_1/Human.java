package Java_Home_Work.HW_1;

public class Human extends Team{

    public Human(String name, String type) {
        super(name, type);
    }

    @Override
   protected final int stamina(){
        int stamina = random.nextInt(50, 600);
            return stamina;
    }

}
