public class Insertion_sort {

	public static void main(String[] args) {

		int []arr = {10, 2, 6, 4, 3, 7, 5};
		//배열 선언과 함계 초기화
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];  // 기준
			int j = i - 1;   // 비교할 대상

			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
				j--;
			}
			arr[j + 1] = key;  // 기준값 저장
		}
		printArr(arr);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
