class A{
    public void show1(){
        System.out.println("Class A :: Method Show1");
    }
}
class B extends A{
    public void show2(){
        System.out.println("Class B :: Method Show");
    }
}
public class Upcasting_Downcasting {
    public static void main(String args[]){
//        A obj = new A();
//        obj.show1();

        /*Upcasting Here :-> Implicit casting from <-: */
        A obj = (A) new B();
        obj.show1();
        // Or
        A obj1 = new B();
        obj1.show1();

        /* DownCasting :-> Explicit casting from <-: */
        B obj2 = (B) obj;
        obj2.show2();
    }
}
