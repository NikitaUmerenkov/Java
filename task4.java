// Task_4. *
// +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class task4 {
    static int getInt(String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return Integer.parseInt(new Scanner(System.in).next());
            } catch (NumberFormatException ne) {
                System.out.print("Не удалось распознать число.\n" + prompt);
            }
        }
    }
    public static void main(String[] args) {
        int q = getInt("Введите число q: ");
        if (q < 0){
            System.out.println("Ошибка! Число меньше 0");
        }

        int w = getInt("Введите число w: ");
        if (w < 0){
            System.out.println("Ошибка! Число меньше 0");
        }

        int e = q + w;
        System.out.println("\nрезультат вычисления равен: "+ q + "+" + w + "=" + e);
        
        int num1 = (e - (w % 10)) % 10 + ((q / 10) * 10);
        System.out.println("\nчисло q равно: " + num1);
        int num2 = e - num1;
        System.out.println("число w равно: " + num2);



    }
}
