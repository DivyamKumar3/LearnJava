package lambda.StreamFilterMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnStream {


    public static void main(String args[]){


        List<Integer> number = Arrays.asList(1, 2, 3, 4, 7, 8, 9, 4, 10);

        int sum=0;
        for(int n : number)
        {
            if(n%2==0){
                n=n*2;
                sum=sum+n;
            }
        }
        System.out.println(sum);

        // iteration 2,4,8,4,10 is the even
        // 4+8+16+8+20=56
        test();
    }


    public static void test(){
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 7, 8, 9, 4, 10);


        //1st way print all number
        for(int n=0;n<number.size();n++){
            System.out.println("1st line\n"+number.get(n));
        }

        //2nd way to print all number
        for(int n : number)
        {
            System.out.println("2nd line\n"+n);
        }

        //3rd way to print all number
        number.forEach(n-> System.out.println("3rd line\n"+n));
    }
    }
