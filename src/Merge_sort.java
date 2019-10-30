
public class Merge_sort {
	
	public static int [] sorted = new int[30];
	
	public static void Merge_sort(int[] A,int p, int r){
		if(p<r) {
			int q=(p+r)/2;				//mid
			Merge_sort(A,p,q);			//왼쪽
			Merge_sort(A,q+1,r);		//오른쪽
			Merge(A,p,q,r);				//합병
		}
	}
	
	public static void Merge(int[] A,int p,int q,int r) {
		int i,j,k;
		
		i=p;		//왼쪽
		j=q+1;		//오른쪽
		k=p;		//새 배열 인덱스
		
		while(i<=q && j<=r) {			//비교하고 값 sorted 배열에 저장
			if (A[i]<=A[j]) 			
				sorted[k]=A[i++];
			else 
				sorted[k]=A[j++];
			k++;
		}
		if(i>q) 						//i가 끝난 상황
			for(int t= j;t<=r;t++,k++)
				sorted[k]=A[t];
		else 							//j가 끝난 상황
			for(int t= i;t<=q;t++,k++)
				sorted[k]=A[t];
		
		for(int t=p;t<=r;t++) {			//정렬된 sorted를 배열 A에 저장
			A[t]=sorted[t];
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String args[]) {
		int [] arr= {2,6,3,7,8,4,9,1,5};
		
		Merge_sort(arr,0,arr.length-1);
		
		printArr(arr);	
	}
}
