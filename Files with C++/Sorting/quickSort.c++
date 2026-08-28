// Write a code to show meaning of quick sort

#include <bits/stdc++.h>
using namespace std;

int partition(int arr[], int low , int high);

// Implementation quick sort
void quickSort(int arr[] , int low , int high) {
    if(low >= high) return;

    int pivotIndex = partition(arr,low,high);
    quickSort(arr,low,pivotIndex-1);
    quickSort(arr,pivotIndex+1,high);
}

int main() {

int n;
cin >> n;

int arr[n];
for(int i = 0 ; i < n ; i++) cin >> arr[i];

    return 0;
}