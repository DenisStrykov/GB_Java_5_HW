package HW.ExNum2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        /*
        Подсчитать количество искомого слова,
        через map (наполнением значение, где искомое слово будет являться ключом),
        вносить все слова не нужно
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
     * Метод ищет искомое слово, введенное с клавиатуры пользователем и показывает, сколько раз оно использовалось в сообщении
     *
     * @param string : Вложенное сообщение
     */
    private static void searchDooble(String string) {

        String[] str = string.split(" ");
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : str) {
            newMap.putIfAbsent(s, 0);
            newMap.put(s, newMap.get(s) + 1);
        }

        String searchKey = readString("Введите искомое слово: ");
        System.out.println("Искомое слово: " + searchKey + " встретилось " + newMap.get(searchKey) + " раза");
    }

    /**
     * Метод печатает вложенное сообщение и считывает сообщение, введенное пользователем
     *
     * @param m : Вложенное сообщение
     * @return : Возвращает сообщение типа String
     */
    private static String readString(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
