package com.jivega.mergesort;

import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class MergeSortTest {

	@Test
    public void testApp()
    {
		MergeSort merge = new MergeSort();
		List<Integer> output = merge.order();
        Assert.assertTrue( output.get(0) < output.get(1) );
    }
}
