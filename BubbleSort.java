/* Purpose: Who knows? It's fucking bubblesort.
 *  * Status: Complete and thoroughly tested
 *   * Last update: 10/10/18
 *    * Submitted: 11/11/15
 *      * @author: Eric M. Lynn!
 *       * @version: 2015.11.10
 *        */
package ElaborateSorting;

public  class BubbleSort {

	public static int[] sort(int[] items) {
		int comparisons, swaps;
		swaps = comparisons = 0;
		boolean notSwap = false;
		for (int i = items.length - 1; i > 0 && !notSwap; i--) {
			for (int j = 0; j < i; j++) {
				comparisons++;
				notSwap = true;

				if (items[j] > items[j + 1]) {
					swaps++;
					notSwap = false;
					int temp = items[j + 1];
					items[j + 1] = items[j];
					items[j] = temp;
				}

			}

		}
		return items;
	}
}
