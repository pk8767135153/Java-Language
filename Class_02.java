/*
*  Java has automatic memory management system that called garbage collection.
* */
class Student{
    String name;
    int age;
    // Default Constructor
    Student(){
        this.name = "Not Available";
        this.age = 0;
    }
    // Parameterized Constructor
    Student(String s, int a){
        this.name = s;
        this.age = a;
    }
    // Copy Constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    public void get_data(){
        System.out.println("Name : "+this.name+" Age : "+this.age);
    }
}

public class Class_02 {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Pravin",23);
        Student s3 = new Student(s2);
        s1.get_data();
        s2.get_data();
        s3.get_data();

    }
}
