
import java.util.Scanner;
class Deletion{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,20,30,40};
    int n = arr.length;
    
    int pos = 2;
    
    for(int i = pos;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    n--;
    
    for(int i =0;i<n;i++){
    System.out.println(arr[i]+"");
        
    }
   
     
      
    }
}