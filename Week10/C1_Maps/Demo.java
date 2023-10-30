package Week10.C1_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        for (Map.Entry<String, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Set<String> set = new HashSet<>();
        set.add("dog");
        set.add("cat");
        set.add("cow");
        set.add("dog");

        System.out.println("Set 1: " + set);

        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("dog");
        anotherSet.add("monkey");
        anotherSet.add("cow");
        anotherSet.add("sheep");

        System.out.println("Set 2: " + anotherSet);

        Set<String> union = new HashSet<>(set);
        union.addAll(anotherSet);
        System.out.println("Union of two sets: " + union);

        Set<String> intersection = new HashSet<>(set);
        intersection.retainAll(anotherSet);
        System.out.println("Intersection of two sets: " + intersection);

        Set<String> difference = new HashSet<>(anotherSet);
        difference.removeAll(set);
        System.out.println("Difference of two sets: " + difference);

    }
}
