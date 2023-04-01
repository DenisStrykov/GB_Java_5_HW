package CW.ExNum2;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

    public static void main(String[] args) {

        /*
        2)	Определить, есть ли в массиве дубликаты,
        если найден хоть один, вывести на экран (true),
        В противном случае (false).
         */

        String str = "qwerasdf zxcv";

        System.out.println(searchDouble(str));
        System.out.println(searchDouble2(str));

//        for (int i = 0; i < str.length(); i++) {
//
//            characterIntegerMap.putIfAbsent(str.charAt(i), 0);
//            characterIntegerMap.put(str.charAt(i), characterIntegerMap.get(str.charAt(i)) + 1);
//        }
//
//        int flag = 0;
//        for (var entry : characterIntegerMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                flag = 1;
//                break;
//            }
//        }
//
//        if (flag == 0) {
//            System.out.println("False");
//        } else {
//            System.out.println("True");
//        }

    }

    /**
     * Метод ищет дубликаты в строке
     *
     * @param str : Вложенная строка
     * @return : Буллевое значение true/false
     */
    private static boolean searchDouble(String str) {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (characterIntegerMap.containsKey(str.charAt(i))) {
                return true;
            } else {
                characterIntegerMap.put(str.charAt(i), 1);
            }
        }
        return false;
    }

    /**
     * Метод ищет дубликаты в строке
     *
     * @param str : Вложенная строка
     * @return : Буллевое значение true/false
     */
    private static boolean searchDouble2(String str) {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            characterIntegerMap.put(str.charAt(i), 1);
        }
        System.out.println(str);
        System.out.println(characterIntegerMap);
        return !(characterIntegerMap.size() == str.length());
    }

}
