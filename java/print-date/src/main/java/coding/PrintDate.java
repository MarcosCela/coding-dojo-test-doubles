package coding;

public class PrintDate {
    private final CurrentDateProvider dateProvider;
    private final ConsolePrinter datePrinter;


    public PrintDate(CurrentDateProvider dateProvider,
                     ConsolePrinter datePrinter) {
        this.dateProvider = dateProvider;
        this.datePrinter = datePrinter;
    }

    public void printCurrentDate() {
        this.datePrinter.printDate(this.dateProvider.getDate());
    }
}
