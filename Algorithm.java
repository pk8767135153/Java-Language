import java.util.Arrays;
 
public class Algorithm {
    public static void main(String[] args){
        /*
         *   Sort the array
         */
        int arr[] = {1,2,20,4,23,18,23};
        for(int e : arr)
            System.out.print(e+" , ");
        Arrays.sort(arr); // Internally by default it use Quick Sort algorithm
        System.out.println("\nGetting Hash Code (hashcode() method has int return type) : "+arr.hashCode());
        System.out.println("It will return address 4 is present so it will return positive address : "+Arrays.binarySearch(arr,4));
        System.out.println("It will return address 44 was not present so it will return negative address : "+Arrays.binarySearch(arr,44));
    }
}
