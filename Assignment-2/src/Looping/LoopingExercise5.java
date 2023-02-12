package Looping;
import java.util.Scanner;

public class LoopingExercise5 {
    public static void main(String[] args) {
        int year=0;
        double save = 0;
        double remain = 0.0;
        double spend =0.0;
        System.out.println("Enter the number of  work year: ");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();

        System.out.println("Enter the user can save anmual amount of money : ");
        save = scan.nextInt();
        double newSave = save;

        for(int i=1; i <= year ; i++){
            save += save * 0.03;
            System.out.println(save);
            if(i != year){
                save += newSave;
            }
        }
        remain = save;
        do{
            System.out.println("The user spend per year : ");
            spend = scan.nextDouble();
            if(remain > 0 && remain > spend) {
                    remain = remain - spend;
                    System.out.println("Total :" + remain);
                    remain += remain * 0.03;
                    System.out.println("Total + interest :" + remain);
            }else {
                System.out.println("You can get : " + remain);
                remain = 0;
            }

        }while(remain > 0);
    }
}
