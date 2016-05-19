public class FindElement {
	public static int getIndexFirst(int A[], int size, int key) {
		if (size<=0) {throw new IllegalArgumentException("size should be more tnan 0");}
		int index = -1;
				for (int i=0; i<size; i++) {
					if (A[i]==key) {
						index = i;
					} 
				}
		return index;
	}
	
	public static int getIndexSecond(int A[], int size, int key) {
		if (size<=0) {throw new IllegalArgumentException("size should be more tnan 0");}
		int index = -1;
		int i = 0;
			while (i<size) {
				if (A[i]==key) {
						index = i;
					} 
					i++;
				} 
		return index;
	}
	
	public static int getIndexThird(int A[], int size, int key) {
		if (size<=0) {throw new IllegalArgumentException("size should be more tnan 0");}
		int index = 0;
		int i = 0;
		if (A[size-1]==key) 	{
			index = size-1;
		}else{
		
		A[size-1] = key;
		
			while (A[i] != key) {
				i++;
			}
					if (i == (size-1)) {
						index = -1;
					}
					else {
						index = i;
					}
		}
		return index;
	}
	
	public static int getIndexFourth(int A[], int size, int key) {
		if (size<=0) {throw new IllegalArgumentException("size should be more tnan 0");}
		int index = 0;
		int i = 0;
		int pr = A[size-1];
		A[size-1] = key;
		
		if (pr == key) {
			index = size-1;
		}
		else {
			while (A[i] != key) {
					i++;
			}
					if (i == (size-1)) {
						index = -1;
					}
					else { index = i; }
		}
		A[size-1] = pr;
		return index;
	}
	
	public static int getBinarySearch(int A[], int size, int key){
		if (size<=0) {throw new IllegalArgumentException("size should be more tnan 0");}
		int index = -1;
		
		return index;
	}
}
