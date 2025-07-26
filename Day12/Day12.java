import java.util.*;
class Day12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int num=sc.nextInt();
        int temp=num,temp2=num,dig=0,newNum=0,count=0,pow=0;
        if(num>=0&&num<=1000000){
            while(temp>0){
                temp/=10;
                count++;
            }
            while(count>0){
                pow=(int)Math.pow(10, count-1);
                dig=temp2/pow;
                dig=9-dig;
                newNum=newNum*10+dig;
                temp2=temp2%pow;
                count--;                     
            }
            System.out.print(newNum);    
            }
            else{
                System.out.println("Wrong input!");
            }
        
    }
}