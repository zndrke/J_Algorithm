public class Insertion_sort {

	public static void Insertion_sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];  // 기준
			int j = i - 1;   // 비교할 대상

			while (j >= 0 && key < A[j]) {
				A[j + 1] = A[j];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
				j--;
			}
			A[j + 1] = key;  // 기준값 저장
		}
		return ;
	}
	
	public static void main(String[] args) {

		int []arr = {10, 2, 6, 4, 3, 7, 5};
		long start = System.currentTimeMillis();
		Insertion_sort(arr);
		
		printArr(arr);
		
		long end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
