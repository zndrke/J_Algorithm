public class Insertion {

	public static void main(String[] args) {

		int [] arr = {10, 2, 6, 4, 3, 7, 5};
		//�迭 ����� �԰� �ʱ�ȭ
		
		for (int i = 1; i < arr.length; i++) {
			int standard = arr[i];  // ����
			int aux = i - 1;   // ���� ���

			while (aux >= 0 && standard < arr[aux]) {
				arr[aux + 1] = arr[aux];   // �񱳴���� ū ��� ���������� �о
				aux--;
			}
			arr[aux + 1] = standard;  // ���ذ� ����
		}
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
