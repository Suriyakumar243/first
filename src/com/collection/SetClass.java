package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
	
	public static void main(String[] args) {
		
		Set s = new LinkedHashSet();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add("java");
		s.add(100);
		System.out.println(s);
		
		//to find no of values
		
		int size = s.size();
		
		System.out.println(size);
		
		s.remove(100);
		
		System.out.println(s);
		
		s.contains("java");
		System.out.println(s);
		
//		s.clear();
//		System.out.println(s);
//		
		
		for (Object s1 : s) {
			
				System.out.println(s1);
			}
		Set s2 = new HashSet();
		
		s2.addAll(s);
		System.out.println(s2);
		
		s.remove(200);
		
		s.retainAll(s2);
		
		System.out.println(s);
		
		
		s2.removeAll(s);
		System.out.println(s2);
		
		
		
		
	}

}
