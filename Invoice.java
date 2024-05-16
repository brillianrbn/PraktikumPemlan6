package PraktikumPemlan6;

public class Invoice implements Payable{
    String productName;
    int quantity;
    int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}