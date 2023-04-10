//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.

package seminar4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
		Deque<Integer> number1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
		Deque<Integer> number2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
		sum(number1, number2);
	}

	public static Deque<Integer> sum(Deque<Integer> number1, Deque<Integer> number2) {
		int first = getNumber(number1);
		int second = getNumber(number2);
		int sum = first + second;
		System.out.println(sum);
		LinkedList<Integer> result = new LinkedList<>();
		while (sum > 0) {
			result.add(sum % 10);
			sum = sum / 10;
		}
		System.out.println(result);
		return result;
	}

	public static int getNumber(Deque<Integer> d) {
		int first = 0;
		int index = 1;
		for (Integer integer : d) {
			first = first + integer * index;
			index = index * 10;
		}
		System.out.println(first);
		return first;
	}
}
