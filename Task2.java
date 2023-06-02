public class Task2 {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
/**
 * Возможные исключения в коде:
 * 1. IndexOutOfBoundsException (выход за пределы массива):
 * for (int j = 0; j < 5; j++)
 * 2. ClassCastException (неверное преобразование типов):
 * int val = Integer.parseInt(arr[i][j]);
 * 3. NullPointerException (если массив равен null):
 * если arr = null
 * 4. Переполнение значения int :
 * sum += val;
 * 5. NullPointerException:
 * может возникнуть, если вложенные массивы равны null
 */