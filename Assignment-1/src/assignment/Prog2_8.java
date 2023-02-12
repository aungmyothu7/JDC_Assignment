package assignment;

public class Prog2_8 {

    public static void main(String[] args) {
        int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minNumber = min(arr);
        System.out.println("Minimumber is "+minNumber);
    }

    static int min(int[] arrayOfInts) {
        int i = 1;
        int min = arrayOfInts[0];
        while (i < arrayOfInts.length) {
            if (arrayOfInts[i] < min) {
                min = arrayOfInts[i];
            }
            i++;
        }
        return min;
    }
}
