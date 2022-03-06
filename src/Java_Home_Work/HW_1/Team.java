package Java_Home_Work.HW_1;

public abstract class Team{
private int number;
private String name;
private String type;
protected abstract int stamina();


    public Team(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public String about_team(){
        return (name + ", " + type);
    }

    public void print_team(){
        System.out.println(about_team());
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
}
