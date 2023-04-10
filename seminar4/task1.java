// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом

package seminar4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task1 {
    public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println(checkOn(deque) ? "Палиндром" : "Не палиндром");
	}

	public static boolean checkOn(Deque<Integer> deque) {
		for (int i = 0; i < deque.size() / 2; i++) {
			if (deque.pollFirst() != deque.pollLast()) {
				return false;
			}
		}
		return true;
	}
}
