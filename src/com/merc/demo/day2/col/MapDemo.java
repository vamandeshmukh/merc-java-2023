package com.merc.demo.day2.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		System.out.println(map.size());
		map.put(10, "Ten");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		System.out.println(map);
		System.out.println(map.size());
		
		Map<String, String> stateCodes = new HashMap<>();
		stateCodes.put("MH", "Maharashtra");
		stateCodes.put("TS", "Telangana");
		stateCodes.put("KA", "karnataka");
		System.out.println(stateCodes);
		System.out.println(stateCodes.keySet());
		System.out.println(stateCodes.values());
		System.out.println(stateCodes.get("MH"));
		

	}

}
