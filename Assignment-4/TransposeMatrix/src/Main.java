import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        System.out.print("Enter the element of the matrix : " );
        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();
        for(int i=0; i< 3;i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("The elements of matrix are ");
        for(int i=0; i< 3;i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The elements of transpose matrix are ");
        for(int i=0; i< 3;i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}