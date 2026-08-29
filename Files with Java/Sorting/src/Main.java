// Write a main class for every kind of sort

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the size of array : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = input.nextInt();

        // Bubble sort
        // bubbleSort(arr,n);

        // Selection sort\
        // selectionSort(arr,n);

        // Insertion sort
        // insertionSort(arr,n);

        // mergeSort(arr,0,n-1);

        quickSort(arr,0,n-1);

        System.out.println("After quick sorting");
        for(int i = 0 ; i < n ; i++)
            System.out.print(arr[i] + " ");

    }

    // Bubble sort
    static void bubbleSort(int arr[] , int n) {
        for(int i = 0 ; i < n-1 ; i++) {
            for(int j = 0 ; j < n-i-1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    // تبديل العناصر (Swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort
    static void selectionSort(int arr[] , int n) {
        for(int i = 0 ; i < n-1 ; i++) {
            int minIndex = i;
            for(int j = i+1 ; j < n ; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                // swap function
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Insertion sort
    static void insertionSort(int arr[] , int n) {
        for(int i = 1 ; i < n ; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    // Merge sort
    static void mergeSort(int arr[] , int left , int right) {
        if(left < right) {
            int mid = left + (right-left)/2;

            // Divide left section
            mergeSort(arr,left,mid);

            // Divide right section
            mergeSort(arr,mid+1,right);

            // Merge function
            merge(arr,left,mid,right);
        }
    }
    static void merge(int arr[] , int left , int mid , int right) {

        // 1. حساب أحجام المصفوفات المؤقتة
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 2. إنشاء المصفوفات المؤقتة
        int [] L = new int[n1];
        int[]  R = new int [n2];

        // 3. نسخ البيانات إلى المصفوفات المؤقتة
        for(int i = 0 ; i < n1 ; i++)
            L[i] = arr[left+i];
        for(int i = 0 ; i < n2 ; i++)
            R[i] = arr[mid+i+1];

        // 4. دمج عناصر المصفوفات بالترتيب الصحيح
        int i = 0 , j = 0 , k = left;

        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // 5. نسخ العناصر المتبقية إن وجدت
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick sort
    static void quickSort(int arr[] , int low , int high) {
        if(low < high) {
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    static int partition(int arr[] , int low , int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low ; j < high ; j++) {
            if(arr[j] < pivot) {
                i++;
                // Swap function
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap function
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    // Heap sort
    static void heapSort(int[] arr) {
        int n = arr.length;

        // 1. بناء الـ Max-Heap (إعادة ترتيب المصفوفة)
        // نفتح الحلقة من آخر عقدة غير ورقية (n/2 - 1) وننزل إلى الجذر (0)
        for(int i = n/2-1 ; i >= 0 ; i--) {
            heapify(arr, n, i);
        }

        // 2. استخراج العناصر من الكومة واحدًا تلو الآخر
        for(int i = n-1 ; i > 0 ; i--) {
            // Swap function
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // استدعاء heapify على الكومة المُصغّرة لإعادة ترتيب الجذر
            heapify(arr,i,0);
        }
    }
    static void heapify(int arr[],int n , int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            // Swap function
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,n,largest);
        }
    }

}