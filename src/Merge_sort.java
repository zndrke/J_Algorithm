
public class Merge_sort {
	
	
	public static void Merge_sort(int[] A,int p, int r){
		if(p!=r) {
			int q=(p+r)/2;				//mid
			Merge_sort(A,p,q);			//왼쪽
			Merge_sort(A,q+1,r);		//오른쪽
			Merge(A,p,q,r);				//합병
		}
	}
	
	public static void Merge( int[] A,int p, int q, int r)
	   {
	      int []temp;
	      int MAX = r+1-p;
	      temp = new int[MAX];
	      int i = 0;
	      int idxA = p;
	      int idxB = q+1;
	      
	      while(true)
	      {
	         if(A[idxA] < A[idxB])
	         {
	            temp[i] = A[idxA];
	            i++;
	            idxA++;
	         }
	         else
	         {
	            temp[i] = A[idxB];
	            i++;
	            idxB++;
	         }
	         
	         if(idxA == q+1)
	         {
	            for(int j =idxB; j <= r; j++)
	            {
	               temp[i] = A[j];
	               i++;
	            }
	            break;
	         }
	         else if(idxB == r+1)
	         {
	            for(int j =idxA; j <= q; j++)
	            {
	               temp[i] = A[j];
	               i++;
	            	}
	            	break;
	         	}
	      	}

	      	for(int j = 0; j < MAX; j++)
	      	{
	    	  	A[p] = temp[j];
	         	p++;
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
