class A{
    public void show(){
        System.out.println("Show Class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Show Class B");
    }
}



public class Polymorphism_02 {
    public static void main(String args[]){
        B b = new B();
        b.show();
    }
}
