
import java.security.Provider;
import java.util.*;
import static java.util.List.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 4, 3, 4, 4, 5, 5, 4, 7));
        ((ArrayList<Integer>) nums).ensureCapacity(500);
        nums.add(10);
        nums.add(8);
        nums.add(12);

        List<Integer> even = new ArrayList<>(500);
        List<Integer> odd = new ArrayList<>(500);
        List<Integer> evenSorted = new ArrayList<>(500);
        List<String> wordSorted = new ArrayList<>(500);

        /*Задание 1*/
        int i = 0;
        for (Integer number : nums) {
            if (nums.get(i) % 2 == 0) {
                even.add(nums.get(i));
            } else {
                odd.add(nums.get(i));
            }
            i++;
        }
        System.out.println("все четные числа списка \n" + even);
        System.out.println("все нечетные числа списка \n" + odd);

        /*Задание2*/
        Collections.sort(nums);
        int index = nums.size() - 1;
        for (int a = 0; a < nums.size() - 1; a++) {
            for (int b = a + 1; b < nums.size(); b++) {
                if ((nums.get(a) % 2 == 0) &&
                        (!Objects.equals(nums.get(a), nums.get(b)))) {
                    evenSorted.add(nums.get(a));
                }
                break;
            }
        }
        evenSorted.add(nums.get(index));
        System.out.println("все четные числа списка в порядке возрастания\n" + evenSorted);

        /*Задание3*/
        List<String> word = Arrays.asList("текст", "без", "без", "дублей", "дублей", "текст");
        Collections.sort(word);
        int index1 = word.size() - 1;
        for (int c = 0; c < word.size() - 1; c++) {
            for (int d = c + 1; d < word.size(); d++) {
                if (!Objects.equals(word.get(c), word.get(d))) {
                    wordSorted.add(word.get(c));
                }
                break;
            }
        }
        wordSorted.add(word.get(index1));
        System.out.println(wordSorted);


        /*Задание 4*/
        List<String> list = Arrays.asList("текст", "без", "дублей", "дублей", "текст");
        Map<String, Integer> map = new HashMap<>();
        for (String text : list) {
            if (map.keySet().contains(text)) {
                map.put(text, map.get(text) + 1);
            } else {
                map.put(text, 1);
            }
        }
        System.out.println(map);
    }
}