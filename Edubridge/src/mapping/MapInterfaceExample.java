package mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceExample {

	
	public static void main(String[]args) {
		
		Map<String,String> map=new HashMap<>();
		map.put("favactress", "Kriti");
		map.put("favHollyActress", "mallia");
		map.put("favseries", "Stranger Things");
		
		Set<String> keys=map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key +"  "+map.get(key));
		}
	}
}
