import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
	public static void main(String[] args) {
		int inputNum = 0;
		boolean condition = true;
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
			
			while(condition){
				
				int randomNum = random.nextInt(0,10);
				System.out.println("Enter Your Number : ");
				inputNum = scan.nextInt();
				
				System.out.println("Input number is : "+ inputNum);
				System.out.println("Random number is : "+ randomNum);
				if(inputNum == randomNum) {
				
				if(inputNum >=1 && inputNum <4) {
					System.out.println("Excellent!");
				}
				else if(inputNum >=4 & inputNum <=6) {
					System.out.println("Good!");
				}
				else if(inputNum >=7 & inputNum <=9) {
					System.out.println("Not Bad!");
				}
				else {
					System.out.println("Bad!");
				}
				condition = false;
				}
			}
		}
	}
