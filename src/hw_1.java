import java.util.Arrays;

public class hw_1 {

    public static void main(String[] args) {
        System.out.println("--------");

        int[] fArr = {1, 2, 5, 3};
        int[] sArr = {4, 2, 2, 6};
        int[] dArr = {2, 5, 7};
        int[] d2Arr = {2, 0, 5, 0};
        System.out.println(Arrays.toString(differenceArray(fArr, sArr)));
//        System.out.println(Arrays.toString(differenceArray(fArr,dArr)));
        System.out.println(Arrays.toString(divideArray(fArr, sArr)));
        System.out.println(Arrays.toString(divideArray(fArr, d2Arr)));
    }

    /**
     * Реализация 3х методов для получения исключений ----------
     */
    public static float division(float a, float b) {
        if (b == 0) {
            throw new RuntimeException("Делить на ноль нельзя!");
        }
        return a / b;
    }

    public static boolean existingArrayElement(int[] arr, int idx) {
        if (idx >= arr.length) {
            throw new RuntimeException("Элемента с таким индексом в массиве нет");
        }
        return true;
    }

    public static boolean eis(String text) {
        if (text.contains("е")) {
            throw new RuntimeException("В тексте есть буква \"е\".");
        }
        return false;
    }

    /**
     *2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
     */
    /**
     * В цикле j<5 -> может быть исключение - индекс больше длины массива.
     * В цикле ипользуется преобразование типов - может быть исключение - ошибка преобразования типов.
     *
     * */

    /**
     * 3.Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
     * не равны, необходимо как-то оповестить пользователя.
     */
    public static int[] differenceArray(int[] f, int[] s) {
        if (f.length != s.length) {
            throw new RuntimeException("Массивы имеют разную длину");
        }
        int res[] = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            res[i] = f[i] - s[i];

        }
        return res;
    }

    /**
     * 4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
     * не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
     * которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */
    public static int[] divideArray(int[] f, int[] s) {
        if (f.length != s.length) {
            throw new RuntimeException("Массивы имеют разную длину");
        }
        int res[] = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            if (s[i] == 0) {
                throw new RuntimeException("Делить на ноль нельзя. " + "Индекс нулевого элемента: " + i + ".");
            }
            res[i] = f[i] / s[i];
        }
        return res;
    }
}