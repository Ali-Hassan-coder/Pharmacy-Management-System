import java.util.Scanner;

public class PharmacyShop {
    private Address address;
    private Medicine[] medicines = new Medicine[100];
    private Person owner;
    private int medicineCount = 0;

    Scanner scanner = new Scanner(System.in);

    public PharmacyShop(Address address, Person owner, int medicineCount) {
        this.address = address;
        this.owner = owner;
        this.medicineCount = medicineCount;

    }

    {

    medicines[medicineCount++]=new Medicine("M001","B123","Pharmacorp",new Date(15, 8,2025), 50,"Paracetamol",100.0);
    medicines[medicineCount++]=new Medicine("M002","B124","Healthmed",new Date(10, 12,2024), 80,"Ibuprofen",75.0);

}



    public void displayMedicine() {
        ;
        for (int i = 0; i <= medicineCount; i++) {
                medicines[i].displayMedicineInfo();

            }System.out.println("\nAdd More Medicines to Display!");
        }


    public void searchMedicineById() {
        System.out.println("Enter Medicine ID: ");
        String ID = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i <= medicineCount; i++) {
            if (medicines[i] != null && medicines[i].getMedicineId().equals(ID)) {
                isFound = true;
                System.out.println("Medicine Found Successfully!");
                medicines[i].displayMedicineInfo();
                break;
            }
        }
        if (!isFound) {
            System.out.println("Medicine Not Found");
        }
    }

    public void searchMedicineByName() {
        System.out.println("Enter Medicine Name: ");
        String name = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i <= medicineCount; i++) {
            if (medicines[i] != null && medicines[i].getName().equals(name)) {
                isFound = true;
                System.out.println("Medicine Found Successfully!");
                medicines[i].displayMedicineInfo();
                break;
            }
        }
        if (!isFound) {
            System.out.println("Medicine Not Found");
        }
    }

    public void addMedicine(Medicine[] medicines) {
        System.out.println("Enter New Medicine ID");
        String medicineID = scanner.nextLine();
        System.out.println("Enter New Medicine Batch Number:");
        String newBatchNumber = scanner.nextLine();
        System.out.println("Enter New Medicine Manufacturer");
        String newManufacturer = scanner.nextLine();
        System.out.println("Enter New Medicine Expiry Date: ");
        System.out.print("Date: ");
        int newDate = scanner.nextInt();
        System.out.print(" Month: ");
        int newMonth = scanner.nextInt();
        System.out.print(" Year: ");
        int newYear = scanner.nextInt();
        System.out.println("Enter New Medicine Quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter New Medicine Name:");
        String newName = scanner.nextLine();
        System.out.println("Enter New Medicine Price:");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();

        this.medicines[medicineCount++] = new Medicine(medicineID, newBatchNumber, newManufacturer, new Date(newDate, newMonth, newYear), quantity, newName, newPrice);
        System.out.println("Medicine Added Successfully!");
        displayMedicine();
    }

    public void updateMedicine(Medicine[] medicines) {
        System.out.println("Enter Medicine ID to update: ");
        String medicineID = scanner.nextLine();
        for (int i = 0; i < medicineCount; i++) {
            if (this.medicines[i] != null && this.medicines[i].getMedicineId().equals(medicineID)) {  // Fix: check for null
                System.out.println("Enter New Medicine ID");
                String newMedicineID = scanner.nextLine();
                this.medicines[i].setMedicineId(newMedicineID);
                System.out.println("Enter New Medicine Batch Number:");
                String newBatchNumber = scanner.nextLine();
                this.medicines[i].setBatchNumber(newBatchNumber);
                System.out.println("Enter New Medicine Manufacturer");
                String newManufacturer = scanner.nextLine();
                this.medicines[i].setManufacturer(newManufacturer);
                System.out.println("Enter New Medicine Quantity:");
                int quantity = scanner.nextInt();
                this.medicines[i].setQuantity(quantity);
                scanner.nextLine();  // Fix: clear the scanner buffer
                System.out.println("Enter New Medicine Name:");
                String newName = scanner.nextLine();
                this.medicines[i].setName(newName);
                System.out.println("Enter New Medicine Price:");
                double newPrice = scanner.nextDouble();
                scanner.nextLine();  // Fix: clear the scanner buffer
                this.medicines[i].setPrice(newPrice);
                System.out.println("Medicines Updated Successfully!");
                displayMedicine();
                return;
            }
        }
        System.out.println("Medicine Not Found");
    }

    public void sellMedicine() {
        System.out.println("Enter Medicine Name which you want to buy: ");
        String name = scanner.nextLine();
        for (int i = 0; i <= medicineCount; i++) {
            if (medicines[i] != null && medicines[i].getName().equals(name)) {
                System.out.println("Enter Medicine Quantity: ");
                int quantity = scanner.nextInt();
                if (medicines[i].getQuantity() >= quantity) {
                    medicines[i].setQuantity(medicines[i].getQuantity() - quantity);
                    System.out.println("Medicine Purchased Successfully!");
                    displayMedicine();
                } else {
                    System.out.println("Out of Stock!");
                }
                return;
            }
        }
        System.out.println("Medicine Not Found");
    }

    public void removeMedicine() {
        System.out.println("Enter Name of Medicine you want to remove: ");
        String remove = scanner.nextLine();
        for (int i = 0; i <= medicineCount; i++) {
            if (medicines[i] != null && medicines[i].getName().equals(remove)) {
                medicines[i] = null;
                System.out.println("Medicine removed Successfully");
                displayMedicine();
                return;
            }
        }
        System.out.println("Medicine Not Found");
    }
}
