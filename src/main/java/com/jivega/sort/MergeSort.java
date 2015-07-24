package com.jivega.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort {
	public List<Integer> sort(List<Integer> listtoorder) {

		if (listtoorder.size() == 1) {
			return listtoorder;
		} else {
			List<Integer> result = new ArrayList<Integer>();
			int m = listtoorder.size() / 2;
			List<Integer> first = sort(listtoorder.subList(0, m));
			List<Integer> last = sort(listtoorder.subList(m, listtoorder.size()));

			for (int i = 0, k = 0; (i + k) < listtoorder.size();) {
				if ( ( k >= last.size() )  || ( !( i >= first.size() ) && (first.get(i) <= last.get(k)))) {
					result.add(first.get(i++));
				} else {
					result.add(last.get(k++));
				}
			}
			return result;
		}
	}
}
