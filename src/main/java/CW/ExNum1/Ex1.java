package CW.ExNum1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args) {

        /*
        1)	Посчитать количество вхождений каждого символа в текст.
         */

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        String str = "ewwe dqqweelbdqew jhbewqeqweqweqeeweewqwfe";

        for (int i = 0; i < str.length(); i++) {

            characterIntegerMap.putIfAbsent(str.charAt(i), 1);
            characterIntegerMap.put(str.charAt(i), characterIntegerMap.get(str.charAt(i)) + 1);

//            if (!characterIntegerMap.containsKey(str.charAt(i))) {
//                characterIntegerMap.put(str.charAt(i), 1);
//            } else {
//                characterIntegerMap.put(str.charAt(i), characterIntegerMap.get(str.charAt(i)) + 1);
//            }
        }

        for (var entry : characterIntegerMap.entrySet()) {

            System.out.println(entry.getKey() + " встретился: " + entry.getValue() + " раз");
        }

    }

}
