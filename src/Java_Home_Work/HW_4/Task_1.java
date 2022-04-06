package Java_Home_Work.HW_4;

import java.util.*;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести
 * список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 */
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Собачка");
        words.add("Котик");
        words.add("Свинка");
        words.add("Собачка");
        words.add("Котик");
        words.add("Свинка");
        words.add("Собачка");
        words.add("Котик");
        words.add("Свинка");
        words.add("Коровка");
        words.add("Овечка");
        words.add("Слонёнок");
        words.add("Волчёнок");
        System.out.println(words);
        Set<String> unique_words = new HashSet<>(words);
        System.out.println(unique_words);
        for (String key: words){
            System.out.print(key + " - " + Collections.frequency(words, key) + ". ");
        }
    }
}