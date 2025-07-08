import java.util.Scanner;
public class jnjTCS {
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Hey jack!What's the 1st string you gave to Jill?: ");
    String str1=sc.nextLine();
    System.out.println("and the 2nd one?: ");
    String str2=sc.nextLine();
    String str3="";
    for(int k=0;k<str1.length();k++){
    int i=0;boolean found=true;
    while(i<str2.length()){
        if(str1.charAt(k)==str2.charAt(i)){
            found=false;
            break;
        }
       i++; 
    }
    if(found==true){
            str3+=str1.charAt(k);
            
        }
}
System.out.println("New string jill created is: "+str3);
}
}