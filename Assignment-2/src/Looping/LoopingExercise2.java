package Looping;

import java.util.Arrays;
import java.util.Scanner;

public class LoopingExercise2 {
    public static void main(String[] args) {
        int keepGoing;
        int[] arr = new int [5];
        int size = 0;
        int sum =0;
        System.out.println("Enter a series of positive numbers :");
        do{
            Scanner scan = new Scanner(System.in);
            keepGoing = scan.nextInt();

            if(keepGoing >= 0 && size == arr.length){
                int[] newArray = new int[2* arr.length];
                for(int i = 0;i < arr.length; i++){
                    newArray[i] = arr[i];
                }
                arr = newArray;
            }
            if(keepGoing >= 0) {
                arr[size] = keepGoing;
                sum += arr[size];
                size++;
            }

        }while (keepGoing >= 0);
      System.out.println(Arrays.toString(arr));
      System.out.println("Sum of total numbers : "+ sum);
    }
}
