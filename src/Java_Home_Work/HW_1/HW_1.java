package Java_Home_Work.HW_1;

public class HW_1 {
    public static void main(String[] args) {
        Team[] team = new Team[4];
        team[0] = new Human(1, "Alan");
        team[1] = new Human(2, "Dave");
        team[2] = new Human(3, "Vincent");
        team[3] = new Human(4, "Bob");
        for (int i = 0; i < team.length; i++ ){
            team[i].print_team();
        }
        System.out.println("*****");
        Courses[] courses = new Courses[4];
        courses[0] = new Courses();
        courses[1] = new Courses();
        courses[2] = new Courses();
        courses[3] = new Courses();
        for (int i = 0; i < courses.length; i++ ){
            if (courses[i].duration() <= team[i].stamina()){
                System.out.println(team[i].getName() + " прошёл испытание.");
            } else {
                System.out.println(" ");
            }
        }
    }
}
