// Write a code to show meaning of binary search

#include <bits/stdc++.h>
using namespace std;

// Declaration of binary search method
int binarySearch(int arr[] , int n , int target);

int main() {

    int n;
    cin >> n;
    
    int arr[n];
    for(int i = 0 ; i < n ; i++) cin >> arr[i];

    sort(arr,arr+n);

    int target;
    cout << "Enter a target you're loooking for : ";
    cin >> target;
    int result = binarySearch(arr,n,target);
    if(result <= -1) {
        cout << "Not found";
    }else {
        cout << "found";
    }

    return 0;
}

// Definition of binary search method
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