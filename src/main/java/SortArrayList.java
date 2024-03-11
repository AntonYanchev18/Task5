//Да се напише програма, която сортира ArrayList от цели числа в
//нарастващ ред.


import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Създайте ArrayList от цели числа
        ArrayList<Integer> numbers = new ArrayList<>();

        // Добавете числа към ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Използвайте Collections.sort() за сортиране в нарастващ ред
        Collections.sort(numbers);

        // Изпечатайте сортираните числа
        System.out.println("Сортирани числа в нарастващ ред: " + numbers);
    }
}

