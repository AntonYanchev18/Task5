import java.util.HashMap;

public class Duplicates {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "banana", "banana", "apple"};
        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String word: words) {
            if (wordsCount.containsKey(word)) {
                int count = wordsCount.get(word);
                wordsCount.put(word, count + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        for (String word: wordsCount.keySet()) {
            int count = wordsCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
