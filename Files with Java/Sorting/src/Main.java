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
        insertionSort(arr,n);

        System.out.println("After insertion sorting");
        for(int i = 0 ; i < n ; i++)
            System.out.print(arr[i] + " ");

    }

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

    static void mergeSort(int arr[] , int left , int right) {
        if(left < right) {
            int mid = left + (right-left)/2;

            // Divide left section
            mergeSort(arr,left,mid);

            // Divide right section
            mergeSort(arr,mid+1,right);

            // Merge function
            // merge(arr,left,mid,right);
        }
    }

}