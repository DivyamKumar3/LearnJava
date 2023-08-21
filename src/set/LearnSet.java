package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {


    public static void main(String args[]){

        Set<Integer> set =new HashSet<>();

        //it internally works hashing mechanism
        //so we can not add any new duplicate item
        // it will print in random item
        // if we create differnt object then it will print duplicate as well
        set.add(10);
        set.add(21);
        set.add(22);

        System.out.println(set);

        set.remove(10);

        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());
        set.clear();
        System.out.println(set);



        // linkedHashSet
        // it works with set and linked list
        //it will add item in sequence ways
        Set<Integer> setLinked =new LinkedHashSet<>();
        setLinked.add(10);
        setLinked.add(21);
        setLinked.add(22);

        System.out.println(setLinked);

        setLinked.remove(10);

        System.out.println(setLinked);

        System.out.println(setLinked.contains(21));

        System.out.println(setLinked.isEmpty());

        System.out.println(setLinked.size());
        setLinked.clear();
        System.out.println(setLinked);


        //treeSet
        // it works on set and binary tree
        // it always print item in sorted

        Set<Integer> setTree =new TreeSet<>();

        setTree.add(10);
        setTree.add(21);
        setTree.add(22);

        System.out.println(setTree);

        setTree.remove(10);

        System.out.println(setTree);

        System.out.println(setTree.contains(21));

        System.out.println(setTree.isEmpty());

        System.out.println(setTree.size());
        setTree.clear();
        System.out.println(setTree);
    }
}
