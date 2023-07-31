import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        
        Map<String, Integer>mp=new HashMap<>();
        mp.put("Monu", 12);
        mp.put("sonu", 13);
        mp.put("tonu", 14);
        mp.put("konu", 15);
        System.out.println(mp.get("Monu"));
        // update and insertion in map
        mp.put("Monu", 100);
        System.out.println(mp.get("Monu"));
        // delete in map
        mp.remove("Monu");
        System.out.println(mp.get("Monu"));
    }
}
