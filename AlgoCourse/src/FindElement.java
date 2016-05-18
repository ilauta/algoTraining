import java.util.Arrays;
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
		if (A[0]==key) 	{
			index = 0;
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
	
	
	public static void getIndexTest(int ExpRes, int index) {
		if (ExpRes == index){
			System.out.println("test OK");
		}
		else{
			System.out.println("test Failed");
		}
	}
	
	/*
	
		public static void getFuncTest(int ExpRes, ,int A[], int size, int key) {
			if (ExpRes == index){
				System.out.println("test OK");
			}
			else{
				System.out.println("test Failed");
			}	
	}
	*/
	
	public static void main (String [] args){
//		//tests for getIndexFirst
		System.out.println("The first group of tests");
		getIndexTest(0, (getIndexFirst(new int [] {1}, 1, 1)));
		getIndexTest(0, (getIndexFirst(new int [] {1,8}, 2, 1)));
		getIndexTest(1, (getIndexFirst(new int [] {1,3,6,2}, 4, 3)));
		getIndexTest(-1, (getIndexFirst(new int [] {1,3,6,2}, 4, 8)));
//		getIndexTest(-1, (getIndexFirst(new int [] {}, 0, 1)));
//		
//		//tests for getIndexSecond
		System.out.println("The second group of tests");
		getIndexTest(0, (getIndexSecond(new int [] {1}, 1, 1)));
		getIndexTest(0, (getIndexSecond(new int [] {1,8}, 2, 1)));
		getIndexTest(1, (getIndexSecond(new int [] {1,3,6,2}, 4, 3)));
		getIndexTest(-1, (getIndexSecond(new int [] {1,3,6,2}, 4, 8)));
//		getIndexTest(-1, (getIndexSecond(new int [] {}, 0, 1)));
		
		//tests for getIndexThird
		System.out.println("The third group of tests");
		getIndexTest(0, (getIndexThird(new int [] {1}, 1, 1)));
		getIndexTest(0, (getIndexThird(new int [] {1,8,0}, 3, 1)));
		getIndexTest(3, (getIndexThird(new int [] {1,4,6,3,0}, 5, 3)));
		getIndexTest(-1, (getIndexThird(new int [] {1,3,6,2,0}, 5, 8)));
//		getIndexTest(-1, (getIndexThird(new int [] {}, 0, 1)));

		//tests for getIndexFourth
		System.out.println("The Fourth group of tests");
		getIndexTest(0, (getIndexFourth(new int [] {1}, 1, 1)));
		getIndexTest(0, (getIndexFourth(new int [] {1,8}, 2, 1)));
		getIndexTest(3, (getIndexFourth(new int [] {1,4,6,3}, 4, 3)));
		getIndexTest(-1, (getIndexFourth(new int [] {1,3,6,2}, 4, 8)));
//		getIndexTest(-1, (getIndexThird(new int [] {}, 0, 1)));
	}
	
}
