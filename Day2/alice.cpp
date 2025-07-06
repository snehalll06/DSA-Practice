#include <iostream>
using namespace std;

void levels(int n, int arr[]){
    int max=1;int temp;
        for(int i=0;i<n;i++){
            for(int k=i+1;k<n;k++){
                int count=1;
                if(arr[k]>arr[i]){
                    temp=arr[k];
                    count++;
                }
                for(int j=k+1;j<n;j++){
                    if(arr[j]>temp){
                        temp=arr[j];count ++;
                    }
                }
                if(count>max){
                    max=count;
                }
            }

        }
        cout<<"Max reward points can be earned are: "<<max;
}
int main() {
    cout<<"Enter the number of levels: ";
    int n;
    cin>>n;
    cout<<"Enter the levels sequentially: ";
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    levels(n,arr);    
        
    return 0;
}