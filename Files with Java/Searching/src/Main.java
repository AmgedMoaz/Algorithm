// Write a code to show meaning of searching algorithm

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner input = new Scanner(System.in);
    public static void main(String []args) {

        int n;
        n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = input.nextInt();

        System.out.print("Enter target you're looking for : ");
        int target = input.nextInt();

        /*
        if(linearSearch(arr,n,target)) {
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }
        */

        // Like sort method in C++
        Arrays.sort(arr);

        int result = binary_Search(arr,0,n-1,target);
        if(result <= -1) {
            System.out.println("Not found");
        }else {
            System.out.println("Found");
        }

    }

    // Linear search method
    static boolean linearSearch(int []arr , int n ,  int target) {
        for(int i = 0 ; i < n ; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Binary search method
    // Iterative style
    static int binarySearch(int []arr , int n , int target) {
        int left = 0;
        int right = n-1;
        while(left <= right) {
            int mid = (left+right) / 2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] < target) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
    // Recursive style
    static int binary_Search(int []arr , int left , int right , int target) {
        if(left <= right) {
            int mid = (left+right) / 2;
            if(arr[mid] == target) {
                return mid;                                         // base case
            }else if(arr[mid] > target) {
                return binary_Search(arr,left,mid-1,target);   // recursive case
            }else {
                return binary_Search(arr,mid+1,right,target);   // recursive case
            }
        }
        return -1;                                                   // base case
    }
}