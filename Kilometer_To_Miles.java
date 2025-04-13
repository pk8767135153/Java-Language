import java.util.Scanner;
public class Kilometer_To_Miles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometer ");
        // mile to kilometer : 1 kilometer = 0.621 mile
        double kilometer = sc.nextDouble();
        System.out.println("In miles : "+kilometer*0.621+"Miles \nIn Kilometer "+kilometer/0.621+"KM");
    }
}
