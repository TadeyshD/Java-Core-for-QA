package Java_Home_Work.HW_2;

/** 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета. **/
public class HW_2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"5", "4", "3", "2"},
                {"5", "4", "3", "2"},
                {"5", "4", "3", "2"},
                {"5", "4", "3", "2"},

        };
        try {
            try {
                int end_calc = size_check(arr);
                System.out.println(end_calc);
            } catch (MyArraySizeException e) {
                System.out.println("Нарушена целостность массива.");
                e.printStackTrace();
            }
        } catch (MyArrayDataException e){
            System.out.println("Ошибка в значении массива.");
            e.printStackTrace();
        }


    }

    public static int size_check(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr.length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
