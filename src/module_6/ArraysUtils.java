package module_6;


public class ArraysUtils {
    int[] sum(int array[]) {
        return null;
    }

    int[] min(int array[]) {
        return null;
    }

    int[] max(int array[]) {
        return null;
    }

    int[] maxPositive(int array[]) {
        return null;
    }

    int[] multiplication(int array[]) {
        return null;
    }

    int[] modulus(int array[]) {
        return null;
    }

    int[] secondLargest(int array[]) {
        return null;
    }

    final int[] reverse(int[] array) {
        int count = 0;
        int[] result = new int[array.length];
        for (int i=array.length-1; i>-1; i--){
            result[count]=array[i];
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
