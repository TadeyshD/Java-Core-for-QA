package Java_Home_Work.HW_1;

import java.util.Random;

/*2. Добавить класс Team, который будет содержать:
название команды;
массив из четырех участников — в конструкторе можно сразу всех участников указывать);
метод для вывода информации о членах команды, прошедших дистанцию;
метод вывода информации обо всех членах команды.*/
public abstract class Team {
    private String name;
    private String type;

    protected static int stamina() {
        return 0;
    }

    protected Random random = new Random();

    public Team(String name, String type){
        this.name = name;
        this.type = type;
    }


    public String member(){
    return (name + ", " + type + " и его выносливость " + stamina());
    }
    public void about_team(){
        System.out.println(member());
    }

    public String run(){
        if (stamina() >=  Course.length){
            return(name + " успешно преодолел дистанцию, длинной " + Course.length);
        } else {
            return (name + " не смог преодолеть дистанцию, длинной " + Course.length);
        }
    }
    public void go_team_go(){
        System.out.println(run());
    }

}



