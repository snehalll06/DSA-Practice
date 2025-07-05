#include <iostream>
using namespace std;
void nthlargest(int n, int arr[],int k){
    
    int max=0,i=0,count=k,index=0,result=0;
    int r=0,s=1,countdup=0;
    while(arr[r]>0 && r<n && s<n){
        if(arr[s]==arr[r]){
            arr[s]=-1;
            countdup++;
        }
        s++;
        if(s==n){
            r++;
            s=r+1;
        }
    }
    if(k>n-countdup){
        cout<<"-1";
    }
    else{
    while(count!=0 && i<n){
        if(arr[i]>max){
            max=arr[i];
            index=i;
        }
        i++;
        if(i==n){
            count--;
            i=0;
            arr[index]=-1;
            result=max; max=0;
        }
    }
    cout<<k<<"th largest element is: "<<result;
    }
}
int main() {
    
    cout<<"Enter the size of array: ";
    int N;
    cin>>N;
    cout<<"Enter the array: ";
    int array[N];
    for(int i=0;i<N;i++){
        cin>>array[i];
    }
    cout<<"Enter which largest value you want: ";
    int K;
    cin>>K;
    nthlargest(N,array,K);
    
    return 0;
}