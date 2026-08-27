// Write a code to show meaning of merge sort

#include <bits/stdc++.h>
using namespace std;

// Merge Sort implementation
void mergeSort(int arr[] , int left , int right) {
    int mid = left + (right - left)/2;

    // Divide left section
    mergeSort(arr,left,mid);
    
    // Divide right section
    mergeSort(arr,mid+1,right);

    // Merge function
    // merge(arr,left,mid,right);
}


int main() {



    return 0;
}