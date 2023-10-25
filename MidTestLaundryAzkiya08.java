import java.util.Scanner;

/**
 * MidTestLaundryAzkiya08
 */
public class MidTestLaundryAzkiya08 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        String name, category;
        int weight, price;
        double disc, netPrice;

        System.out.print("Input name: ");
        name = input08.nextLine();
        System.out.print("Input category: ");
        category = input08.nextLine();
        System.out.print("Input weight of clothes: ");
        weight = input08.nextInt();


        System.out.println("------Receipt of total laundry price------");

        if ((name.equalsIgnoreCase("s") && weight >= 7)) {
            if (category.equalsIgnoreCase("washing")) {
            price = 3000;
            disc = 0.7;
            netPrice = price * weight - (disc/100);
            System.out.println("Total Laundry Price is: Rp "+ netPrice);
            } else if (category.equalsIgnoreCase("washing and ironing")) {
            price = 5000;
            disc = 0.7;
            netPrice = price * weight - (disc/100);
            System.out.println("Total Laundry Price is: Rp "+ netPrice);
            } else 
            System.out.println("your category input is wrong!");
        } else if (category.equalsIgnoreCase("washing")) {
            price = 3000;
            netPrice = price * weight;
            System.out.println("Total Laundry Price is: Rp "+ netPrice);
        } else if (category.equalsIgnoreCase("washing and ironing")) {
            price = 5000;
            netPrice = price * weight;
            System.out.println("Total Laundry Price is: Rp "+ netPrice);
        } else
            System.out.println("your category input is wrong!");
        
    }
}