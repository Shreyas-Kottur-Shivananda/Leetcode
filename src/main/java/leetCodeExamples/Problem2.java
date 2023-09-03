package leetCodeExamples;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

    public static void main(String[] arg) {
        System.out.print(isValid("()"));
    }

    public static boolean isValid(String s) {
        Map<String, Integer> chars = new HashMap<>();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    if (!chars.containsKey("(")) {
                        chars.put("(", 1);
                    } else{
                        var count = chars.get("(") + 1;
                        chars.put("(",count);
                    }
                    break;
                case ')':
                    if(chars.containsKey("(")){
                        var count = chars.get("(") - 1;
                        chars.put("(",count);
                    }
                    break;
                case '{':
                    if (!chars.containsKey("{")) {
                        chars.put("{", 1);
                    } else{
                        var count = chars.get("{") + 1;
                        chars.put("{",count);
                    }
                    break;

                case '}':
                    if(chars.containsKey("}")){
                        var count = chars.get("}") - 1;
                        chars.put("}",count);
                    }
                    break;
                case '[':
                    if (!chars.containsKey("[")) {
                        chars.put("[", 1);
                    } else{
                        var count = chars.get("[") + 1;
                        chars.put("[",count);
                    }
                    break;

                case ']':
                    if(chars.containsKey("]")){
                        var count = chars.get("]") - 1;
                        chars.put("]",count);
                    }
                    break;
                default:
                    break;
            }
        }
        if(chars.containsKey("(") && chars.get("(") >= 0){
            flag = true;
        }
        if(chars.containsKey("{") && chars.get("{") >= 0){
            flag = true;
        }
        if(chars.containsKey("[") && chars.get("[") >= 0){
            flag = true;
        }
        return flag;
    }

}
