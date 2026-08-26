// Write a code to show meaning of selection sort

#include <bits/stdc++.h>
using namespace std;

// Selection Sort implementation
void selectionSort(int arr[],int n) {
    for(int i = 0 ; i < n-1 ; i++) {
        int minIndex = i;
        for(int j = i+1 ; j < n ; j++) {
            if(arr[minIndex] > arr[j]) {
                minIndex = j;
            }
        }
        if(minIndex != i) {
            swap(arr[i] , arr[minIndex]);
        }
    }
}

int main() {

    int n;
    cin >> n;

    int arr[n];
    for(int i = 0 ; i < n ; i++) cin >> arr[i];

    selectionSort(arr,n);

    for(int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    return 0;
}