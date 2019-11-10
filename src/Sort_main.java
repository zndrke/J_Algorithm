import java.util.Random;
import java.util.Arrays;

public class Sort_main {
	
	public static void main(String[] args) {
		
		int MAXN  = 1024;
		   int [] arr = new int [MAXN];
		   int [] sorted;	//정렬된 배열
		   int [] test_arr;		//정렬안된 배열 정렬
		   long startTime;
		   long endTime;
		   
		   Random random = new Random();
		   for (int i = 0 ; i < MAXN; i ++)
		   {
			   arr[i] = random.nextInt(MAXN);
		   }
		   
		   sorted = arr.clone();
		   Arrays.sort(sorted);
		   
		   
		   for (int i = 0 ; i < arr.length; i ++){
			   System.out.print(arr[i]+ " ");
		   }
		   System.out.println();
		   
		   
		   //정렬안된 Insertion
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
		   System.out.print("Compcount of Insertion Sort is ..  " );
		   System.out.println(is.count);
		   is.setCount();
		   
		   //정렬된 Insertion
		   System.out.println("Already Sorted Insertion Sort ...  ");
		   test_arr = sorted.clone(); 
		   startTime = System.nanoTime();	
		   Insertion_sort sis = new Insertion_sort();
		   sis.Insertion_sort(test_arr);
		   endTime =  System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Sorted Insertion Sort is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Sorted Insertion Sort is ..  " );
		   System.out.println(sis.count);
		   
		 
		   //정렬안된 Heap
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
		   System.out.print("COMPCOUNT of Heap Sort is ..  " );
		   System.out.println(hs.count);
		   hs.setCount();
		   
		   //정렬된 heap
		   System.out.println("Sorted Heap Sort ...  ");
		   test_arr = sorted.clone();
		   startTime = System.nanoTime();
		   Heap_sort shs = new Heap_sort();
		   shs.Heap_sort(test_arr);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Sorted Heap Sort is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Sorted Heap Sort is ..  " );
		   System.out.println(shs.count);
		   
		   //정렬안된 Merge
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
		   System.out.print("COMPCOUNT of Merge Sort is ..  " );
		   System.out.println(ms.count);
		   ms.setCount();
		   
		   //정렬된 Merge
		   System.out.println("Sorted Merge Sort ...  ");
		   test_arr = sorted.clone();
		   startTime = System.nanoTime();
		   Merge_sort sms= new Merge_sort();
		   sms.Merge_sort(test_arr, 0, test_arr.length-1);
		   endTime =  System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Sorted Merge Sort is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Sorted Merge Sort is ..  " );
		   System.out.println(sms.count);
		   
		   //정렬안된 Quick1
		   System.out.println("Quick Sort1 ...  ");
		   test_arr = arr.clone();
		   startTime = System.nanoTime();
		   Quick_sort qs= new Quick_sort();
		   qs.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Quick Sort1 is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Quick Sort1 is ..  " );
		   System.out.println(qs.count);
		   //qs.setCount();
		   
		   //정렬된 Quick1
		   System.out.println("Sorted Quick Sort1 ...  ");
		   test_arr = sorted.clone();
		   startTime = System.nanoTime();
		   Quick_sort sqs= new Quick_sort();
		   sqs.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Sorted Quick Sort1 is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Sorted Quick Sort1 is ..  " );
		   System.out.println(sqs.count);
		   
		   //정렬안된 Quick2
		   System.out.println("Quick Sort2 ...  ");
		   test_arr = arr.clone();
		   startTime = System.nanoTime();
		   Quick_sort2 qs2= new Quick_sort2();
		   qs2.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Quick Sort2 is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Quick Sort is2 ..  " );
		   System.out.println(qs2.count);
		   qs2.setCount();
		   
		   //정렬된 Quick2
		   System.out.println("Sorted Quick Sort2 ...  ");
		   test_arr = sorted.clone();
		   startTime = System.nanoTime();
		   Quick_sort2 sqs2= new Quick_sort2();
		   sqs2.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Sorted Quick Sort2 is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Sorted Quick Sort2 is ..  " );
		   System.out.println(sqs2.count);
		   
		   //정렬안된 Quick3
		   System.out.println("Quick Sort3 ...  ");
		   test_arr = arr.clone();
		   startTime = System.nanoTime();
		   Quick_sort3 qs3= new Quick_sort3();
		   qs3.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Quick Sort is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Quick Sort is ..  " );
		   System.out.println(qs3.count);
		   qs3.setCount();
		   
		   //정렬된 Quick3
		   System.out.println("Sorted Quick Sort3 ...  ");
		   test_arr = sorted.clone();
		   startTime = System.nanoTime();
		   Quick_sort3 sqs3= new Quick_sort3();
		   sqs3.Quick_sort(test_arr, 0, test_arr.length-1);
		   endTime = System.nanoTime();
		   for (int i = 0 ; i < test_arr.length; i ++){
			   System.out.print(test_arr[i]+ " ");
		   }
		   System.out.println();
		   System.out.print("ClockTime of Sorted Quick Sort3 is ..  " );
		   System.out.println(endTime - startTime);
		   System.out.print("COMPCOUNT of Sorted Quick Sort3 is ..  " );
		   System.out.println(sqs3.count);
		   
	}
}
