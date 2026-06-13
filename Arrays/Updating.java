
import java.util.Scanner;
class Updating{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,20,30,40};
    arr[2] = 100;
    for(int num: arr){
        System.out.println(num+"");
    }
    }
}