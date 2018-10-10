/* Purpose: DSA Lab 9 Problem 4
 *  * Status: Complete and thoroughly tested
 *   * Last update: 10/10/18
 *    * Submitted: 11/11/15
 *      * @author: Eric M. Lynn!
 *       * @version: 2015.11.10
 *        */

public  class SelectionSort{

    public static int[] sort(int[] items){
	int comparisons, swaps;
	swaps = comparisons = 0;
	int indexOfLargest;
	boolean sorted = false;
	for(int i = items.length-1; i>=0 && !sorted ; i--){
	    indexOfLargest = i;
	    sorted = false;
	    for(int j = 0; j<i; j++){
		comparisons++;
		if(items[j]>items[indexOfLargest]){
		    indexOfLargest = j;
		}
	    }
	    if(i != indexOfLargest){
	        swaps++;
		int temp = items[indexOfLargest];
		items[indexOfLargest] = items[i];
		items[i] = temp;
		
	    }
	    else{
		sorted = true;
	    }
	    return items;
	}



}
