package Week10.C1_Maps;

import java.util.HashMap;
import java.util.Map;

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
    }
}
