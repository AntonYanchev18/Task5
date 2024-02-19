public class AverageArray {
    public static void main(String[] args) {

        int[] array = {5, 10, 20, 25};

        int sum = 0;

        // Начин 1
//        for ( int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }

        for (int num: array) {      // Начин 2
            sum += num;
        }

        int average = sum / array.length;

        System.out.println(average);
    }
}
