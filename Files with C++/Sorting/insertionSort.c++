// Write a code to show meaning of insertion sort

#include <bits/stdc++.h>
using namespace std;

// Insertion Sort implementation
void insertionSort(int arr[] , int n) {
    for(int i = 1 ; i < n ; i++) {
        int key = arr[i];
        int j = i-1;
        while(j >= 0 and key < arr[j]) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
}

int main() {

    int n ;
    cin >> n;

    int arr[n];
    for(int i = 0 ; i < n ; i++) cin >> arr[i];

    insertionSort(arr,n);

    for(int i = 0 ; i < n ; i++) cout <<  arr[i] << " ";

    return 0;
}