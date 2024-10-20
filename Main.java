import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PharmacyShop ps = new PharmacyShop(new Address("Labour Colony", "Sialkot", "154A"), new Person("Ali Hassan", "03287756369"), 0);

        int choice2;
        System.out.println("******Welcome To Pharmacy Shop*******");  // This will store the user's decision to exit or continue
        do {

            System.out.println("\n");
            System.out.println("*** Menu ***");
            System.out.println("* 1. Display Medicines *");
            System.out.println("* 2. Search Medicine by name *");
            System.out.println("* 3. Search Medicine by ID *");
            System.out.println("* 4. Buy Medicine *");
            System.out.println("* 5. Add Medicine *");
            System.out.println("* 6. Remove Medicine *");
            System.out.println("* 7. Update Medicine *");
            System.out.println("* 8. Exit *");
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();

            // Switch case would be a better option here for clarity, but we'll use if-else as per your structure
            if (choice == 1) {
                ps.displayMedicine();
            } else if (choice == 2) {
                ps.searchMedicineByName();
            } else if (choice == 3) {
                ps.searchMedicineById();
            } else if (choice == 4) {
                ps.sellMedicine();
            } else if (choice == 5) {
                ps.addMedicine(new Medicine[100]);
            } else if (choice == 6) {
                ps.removeMedicine();
            } else if (choice == 7) {
                ps.updateMedicine(new Medicine[100]);
            } else if (choice == 8) {
                // Exit the loop by setting choice2 to 1, skipping the exit confirmation
                choice2 = 2;
                break;  // Breaks the loop if user selects "Exit"
            } else {
                System.out.println("Invalid choice! Please select a valid option.");
            }

            // Ask the user whether they want to exit or not
            System.out.println("Do you you want to exit the Pharmacy Shop?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your choice: ");
            choice2 = scanner.nextInt();  // Takes user's decision for continuing or exiting

        } while (choice2 == 2);  // Loop continues if user selects "2" (No), exits on "1" (Yes)

        System.out.println("Thank you for visiting the Pharmacy Shop!");
    }
}
