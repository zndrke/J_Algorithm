import java.util.Random;

public class Sort_main {
	
	public static void main(String[] args) {
		
		int MAXN  = 1024;
		   int [] arr = new int [MAXN];
		   int [] test_arr;
		   long startTime;
		   long endTime;
		   
		   Random random = new Random();
		   for (int i = 0 ; i < MAXN; i ++)
		   {
			   arr[i] = random.nextInt(MAXN);
		   }
		   for (int i = 0 ; i < arr.length; i ++){
			   System.out.print(arr[i]+ " ");
		   }
		   System.out.println();
		   
		   System.out.println("Insertion Sort ...  ");
		   test_arr = arr.clone();		
		   startTime = System.nanoTime();
		   Insertion_sort is = new Insertion_sort();
		   is.Insertion_sort(test_arr);
		   endTime =  System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Insertion Sort is ..  " );
		   System.out.println(endTime - startTime);
		   

		   System.out.println("Heap Sort ...  ");
		   test_arr = arr.clone();
		   startTime = System.nanoTime();
		   Heap_sort hs = new Heap_sort();
		   hs.Heap_sort(test_arr);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Heap Sort is ..  " );
		   System.out.println(endTime - startTime);
		   

		   System.out.println("Merge Sort ...  ");
		   test_arr = arr.clone();
		   startTime = System.nanoTime();
		   Merge_sort ms= new Merge_sort();
		   ms.Merge_sort(test_arr, 0, test_arr.length-1);
		   endTime =  System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Merge Sort is ..  " );
		   System.out.println(endTime - startTime);
		   
		   System.out.println("Quick Sort ...  ");
		   test_arr = arr.clone();
		   startTime = System.nanoTime();
		   Quick_sort qs= new Quick_sort();
		   qs.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Quick Sort is ..  " );
		   System.out.println(endTime - startTime);
		   
	}
}
