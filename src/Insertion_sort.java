public class Insertion_sort {

	public static void Insertion_sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];  // ����
			int j = i - 1;   // ���� ���

			while (j >= 0 && key < A[j]) {
				A[j + 1] = A[j];   // �񱳴���� ū ��� ���������� �о
				j--;
			}
			A[j + 1] = key;  // ���ذ� ����
		}
		return ;
	}
	
	public static void main(String[] args) {

		int []arr = {10, 2, 6, 4, 3, 7, 5};
		long start = System.currentTimeMillis();
		Insertion_sort(arr);
		
		printArr(arr);
		
		long end = System.currentTimeMillis();

		System.out.println( "���� �ð� : " + ( end - start )/1000.0 );
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
