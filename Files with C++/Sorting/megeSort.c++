// Write a code to show meaning of merge sort

#include <bits/stdc++.h>
using namespace std;

void merge(int arr[] , int left , int mid , int right);

// Merge Sort implementation
void mergeSort(int arr[] , int left , int right) {
    if(left < right){
        int mid = left + (right - left)/2;

        // Divide left section
        mergeSort(arr,left,mid);

        // Divide right section
        mergeSort(arr,mid+1,right);

        // Merge function
        merge(arr,left,mid,right);
    }
}
void merge(int arr[],int left,int mid,int right) {

    // 1. حساب أحجام المصفوفات المؤقتة
    int n1 = mid - left + 1;
    int n2 = right - mid;

    // 2. إنشاء المصفوفات المؤقتة
    int L[n1];
    int R[n2];

    // 3. نسخ البيانات إلى المصفوفات المؤقتة
    for(int i = 0 ; i < n1 ; i++) L[i] = arr[left+i];
    for(int i = 0 ; i < n2 ; i++) R[i] = arr[mid+1+i];

    // 4. دمج عناصر المصفوفات بالترتيب الصحيح
    int i = 0 , j = 0 , k = left;

    while(i < n1 and j < n2) {
        if(L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        }else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    // 5. نسخ العناصر المتبقية إن وجدت
    while(j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
    while(i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }
}

int main() {

    int n;
    cin >> n;

    int arr[n];
    for(int i = 0 ; i < n ; i++) cin >> arr[i];

    mergeSort(arr,0,n-1);
    cout << "After merging sort" << endl;
    for(int i = 0 ; i < n ; i++) cout << arr[i] << " ";

    return 0;
}