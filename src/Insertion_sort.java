public class Insertion_sort {

	public static void main(String[] args) {

		int []arr = {10, 2, 6, 4, 3, 7, 5};
		//�迭 ����� �԰� �ʱ�ȭ
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];  // ����
			int j = i - 1;   // ���� ���

			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];   // �񱳴���� ū ��� ���������� �о
				j--;
			}
			arr[j + 1] = key;  // ���ذ� ����
		}
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
