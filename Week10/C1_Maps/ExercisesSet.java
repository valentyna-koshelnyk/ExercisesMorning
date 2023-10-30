package Week10.C1_Maps;

import java.util.*;

public class ExercisesSet {
    public static void main(String[] args) {

        // 1. Basic Hashset;

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(4);
        for (Integer i : integerSet) {
            System.out.println(i);
        }
//Ex.2 Hashset for String deduplication;

        Set<String> uniqueStrings = new HashSet<>();
        List<String> str = new ArrayList<>(List.of("apple", "banana", "apple", "cherry"));

//        for ( String i: str) {
//            uniqueStrings.add(i);
//        }
//        Iterator<String> iterator = uniqueStrings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //Ex.3 TreeSet with Natureal Ordering

        Set<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(343);
        sortedSet.add(2);
        sortedSet.add(4);
        sortedSet.add(567);

//        System.out.println(sortedSet);

//        Iterator<Integer> iteratorInt = sortedSet.iterator();
//        while (iteratorInt.hasNext()){
//            System.out.println(iteratorInt.next());
//        }
        Set<Person> personSet = new TreeSet<>();
        Person personOne = new Person("Olivia", 1);
        Person personTwo = new Person("Jean", 18);


        personSet.add(personOne);
        personSet.add(personTwo);

        for (Person o : personSet) {
            System.out.println(o);
        }

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(5);
        setA.add(45);
        setA.add(125);
        setA.add(6);

        setB.add(5);
        setB.add(45);
        setB.add(100);
        setB.add(14);

        //union

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println(union);

        // intersection

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println(intersection);

        // difference

        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println(difference);


    }
}
