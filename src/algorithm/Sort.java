package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    void heapify(int list[], int arrayLength, int rootIndex)
    {
        int largest = rootIndex;
        int leftNodeIndex = 2*rootIndex + 1;
        int rightNodeIndex = 2*rootIndex + 2;


        if (leftNodeIndex < arrayLength && list[leftNodeIndex] > list[largest])
            largest = leftNodeIndex;

        if (rightNodeIndex < arrayLength && list[rightNodeIndex] > list[largest])
            largest = rightNodeIndex;


        if (largest != rootIndex)
        {
            int temp = list[rootIndex];
            list[rootIndex] = list[largest];
            list[largest] = temp;

            heapify(list, arrayLength, largest);
        }
    }
    public int [] heapSort(int [] array,int arrayLength){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(list, arrayLength, i);

        for (int i=arrayLength-1; i>=0; i--)
        {
            int temp =list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(list, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] bucketSort(int [] array, int maxArrayElementValue){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int max = maxArrayElementValue;
        int [] bucket=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<list.length; i++) {
            bucket[list[i]]++;
        }

        int position=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                list[position++] = i;
            }

        }         final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] redixSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

