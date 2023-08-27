package lambda.BlockLambdaExpressions;
public class BlockLambdaDemo {

    public static void main (String arg[]){


        NumericFunction factorial =(n) -> {
            int result = 1;
            for(int i=1; i<=n; i++)
                result =i * result;
            return result;
        };


        System.out.println("factorial of 5 is " + factorial.func(5));
    }
}
