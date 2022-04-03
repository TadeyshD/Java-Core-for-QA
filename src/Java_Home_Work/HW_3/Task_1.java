package Java_Home_Work.HW_3;

import java.util.Arrays;

/**
 *  Написать метод, который меняет
 *  два элемента массива местами (массив может быть любого ссылочного типа);
 */
public class Task_1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 7, 9};
        System.out.println(Arrays.toString(arr));
        mixer(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        String[] arr1 = {"Cola", "Pepsi", "Vodka", "Water"};
        System.out.println(Arrays.toString(arr1));
        mixer(arr1, 0, 2);
        System.out.println(Arrays.toString(arr1));
    }

    private static <T> void mixer (T[] array, int index1, int index2){
        T mix = array[index1];
        array[index1] = array[index2];
        array[index2] = mix;
    }
}
