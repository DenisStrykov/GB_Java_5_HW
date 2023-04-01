package HW.ExNum1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args) {

        /*
        Подсчитать количество вхождения каждого слова
        Пример:
        Россия идет вперед всей планеты. Планета — это не Россия.

        (Усложнение - игнорировать пунктуацию)*
         */


        String string = "Россия идет впереди всей планеты. Планета — это не Россия.";
        System.out.println(string);

        string = newString(string);
        System.out.println(string);
        System.out.println();

        searchDooble(string);

    }

    /**
     * Метод удаляет лишние знаки, оставляя только слова
     *
     * @param string : Вложенное сообщение типа String
     * @return : Возвращает строку типа String
     */
    private static String newString(String string) {

        String charsToRemove = ".,!@$%^&*()_+=-/—|№;:?";
        for (char c : charsToRemove.toCharArray()) {
            string = string.replace(String.valueOf(c), "");
        }
        return string.replaceAll("\\s+", " ");
    }

    /**
     * Метод ищет количество повторяющихся слов в тексте
     *
     * @param string : Вложенный текст типа String
     */
    private static void searchDooble(String string) {

        String[] str = string.split(" ");
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : str) {
            newMap.putIfAbsent(s, 0);
            newMap.put(s, newMap.get(s) + 1);
        }

        for (var entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + " встретился: " + entry.getValue() + " раз");
        }
    }

}
