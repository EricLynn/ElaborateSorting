/* Purpose: DSA Lab 10
 * Status: Complete and thoroughly tested
 * Last update: 10/10/18
 * Submitted: 11/20/2015
 * @author: Eric M. Lynn!
 * @version: 19.11.15
 */
package ElaborateSorting;

import java.io.*;
import java.util.Random;
public class QuickSort{

    
    public static int[] sort(int[] items){
    	return quickSort(items, 0, items.length-1);
	}

    //1-pivot quicksort
    private static int[] quickSort(int[] items, int start, int end){

	if(start >= end)
	    return items;
	else if(end-start == 1)
	    return simpleSort(items, start, end);

	//step 1: choose a pivot point (hardcoding for simplicity)
	int pivot = start + 1;
	
	//step 2: swap pivot into first index	
	int temp = items[start];
	items[start] = items[pivot];
	items[pivot] = temp;

	//step 3: sort into >pivot and <pivot
	int lastLessThanPivot = start;
	for(int i = start + 1; i<=end; i++){
	    if(items[i] < items[start]){
		temp = items[i];
		items[i] = items[lastLessThanPivot + 1];
		items[lastLessThanPivot + 1] = temp;
		lastLessThanPivot++;
	    }
		
	}

	//step 4: swap pivot w/last item in <pivot
	temp = items[start];
	items[start] = items[lastLessThanPivot];
	items[lastLessThanPivot] = temp;
	
	//step 5: recursive calls
	quickSort(items, start, lastLessThanPivot-1);
	quickSort(items, lastLessThanPivot+1, end);

	return items;
    }

    //for sorting a list of 2 items
    private static int[] simpleSort(int[] items, int start, int end){
	if(items[start] > items[end]){
	    int temp = items[start];
	    items[start] = items[end];
	    items[end] = temp;
	}
	
	return items;
    }


}
