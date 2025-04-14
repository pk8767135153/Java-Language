import java.util.TreeMap;

public class TreeMap_Class {
    public static void main(String[] args){
        TreeMap<String, String> tree_map = new TreeMap<>();
        tree_map.put("Name","Pravinsingh Arun Korekar");
        tree_map.put("Phone Number","8767135153");
        tree_map.put("Address","XYZ Colony Nashik");
        System.out.println(tree_map);
        System.out.println("All Keys"+tree_map.keySet());
        System.out.println("All Values "+tree_map.values());
        System.out.println("Name "+tree_map.get("Name"));
    }
}
