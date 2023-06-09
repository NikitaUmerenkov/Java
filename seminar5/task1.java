// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int element : item.getValue()) {
                phones = phones + element + " ";
            }
            phones = phones.trim().replaceAll(" ", ", ");
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 432123, bookPhone);
        addNumber("Куплинов", 123542, bookPhone);
        addNumber("Нестеров", 1244654, bookPhone);
        addNumber("Нестеров", 25728769, bookPhone);
        addNumber("Нестеров", 548562345, bookPhone);
        addNumber("Иванов", 45734562, bookPhone);
        printBook(bookPhone);
    }
}
