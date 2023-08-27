package lambda.MethodReferences;

public class MethodRefToStaticMethods {

    static String stringOp (StringFunc sf, String s)
    {
        return sf.func(s);
    }

   //Method References To static Methods
    public static void main(String agrs[]) {
        String inputString ="This is divyam";
        String outputString;
        outputString=stringOp(MyStringOps::strReverse, inputString);
        System.out.println("Input string :-\n"+inputString );
        System.out.println("Output string :-\n"+outputString);
    }

}
