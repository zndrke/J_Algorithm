public class Insertion_sort {
	static int count=0;

	public static void Insertion_sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];  // 기준
			int j = i - 1;   // 비교할 대상

			while (j >= 0 && key < A[j]) {
				A[j + 1] = A[j];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
				j--;
				count++;
				
			}
			A[j + 1] = key;  // 기준값 저장
			count++;
		}
		
		return ;
	}
	
	public static void setCount() {
		count=0;
	}
}
