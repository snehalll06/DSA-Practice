import java.util.*;
class Day14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost per hour for first N hours: ");
        int R1=sc.nextInt();
        System.out.println("Enter the number of first N hours: ");
        int N=sc.nextInt();
        System.out.println("Enter the cost per hour after N hours: ");
        int R2=sc.nextInt();
        System.out.println("Enter the total travel time in minutes: ");
        int X=sc.nextInt();

        int total=0;
        total+=R1*N;
        if((X-N*60)%60==0){
           int N2=(X-(N*60))/60;
           total+=N2*R2;
        }
        else{
            int N2=((X-(N*60))/60 )+1;
            total+=N2*R2;
        }

        System.out.println(total);
        
    }
}