public class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize the instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate the invoice amount
    public double getInvoiceAmount() {
        // Calculate the total amount (quantity * price per item)
        return quantity * pricePerItem;
    }

    // Getters for instance variables (optional)
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
}
class Invoice_Ex{
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("1234", "Widget", 10, 15.50);

        // Display invoice details by calling the methods
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());

        // Calculate and display the total invoice amount
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
