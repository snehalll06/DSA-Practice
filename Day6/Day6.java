import java.util.*;
public class Day6{
    
    static int strange_number(String num){
        int Esum=0,Osum=0,ans=0;
        for(int i=0;i<num.length();i++){
            if ((i+1)%2==0){
                Osum+=(int)num.charAt(i)-'0';//subtract ascii value of 0 from ascii of num to get the original number
            }
            else{
                Esum+=(int)num.charAt(i)-'0';
            }
        }
        ans=Esum-Osum;
        if(ans<0){
            ans*=-1;
        } 
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ayushi,please enter the number: ");
        String n=sc.next();
        System.out.println(strange_number(n));
    }
}