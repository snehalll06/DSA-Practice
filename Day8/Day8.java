import java.util.*;
public class Day8{
    static int magic(int num,int common){
        int temp=num;int digit,ans=0,count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int mul=1;
        for(int j=0;j<count-1;j++){
                mul=mul*10;
            }
        for(int i=0;i<count;i++){
            digit=num/mul;
            num=num%mul;
            mul=mul/10;

            digit=(digit+common)%10;
            ans=ans*10+digit;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println("Enter the magic number: ");
        int n=sc.nextInt();
        System.out.println("Result: "+magic(x, n));
    }
}