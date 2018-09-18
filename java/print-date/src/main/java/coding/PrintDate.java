package coding;

public class PrintDate {
    private final DateProvider dateProvider;
    private final DatePrinter datePrinter;


    public PrintDate(DateProvider dateProvider,
                     DatePrinter datePrinter) {
        this.dateProvider = dateProvider;
        this.datePrinter = datePrinter;
    }

    public void printCurrentDate() {
        this.datePrinter.printDate(this.dateProvider.getDate());
    }
}
