// дана строка, вводится число, опеределть индекс первого и последнего вхождения

// import java.util.Scanner;

// public class allPrograms {

//     public static void main(String[] args) {
//         String numbers = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("введите целое число: ");
//         String n = iScanner.next();
//         int x1 = numbers.indexOf(n);
//         int x2 = numbers.lastIndexOf(n);
//         System.out.println(x1);
//         System.out.println(x2);
//     }
// }

// ****************************************************************

// import java.util.Scanner;
// public class allPrograms {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("любимая буква Маши: ");
//         String masha = iScanner.next();
//         System.out.printf("любимая буква Олега: ");
//         String oleg = iScanner.next();
//         String stroka = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
//         String[] sample = stroka.split(" ");
//         int count1 = 0;
//         int count2 = 0;
//         for (int i = 0; i < sample.length; i++) {
//             if (sample[i].indexOf(masha) != -1) {
//                 count1++;
//             }
//             if (sample[i].indexOf(oleg) != -1) {
//                 count2++;
//             }
//         }
//         System.out.printf("%s, %s\n", count1, count2);
//     }
// }

// ****************************************************************

// import java.util.Scanner;

// public class allPrograms {
//     public class task4 {
//         public static void main(String[] args) {
//             String sample = "Good morning my dear friend. My fish.".toLowerCase();
//             int count = 0;
//             char n = 'm';
//             for (int i = 0; i < sample.length(); i++) {
//                 if (sample.charAt(i) == n) {
//                     count++;
//                 }
//             }
//             System.out.println(count);
//         }
//     }
// }