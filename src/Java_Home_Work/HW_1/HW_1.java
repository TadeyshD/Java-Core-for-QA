package Java_Home_Work.HW_1;

import java.nio.charset.CoderResult;

public class HW_1 {
    public static void main(String[] args) {
            Team[] team_member = new Team[4];
            team_member[0] = new Human("Dave", "Human");
            team_member[1] = new Human("Greg", "Human");
            team_member[2] = new Human("Alan", "Human");
            team_member[3] = new Human("Bill", "Human");
            for (int i = 0; i < team_member.length; i++){
                team_member[i].about_team();
                team_member[i].go_team_go();
            }
    Course course = new Course(250);



    }


}
