//Class for any miscellanious functionality outside of actual sorting
//for this elaborate sorting homework assignment
package ElaborateSorting;

import java.util.Random;
import ElaborateSorting.QuickSort;
import ElaborateSorting.MergeSort;

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
			sorted[i] = i+1;
		}
		return sorted;
	}
	
	public static void timingFunction(int[] array) {
		long timeStart = System.currentTimeMillis();
		int[] sortedArray = newMergeSort.sort(array);
		//BinarySearchTree tree = new BinarySearchTree();
		//for(int i=0; i<array.length;i++) {
		//    tree.insert(array[i]);
		//}
		//tree.inorder();
		long timeEnd = System.currentTimeMillis();
		long ellapsedTime = timeEnd-timeStart;
		System.out.println(ellapsedTime);
	}

	public static void main(String[] args) {
		int[] arrayToBeSorted = produceHalfSortedArray(1000, 1, 1000);
		Misc.timingFunction(arrayToBeSorted);
	}
}
