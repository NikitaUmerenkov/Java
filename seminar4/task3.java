//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

package seminar4;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
		String s = "({[]{[Git]}})";
		System.out.println(s);
		System.out.println(validate(s));
	}

	private static boolean validate(String input) {
		Map<Character, Character> brackets = new HashMap<>();
		brackets.put(')', '(');
		brackets.put('}', '{');
		brackets.put(']', '[');

		Deque<Character> stack = new LinkedList<>();

		for (char c : input.toCharArray()) {
			if (brackets.containsValue(c)) {
				stack.push(c);

			}
            else if (brackets.containsKey(c)) {
				if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
