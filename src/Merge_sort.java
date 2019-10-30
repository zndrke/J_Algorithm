
public class Merge_sort {
	
	public static int [] sorted = new int[30];
	
	public static void Merge_sort(int[] A,int p, int r){
		if(p<r) {
			int q=(p+r)/2;				//mid
			Merge_sort(A,p,q);			//����
			Merge_sort(A,q+1,r);		//������
			Merge(A,p,q,r);				//�պ�
		}
	}
	
	public static void Merge(int[] A,int p,int q,int r) {
		int i,j,k;
		
		i=p;		//����
		j=q+1;		//������
		k=p;		//�� �迭 �ε���
		
		while(i<=q && j<=r) {			//���ϰ� �� sorted �迭�� ����
			if (A[i]<=A[j]) 			
				sorted[k]=A[i++];
			else 
				sorted[k]=A[j++];
			k++;
		}
		if(i>q) 						//i�� ���� ��Ȳ
			for(int t= j;t<=r;t++,k++)
				sorted[k]=A[t];
		else 							//j�� ���� ��Ȳ
			for(int t= i;t<=q;t++,k++)
				sorted[k]=A[t];
		
		for(int t=p;t<=r;t++) {			//���ĵ� sorted�� �迭 A�� ����
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
