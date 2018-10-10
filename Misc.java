//Class for any miscellanious functionality outside of actual sorting
//for this elaborate sorting homework assignment

import java.util.Random;

public class Misc{

	public static int[] produceRandArray(int size, int minrange, int maxrange){
		Random rand = new Random();
		int[] randArray = new int[size];

		for(int i = 0; i<randArray.length; i++){
			randArray[i] = rand.nextInt(maxrange-minrange) + minrange;
		}

		return randArray;

	}

	public static int[] produceHalfSortedArray(int size, int minrange, int maxrange){
		int[] halfSorted = produceRandArray(size, minrange, maxrange);
		int[] sorted = new int[halfSorted.length/2];

		System.arraycopy(halfSorted, 0, sorted, 0, sorted.length);

		QuickSort.sort(sorted);

        System.arraycopy(sorted, 0, halfSorted, 0, sorted.length);

		return halfSorted;
	}

	public static int[] produceSortedArray(int size){
		int[] sorted = new int[size];
		for(int i = 0; i<size; i++){
			sorted[i] = i+2;
		}
		return sorted;
	}

}
