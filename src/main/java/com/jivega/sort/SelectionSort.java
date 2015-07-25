package com.jivega.sort;

import java.util.List;

public class SelectionSort implements Sort {

	public List<Integer> sort(List<Integer> listtoorder) {
		List<Integer> result = listtoorder;
		for (int i = 0 ; i < result.size(); i++){
			int k = i;
			for ( int j= i +1; j < result.size(); j++ ){
				if ( result.get(j) < result.get(k) ) {
					k = j;
				}
			}
			Integer temp = result.get(i);
			result.set(i, result.get(k));
			result.set(k, temp);			
		}
		return result;
	}

}
