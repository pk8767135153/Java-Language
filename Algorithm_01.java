import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Algorithm_01 {
    public static void main(String[] args){
        ArrayList <String> mylist = new ArrayList<>();
        mylist.add("Second");
        mylist.add("Third");
        mylist.add("First");
        System.out.println(mylist);
        Collections.sort(mylist);
        System.out.println(mylist);
        System.out.println("Maximun : "+Collections.max(mylist));
        System.out.println("Minimum : "+Collections.min(mylist));
        Collections.reverse(mylist);
        System.out.println(mylist);

        /*
        * Interator :
        */
        Iterator it = mylist.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
