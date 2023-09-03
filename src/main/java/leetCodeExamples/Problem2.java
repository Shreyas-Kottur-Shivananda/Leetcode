package leetCodeExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem2 {

    public static void main(String[] arg) {
        System.out.print(isValid("([{}])"));
    }

    public static boolean isValid(String s) {
        Deque<Character> chars = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    chars.push('(');
                    break;
                case '{':
                    chars.push('{');
                    break;
                case '[':
                    chars.push('[');
                    break;
                case ')':
                    if (!chars.isEmpty()) {
                        if (chars.peek() == '(') {
                            chars.pop();
                        } else {
                            chars.push(')');
                        }
                    } else {
                        chars.push(')');
                    }
                    break;
                case '}':
                    if (!chars.isEmpty()) {
                        if (chars.peek() == '{') {
                            chars.pop();
                        } else {
                            chars.push('}');
                        }
                    }
                    else {
                        chars.push('}');
                    }
                    break;
                case ']':
                    if (!chars.isEmpty()) {
                        if (chars.peek() == '[') {
                            chars.pop();
                        } else {
                            chars.push(']');
                        }
                    }
                    else {
                        chars.push(']');
                    }
                    break;
            }
        }

        return chars.isEmpty();
    }

}
