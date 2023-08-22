package collectionClass;

import java.util.*;

public class LearnCollectionClass {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(12);
        list.add(4);
        list.add(45);
        list.add(112);
        list.add(45);
        list.add(99);

        System.out.println("min element\n"+ Collections.min(list));
        System.out.println("max element\n"+Collections.max(list));
        System.out.println("frequent element\n"+Collections.frequency(list,99));
        System.out.println("frequent element\n"+Collections.frequency(list,45));

        Collections.sort(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);

    }
}