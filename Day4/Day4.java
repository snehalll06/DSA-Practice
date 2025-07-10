import java.util.Arrays;
class Main {
    public static void main(String[] args) {
      
        int target=-1;
        int[] arr={0,0,5,8,0,3,0,1,2};
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                target=i;
                break;
            }
        }
        for(int i=target+1;i<arr.length;i++){
            if(arr[i]!=0){
                arr[target]=arr[i];
                arr[i]=0;
                target++;
            }
        }
        
       
        System.out.println(Arrays.toString(arr));
    }

}