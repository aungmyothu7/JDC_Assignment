package Looping;

public class LoopingExercise6 {
    public static void main(String[] args) {
        int kgFees = 80;
        int othersFees =60;

        for(int i=0;i <= 8; i++){
            for(int j=1 ; j<= 3; j++){
                if(i == 0) {
                    System.out.println(j + " room of grade " + i+ " for nine month tution payment " + (80 * 9));

                }
                else{
                    System.out.println(j + " room of grade " + i+ " for nine month tution payment " + (60 * 9));
                }
            }
            System.out.println();
        }
    }
}
