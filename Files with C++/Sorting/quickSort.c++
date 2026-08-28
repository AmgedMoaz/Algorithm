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
int partition(int arr[] , int low , int high) {
    int pivot = arr[high];
    int i = low-1;

    for(int j = low ; j < high ; j++) {
        if(arr[j] < pivot) {
            i++;
            swap(arr[j],arr[i]);
        }
    }

    swap(arr[i+1],arr[high]);
    return i+1;
}

int main() {

int n;
cin >> n;

int arr[n];
for(int i = 0 ; i < n ; i++) cin >> arr[i];

cout << "After quick sort" << "\n";
quickSort(arr,0,n-1);
for(int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    return 0;
}