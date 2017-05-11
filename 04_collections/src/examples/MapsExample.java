package examples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Hans", new Integer(120));
		map.put("Manni", 450);
		map.put("Peter", 200);
		map.put("Peter", 200);
		map.put("Peter", 200);
		map.put("Peter", 200);
		
		System.out.println("Is map emtpty? " + map.isEmpty());
		System.out.println("Size of map: " + map.size());
		
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string);
		}
		
		
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		
		for (String key : keys) {
			Integer value = map.get(key);
			System.out.println(key + " "+value);
		}
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
