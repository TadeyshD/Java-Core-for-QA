package Java_Home_Work.HW_4.Phone_Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneBook<T> {

    HashMap<String, ArrayList<String>> phone_book = new HashMap<>();


//    public void add() {
//        Scanner add = new Scanner(System.in);
//        String name;
//        int number;
//        for (int i = 0; i < 5; i++){
//            name = add.nextLine();
//            number = add.nextInt();
//            if (phone_book.get(name) != null) {
//                phone_book.get(name).add(number);
//            }
//             else{
//                ArrayList<Integer> tmp = new ArrayList<>();
//                tmp.add(number);
//                phone_book.put(name, tmp);
//            }
//        }
//        } // здесь я пытался реализовать что-то похожее на метод с книгами и автором из вебинара,
//        но сломался о свой недостаточным опыт, видимо. Технически оно работало, но видимо я недостаточно хорошо
//        понял происходящий цикл, потому вышло коряво. Оставлю себе на доработать уже просто для себя, ну и
//        тут как хронику моих страданий :)

public void add(String name, String phone){
    if (phone_book.get(name) == null){
        ArrayList<String> tel = new ArrayList<>();
        tel.add(phone);
        phone_book.put(name, tel);
    } else {
        phone_book.get(name).add(phone);
    }
}
    public ArrayList<String> getPhone_book(String name) {
        return phone_book.get(name);
    }
}

