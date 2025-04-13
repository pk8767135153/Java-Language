/*
* Abstraction : Show necessary data only
*  It cannot be instantiated
*   Abstraction class contain abstract method as well as not abstract method as well
*   Abstraction class have constructor also contain static method
* */
abstract class Animal{
    abstract void walk();
    public void eatingFood(){

}
static class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

static class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse hours = new Horse();
        Chicken chicken = new Chicken();
        // give error : because Animal Is Abstration class
        // Animal animal = new Animal();
        hours.eatingFood();
        }
    }
}
