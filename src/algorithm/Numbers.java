package algorithm;

import databases.ConnectToSqlDB;
import java.lang.*;
import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[100000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		int n = num.length;
		randomize (num, n);

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
//        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//        printValue(numbers);


		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
//		List<String> numbers1 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
//		printValue(numbers);


		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
//		List<String> numbers2 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
//		printValue(numbers);
//		randomize (num, n);

		//Merge Sort
		algo.mergeSort(num);
		long margeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Merge Sort take: " + margeSortExecutionTime+ " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
//		List<String> numbers3 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
//		printValue(numbers);

		//Quick Sort
		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
//		List<String> numbers4 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
//		printValue(numbers);


		//Heap Sort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
//		List<String> numbers5 = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
//		printValue(numbers);


		//Bucket Sort
		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
//		List<String> numbers6 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
//		printValue(numbers);

		//Shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
//		List<String> numbers7 = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
//		printValue(numbers);


		//Redix Sort
		algo.redixSort(num);
		long redixSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Redix Sort take: " + redixSortExecutionTime + " milli sec");
//		connectToSqlDB.insertDataFromArrayToSqlTable(num, "redix_sort", "SortingNumbers");
//		List<String> numbers8 = connectToSqlDB.readDataBase("redix_sort", "SortingNumbers");
//		printValue(numbers);

	}

	//Come to conclusion about which Sorting Algo is better in given data set.

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(100);
		}
	}

	public static void randomize( int arr[], int a) {
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = a-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}


	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
