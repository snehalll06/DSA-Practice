import java.util.*;
class Day15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        int [] freq=new int[10]; //since digits are 0-9
        if (str.length()==0){
            System.out.println("-1");
            sc.close();
            return;
        }
    
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) - '0']++;  //incremented freq of digits at respective index
        }
        int max=0,result=0;
        for(int i=0;i<10;i++){  
            if(freq[i]>max){
                max=freq[i];   //to prioritize smallest digit
                result=i;    //returns digit with max freq
            }
        }
        System.out.println("Digit with highest frequency is: "+result);
    sc.close();
}
}