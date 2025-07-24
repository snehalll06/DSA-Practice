import java.util.*;
public class Day10{
    public static void main(String[] args){
        int [] price={4,8,5,3};
        int [] volume={6,10,4,2};
        int budget=10;int n=4;
        double [] ratio=new double[n];
        boolean[] visited=new boolean[n];
        int []indices=new int[n];
        int vol=0,maxidx=0,exp=0;
        for(int i=0;i<n;i++){
            ratio[i]=(double)volume[i]/price[i]; 
            indices[i]=i;          
        }
        for(int i=0;i<n;i++){
            maxidx=i;
            for(int j=i + 1;j<n;j++){
                if(ratio[j]>ratio[maxidx]){
                    maxidx=j;
                }
            }
            int temp;
            temp=indices[i];
            indices[i]=indices[maxidx];
            indices[maxidx]=temp;

        }
        for(int i=0;i<n;i++){
            int idx=indices[i];
            if(!visited[idx]&&budget>=price[idx]){
                budget-=price[idx];
                vol+=volume[idx];
                exp+=price[idx];
                visited[idx]=true;
            }
        }
        System.out.println("Total volume purchased= "+vol+"\nTotal expense= "+exp);
       
   }
}