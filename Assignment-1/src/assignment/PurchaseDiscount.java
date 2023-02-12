package assignment;

import java.io.*;

public class PurchaseDiscount {
    public static void main(String[] args) throws IOException {
        int quantity = 0;
        int price = 100;
        String keepGoing =" ";
        double discount = 0;
        double total = 0;
        double totalAmount = 0;
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));


        do {
            System.out.print("Enter the number of packages :");
            quantity = Integer.parseInt(in.readLine());
            if (quantity < 10) {
                discount = price * 0;
                total = quantity * price;
                totalAmount = total - discount;


            } else if (quantity >= 10 && quantity <= 19) {
                discount = quantity * price * 0.2;
                total = quantity * price;
                totalAmount = total - discount;

            } else if (quantity >= 20 && quantity <= 49) {
                discount = quantity * price * 0.3;
                total = quantity * price;
                totalAmount = total - discount;

            } else if (quantity >= 50 && quantity <= 99) {
                discount = quantity * price * 0.4;
                total = quantity * price;
                totalAmount = total - discount;

            } else if(quantity >= 100){
                discount = quantity * price * 0.5;
                total = quantity * price;
                totalAmount = total - discount;


            }
            System.out.println("The amount of discount :" + discount);
            System.out.println("The total amount of purchases after discount :" + totalAmount);

            System.out.println("Continue : ? Enter 'y' :");
            keepGoing = in.readLine();

        }while (keepGoing.equalsIgnoreCase("Y"));
    }
}
