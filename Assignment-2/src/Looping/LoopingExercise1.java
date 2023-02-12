package Looping;

public class LoopingExercise1 {
    public static void main(String[] args) {
        double caloriesBurn =0;
        for(int i = 0;i <=30; i=i+5 ){
            if(i == 0){
                caloriesBurn = 3.9;
                System.out.println(caloriesBurn + " calories burned after 1 minute");
            }
            else{
                caloriesBurn = 3.9 * i;
                System.out.println(caloriesBurn + " calories burned after "+ i + " minutes");
            }
        }
    }
}
