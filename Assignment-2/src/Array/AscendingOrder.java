package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        int num =0;
        int [] arr = {};
        int digit =0;
        int insertion = 0;
        int temp =0;
        System.out.print("Enter the number of elements in the array : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        arr = new int[++num];
        for(int i = 0; i< arr.length-1 ;i ++){
            System.out.print("array["+i+"] = ");
            digit = sc.nextInt();
            arr[i] = digit;
        }
        System.out.print("Enter the number to be inserted : ");
        insertion = sc.nextInt();
        arr[arr.length-1] = insertion;
        System.out.println("The array after insertion of "+insertion +" is :");

        for(int i=0; i< arr.length ; i++){
            for(int j =i+1 ; j< arr.length; j++ ){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for(int i = 0; i< arr.length ;i ++){
            System.out.println("array["+i+"] = " + arr[i]);
        }
    }
}
