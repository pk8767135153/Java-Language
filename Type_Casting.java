
/*
* Type casting is the process of converting
*  one data type into another. It is commonly used
*  when you need to change the type of a
*  variable to perform specific operations.
* */
public class Type_Casting {
    public static void main(String args[]){
        double d = 3.4;
        // Explicit casting from double to int
        int i = (int) d;

        int num = 10;
        // Implicit casting from int to double
        double numDouble = num;

        System.out.println(i);
    }
}
