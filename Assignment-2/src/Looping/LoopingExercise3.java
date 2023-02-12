package Looping;

import java.util.Scanner;

public class LoopingExercise3 {
    public static void main(String[] args) {
        int speed = 0 ;
        int time = 0 ;
        int distance = 0;
        System.out.println("Enter the speed of the vehicle in mph : ");
        Scanner scan = new Scanner(System.in);
        speed = scan.nextInt();

        System.out.println("Enter the hours has it traveled : ");
        time = scan.nextInt();

        System.out.println("Hour\t\t\tDistance Traveled");
        for(int i=1; i <= time ; i++){
            distance = speed * i;
            System.out.println(i + "\t\t\t\t\t" +distance);
        }
        scan.close();
    }
}
