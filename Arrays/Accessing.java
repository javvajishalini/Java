
import java.util.Scanner;
class Accessing{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter rows:");
      int rows = sc.nextInt();
      System.out.println("Enter columns:");
      int columns= sc.nextInt();
      int[][] arr = new int[rows][columns];
      
      for(int i=0;i<rows;i++){
          for(int j=0;j<columns;j++){
              System.out.println("Enter element:" + i + "at" + j +" ");
              arr[i][j] = sc.nextInt();
          }
      }
      //ACCESSING
      System.out.println("Array ");
      for(int i=0;i<rows;i++){
          for(int j=0;j<columns;j++){
              System.out.println( arr[i][j]);
              
          }
          System.out.println();
      }
     
      
    }
}