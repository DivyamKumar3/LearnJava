package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

    public static void main (String args[]){

        Map<String,Integer> number=new TreeMap<>();
        //keys is always unique
        //map(key, values)
        //it will always add item in sequence ways and print sequnectly based on key one,two, three
        // works binary sort on key

        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        System.out.println();

        number.put("two",36);
        //this will override the above two^^

        //to check and put the values
        if(!number.containsKey("two")){
            number.put("two",23);
        }
        number.putIfAbsent("two",23);
        number.containsValue(3);
        System.out.println(number);
        System.out.println(number.isEmpty());

        number.remove("three");
    }

}
