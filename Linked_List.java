import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args){
        LinkedList<String> linklist = new LinkedList();
        linklist.add("Pravin");
        linklist.add(1,"Korekar");
        System.out.println(linklist.indexOf("Pravin"));
        System.out.println(linklist.element());
        System.out.println(linklist.size());
        System.out.println(linklist.get(1));
    }
}
