import java.util.Arrays;

public class DivisibleByQ {

    public static int[] filterDivisibleByQ(int[] array, int q) {
        return Arrays.stream(array)
                .filter(value -> value % q == 0)  // Фильтруем элементы, которые делятся на q
                .toArray();  // Преобразуем в массив
    }

    // Тестируем
    public static void main(String[] args) {
        int[] array = {10, 20, 33, 40, 55, 60};
        int q = 10;

        int[] result = filterDivisibleByQ(array, q);

        // Выводим результат
        System.out.println(Arrays.toString(result));
    }
}
