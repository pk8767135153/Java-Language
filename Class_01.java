class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void getdata(){
        System.out.println("Color : "+this.color+" Type : "+this.type);
    }
}
public class Class_01 {
    public static void main(String args[]){
        Pen pen_01 = new Pen();
        pen_01.color = "Blue";
        pen_01.type = "gel";
//        pen_01.write();
        Pen pen_02 = new Pen();
        pen_02.color = "Black";
        pen_02.type = "ballpen";
//        pen_02.write();
        pen_01.getdata();
        pen_02.getdata();
    }

}
