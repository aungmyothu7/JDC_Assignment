package assignment;

import java.util.Scanner;

public class EarnMoney {
    public static void main(String[] args) {
        int day = 0;
        int salary = 1;
        int total = 1;
        int i=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of day :");
        day = scan.nextInt();

        System.out.println("Salary for each day :"+ i +" days " + salary +" penny");
       while ( i < day) {
          if(i < day){
              salary *= 2;
              i++;
          }
           System.out.println("Salary for each day :"+ i +" days " + salary +" pennies");
          total += salary;
       }

       double dollar = total * 0.01;

       System.out.println("Total pay :" + dollar +"$");
    }

}

