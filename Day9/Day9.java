import java.util.*;
public class Day9{
    public static void main(String[] args){
        String str="abc123bhg45hg9";
        String str2="";int num=0,sum=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>=48 && str.charAt(i)<=57){
                str2+=str.charAt(i);
            }
                else{
                    if(!str2.isEmpty()){
                    num=Integer.parseInt(str2);
                    str2="";
                    sum+=num;
                    }
                }
                }
                if(!str2.isEmpty()){
                    num=Integer.parseInt(str2);
                    sum+=num;
                    }
            System.out.println("The price of item is: "+sum);   
    }
}
