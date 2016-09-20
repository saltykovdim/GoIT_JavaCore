package module_6;


public final class ArraysUtils {
    int sum(int array[]) {
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            m += array[i];
        }
        return m;
    }

    int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int maxPositive(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int multiplication(int array[]) {
        int m = array[0];
        for (int i = 1; i < array.length; i++) {
            m *= array[i];
        }
        return m;
    }

    int modulus(int array[]) {
        return array[0] % array.length;
    }

    int secondLargest(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > max) {
                max = array[i];
            }
        }
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max && array[i] > s) {
                s = array[i];
            }
        }
        return s;
    }

    final int[] reverse(int[] array) {
        int count = 0;
        int[] result = new int[array.length];
        for (int i = array.length - 1; i > -1; i--) {
            result[count] = array[i];
            count++;
        }
        return result;
    }

    final int[] findEvenElements(int[] array) {
        int count = 0;
        int ii = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                result[ii] = array[i];
                ii++;
            }
        }
        return result;
    }

}
