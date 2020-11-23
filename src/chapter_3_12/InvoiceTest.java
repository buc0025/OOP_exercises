package chapter_3_12;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1", "hammer", 7, 3.53);
        Invoice invoice2 = new Invoice("2", "nails", 5, -1);

        System.out.println(invoice1.getInvoiceAmount());
        System.out.println(invoice2.getInvoiceAmount());

    }
}
