package com.jivega.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Sort sortMerge = new MergeSort();
        Sort sortSlow = new SlowSort();
        Sort sortInsert = new InsertionSort();
        System.out.println("Time (micros) to execute sort" );
        System.out.println("Size \tMerge \tSlow \tInserttion " );
        for ( int i = 10 ; i < 1000000 ; i = i *10 )
        {
        	List<Integer> list = UtilArrays.buildRandomList(i);
        	long startTime1 = System.nanoTime();            
            sortMerge.sort(list);
            long endTime1 = System.nanoTime();
            long duration1 = (endTime1 - startTime1);

            long startTime2 = System.nanoTime();            
            sortSlow.sort(list);
            long endTime2 = System.nanoTime();
            long duration2 = (endTime2 - startTime2);

            long startTime3 = System.nanoTime();
            sortInsert.sort(list);
            long endTime3 = System.nanoTime();
            long duration3 = (endTime3 - startTime3);

            System.out.println(i+ "\t" + duration1/1000 + "\t" + duration2/1000 + "\t" + duration3/1000 );	
        }
        System.out.println("Done" );
    }
}
