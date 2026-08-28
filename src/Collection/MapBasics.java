package Collection;

import java.util.*;

public class MapBasics {
    
    public static void main(String[] args) {
        
        Map<String,String> map = new HashMap<>();

        //insertion
        // map.put("in","India");
        // map.put("us","United States");
        // map.put("br","Brazil");

        // System.out.println(map);

        // Map<String,String> table = new HashMap<>();
        // table.put("ny", "newYork");
        // System.out.println("Before: " + table);

        // table.putAll(map);
        // System.out.println("After: "+table);

        // //putIfAbsent
        // System.out.println(table.putIfAbsent("in", "England"));
        // table.remove("in");
        
        // System.out.println(table);

        // System.out.println(table.get("br"));

        // System.out.println(table.getOrDefault("in","NONE" ));

        // System.out.println(table.containsKey("us"));
        // System.out.println(table.containsValue("India"));  

        // table.replace("us","United States of America");
        // System.out.println(table);


        // Set<String> keyset = table.keySet();
        // System.out.println(keyset);

        // Collection<String> valueset = table.values();
        // System.out.println(valueset);

        // Set<Map.Entry<String,String>> entrySet =  table.entrySet();
        // System.out.println(entrySet);

        Map<Integer,String> num = new HashMap<>() ;
            num.put(1,"One");
            num.put(2,"Two");
            num.put(3,"Three");

            for(Map.Entry<Integer,String> numset :  num.entrySet()) {
                System.out.println("key:" +numset.getKey() +" "+ "value:" +numset.getValue());

            }
       

    }
}
