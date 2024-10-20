public class Medicine {
   private String medicineId;
   private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
   private int quantity;
    private String name;
    private double price;



    public Medicine(String medicineId, String batchNumber, String manufacturer, Date expiryDate, int quantity, String name, double price) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void displayMedicineInfo(){
        System.out.println("Medicine ID:"+medicineId+" Batch Number:"+batchNumber+" Manufacturer:"+manufacturer+" Quantity:"+quantity+" Name:"+name+" Price:"+price);
        System.out.print("Expiry Date:");
        expiryDate.displayDate();
    }
}
