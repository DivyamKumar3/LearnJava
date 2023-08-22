package arraysClass;

import java.util.Arrays;

public class LearnArraysClass {
//searching, sorting,list compare can be done
    public static void main(String args[]){
        //quick sort algorithm

        Integer[] numbers= {10,32,12,34,45,233,2,21,1};
        Arrays.sort(numbers);
        System.out.println("Sorted numbers are:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // binary search
        int index = Arrays.binarySearch(numbers,21);
        System.out.println("index of number 21 is \n"+index);


        // to add numbers
        Arrays.fill(numbers,10);

    }
}
