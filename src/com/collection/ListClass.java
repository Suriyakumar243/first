package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
	
	public static void main(String[] args) {
		//create object for List
		List li = new ArrayList();
		//methods in list
		//objname.add();
		li.add(10);
		li.add("java");
		li.add(true);
		li.add(45678.45678);
		li.add('m');
		li.add(10);
		li.add(10);
		// to print all the values of list
		 System.out.println(li);
		//to find no of values in the first
		 int size = li.size();
		 System.out.println(size);
		 //to find the index position of a given value
		 int indexOf = li.indexOf(10);
		 System.out.println(indexOf);
		 //to find the last  index position of a given value
		 int lastIndexOf = li.lastIndexOf(10);
		 System.out.println(lastIndexOf);
		 //to add the value base on index
		 li.add(3, 100);
		 System.out.println(li);
		 //to replace a value based on index
		 li.set(3, false);
		 System.out.println(li); 
		 //to check a value is present or not
		 boolean contains = li.contains(false);
		 System.out.println(contains);
		 // to remove  a value
		 Object remove = li.remove(3);
		 System.out.println(li);
		 
		 // to remove all the values from the list
		 li.clear();
		 System.out.println(li);
		 
		 //creating object for list with generics
		 
		 List<Integer> li1 = new LinkedList();
		 
		 li1.add(100);
		 li1.add(200);
		 li1.add(300);
		 li1.add(400);
		 System.out.println(li1);
		 
		 List<Integer> li2 = new ArrayList();
		 li2.add(100);
		 li2.add(200);
		 
		 //to compare the two list and remove the common values
		 
		 li1.removeAll(li2);
		 System.out.println(li1);
		 System.out.println(li2);
		 
		 //to compare two list and retain the common values
		 
		  li1.retainAll(li2);
		  li1.add(100);
		  System.out.println(li1);
		  
		  //to add all the values from one list to another list
		  
		  System.out.println(li);
		  
		  li.addAll(li2);
		  System.out.println(li);
		  
		  //to print the values one by one or iteration of list
		  int size2 = li2.size();
		  
		  for (int i = 0; i < size2; i++) {
			  
			  Integer integer = li2.get(i);
			  
			  System.out.println(integer);
			
		}
		  
		  //iteration using exhanced for loop
		  
		  for (Integer integer : li2) {
			  
			  System.out.println(integer);
			
		}
		  
		  System.out.println("java");
		  System.out.println("java");
		  System.out.println("java");
		 
		 
		 
		
	}
	    
	
	 

}
