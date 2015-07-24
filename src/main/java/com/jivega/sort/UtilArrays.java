package com.jivega.sort;

import java.util.Arrays;
import java.util.List;

public class UtilArrays {

	public static List<Integer> buildRandomList(int size) {
		Integer[] list = new Integer[size];
		for (int i = 0; i < list.length; i++) {
			int n = (int) (Math.random() * size + 1);
			list[i] = n;
			// System.out.println(list[i] + " ");
		}
		List<Integer> listtoorder = Arrays.asList(list);
		return listtoorder;
	}
}
