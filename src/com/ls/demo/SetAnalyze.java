package com.ls.demo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<>();
		set.add(6);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(2);
		for (Integer i:set) {
			System.err.print (i+" ");
		}
		System.err.println();
		ArrayList<Integer> list =  new ArrayList<>();
		list.add(6);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		for(Integer integer : list) {
			System.err.print(integer+" ");
		}
	}

}
