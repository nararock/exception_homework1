import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Метод 1: вывести выбранный по индексу элемент из массива");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента массива");
        int num = scanner.nextInt();
        String[] stringArray = new String[] { "hello", "hi", "aloha", "bye" };
        try {
            getElement(stringArray, num);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1.getMessage());
        }

        System.out.println();

        System.out.println("Метод 2: взятие процента от числа");
        System.out.println("Введите число");
        double number = scanner.nextDouble();
        System.out.println("Введите проценты");
        double procent = scanner.nextDouble();
        double answer = 0;
        boolean flag = false;
        try {
            answer = getProcent(number, procent);
        } catch (IllegalArgumentException e2) {
            System.out.println(e2.getMessage());
            flag = true;
        } finally {
            if (!flag) {
                System.out.println(answer);
            }
        }

        System.out.println();

        System.out.println("Метод 3: создание массива случайных чисел");
        System.out.println("Введите желаемый размер массива");
        int size = scanner.nextInt();
        try {
            int[] randomArray = createRandomArray(size);
        } catch (NegativeArraySizeException e3) {
            System.out.println(e3.getMessage());
        }
    }

    public static <String> void getElement(String[] array, int num) {
        if (num > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");

        } else
            System.out.println(array[num]);

    }

    public static double getProcent(double number, double procent) {
        if (procent < 0) {
            throw new IllegalArgumentException("Значение процентов не может быть отрицательным!");
        } else if (procent > 100) {
            throw new IllegalArgumentException("Значение процентов не может быть больше 100!");
        } else
            return number * procent / 100;
    }

    public static int[] createRandomArray(int size) {
        Random random = new Random();
        if (size < 0) {
            throw new NegativeArraySizeException("Размер массива не может быть меньше нуля");
        }
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

}
