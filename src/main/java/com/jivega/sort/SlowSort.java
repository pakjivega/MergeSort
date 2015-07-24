package com.jivega.sort;

import java.util.List;

public class SlowSort  implements Sort {
	public List<Integer> sort(List<Integer> listtoorder) {
		List<Integer> result = listtoorder;
		boolean isOrder = false;
		while (!isOrder) {
			isOrder = true;
			for ( int i= 0 ; i< (result.size() -1) ;i++ ){
				if ( result.get(i) > result.get(i+1) ){
					isOrder = false;
					Integer temp = result.get(i+1);
					result.set(i+1,result.get(i));
					result.set(i,temp);
				}
			}
		}
		return result;
	}
}
