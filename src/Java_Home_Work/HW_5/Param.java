package Java_Home_Work.HW_5;

import java.io.*;

public class Param {
    private String[] head;
    private int[][] data;


    public String[] getHead() {
        return head;
    }

    public int[][] getData() {
        return data;
    }

    public void setHead(String[] head) {
        this.head = head;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void read(File file){
        int size = 0;
        try(BufferedReader bfr = new BufferedReader(new FileReader(file))){
            String line;
        while ((line = bfr.readLine()) != null){
        size++;
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

        head = new String[14];
        data = new int[size -1][];
        try(BufferedReader bfr = new BufferedReader(new FileReader(file))){
            head = bfr.readLine().split(";"); //возвращает строковый массив по поределённому признаку
            String line;
            int tmp = 0;
            while ((line = bfr.readLine()) != null){
            String[] dataString = line.split(";");
            int a1 = Integer.parseInt(dataString[0]);
            int a2 = Integer.parseInt(dataString[1]);
            int a3 = Integer.parseInt(dataString[2]);
            data[tmp] = new int[]{a1, a2, a3};
            tmp++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
     System.out.println(size);

    }
    public void write_data(File file){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)) ) {
            bufferedWriter.write(head[0] + "; " + head[1] + "; " + head[2]);

            for (int[] arr: data){
                bufferedWriter.write(arr[0] + "; " + arr[1] + "; " + arr[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
