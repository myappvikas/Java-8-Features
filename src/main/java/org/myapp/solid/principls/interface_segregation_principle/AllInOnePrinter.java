package org.myapp.solid.principls.interface_segregation_principle;

class AllInOnePrinter implements Printer, Scanner, Fax {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}
