package Looping;

import java.util.Scanner;

public class LoopingExercise4 {
    public  static void main(String[] args) {
        int year = 0;
        int totalMonth=0;
        double rainfall = 0;
        double totalOneYear = 0.0;
        double averageOneYear = 0.0;
        double totalAllYearRainfall = 0.0;
        double totalAverageRainfall =0.0;

        System.out.println("Enter the number of years : ");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();

        for(int i = 1;i <= year ; i++){
            for(int j=1; j <= 12 ; j++){
                System.out.println("Enter the inches of rainfall for "+ j +" month of "+ i +" year");
                rainfall = scan.nextDouble();
               // totalOneYear += rainfall;

                //"Calculate the total inches of rianfall for All
                totalAllYearRainfall += rainfall;

                //"Calculate the total month
                totalMonth = year*12;

                //Calculate the average rainfall
                totalAverageRainfall = totalAllYearRainfall/totalMonth;
            }
            //averageOneYear = totalOneYear / 12;
            //System.out.println("The average rainfall over a period of "+i +" year"+averageOneYear);
            totalOneYear =0;

        }
        System.out.println("The number of months "+ totalMonth);
        System.out.println("The total inches of rainfall :"+ totalAllYearRainfall);
        System.out.println("The average rainfall per month for the entire period :" + totalAverageRainfall);

    }
}
