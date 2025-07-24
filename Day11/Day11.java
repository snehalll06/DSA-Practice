import java.util.Scanner;
public class Day11{
    int[] arr;
    int candies;
    int ch;
    int N;
    Day11(int ch, int candies, int N){
        this.arr=new int[ch];
        this.ch=ch;
        this.N=N;
        this.candies=candies;
    }
    void candy(){
        int j=N-1;
        while(candies>0){
            if(j==ch){
                j=0;
            }
            arr[j]+=1;
            j++;
            candies--;
        }
        if (j==0){
        System.out.println("The chair number with awful candy is: "+ch);           
        }
        else{
        System.out.println("The chair number with awful candy is: "+(j));
        }      
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of test cases: ");
        int t=sc.nextInt();

        for(int i=0;i<t;i++){ 
        System.out.println("Enter the number of chairs: ");
        int ch=sc.nextInt();
        System.out.println("Enter the number of candies: ");
        int candies=sc.nextInt();
        System.out.println("Enter the starting chair number: ");
        int N=sc.nextInt(); 

        Day11 c=new Day11(ch,candies,N);
        c.candy();
        }

    }
}