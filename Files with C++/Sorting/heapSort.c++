// Write a code to show meaning of heap sort

#include <bits/stdc++.h>
using namespace std;

// Heap sort implementation
void heapify(int arr[] , int n , int i) {
    int max = i;
    int left = 2*i+1;
    int right = 2*i+2;

    if(left < n and arr[left] > arr[max]) {
        max = left;
    }
    if(right < n and arr[right] > arr[max]) {
        max = right;
    }

    if(i != max) {
        swap(arr[max],arr[i]);
        heapify(arr,n,max);
    }
}
void heapSort(int arr[] , int n) {
    for(int i = n/2-1 ; i >= 0 ; i--) {
        heapify(arr,n,i);
    }

    for(int i = n-1 ; i > 0 ; i--) {
        swap(arr[0],arr[i]);
        heapify(arr,i,0);
    }
}

int main() {

    

    return 0;
}