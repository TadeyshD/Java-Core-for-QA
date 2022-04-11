package Java_Home_Work.HW_5;

import java.io.File;
import java.util.Arrays;

public class HW_5 {
    public static void main(String[] args) {
        File  file = new File("src/Java_Home_Work/HW_5/File");
        Param param = new Param();
        param.read(file);
        System.out.println(Arrays.toString(param.getData()));

    }
}
