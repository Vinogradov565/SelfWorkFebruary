import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        List<Integer> intList = Arrays.asList(intArray);

        Collections.shuffle(intList);
        intList.toArray(intArray);

        System.out.println("Неотсортированный массив: " + intList);

        System.out.println("============================================================================");

        ArrayCalculator.arrayCalc();

        System.out.println("============================================================================");

        SieveOfEratosthenes.sieveOfEratosthenes();
    }
}
