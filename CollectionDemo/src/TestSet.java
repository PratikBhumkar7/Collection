import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestSet {

	public static void main(String[] args) {
         Map<String,Integer>treemap=new TreeMap<String,Integer>();
         treemap.put("Maruti", 60000);
         treemap.put("Toyota", 80000);
         treemap.put("BMW", 30000);
         treemap.put("Maruti", 70000);
   
         int i=treemap.get("BMW");
         System.out.println(i);
         System.out.println(treemap.containsKey("Maruti"));
         System.out.println(treemap.containsValue(60000));
         treemap.remove("Toyota");
         Set<String> set=treemap.keySet();
         
         for(String s:set){
        	 System.out.println("for key"+s+"values is"+treemap.keySet());
        	 
        	 
        	 }
         System.out.println();
         System.out.println("Tree Map:"+treemap);
         Map<String,Integer> hashmap=new HashMap<String,Integer>();
         hashmap.put("Maruti", 60000);
         hashmap.put("Toyota", 80000);
         hashmap.put("BMW", 30000);
         hashmap.put("Maruti", 70000);
         System.out.println("Hash Map :"+hashmap);


	}

}
