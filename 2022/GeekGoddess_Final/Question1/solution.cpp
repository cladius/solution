/* Read input from STDIN. Print your output to STDOUT*/ 
#include <bits/stdc++.h>
using namespace std;

/*
    AUTHOR : VAISHNAVI BHAVAGNA KANCHARLA
    SCORE : 100/100

    Approach :- To find a control room which is min distance from all the points
    we need to find median of array. We will maintain vector of 'n' size and we keep
    sorting the array. Once array is sorted we find median as per below conditions:-
    1. If size of array is even return median+1.
    2. If size of array is odd return median.
*/

int getMedian(vector<int> temp){
    int s = temp.size();
    if(s%2==0){
        return temp[(s-1)/2];
    }else{
        return temp[(s/2)];
    }
}

int main(int argc, char *a[]) { 
    //Write code here
    int n;
    cin>>n;
    vector<int> arr;
    for(int i=0;i<n;i++){
        int val;
        cin>>val;
        arr.push_back(val);
        if(i==0){
            cout<<val<<endl;
        }else{
            vector<int> temp=arr;
            sort(temp.begin(),temp.end());
            cout<<getMedian(temp)<<endl;
        }
    }
    return 0;
}