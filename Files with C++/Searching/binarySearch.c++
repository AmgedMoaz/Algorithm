// Write a code to show meaning of binary search

#include <bits/stdc++.h>
using namespace std;

// Declaration of binary search method
// Iterative style
int binarySearch(int arr[] , int n , int target);

// Recursive style
int binary_Search(int arr[] , int left , int right , int target);

int main() {

    int n;
    cin >> n;
    
    int arr[n];
    for(int i = 0 ; i < n ; i++) cin >> arr[i];

    sort(arr,arr+n);

    int target;
    cout << "Enter a target you're loooking for : ";
    cin >> target;
    int result = binary_Search(arr,0,n-1,target);
    if(result <= -1) {
        cout << "Not found";
    }else {
        cout << "found";
    }

    return 0;
}

// Definition of binary search method
// Iterative style
int binarySearch(int arr[] , int n , int target) {
    int left = 0 , right = n-1;
    while(left <= right) {
        int mid = (left+right) / 2;
        if(arr[mid] == target) {
            return mid;
        }else if(arr[mid] > target) {
            right = mid-1;
        }else {
            left = mid+1;
        }
    }
    return -1;
}
// Recursion style
int binary_Search(int arr[] , int left , int right , int target) {
    if(left <= right) {
        int mid = (left+right) / 2;
        if(arr[mid] == target) {
            return mid;                                     // base case
        }else if(arr[mid] < target) {
            return binary_Search(arr,mid+1,right,target);   // recursive case
        }else {
            return binary_Search(arr,left,mid-1,target);    // recursive case
        }
    }
    return -1;                                              // base case
}