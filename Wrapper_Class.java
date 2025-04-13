/*
*Wrapper Class is a special class that provides an
* object representation for primitive data types.
*  Essentially, it allows you to treat primitive
*  types (like int, char, etc.) as objects, which
*  can be useful when working with collections,
* generics, or certain APIs that require objects
*  rather than primitives.
*
byte --> Byte
short --> Short
int --> Integer
long --> Long
float --> Float
double --> Double
char --> Character
boolean --> Boolean
*
*/
public class Wrapper_Class {
    public static void main(String args[]){
        int num = 7;
//        Integer num1 = new Integer(3);
        Integer num1 = 8;
        Integer num2 = new Integer(num); // Autoboxing
        System.out.println(num1);

        int num3 = num1.intValue(); // Auto-Unboxing
        System.out.println(num3);


        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*2);

        String text = "Hello, World!";
        System.out.println("Data Type Text "+text.getClass().getName());
        // Outputs: java.lang.String


    }
}
