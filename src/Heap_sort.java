
public class Heap_sort {
		
	
	public static void Heap_sort(int[] A,int heap_size) {	
		//정렬 루트를 마지막 인덱스와 바꾸고 사이즈를 줄임
		Build_Max_Heap(A,heap_size);	//힙으로 만듦
		for(int i=heap_size;i>1;i--) {
			
			Swap(A,1,i);
			heap_size--;		
			Max_Heapify(A,1,heap_size);
		}
	}
	
	public static void Build_Max_Heap(int A[],int heap_size){

		for(int i= heap_size/2 ; i>=1 ; i--) {	//heap_size/2부터 루트까지 heapify함
			Max_Heapify(A,i,heap_size);
		}
	}
	
	public static void Max_Heapify(int A[],int i,int heap_size) {
		
		int l= 2*i;
		int r= (2*i)+1;
		int largest;
		if( l <= heap_size && A[l] > A[i]) {			//왼쪽 자식이 더 큰 경우
			largest = l;
		}
		else {
			largest = i;
		}
		if (r <= heap_size && A[r] > A[largest]) {	//오른쪽이 더 큰 경우
			largest = r;
		}
		
		if(largest != i) {
			Swap(A,i,largest);
			Max_Heapify(A,largest,heap_size);			//재귀
		}
	}
	
	public static void Swap(int A[], int i,int j) {
		int tmp=A[i];
		A[i]=A[j];
		A[j]=tmp;
	}
	
	
	public static void printArr(int[] arr,int heap_size) {
		for (int i = 1; i < heap_size+1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int Extract_Max(int[] A,int heap_size) {
		if (heap_size<1) {
			System.out.print("heap underflow");
		}
		int max=A[1];
		A[1]=A[heap_size];
		heap_size--;
		
		return max;
	}
	
	public static void Insert(int n) {
		
	}
	
	public static void main(String[] args) {
		int[] A= {0,5,1,3,7,9,2,6,4,8,10,14,12,13,15};	
		int heap_size=A.length-1;		//인덱스 0을 빼기위해 -1함
		
		//정렬
		Heap_sort(A,heap_size);
		printArr(A,heap_size);	
		System.out.println("");
		
		Build_Max_Heap(A,heap_size);
		int num=Extract_Max(A,heap_size);
		System.out.println(num);
		heap_size--;
		printArr(A,heap_size);
		
		
	}
}
