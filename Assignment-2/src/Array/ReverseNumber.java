package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num =0;
        int position = 0;
        System.out.print("Enter the number of digits : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int[] arr = new int[num];
        for(int i =0; i< arr.length;i++){
            System.out.print("Enter the digit at position "+ (1+i) + " " );
            position = scan.nextInt();
            arr[i] = position;
        }
        System.out.print("The number is : ");
        for(int i = arr.length-1 ; i >=0 ; i--){
            System.out.print(arr[i]);
        }
    }
}
