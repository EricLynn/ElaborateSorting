/* Purpose: DSA Lab 10
 * Status: Complete and thoroughly tested
 * Last update: 10/10/18
 * Submitted: 11/23/2015
 * @author: Eric M. Lynn!
 * @version: 23.11.15
 */
package ElaborateSorting;

public class MergeSort{


    public static int[] sort(int[] items){
    	int[] otherItems = new int[items.length];
    	//i = the size of the partitions being sorted
    	for(int i = 1; i < items.length; i *= 2){
	    //j loops through sets of 2 partitions and sorts them
    		for(int j = 0; j<items.length; j += 2*i){
    			mergeParts(items, otherItems, j, i+j,  j+2*i);
    		}
    	}
    	return items;
    }

//feel like this could have been significantly more efficient. want to go back and re-work it at some point.
    private static void mergeParts(int[] items, int[] temp, int start, int mid, int end){
    	if(mid<items.length){
    		if(end > items.length)
    			end = items.length;
    		int index1 = start;
    		int index2 = mid;
    		for(int i = start; i<end; i++){
    			if(index1 == mid){
    				temp[i] = items[index2];
    				index2++;
    			}
    			else if(index2 == end){
    				temp[i] = items[index1];
    				index1++;
    			}
    			else if(items[index1]<items[index2]){
    				temp[i] = items[index1];
    				index1++;
    			}
    			else{
    				temp[i] = items[index2];
    				index2++;
    			}
    		}
    		for(int i = start; i<end; i++){
    			items[i] = temp[i];
    		}
    	}	
    }
}
