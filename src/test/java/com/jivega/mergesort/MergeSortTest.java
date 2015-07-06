package com.jivega.mergesort;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class MergeSortTest {

	private List<Integer> listtoorder;
	
	@Before
	public void setup(){
		listtoorder = Arrays.asList(40, 50, 10, 700, 20,34);
	}
	
	@Test
    public void testApp()
    {
		MergeSort merge = new MergeSort(listtoorder);
		List<Integer> output = merge.sort();
        Assert.assertTrue( output.get(0) < output.get(1) );
    }
}
