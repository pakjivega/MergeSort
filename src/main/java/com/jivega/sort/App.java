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
        System.out.println("Size \tMerge \tInsertion " );
        for ( int i = 10 ; i < 100000000 ; i = i *10 )
        {
        	List<Integer> list = UtilArrays.buildRandomList(i);
        	long startTime1 = System.nanoTime();            
            sortInsert.sort(list);
            long endTime1 = System.nanoTime();
            long duration1 = (endTime1 - startTime1);

//            long startTime2 = System.nanoTime();            
//            sortSlow.sort(list);
//            long endTime2 = System.nanoTime();
//            long duration2 = (endTime2 - startTime2);

            

            System.out.println(i+ "\t" + duration1/1000 );	
        }
        System.out.println("Done" );
    }
}
