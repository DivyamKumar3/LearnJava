package map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

    public static void main (String args[]){

        Map<String,Integer> number=new HashMap<>();
        //keys is always unique
        //map(key, values)
        // it will add item in random and print randomly
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
        }
    }

