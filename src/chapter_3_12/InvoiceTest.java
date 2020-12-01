package chapter_3_12;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice(/*partNumber=*/"1", /*partDescription=*/"hammer", /*quantity=*/-2, /*price=*/3.53);
        Invoice invoice2 = new Invoice(/*partNumber=*/"2", /*partDescription=*/"nails", /*quantity=*/5, /*price=*/-1);

        System.out.println(invoice1.getInvoiceAmount());
        System.out.println(invoice2.getInvoiceAmount());

    }
}
