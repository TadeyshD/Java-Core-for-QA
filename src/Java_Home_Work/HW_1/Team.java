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
    protected abstract int stamina();
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

    public void lets_run(){
        System.out.println(stamina());
    }
    }
