
public class Merge_sort {
	static int count=0;
	

	public static void setCount() {count=0;}
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
	      int i = 0;		//새 배열의 인덱스
	      int idxA = p;		//왼쪽
	      int idxB = q+1;	//오른쪽
	      
	      while(true)
	      {
	    	 count++;
	         if(A[idxA] <= A[idxB])	//오른쪽이 큰경우
	         {
	            temp[i] = A[idxA];	//왼쪽을 배열에 넣고
	            i++;				//전체 배열 인덱스 증가
	            idxA++;
	         }
	         else					//왼쪽이 큰경우
	         {
	            temp[i] = A[idxB];
	            i++;
	            idxB++;
	         }
	         
	         
	         if(idxA == q+1)		//왼쪽을 모두 사용한 경우
	         {
	            for(int j =idxB; j <= r; j++)	//오른쪽 나머지를 모두 배열에 저장
	            {
	               temp[i] = A[j];
	               i++;
	            }
	            break;
	         }
	         else if(idxB == r+1)	//오른쪽을 모두 사용한 경우
	         {
	            for(int j =idxA; j <= q; j++)
	            {
	               temp[i] = A[j];
	               i++;
	            	}
	            	break;
	         	}
	      	}

	      	for(int j = 0; j < MAX; j++)	//새로만든 배열을 원래 배열로 옮김
	      	{
	    	  	A[p] = temp[j];
	         	p++;
	      	}
	   }
	}
