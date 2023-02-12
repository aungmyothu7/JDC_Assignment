package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertIndexLocation {
    public static void main(String[] args) {
        int num =0;
        int [] arr = {};
        int digit =0;
        int newValue = 0;
        int index_position = 0;
        System.out.print("Enter the number of elements in the array : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        arr = new int[++num];
        for(int i = 0; i< arr.length-1 ;i ++){
            System.out.print("array["+i+"] = ");
            digit = sc.nextInt();
            arr[i] = digit;
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the number to be inserted : ");
        newValue = sc.nextInt();

        System.out.print("Enter the position at which the number has to added : ");
        index_position = sc.nextInt();


        for(int i = arr.length-1 ; i > index_position ; i--){
               arr[i] = arr[i-1];
        }
        arr[index_position] = newValue;

        for(int i = 0; i< arr.length ;i ++){
            System.out.println("array["+i+"] = " + arr[i]);
        }

    }

}
