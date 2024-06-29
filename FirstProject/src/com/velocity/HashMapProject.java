package com.velocity;

import java.util.HashMap;
import java.util.Set;

public class HashMapProject {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(101, "Prasad");
		hm.put(102, "Mahesh");
		hm.put(103, "Ashwini");
		hm.put(104, "Mayuri");
		
		Set<Integer> s =hm.keySet();
		
		
		for(int i : s) {
			System.out.println("Key  :  " + i);
			System.out.println("Value: "+ hm.get(i));
			System.out.println("");
		}
	}

}