package module_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTime {
    public static void main(String[] args) {
        List<Integer> integersArray = new ArrayList<>();
        List<Integer> integersLinked = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            integersArray.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("1000 int element add " + (finish - start));

        long start1 = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            integersArray.get(i);
        }
        long finish1 = System.currentTimeMillis();
        System.out.println("1000 int element get " + (finish1 - start1));

        long start2 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            integersLinked.add(i);
            integersLinked.set(i, i+i);
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("10000 int element set " + (finish2 - start2));

        long start3 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            integersLinked.get(i);
        }
        long finish3 = System.currentTimeMillis();
        System.out.println("10000 int element get " + (finish3 - start3));

        List<String> stringArray = new ArrayList<>();
        List<Integer> stringLinked = new LinkedList<>();

        long startS = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            stringArray.add("hello "+i);
        }
        long finishS = System.currentTimeMillis();
        System.out.println("1000 STRING element add " + (finishS - startS));

        long startS1 = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            stringArray.get(i);
        }
        long finishS1 = System.currentTimeMillis();
        System.out.println("1000 string element get " + (finishS1 - startS1));

        long startS2 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            stringLinked.add(i);
            stringLinked.set(i, i+i);
        }
        long finishS2 = System.currentTimeMillis();
        System.out.println("10000 String element set " + (finishS2 - startS2));

        long startS3 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            stringLinked.get(i);
        }
        long finishS3 = System.currentTimeMillis();
        System.out.println("10000 STRING element get " + (finishS3 - startS3));

     /*    Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the following methods and print it to console:
        - add
                - set
                - get
                - remove
    */}
}
