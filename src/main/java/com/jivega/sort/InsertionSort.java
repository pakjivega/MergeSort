package com.jivega.sort;

import java.util.List;

public class InsertionSort implements Sort{

	public List<Integer> sort(List<Integer> listtoorder) {
		List<Integer> result = listtoorder;
		for (int i = 1 ; i < result.size() ;i++){
			for ( int k = i; ( k>0)  && ( result.get(k) < result.get(k-1)) ; k--) {
				Integer temp = result.get(k-1);
				result.set(k-1, result.get(k));
				result.set(k, temp);
			}
		}
		return result;
	}

}
