package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        int num = 0;
        int[] arr = new int[10];
        int size =0;
        System.out.println("Enter number : ");
        Scanner scan = new Scanner(System.in);

        while (num != -99){
            num = scan.nextInt();
            if(num != -99) {
                if (size == arr.length) {
                    int[] newArray = new int[2 * arr.length];
                    for (int i = 0; i < arr.length; i++) {
                        newArray[i] = arr[i];
                    }
                    arr = newArray;
                } else {
                    arr[size++] = num;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(size);
        System.out.println("Largest number : "+ max(arr,size));
        System.out.println("Smallest number : "+ min(arr,size));
    }
    static int min(int[] arr,int size) {
        int i=1;
        int min = arr[0];
        while (i <= size) {

            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }
    static int max(int[] arr,int size){
        int i =0;
        int max = arr[0];
        while (i < size){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
