/*
* 1. single level Inheritance
* 2. Multi-level Inheritance : Multiple child class and base class.
* 3. Hierarchical Inheritance : One base class multiple derived class
* 4. Hybrid Inheritance
* */

import java.util.*;


class Shape{
    public void area()
    {
        System.out.println("Display Area");
    }
}


class Triangle extends Shape{
    public void area_01(int l, int h){
        System.out.println("Area : "+1/2*l*h);
    }
}

class equilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void  area(int r){
        System.out.println(3.14*r*r);
    }
}



public class Inheritance_01 {
    public static void main(String args[]){
        Triangle t1 = new equilateralTriangle();
        Circle circle_01 = new Circle();
        circle_01.area(3);
        circle_01.area();
        t1.area_01(3,43);
    }
}
