import java.util.Random;


//마지막을 피벗으로
public class Quick_sort {
	
	public static int Partition(int[] A, int p,int r) {
			int pivot = A[r];
			int i = p-1;
			for(int j = p ; j < r ; j++) {
				if(A[j]<=pivot) {
					i++;
					Swap(A,i,j);
				}
			}

		Swap(A,i+1,r);
		return i+1;
	}
	
	//median
	/*
	public static int Partition(int[] A, int p,int r) {
		
		int q=(p+r)/2;
		
		int pivot = A[q];
		Swap(A,q,r);
		
		int i = p-1;
		for(int j = p ; j < r ; j++) {
			if(A[j]<=pivot) {
				i++;
				Swap(A,i,j);
			}
		}

		Swap(A,i+1,r);
		return i+1;
	}
	*/
	
	public static void Quick_sort(int[] A,int p,int r) {
		if(p<r) {
			int q = Partition(A,p,r);	//피벗
			Quick_sort(A,p,q-1);
			Quick_sort(A,q+1,r);		
		}
	}
	
	public static void Swap(int A[], int i,int j) {
		int tmp=A[i];
		A[i]=A[j];
		A[j]=tmp;
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int [] A = {1,5,7,9,3,2,4,8,6};
		
		Quick_sort(A,0,A.length-1);
		
		printArr(A);
	}
	
}
