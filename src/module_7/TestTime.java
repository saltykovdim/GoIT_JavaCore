package module_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTime {
    public static void main(String[] args) {
       ArrayList<Integer> integersArray = new ArrayList<>();
       LinkedList<Integer> integersLinked = new LinkedList<>();

        long startInt1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersArray.add(i+1);
        }
        long finishInt1 = System.currentTimeMillis();
        System.out.println("1000 int element in ArrayList add " + (finishInt1 - startInt1)+" "+ integersArray.size());

        long startInt2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersArray.set(i, i+2);
        }
        long finishInt2 = System.currentTimeMillis();
        System.out.println("1000 int element in ArrayList set " + (finishInt2 - startInt2)+" "+ integersArray.size());

        long startInt3 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersArray.get(0);
        }
        long finishInt3 = System.currentTimeMillis();
        System.out.println("1000 int element in ArrayList get " + (finishInt3 - startInt3)+" "+ integersArray.size());

        long startInt4 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(0);
        }
        long finishInt4 = System.currentTimeMillis();
        System.out.println("1000 int element in ArrayList remove " + (finishInt4 - startInt4)+" "+ integersArray.size());
        System.out.println();
integersArray.clear();
        long startInt11 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersArray.add(i+1);
        }
        long finishInt11 = System.currentTimeMillis();
        System.out.println("10000 int element in ArrayList add " + (finishInt11 - startInt11)+" "+ integersArray.size());

        long startInt12 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersArray.set(i, i+2);
        }
        long finishInt12 = System.currentTimeMillis();
        System.out.println("10000 int element in ArrayList set " + (finishInt12 - startInt12)+" "+ integersArray.size());

        long startInt13 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersArray.get(0);
        }
        long finishInt13 = System.currentTimeMillis();
        System.out.println("10000 int element in ArrayList get " + (finishInt13 - startInt13)+" "+ integersArray.size());

        long startInt14 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersArray.remove(0);
        }
        long finishInt14 = System.currentTimeMillis();
        System.out.println("10000 int element in ArrayList remove " + (finishInt14 - startInt14)+" "+ integersArray.size());
        System.out.println();

        long startInt21 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i+1);
        }
        long finishInt21 = System.currentTimeMillis();
        System.out.println("1000 int element in LinkedList add " + (finishInt21 - startInt21)+" "+ integersLinked.size());

        long startInt22 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i, i+2);
        }
        long finishInt22 = System.currentTimeMillis();
        System.out.println("1000 int element in LinkedList set " + (finishInt22 - startInt22)+" "+ integersLinked.size());

        long startInt23 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersLinked.get(0);
        }
        long finishInt23 = System.currentTimeMillis();
        System.out.println("1000 int element in LinkedList get " + (finishInt23 - startInt23)+" "+ integersLinked.size());

        long startInt24 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(0);
        }
        long finishInt24 = System.currentTimeMillis();
        System.out.println("1000 int element in LinkedList remove " + (finishInt24 - startInt24)+" "+ integersLinked.size());
        System.out.println();
integersLinked.clear();
        long startInt212 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersLinked.add(i+1);
        }
        long finishInt212 = System.currentTimeMillis();
        System.out.println("10000 int element in LinkedList add " + (finishInt212 - startInt212)+" "+ integersLinked.size());

        long startInt222 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersLinked.set(i, i+2);
        }
        long finishInt222 = System.currentTimeMillis();
        System.out.println("10000 int element in LinkedList set " + (finishInt222 - startInt222)+" "+ integersLinked.size());

        long startInt232 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersLinked.get(0);
        }
        long finishInt232 = System.currentTimeMillis();
        System.out.println("10000 int element in LinkedList get " + (finishInt232 - startInt232)+" "+ integersLinked.size());

        long startInt242 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            integersLinked.remove(0);
        }
        long finishInt242 = System.currentTimeMillis();
        System.out.println("10000 int element in LinkedList remove " + (finishInt242 - startInt242)+" "+ integersLinked.size());
        System.out.println();
        ArrayList<String> stringArray = new ArrayList<>();
        LinkedList<String> stringLinked = new LinkedList<>();
        long startInt41 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArray.add("hello "+1);
        }
        long finishInt41 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in ArrayList add " + (finishInt41 - startInt41)+" "+ stringArray.size());

        long startInt42 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArray.set(i,"HELLO "+2);
        }
        long finishInt42 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in ArrayList set " + (finishInt42 - startInt42)+" "+ stringArray.size());

        long startInt43 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArray.get(0);
        }
        long finishInt43 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in ArrayList get " + (finishInt43 - startInt43)+" "+ stringArray.size());

        long startInt44 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringArray.remove(0);
        }
        long finishInt44 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in ArrayList remove " + (finishInt44 - startInt44)+" "+ stringArray.size());
        System.out.println();
        stringArray.clear();
        long startInt411 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArray.add("good "+1);
        }
        long finishInt411 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in ArrayList add " + (finishInt411 - startInt411)+" "+ stringArray.size());

        long startInt412 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArray.set(i, "good "+2);
        }
        long finishInt412 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in ArrayList set " + (finishInt412 - startInt412)+" "+ stringArray.size());

        long startInt413 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArray.get(0);
        }
        long finishInt413 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in ArrayList get " + (finishInt413 - startInt413)+" "+ stringArray.size());

        long startInt414 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringArray.remove(0);
        }
        long finishInt414 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in ArrayList remove " + (finishInt414 - startInt414)+" "+ stringArray.size());
        System.out.println();

        long startInt421 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinked.add("good "+1);
        }
        long finishInt421 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in LinkedList add " + (finishInt421 - startInt421)+" "+ stringLinked.size());

        long startInt422 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinked.set(i, "good "+2);
        }
        long finishInt422 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in LinkedList set " + (finishInt422 - startInt422)+" "+ stringLinked.size());

        long startInt423 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinked.get(0);
        }
        long finishInt423 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in LinkedList get " + (finishInt423 - startInt423)+" "+ stringLinked.size());

        long startInt424 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            stringLinked.remove(0);
        }
        long finishInt424 = System.currentTimeMillis();
        System.out.println("1000 int element(string) in LinkedList remove " + (finishInt424 - startInt424)+" "+ stringLinked.size());
        System.out.println();
        integersLinked.clear();
        long startInt4212 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
           stringLinked.add("good "+1);
        }
        long finishInt4212 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in LinkedList add " + (finishInt4212 - startInt4212)+" "+ stringLinked.size());

        long startInt4222 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinked.set(i,"good "+2);
        }
        long finishInt4222 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in LinkedList set " + (finishInt4222 - startInt4222)+" "+ stringLinked.size());

        long startInt4232 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringLinked.get(0);
        }
        long finishInt4232 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in LinkedList get " + (finishInt4232 - startInt4232)+" "+ stringLinked.size());

        long startInt4242 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
           stringLinked.remove(0);
        }
        long finishInt4242 = System.currentTimeMillis();
        System.out.println("10000 int element(string) in LinkedList remove " + (finishInt4242 - startInt4242)+" "+ stringLinked.size());


     /*    Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements. Measure time of execution of the following methods and print it to console:
        - add
                - set
                - get
                - remove
    */
    }
}
