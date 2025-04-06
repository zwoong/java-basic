package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성을 막는다.
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
