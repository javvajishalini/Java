
import java.util.Scanner;
class AddedAtPosition {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[6];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    int n = 4;
    
    int pos = 2;
    int value = 25;
    
    for(int i =n;i>pos;i--){
        arr[i] = arr[i-1];
    }
    
    arr[pos] = value;
    n++;
    
    for(int i=0;i<n;i++){
        System.out.println(arr[i] + " ");
    }
     
      
    }
}