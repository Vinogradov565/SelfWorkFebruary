import java.util.Scanner;

public class ArrayCalculator {
    public static void arrayCalc() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int size = sc.nextInt();
        double[] numbers = new double[size];

        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextDouble();
        }

        double sum = 0;
        double max = numbers[0];
        double min = numbers[0];

        for (int i = 0; i < size; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = sum / size;
        double difference = max - min;

        System.out.println("Сумма элементов " + sum);
        System.out.println("Среднее количество элементов: " + average);
        System.out.println("Разница между максимальным и минимальным элементами: " + difference);
    }
}