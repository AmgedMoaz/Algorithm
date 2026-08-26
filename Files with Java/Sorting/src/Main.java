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
        bubbleSort(arr,n);

        System.out.println("After bubble sorting");
        for(int i = 0 ; i < n ; i++)
            System.out.print(arr[i] + " ");



    }
    static void bubbleSort(int arr[] , int n) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n-1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    // تبديل العناصر (Swap)
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}