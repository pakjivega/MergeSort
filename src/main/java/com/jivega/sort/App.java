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
        List<Integer> listtoorder = Arrays.asList(40, 50, 10, 700, 20,34);
        Sort sort = new MergeSort();
        sort.sort(listtoorder);
    }
}
