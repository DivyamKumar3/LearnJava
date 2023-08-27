package lambda.MethodReferences;

import java.sql.SQLOutput;

public class MethodRefDemo {

    static String stringOp (StringFunc sf, String s)
    {
        return sf.func(s);
    }


    public static void main(String agrs[]) {
        String inputString ="This is divyam";
        String outputString;
        outputString=stringOp(MyStringOps::strReverse, inputString);
        System.out.println("Input string :-\n"+inputString );
        System.out.println("Output string :-\n"+outputString);
    }
}
