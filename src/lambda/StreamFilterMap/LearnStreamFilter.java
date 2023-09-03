package lambda.StreamFilterMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStreamFilter {


    public static void main(String args[]){
        lambdaExpression();
        methodReference();
    }


    public static void lambdaExpression()
    {
        List<Integer> number=  Arrays.asList(4,5,6,7,9,2,8);
        List<Integer> result=number.stream()
                .filter(n -> n%2==0)
                .map(n-> n*1)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }



    public static void methodReference()
    {
        List<String> numberStrings = Arrays.asList("4", "5", "6", "7", "9", "2", "8");

        List<Integer> result = numberStrings.stream()
                .map(Integer::valueOf) // Use method reference to convert to Integer
                .filter(n -> n % 2 == 0)
                .map(n -> n * 1)
                .sorted() // Sort the even numbers in ascending order
                .collect(Collectors.toList());

        System.out.println("string to number\n"+result);
    }
}
