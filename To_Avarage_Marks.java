import java.util.Scanner;
public class To_Avarage_Marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float arr[] = new float[5];
        float sum =0.0f;
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum/arr.length);

    }
}
