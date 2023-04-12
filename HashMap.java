import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap();
        
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "VB Script");
        map.put(4, "C#");
        map.put(null, "PERL");
        
        System.out.println("Hashmap " +map);
        
        int keyToBeChecked = 3;
        String val=null;
        //Check if key is present and if present print the value
        if (map.containsKey(keyToBeChecked))
        {
            val = (String)map.get(keyToBeChecked);
            System.out.println("The given key "+keyToBeChecked+" is present and the value is "+val);
        }
        else
        {
            System.out.println("The given key "+keyToBeChecked+" is not present ");
        }
        //Remove all the elements and print size of HashMap
        map.clear();
        System.out.println("Size of hashmap is " + map.size());
        
        //Check whether HashMap is empty or not (Print True or False)
        System.out.println("Is the hashmap empty? "+ map.isEmpty());
        
    }
}
