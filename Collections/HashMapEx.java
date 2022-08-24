import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        
        Map<String,String> phoneBook = new HashMap();

        phoneBook.put("Dharmik", "7621089169");
        phoneBook.put("Sameer", "1712123314");
        phoneBook.put("Dharmil", "9429303210");

        System.out.println("Dharmil: "+phoneBook.get("Dharmil"));

        // Set<String> keys = phoneBook.keySet();

        // for(String key: keys){
        //     System.out.print("\n "+key+": "+phoneBook.get(key));
        // }

        for(Map.Entry temp: phoneBook.entrySet()){
            System.out.print("\n "+temp.getKey()+": "+temp.getValue());
        }
    }
}