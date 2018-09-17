package coding;

import java.util.Date;

public class PrintDate {
    private final CurrentDateProvider dateProvider;

    public PrintDate(CurrentDateProvider dateProvider) {
        this.dateProvider = dateProvider;
    }

    public void printCurrentDate() {
        System.out.println(this.dateProvider.getCurrentDate());
    }
}
