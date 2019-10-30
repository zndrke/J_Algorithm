
public class Heap_sort {
		
	private static int N;
	public static void Heap_sort(int[] A) {	
		//정렬 루트를 마지막 인덱스와 바꾸고 사이즈를 줄임
		Build_Max_Heap(A);	//힙으로 만듦
		for(int i=N;i>0;i--) {
			
			Swap(A,0,i);
			N--;		
			Max_Heapify(A,0);
		}
	}
	
	public static void Build_Max_Heap(int A[]){

		N=A.length-1;
		for(int i=N/2 ; i>=0 ; i--) {	//heap_size/2부터 루트까지 heapify함
			Max_Heapify(A,i);
		}
	}
	
	public static void Max_Heapify(int A[],int i) {
		
		int l= 2*i;
		int r= (2*i)+1;
		int largest;
		if( l <= N && A[l] > A[i]) {			//왼쪽 자식이 더 큰 경우
			largest = l;
		}
		else {
			largest = i;
		}
		if (r <= N && A[r] > A[largest]) {	//오른쪽이 더 큰 경우
			largest = r;
		}
		
		if(largest != i) {
			Swap(A,i,largest);
			Max_Heapify(A,largest);			//재귀
		}
	}
	
	public static void Swap(int A[], int i,int j) {
		int tmp=A[i];
		A[i]=A[j];
		A[j]=tmp;
	}
	
	
	public static void printArr(int[] arr) {
		for (int i = 1; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int Extract_Max(int[] A) {
		if (N<1) {
			System.out.print("heap underflow");
		}
		int max=A[1];
		A[1]=A[N];
		N--;
		
		return max;
	}
	
	public static void Insert(int n) {
		
	}
	
	public static void main(String[] args) {
		int[] A= {0,5,1,3,7,9,2,6,4,8,10,14,12,13,15};	
		int heap_size=A.length-1;		
		
		//정렬
		Heap_sort(A);
		printArr(A);	
		System.out.println("");
		
		Build_Max_Heap(A);
		int num=Extract_Max(A);
		System.out.println(num);
		heap_size--;
		printArr(A);
		
		
	}
}
