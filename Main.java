package PraktikumPemlan6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter employee registration number\t: ");
        int registrationNumber = scn.nextInt();
        scn.nextLine(); 

        System.out.print("Enter employee name\t\t\t: ");
        String name = scn.nextLine();

        System.out.print("Enter employee salary per month\t\t: ");
        int salaryPerMonth = scn.nextInt();
        scn.nextLine();

        System.out.println("\n============ SELAMAT DATANG DI TOKO =============\n");
        System.out.print("Masukkan Jumlah Barang\t: ");
        int numOfInvoices = scn.nextInt();
        scn.nextLine(); 

        Invoice[] invoices = new Invoice[numOfInvoices];
        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("\nEnter details for invoice " + (i + 1));
            System.out.print("Nama Barang\t: ");
            String productName = scn.nextLine();
            System.out.print("Jumlah\t\t: ");
            int quantity = scn.nextInt();
            scn.nextLine(); 

            System.out.print("Harga Barang\t: ");
            int pricePerItem = scn.nextInt();
            scn.nextLine();

            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }

        Employee employee = new Employee(registrationNumber, name, salaryPerMonth, invoices);

    employee.printInvoices();
    System.out.println("\nTotal Gaji Setelah dikurangi Tagihan : " + employee.getPaymentAmount());
    System.out.println();
    
    }
}