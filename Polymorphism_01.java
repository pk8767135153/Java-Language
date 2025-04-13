/*
*
*   Polymorphism :
*       Method Overloading : compile time polymorphism
*       Method Overriding : Run time polymorphism
* */
class Car{
    String car_color;
    int car_height;
    int car_width;
    int car_length;
    String fule_type;
    int fule_capacity;

    public void set_data(int height, int width,int length, int capacity, String color, String type){
        this.car_color = color;
        this.fule_capacity = capacity;
        this.fule_type = type;
        this.car_height = height;
        this.car_length = length;
        this.car_width = width;
    }

    public void dimensions(){
        System.out.println("Height : "+this.car_height);
        System.out.println("Width : "+this.car_width);
        System.out.println("Length : "+this.car_width);
    }

    public void dimensions(String a){
        System.out.println("Height : "+this.car_height);
        System.out.println("Width : "+this.car_width);
        System.out.println("Length : "+this.car_width);
        System.out.println("Color : "+this.car_color);
        System.out.println("Fule Type : "+this.fule_type);
        System.out.println("Fule capacity : "+this.fule_capacity);
    }


}
public class Polymorphism_01 {
    public static void main(String args[]){
         Car car_01 = new Car();
         car_01.set_data(3,3,5,23,"Pink","Electric");
         System.out.println("Without Parameter : \n");
         car_01.dimensions();
         System.out.println(" \nwith Parameter \n");
         car_01.dimensions("all");
    }

}

