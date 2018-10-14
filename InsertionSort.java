package ElaborateSorting;

public class InsertionSort{

    public static int[] sort(int[] items){
	int comparisons, swaps;
	swaps = comparisons = 0;

	for(int i = 1; i<items.length; i++){
	    int[] sortedItems = new int[i];
	    for(int j = 0; j<sortedItems.length; j++){
		sortedItems[j] = items[j];
	    }
	    int low = 0;
	    int high = sortedItems.length-1;
	    int mid = 0;
	    while(high>low){
		mid = (high + low)/2;
		comparisons++;
		if(items[i]>items[mid]){
		    low = mid+1;
		}
		else
		    high = mid;
	    }
	    comparisons++;
	    int index = 0;
	    if(items[i]<items[mid])
		index = mid;
	    else
		index = mid+1;

	    int temp = items[i];
	    for(int j = i-1; j>=index; j--){
		swaps++;
		items[j+1] = items[j];
	    }
	    items[index] = temp;
	    
	}

    return items;

    }
}
