import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double apple = 3.67, pear = 2.14, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        double totalAmount, appleKg, pearKg, tomatoKg, bananaKg, eggplantKg;

        // Pear input
        System.out.print("Enter the weight of pears (kg): ");
        pearKg = input.nextDouble();

        // Apple input
        System.out.print("Enter the weight of apples (kg): ");
        appleKg = input.nextDouble();

        // Tomato input
        System.out.print("Enter the weight of tomatoes (kg): ");
        tomatoKg = input.nextDouble();

        // Banana input
        System.out.print("Enter the weight of bananas (kg): ");
        bananaKg = input.nextDouble();

        // Eggplant input
        System.out.print("Enter the weight of eggplants (kg): ");
        eggplantKg = input.nextDouble();

        totalAmount = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);

        System.out.println("Total Amount: " + totalAmount + " TL");
    }
}
