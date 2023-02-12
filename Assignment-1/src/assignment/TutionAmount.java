package assignment;

public class TutionAmount {
    public static void main(String[] args) {
        double tutionFees = 6000;

        for (int year = 1; year <= 5; year++) {
            if (year > 1) {
                tutionFees = tutionFees + (tutionFees * 0.02);
            }
            System.out.println("The project semester tution amount is " + tutionFees + " for " + year + " year");
        }

    }

}
