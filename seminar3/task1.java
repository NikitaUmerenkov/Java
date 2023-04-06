// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {

    public static List<Integer> removeEvenValue(List<Integer> list) {

        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(75, 99, 34, -9, 34, 58, 864));
        System.out.print("removeEvenValue array: ");
        System.out.println(removeEvenValue(list));
    }

}