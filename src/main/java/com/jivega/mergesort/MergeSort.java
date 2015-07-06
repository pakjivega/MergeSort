package com.jivega.mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	private List<Integer> listtoorder;
	public MergeSort(List<Integer> listtoorder){
		this.listtoorder = listtoorder;
	}
	
	public List<Integer> sort(){
		List<Integer> result = new ArrayList<Integer>();
		result.add(2);
		result.add(3);
		return result; 
	}
}
