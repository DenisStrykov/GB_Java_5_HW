package CW.ExNum3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        /*
        Написать перевод их Римских цифр в арабские:
        I   1
        V   5
        X   10
        L   50
        C   100
        D   500
        M   1000

        Примеры:
        1)	ввод: s = "LVIII"
                      вывод: 58
                      разбор: L = 50, V= 5, III = 3.
        2)	ввод: s = "MCMXCIV"
        вывод: 1994
        разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
         */


        Map<Character, Integer> rimMap = new HashMap<>();
        rimMap.put('I', 1);
        rimMap.put('V', 5);
        rimMap.put('X', 10);
        rimMap.put('L', 50);
        rimMap.put('C', 100);
        rimMap.put('D', 500);
        rimMap.put('M', 1000);

        String value = readString("Введите число римских цифр: ");

        System.out.println(translateToLat(value, rimMap));
    }

    /**
     * Метод печатает вложенное сообщение и считывает сообщение пользователя
     *
     * @param m : Вложенное сообщение
     * @return : Сообщение типа String
     */
    public static String readString(String m) {

        System.out.print(m);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Метод переводит римские цифры в арабские
     *
     * @param value : Вложенное римское число типа String
     * @param rimMap : Вложенный Map
     * @return : арабское число типа int
     */
    public static int translateToLat(String value, Map<Character, Integer> rimMap) {

        int count = 0;
        for (int i = 0; i < value.length() - 1; i++) {
            if (rimMap.get(value.charAt(i)) >= rimMap.get(value.charAt(i + 1))) {
                count += rimMap.get(value.charAt(i));
            } else {
                count += rimMap.get(value.charAt(i + 1)) - rimMap.get(value.charAt(i));
                i++;
            }
        }

        if (rimMap.get(value.charAt(value.length() - 1)) <= rimMap.get(value.charAt(value.length() - 2))) {
            count += rimMap.get(value.charAt(value.length() - 1));
        }

        return count;
    }

}
