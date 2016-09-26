package module_2;

import module_6.ArraysUtils;

public class Task_1 {
    public static void main(String[] args) {
        int masInt[] = {-110, 1205, 80, 16, 449, 18, 50, -51330, 100, 60};
        double masDouble[] = {-100.1, 25.0, 54.5, 1.0, -10.1, 0.5, 20.5, 10.7, -50.7, 10.3};
        System.out.println(maxPositive(masInt));
        System.out.println(ArraysUtils.sum(masInt));
        System.out.println(ArraysUtils.findEvenElements(masInt));
        System.out.println(ArraysUtils.modulus(masInt));
        System.out.println(ArraysUtils.multiplication(masInt));
    }


    public static int sum(int array[]) {
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            m += array[i];
        }
        return m;
    }

    public static double sum(double array[]) {
        double m = 0;
        for (int i = 0; i < array.length; i++) {
            m += array[i];
        }
        return m;
    }

    public static int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double min(double array[]) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double max(double array[]) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double maxPositive(double array[]) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int multiplication(int array[]) {
        int m = array[0];
        for (int i = 1; i < array.length; i++) {
            m *= array[i];
        }
        return m;
    }

    public static double multiplication(double array[]) {
        double m = array[0];
        for (int i = 1; i < array.length; i++) {
            m *= array[i];
        }
        return m;
    }

    public static int modulus(int array[]) {
        return array[0] % array.length;
    }

    public static double modulus(double array[]) {
        return array[0] % array.length;
    }

    public static int secondLargest(int array[]) {
        int m = max(array);
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < m && array[i] > s) {
                s = array[i];
            }
        }
        return s;
    }

    public static double secondLargest(double array[]) {
        double m = max(array);
        double s = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < m && array[i] > s) {
                s = array[i];
            }
        }
        return s;
    }
}
