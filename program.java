/**
 * program
 */
// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона.
//  Используя данные из массива найдите их кубы.

// import java.util.Scanner;
// public class program {
//     static int getInt(String prompt) {
// 		System.out.print(prompt);
// 		while (true) {
// 			try {
// 				return Integer.parseInt(new Scanner(System.in).next());
// 			} catch (NumberFormatException ne) {
// 				System.out.print("Не удалось распознать число.\n" + prompt);
// 			}
// 		}
// 	}
//     public static void main(String[] args) {
//         int numberA = getInt("Введите число A: ");
// 		int numberB = getInt("Введите число B: ");

//         if (numberA < 1 | numberA > 1000) {
//             System.out.println("Ошибка, число A не находится в диапозоне от 1 до 1000");
//         }
//         if (numberB < 1 | numberB > 1000) {
//             System.out.println("Ошибка, число B не находится в диапозоне от 1 до 1000");
//         }
    
//         int [] array = new int[10];
//         for (int i = 0; i < array.length; i++){
//             array[i] = (int) Math.pow((i+1), 3);
//         }

//         for (int i = 0; i < array.length; i++){
//             if (((array[i] / numberA) / numberA) == numberA){
//                 System.out.println((int) Math.pow(numberA, 3));
//             }
//         }

//         for (int i = 0; i < array.length; i++){
//             if (((array[i] / numberB) / numberB) == numberB){
//                 System.out.println((int) Math.pow(numberB, 3));
//             }
//         }
//     }
// }


// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа.
// Выведите на экран результат умножения построчно.

// import java.util.Scanner;
// public class program {
//     static int getInt(String prompt) {
// 		System.out.print(prompt);
// 		while (true) {
// 			try {
// 				return Integer.parseInt(new Scanner(System.in).next());
// 			} catch (NumberFormatException ne) {
// 				System.out.print("Не удалось распознать число.\n" + prompt);
// 			}
// 		}
// 	}
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println ("введите размер массива: ");
//         int size = input.nextInt();
//         int array[] = new int[size];
//         System.out.println("заполните массив элементами:");
//         for (int i = 0; i < size; i++) {
//             array[i] = input.nextInt();
//         }
//         System.out.print ("элементы массива:");
//         for (int i = 0; i < size; i++) {
//         System.out.print (" " + array[i]);
//         }
//         System.out.println();

//         int f = getInt("Введите число f: ");

//         for (int i = 0; i < array.length; i++){
//             array[i] = array[i] * f;
//             System.out.println(array[i]);
            
//         }

//     }
    
// }








// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

// import java.util.Scanner;
// public class program {
//     static int getInt(String prompt) {
//         		System.out.print(prompt);
//         		while (true) {
//         			try {
//         				return Integer.parseInt(new Scanner(System.in).next());
//         			} catch (NumberFormatException ne) {
//         				System.out.print("Не удалось распознать число.\n" + prompt);
//         			}
//                 }
//             }
//    public static void main(String[] args) {
//       double num1;
//       double num2;
//       double ans;
//       char op;
//       Scanner reader = new Scanner(System.in);
//       System.out.print("введите 2 числа: ");
//       num1 = reader.nextDouble();
//       num2 = reader.nextDouble();
//       System.out.print("\nвведите операцию (+, -, *, /): ");
//       op = reader.next().charAt(0);
//       switch(op) {
//          case '+': ans = num1 + num2;
//             break;
//          case '-': ans = num1 - num2;
//             break;
//          case '*': ans = num1 * num2;
//             break;
//          case '/': ans = num1 / num2;
//             break;
//          default:  System.out.printf("Ошибка, некорректный символ");
//             return;
//       }
//       System.out.print("\nрезультат вычисления равен:\n");
//       System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
//    }
// }