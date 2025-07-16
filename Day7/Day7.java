import java.util.*;
public class Day7{
    static int mints(int n,int len){
        int sum=0,total=n;
        for(int i=0;i<len;i++){
            sum+=total;
            total=sum-1;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of mints 1st kid gets: ");
        int first=sc.nextInt();
        System.out.println("Enter the total number of kids: ");
        int kids=sc.nextInt();     
        System.out.println("The total number of mints is: "+ mints(first,kids));

    }
}