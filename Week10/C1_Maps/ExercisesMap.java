package Week10.C1_Maps;

import java.util.*;

public class ExercisesMap {
    public static void main(String[] args) {

        //Ex 1.Basic Hashmap;
        //Ex.2 Iterating over Hashmap;
        //Ex.4 Removing entries;


        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(123, "Olivia");
        studentMap.put(321, "Max");
        studentMap.put(213, "Jean");
//        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        studentMap.remove(213);
//        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        System.out.println(studentMap.get(213));

//        System.out.println(studentMap.get(123));

        Map<String, String> capitalMap = new LinkedHashMap<>();
        capitalMap.put("Germany", "Berlin");
        capitalMap.put("Ukraine", "Kyiv");
        capitalMap.put("BosniaAndHerzegovina", "Sarajevo");

//       for(Map.Entry<String, String> entry: capitalMap.entrySet()) {
//           System.out.println(entry.getKey() + ": " + entry.getValue());
//       }


// 5.Using HashMap for Counting:

        Map<String, Integer> wordCountMap = new HashMap<>();
        String str = "Split a sample sample sample text into words words by using a space space space space space space as the delimiter and store the words in an array.";
        String[] arr = str.split(" ");
        List<String>counts = new ArrayList<>();

        for (String o : arr) {
            counts.add(o);
        }
        System.out.println(counts);
            for (int i = 0; i < counts.size(); i++) {
                wordCountMap.putIfAbsent(counts.get(i), Collections.frequency(counts, counts.get(i)));
            }
            System.out.println(wordCountMap);
        }
    }

