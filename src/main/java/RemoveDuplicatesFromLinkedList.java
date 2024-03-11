import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        // Създайте свързан списък
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(7);

        // Премахнете повторенията
        removeDuplicates(linkedList);

        // Изпечатайте резултата
        System.out.println("Свързан списък след премахване на повторения: " + linkedList);
    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        // HashSet за отслежване на уникалните стойности
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Итерирайте през свързания списък
        // Използвайте итератор, за да може да премахнете елементи по време на итерация
        for (var iterator = list.iterator(); iterator.hasNext(); ) {
            Integer current = iterator.next();

            // Ако стойността вече е в HashSet, премахнете я от списъка
            if (uniqueSet.contains(current)) {
                iterator.remove();
            } else {
                // В противен случай, добавете я в HashSet
                uniqueSet.add(current);
            }
        }
    }
}







