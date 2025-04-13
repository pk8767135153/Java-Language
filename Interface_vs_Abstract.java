// Interface not class so interface give design or blueprint of class

interface A_01{
    int age = 20; // final and static variable
    void show(); // public
    void config();
}

class B_01 implements A_01{
    public void show(){
        System.out.println("IN B2 show() method");
    }
    public void config(){
        System.out.println("IN B2 config() method");
    }
}


public class Interface_vs_Abstract {
    public static void main(String args[]){
        B_01 obj = new B_01();
        System.out.println(obj.age);
        obj.show();

    }
}
