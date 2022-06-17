package q2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String,String> map=new LinkedHashMap<>();
		map.put("Rajasthan","Jaipur");
		map.put("Haryana", "Chandigarh");
		map.put("Gujrat", "Gandhinagar");
		map.put("MP", "Bhopal");
		map.put("Punjab", "Chandigarh");
		Set<Map.Entry<String, String>> s=map.entrySet();
		for(Map.Entry<String, String> me:s) {
			System.out.println("State: "+me.getKey()+"=="+"Capital: "+me.getValue());
		}
				
	}


}
