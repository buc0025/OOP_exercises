package chapter_8_14;

public class DateTest {

    public static void main(String[] args) {
        Date d1 = new Date(/*month*/12,/*day*/4, /*year*/2020);
//        Date d2 = new Date(/*monthName*/"April",/*day*/14, /*year*/1987);
//        Date d3 = new Date(/*day*/29, /*year*/2020);

        displayDate(d1);
//        displayDate(d2);
//        displayDate(d3);
    }

    private static void displayDate( Date date) {
        System.out.printf("%s%n%s%n%s%n", date.numericDate(), date.stringDate(), date.dayYear());
    }
}
