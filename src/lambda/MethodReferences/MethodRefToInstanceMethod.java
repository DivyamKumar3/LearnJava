//package lambda.MethodReferences;
//
//public class MethodRefToInstanceMethod {
//
//    static String stringOp (StringFunc sf, String s)
//    {
//        return sf.func(s);
//    }
//    //Method References To Instance Methods
//    public static void main(String agrs[]) {
//        String inputString ="This is divyam";
//        String outputString;
//
//        MyStringOps myStringOps=new MyStringOps();
//
//        outputString=stringOp(myStringOps::strReverse, inputString);
//        System.out.println("Input string :-\n"+inputString );
//        System.out.println("Output string :-\n"+outputString);
//    }
//}
