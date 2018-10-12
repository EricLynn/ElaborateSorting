//partially stolen from stackoverflow
package ElaborateSorting;

//merge sort modified to work with InsertionSort
public class newMergeSort {
    
    public static int[] sort(int[] list) {
        if (list.length > 1) { //change for modified
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            sort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            sort(secondHalf);

            // Merge firstHalf with secondHalf into list
            list = merge(firstHalf, secondHalf);
        } else {
            //return InsertionSort.sort(list); //use this for modified
            return list; //use this for normal
        }
        return list;
    }
    
    public static int[] merge(int[] firstHalf, int[] secondHalf) {
        int[] list = new int[firstHalf.length+secondHalf.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<firstHalf.length&&j<secondHalf.length) {
            if(firstHalf[i] < secondHalf[j]) {
                list[k]=firstHalf[i];
                i++;
            } else {
                list[k]=secondHalf[j];
                j++;
            }
            k++;
        }
        while(i<firstHalf.length) {
            list[k]=firstHalf[i];
            i++;
            k++;
        }
        while(j<secondHalf.length) {
            list[k]=secondHalf[j];
            j++;
            k++;
        }
        return list;
    }
}
