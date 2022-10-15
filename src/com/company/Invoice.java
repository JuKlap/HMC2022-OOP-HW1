package com.company;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private int pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

        System.out.println("Item number: " + partNumber + ", which description is: " + partDescription + ". " + quantity + " were ordered with a price per item of " + pricePerItem + ".");
    }

    public Invoice() {} // default constructor

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber(){
        return this.partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription(){
        return this.partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public int getPricePerItem(){
        return this.pricePerItem;
    }

    public int getInvoiceAmount(){

        if (quantity >= 0 && pricePerItem >= 0) {
            int invoiceSum = quantity * pricePerItem;
            System.out.println("Quantity purchased: " + quantity + "; Price per item: " + pricePerItem + " eur. The total sum of the invoice: " + invoiceSum + " eur.");
        } else if (quantity < 0 && pricePerItem >= 0) {
            quantity = 0;
            int invoiceSum = quantity * pricePerItem;
            System.out.println("Error in quantity entrance and the invoice total is " + invoiceSum);
        } else if (quantity >= 0 && pricePerItem < 0) {
            pricePerItem = 0;
            int invoiceSum = quantity * pricePerItem;
            System.out.println("Error in price per item entrance and the invoice total is " + invoiceSum);
        } else {
            System.out.println("Error in entrance");
        }
        return 0;
    }

}
