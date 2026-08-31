// Write a code to show meaning of searching algorithm

import java.util.ArrayList;
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

        if(linearSearch(arr,n,target)) {
            System.out.println("Found");
        }else {
            System.out.println("Not found");
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
}