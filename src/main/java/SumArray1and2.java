import java.util.Scanner;

public class SumArray1and2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведето броя на елементите в масива ");
        int size = scanner.nextInt();
        int[] array = new int [size];

        System.out.println("Въведете елементите на масива: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Елемент " + (i + 1) + ":");
            array[i] = scanner.nextInt();

        }
        int evenSum = 0;
        int oddSum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println("Сумата на четните числа в масива е: " + evenSum);
        System.out.println("Сумата на нечетните числа в масива е: " + oddSum);
    }
}
