public class Insertion_sort {
	static int count=0;

	public static void Insertion_sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int key = A[i];  // ����
			int j = i - 1;   // ���� ���

			while (j >= 0 && key < A[j]) {
				A[j + 1] = A[j];   // �񱳴���� ū ��� ���������� �о
				j--;
				count++;
				
			}
			A[j + 1] = key;  // ���ذ� ����
			count++;
		}
		
		return ;
	}
	
	public static void setCount() {
		count=0;
	}
}
