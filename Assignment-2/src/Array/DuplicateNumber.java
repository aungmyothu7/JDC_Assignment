package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        int num =0;
        int[] arr ={};
        int digit =0;
        int first = 0;
        int second = 0;
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

         arr = new int[num];
         for(int i = 0; i< arr.length ;i ++){
             System.out.print("array["+i+"] = ");
             digit = sc.nextInt();
             arr[i] = digit;
         }

         for(int i = 0; i < arr.length ; i++){
             for (int j = (i+1) ; j < arr.length ;j++ ){
                 if(arr[i] == arr[j]) {
                     first = i;
                     second = j;
                     System.out.println("Duplicate numbers found at locations " + first + " and " + second);
                 }
             }
         }
    }
}
