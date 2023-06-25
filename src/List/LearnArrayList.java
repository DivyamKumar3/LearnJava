package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LearnArrayList {

    public static void main(String [] args) {
        understandArrayString();
        understandArrayInteger();
        understandListArray();
        understandListArrayWithIterator();
    }
    public static void understandArrayString() {
        /*
        * How to add array of string manually for a particular set of index
        * for example index =5, so we can max add up to 6 student
        * */
        String [] students=new String[5];
        students[0]="Divyam";
        students[1]="Kumar";
        students[2]="Gupta";
        students[3]="SDET";
        students[4]="Engineer" ;
        for (String Student : students)
        {
            if (students !=null)
            {
                System.out.println(Student);
            }
        }
    }

    public static void understandArrayInteger() {
        /*
         * How to add array of integer manually for a particular set of index
         * for example index =5, so we can max add up to 5 number
         * */
        Integer [] RollNumber=new Integer[5];
        RollNumber[0]=1;
        RollNumber[1]=2;
        RollNumber[2]=3;
        RollNumber[3]=4;
        RollNumber[4]=5;
        for (Integer RollNumbers : RollNumber)
        {
            if (RollNumbers !=null)
            {
                System.out.println(RollNumbers);
            }
        }
    }

    public static void understandListArray() {
        /*
         * How to add list of array string automatically for n number of index
         * It automatically allocates memory
         * size = n ; n + n/2 + 1 (Keeps increasing)
         * */
        ArrayList<String> student = new ArrayList<>();
        student.add("Dibyam");
        student.add("Kumar");
        student.add("Guptaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(student);

        student.remove(2);
        student.remove(String.valueOf("Kumar"));

        student.add("Gupta");
        student.add("Engineer");
        System.out.println(student);
        student.add(3, "SDET");
        System.out.println(student);

        ArrayList<String> updateStudentList = new ArrayList<>();
        updateStudentList.add(0, "and");
        updateStudentList.add("Prashant");

        student.addAll(updateStudentList);
        System.out.println(student);

        System.out.println(student.get(0));
        student.set(0, "Divyam");
        System.out.println(student);

        System.out.println(student.contains("Divyam"));

        student.clear();
        System.out.println(student);

    }

    public static void understandListArrayWithIterator() {
        /*
          * How to add list of array integer automatically for n number of index
          * How to iterate each array with different method
          **/
        List<Integer> rollNumber =new ArrayList<>();
        rollNumber.add(1);
        rollNumber.add(2);
        rollNumber.add(3);
        System.out.println(rollNumber);

        for (int i=0; i<rollNumber.size();i++)
        {
            System.out.println("Iterate with for loop "+rollNumber.get(i));
        }

        for (Integer rollNumbers: rollNumber) {
            System.out.println("Iterate with foreach loop "+rollNumbers);
        }

        Iterator<Integer> rollnumberss= rollNumber.iterator();
        while (rollnumberss.hasNext())
        {
            System.out.println("Iterate with while loop "+rollnumberss.next());
        }
    }
}
