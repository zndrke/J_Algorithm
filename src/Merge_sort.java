
public class Merge_sort {
	static int count=0;
	

	public static void setCount() {count=0;}
	public static void Merge_sort(int[] A,int p, int r){
		if(p!=r) {
			int q=(p+r)/2;				//mid
			Merge_sort(A,p,q);			//����
			Merge_sort(A,q+1,r);		//������
			Merge(A,p,q,r);				//�պ�
		}
	}
	
	public static void Merge( int[] A,int p, int q, int r)
	   {
	      int []temp;
	      int MAX = r+1-p;
	      temp = new int[MAX];
	      int i = 0;		//�� �迭�� �ε���
	      int idxA = p;		//����
	      int idxB = q+1;	//������
	      
	      while(true)
	      {
	    	 count++;
	         if(A[idxA] <= A[idxB])	//�������� ū���
	         {
	            temp[i] = A[idxA];	//������ �迭�� �ְ�
	            i++;				//��ü �迭 �ε��� ����
	            idxA++;
	         }
	         else					//������ ū���
	         {
	            temp[i] = A[idxB];
	            i++;
	            idxB++;
	         }
	         
	         
	         if(idxA == q+1)		//������ ��� ����� ���
	         {
	            for(int j =idxB; j <= r; j++)	//������ �������� ��� �迭�� ����
	            {
	               temp[i] = A[j];
	               i++;
	            }
	            break;
	         }
	         else if(idxB == r+1)	//�������� ��� ����� ���
	         {
	            for(int j =idxA; j <= q; j++)
	            {
	               temp[i] = A[j];
	               i++;
	            	}
	            	break;
	         	}
	      	}

	      	for(int j = 0; j < MAX; j++)	//���θ��� �迭�� ���� �迭�� �ű�
	      	{
	    	  	A[p] = temp[j];
	         	p++;
	      	}
	   }
	}
