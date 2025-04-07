package org.myapp.solid.principls.interface_segregation_principle;

interface MultiFunctionPrinter {

    void print();
    void scan();
    void fax();
}

class InkjetPrinter implements MultiFunctionPrinter {

    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        // Not supported
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax() {
        // Not supported
        throw new UnsupportedOperationException("Fax not supported");
    }
}
