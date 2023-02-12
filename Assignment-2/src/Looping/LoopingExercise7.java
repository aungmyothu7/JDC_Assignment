package Looping;

import java.util.Scanner;

public class LoopingExercise7 {
    public static void main(String[] args) {
        int star = 0;
        int count =0;
        double total =0;
        double average = 0;
        do {
            System.out.println("Enter the number of stars : ");
            Scanner scan = new Scanner(System.in);
            star = scan.nextInt();
            if(star >=0 && star <=4){
                total += star;
                ++count;
            }
            else{
                System.out.println("Invalid! incorrect range star!!");
            }
            average = total / count;
        }while (star >=0);

        System.out.println("Average star : "+ average);
    }
}
