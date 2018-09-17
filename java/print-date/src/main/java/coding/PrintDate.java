package coding;

import java.util.Date;

public class PrintDate {
    private final CurrentDateProvider dateProvider;
    private final DatePrinter datePrinter;


    public PrintDate(CurrentDateProvider dateProvider,
                     DatePrinter datePrinter) {
        this.dateProvider = dateProvider;
        this.datePrinter = datePrinter;
    }

    public void printCurrentDate() {
        this.datePrinter.printDate(this.dateProvider.getCurrentDate());
    }
}
