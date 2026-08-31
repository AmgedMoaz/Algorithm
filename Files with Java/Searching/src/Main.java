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

        int result = binarySearch(arr,n,target);
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
}