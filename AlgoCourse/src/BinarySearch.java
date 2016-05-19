public class BinarySearch {
	public static boolean isSorted(int[] a) {
	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] > a[i + 1]) {
	            return false;
	        }
	    }

	    return true;
	}
	public static int getBinarySearch (int [] A, int key){

		if (!isSorted(A)) {throw new IllegalArgumentException("Array should be sorted Ascending");}
		if (A.length<1) {throw new IllegalArgumentException("Array length should be more tnan 0");}
		
			int index = -1;
		    int low = 0;
		    int high = A.length - 1;
		        
		 while(high >= low) {
		           int middle = (low + high) / 2;
		           if(A[middle] == key) {
		               index = middle;
		               break;
		            }
		           else if(A[middle] < key) {
		                low = middle + 1;
		            }
		           else if(A[middle] > key) {
		                high = middle - 1;
		            }
		       }
		        return index;
	   }
}
