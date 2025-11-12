import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    private String transactionId;
    
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
        System.out.println("Invoice created for Transaction ID: " + transactionId);
    }

    @Override
    public String toString() {
        return "Invoice{" + "transactionId='" + transactionId + '\'' + '}';
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {


        List<String> transactionIDs = Arrays.asList("TXN1001", "TXN1002", "TXN1003", "TXN1004");


        List<Invoice> invoices = transactionIDs.stream()
                                               .map(Invoice::new)  
                                               .collect(Collectors.toList());

        System.out.println("\nAll Generated Invoices:");
        invoices.forEach(System.out::println);
    }
}
