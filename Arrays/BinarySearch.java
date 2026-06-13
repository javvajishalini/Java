
import java.util.Scanner;
class BinarySearch{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,20,30,40};
    int key = 30;
    int low = 0;
    int high = arr.length;
    while(low<high){
        int mid =(high+low)/2;
        if(arr[mid]==key){
            System.out.println("Found");
            return;
        }
        else if(arr[mid]<key){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    System.out.println("Not Found");
    }
}