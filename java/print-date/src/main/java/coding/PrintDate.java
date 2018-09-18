package coding;

public class PrintDate {
    private final DateProvider dateProvider;
    private final DatePrinter datePrinter;


    public PrintDate(DateProvider dateProvider,
                     DatePrinter datePrinter) {
        this.dateProvider = dateProvider;
        this.datePrinter = datePrinter;
    }

    public PrintDate() {
        // Default constructor, in case we don't want to break existing code
        this(new CurrentDateProvider(), new ConsolePrinter());
    }

    public void printCurrentDate() {
        this.datePrinter.printDate(this.dateProvider.getDate());
    }
}
