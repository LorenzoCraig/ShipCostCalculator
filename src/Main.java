import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.println(" Enter the item price: ");
        if(input.hasNextDouble())
        {
            itemPrice = input.nextDouble();
            input.nextLine(); // clear buffer

            if (itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            } else // have to pay ship costs
            {
                shipCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shipCost;
            }
            // Display results
            System.out.println(" Shipping cost are: " + shipCost);
            System.out.println(" Total cost are: " + totalCost);
            {
                trash = input.nextLine();
                System.out.println(trash + " is not a valid number ");
                System.out.println(" RUN THE PROGRAM AGAIN! ");
            }
        }
    }
}