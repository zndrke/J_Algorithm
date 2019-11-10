import java.util.Random;


//랜덤으로 피벗
public class Quick_sort2 {
	static int count=0;
	
	public static int Partition(int[] A, int p,int r) {
			Random random = new Random();
			int pv = random.nextInt((r-p)+1)+p;	//랜덤으로 피벗 설정
			
			Swap(A,r,pv);		//맨 뒤로 옮겨서
			int pivot = A[r];	//마지막을 피벗으로 한것과 동일
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
		count++;
	}	

	public static void setCount() {count=0;}
}
