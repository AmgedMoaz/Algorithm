// Write a code to show meaning of linear search

#include <bits/stdc++.h>
using namespace std;

// Declaration of linear search method
bool linearSearch(vector <int> arr,int key);

int main() {

int n;
cin >> n;

// vector
vector <int> arr(n);
// For-each
for(int &i : arr) cin >> i;

int target;
cout << "Enter target you are looking for : ";
cin >> target;

if(linearSearch(arr,target)) {
    cout << "Found" << endl;
}else {
    cout << "Not found" << endl;
}

   return 0;
}
// Defination of Linear search method
bool linearSearch(vector <int> arr , int target) {
    int n = arr.size();

    for(int i = 0 ; i < n ; i++) {
        if(arr[i] == target) {
            return true;
        }
    }
    return false;
}