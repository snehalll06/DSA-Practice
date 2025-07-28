import java.util.*;
class Day13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int []arr2=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]%10!=0){
                arr2[j++]=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]%10==0){
                arr2[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}