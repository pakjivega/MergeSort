package com.jivega.sort;

import java.util.Arrays;
import java.util.List;

import javax.management.DescriptorKey;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.jivega.sort.MergeSort;

public class MergeSortTest {

	private List<Integer> listtoorder;
	Sort sort = null;

	@Before
	public void setup() {
		listtoorder = UtilArrays.buildRandomList(100);
		sort = null;
	}

	@After
	public void destroy() {
		listtoorder = null;
		sort = null;
	}

	@Test
	public void testMergeSort() {
		long startTime = System.nanoTime();
		sort = new MergeSort();
		List<Integer> output = sort.sort(listtoorder);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Time (ms) to execute MergeSort is: " + duration / 1000000);

		Integer previous = 0;
		for (Integer i : output) {
			Assert.assertTrue( previous <= i );
			previous = i;
		}
	}

	@Test
	public void testSlowSort() {
		long startTime = System.nanoTime();
		sort = new SlowSort();
		List<Integer> output = sort.sort(listtoorder);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Time (ms) to execute SlowSort is: " + duration / 1000000);

		Integer previous = 0;
		for (Integer i : output) {
			Assert.assertTrue( previous <= i );
			previous = i;
		}
	}

	@Test
	public void testInsertionSort() {
		long startTime = System.nanoTime();
		sort = new InsertionSort();
		List<Integer> output = sort.sort(listtoorder);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Time (ms) to execute InsertionSort is: " + duration / 1000000);

		Integer previous = 0;
		for (Integer i : output) {
			Assert.assertTrue( previous <= i );
			previous = i;
		}
	}

	@Test
	public void testSelectionSort() {
		long startTime = System.nanoTime();
		sort = new SelectionSort();
		List<Integer> output = sort.sort(listtoorder);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Time (ms) to execute SelectioSort is: " + duration / 1000000);

		Integer previous = 0;
		for (Integer i : output) {
			Assert.assertTrue( previous <= i );
			previous = i;
		}
	}
}
