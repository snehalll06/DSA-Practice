#include <iostream>
using namespace std;
void nthlargest(int n, int arr[],int k){
    
    int max=0,i=0,count=k,index=0,result=0;
    int countdup=0;
    int freq[1000]={0};
    for(int i=0;i<n;i++){
        freq[arr[i]]++;
    }
    for(int i=0;i<n;i++){
        if((freq[arr[i]])>1){
            countdup++;
        }
    }
    if(k>n-(countdup/2)){
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