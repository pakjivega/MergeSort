package com.jivega.sort;

import java.util.List;

public class InsertionSort implements Sort{

	public List<Integer> sort(List<Integer> listtoorder) {
		List<Integer> result = listtoorder;
		for (int i = 2 ; i < result.size() - 1 ;i++){
			for ( int k = i; ( k>1)  && ( result.get(k) < result.get(k-1)) ; k--) {
				Integer temp = result.get(k-1);
				result.set(k-1, result.get(k));
				result.set(k, temp);
			}
		}
		return result;
	}

}
