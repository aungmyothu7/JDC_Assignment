package assignment;

import java.util.Scanner;
import java.util.*;

public class NameOrder {
    public static void main(String[] args) {
        int n =0;
        String temp =" ";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of names  : ");
        n = scan.nextInt();
        String[] arr = new String[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for(int i=0; i< n ;i++){
            for(int j = i+1; j < n; j++){
                if(arr[i].compareTo(arr[j]) > 0){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimun name is :" + arr[0]);
        System.out.println("Maximun name is :" + (arr[arr.length-1]));
       // scan.close();
    }
}
