/*
     Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. 
*/

package seminar5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task2 {
    private static String getFirstWord(String sentence) {
        String delimiter = " ";
        String[] words = sentence.split(delimiter);
        return words[0];
    }

    public static <N, S extends Comparable<S>> Map<N, S> sortByValues(final Map<N, S> map) {
        Comparator<N> valueComparator = new Comparator<N>() {
            public int compare(N k1, N k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0)
                    return 1;
                else
                    return compare;
            }
        };
        Map<N, S> sortedByValues = new TreeMap<N, S>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public static void main(String[] args) {
        String[] stroka = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов",

        };

        List<String> lst = Arrays.asList(stroka);

        TreeMap<String, Integer> myMap = new TreeMap<>();
        for (String myStr : lst) {
            String localName = getFirstWord(myStr);
            if (myMap.containsKey(localName)) {
                myMap.put(localName, myMap.get(localName) + 1);
            } else {
                myMap.put(localName, 1);
            }
        }
        
        System.out.println(sortByValues(myMap));
    }
}
