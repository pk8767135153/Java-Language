import java.util.HashMap;

public class Hash_Map_Class {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        // get(Object key) :-> Get all values
        // size() : Size of
        map.put(1001, 232);
        System.out.println(map);
        System.out.println("Size "+map.size());
        System.out.println(map.get(1001));
        System.out.println("Geting All Keys : "+map.keySet());
        System.out.println("Geting All Values : "+map.values());

    }
}
