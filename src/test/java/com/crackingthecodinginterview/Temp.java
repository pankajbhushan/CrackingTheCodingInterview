package com.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Temp {

	public static void main(String[] args) {
		Temp temp = new Temp();
		temp.iteratorMethods();
	}
	
	public void stringEquality() {
		String s1 = "abc";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));
	}
	
	public void iteratorMethods() {
		List<String> strList = new ArrayList<>();
		strList.add("foo");
		strList.add("bar");
		strList.add("ronaldo");
		strList.add("messi");
		strList.add("neymar");
		strList.stream().forEach(System.out::println);
		strList.stream().forEachOrdered(System.out::println);
		
		
		Set<String> emptySet = Collections.emptySet();
		emptySet.add("Ronaldo");
		emptySet.add("Messi");
		emptySet.add("Neymar");
		emptySet.add("Ibramahovic");
		emptySet.stream().forEach(System.out::println);
		emptySet.stream().forEachOrdered(System.out::println);
	}
}
