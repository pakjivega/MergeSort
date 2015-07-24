package com.jivega.sort;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.jivega.sort.MergeSort;

public class MergeSortTest {

	private List<Integer> listtoorder;
	Sort merge = null;
	
	@Before
	public void setup(){
        listtoorder = UtilArrays.buildRandomList(100000);
		merge = null;
	}
	
	@Test
    public void testMergeSort()
    {
		long startTime = System.nanoTime();
        merge = new MergeSort();
		List<Integer> output = merge.sort(listtoorder);
		long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time (ms) to execute MergeSort is: " + duration/1000000);
        
		Integer previous = 0;
		for ( Integer i : output) {
			Assert.assertTrue( previous < i );
		}        
    }

	@Test
    public void testSlowSort()
    {
		long startTime = System.nanoTime();
        merge = new SlowSort();
		List<Integer> output = merge.sort(listtoorder);
		long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time (ms) to execute SlowSort is: " + duration/1000000);
        
		Integer previous = 0;
		for ( Integer i : output) {
			Assert.assertTrue( previous < i );
		}
    }
	@Test
    public void testInsertionSort()
    {
		long startTime = System.nanoTime();
        merge = new InsertionSort();
		List<Integer> output = merge.sort(listtoorder);
		long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time (ms) to execute InsertionSort is: " + duration/1000000);
        
		Integer previous = 0;
		for ( Integer i : output) {
			Assert.assertTrue( previous < i );
		}
    }
}
