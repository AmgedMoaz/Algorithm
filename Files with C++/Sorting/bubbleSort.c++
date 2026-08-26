// Write a code to show meaning of bubble sort

#include <bits/stdc++.h>
using namespace std;

// Bubble Sort implementation
void bubbleSort(int arr[],int size) {
    for(int i = 0 ; i < size ; i++) {
        for(int j = 0 ; j < size-i-1 ; j++) {
            if(arr[j] > arr[j+1]) {
                swap(arr[j],arr[j+1]);
            }
        }
    }
}

int main() {

    int n;
    cin >> n;

    int arr[n];
    for(int i = 0 ; i < n ; i++) cin >> arr[i];

    bubbleSort(arr,n);

    for(int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    return 0;
}

// more efficient 
/*
vector<int> arr(n);
for(int i = 0 ; i < n ; i++) cin >> arr[i];
void bubbleSort(vector<int>& arr, int size) {
    for(int i = 0 ; i < size - 1 ; i++) {
        bool swapped = false;
        for(int j = 0 ; j < size - i - 1 ; j++) {
            if(arr[j] > arr[j+1]) {
                swap(arr[j], arr[j+1]);
                swapped = true;
            }
        }
        if(!swapped) break; // توقف إذا لم يتم أي تبديل في هذه الدورة
    }
}
 */