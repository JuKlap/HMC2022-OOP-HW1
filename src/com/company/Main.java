package com.company;

/*
Create a class called Invoice that a hardware store might use to
represent an invoice for an item sold at the store.
An Invoice should include four attributes—a part number (type string),
a part description (type string), a quantity of the item being
purchased (type int) and a price per item (type int).
Your class should have a constructor that initializes
the four attributes. Provide a set and a get method for each attribute.
In addition, provide a method named getInvoiceAmount that calculates
the invoice amount (i.e., multiplies the quantity by the price per item),
then returns the amount as an int value. If the quantity is not positive,
it should be set to 0. If the price per item is not positive,
it should be set to 0. Write a test program that demonstrates
class Invoice’s capabilities.
 */

public class Main {

    public static void main(String[] args) {
	    Invoice invoice01 = new Invoice();
        Invoice invoice02 = new Invoice("20", "wire", 5, 15);
        Invoice invoice03 = new Invoice("22", "keys", -4, 7);
        Invoice invoice04 = new Invoice("24", "machine parts", 8, -300);

        System.out.println(invoice01.getInvoiceAmount());
        System.out.println(invoice02.getInvoiceAmount());
        System.out.println(invoice03.getInvoiceAmount());
        System.out.println(invoice04.getInvoiceAmount());

    }
}

