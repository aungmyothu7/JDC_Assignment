import java.util.Arrays;
import java.util.Scanner;

public class SaleMan {
    public static void main(String[] args) {
        int [][] arr = new int[5][3];
        int line = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the sales of 3 items sold by salesman " + (i + 1) + ": ");
            Scanner scan = new Scanner(System.in);

            for (int j = 0; j < 3; j++) {
                arr[i][j] =scan.nextInt();;
            }
        }
        int total = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
               total+=arr[i][j];
            }
            System.out.println("Total Sales By Salesma "+(i+1) +"= "+ total);
            total=0;
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                total += arr[j][i];
            }
            System.out.println("Total sales of item "+(i+1)+" = "+total );
            total = 0;
        }
    }
}
